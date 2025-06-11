/*
 * Product Made by Anas Ghareib
 * Copyright (C) 2025 Anas Ghareib
 *
 * All rights reserved. This software and associated documentation files
 * (the "Software") are proprietary and confidential. Unauthorized copying,
 * distribution, modification, or use of this Software, via any medium,
 * is strictly prohibited without prior written permission from Anas Ghareib.
 *
 * This Software is provided "as is", without warranty of any kind, express
 * or implied, including but not limited to the warranties of merchantability,
 * fitness for a particular purpose, and non-infringement. In no event shall
 * the author be liable for any claim, damages, or other liability,
 * whether in an action of contract, tort, or otherwise, arising from,
 * out of, or in connection with the Software or the use of it.
 */
package com.github.ansgrb.leaptechevents_android.presentation.viewmodels

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.ansgrb.leaptechevents_android.domain.models.Ticket
import com.github.ansgrb.leaptechevents_android.domain.usecases.BookTicketUseCase
import com.google.firebase.auth.FirebaseAuth
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.ByteArrayOutputStream
import javax.inject.Inject
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi
import android.graphics.Color
import androidx.core.graphics.createBitmap
import androidx.core.graphics.set

@HiltViewModel
class BookingViewModel @Inject constructor(
    private val bookTicketUseCase: BookTicketUseCase,
    private val auth: FirebaseAuth,
) : ViewModel() {
    private val _isBookingSuccess = MutableStateFlow(false)
    val isBookingSuccess: StateFlow<Boolean> = _isBookingSuccess

    private val _ticketWithQR = MutableStateFlow<Ticket?>(null)
    val ticketWithQR: StateFlow<Ticket?> = _ticketWithQR

    val currentUserId: String?
        get() = auth.currentUser?.uid

    suspend fun bookTicket(eventId: String, userId: String, onSuccess: (Ticket) -> Unit) {
        viewModelScope.launch {
            try {
                val ticket = bookTicketUseCase(eventId, userId)
                val qrBitmap = generateQRCode("${ticket.id},${ticket.eventId},${ticket.status}")
                // update ticket with QR data (base64 encode bitmap or URL)
                val updatedTicket = ticket.copy(qrCode = bitmapToString(qrBitmap))
                _ticketWithQR.value = updatedTicket
                _isBookingSuccess.value = true
                onSuccess(updatedTicket)
            } catch (e: Exception) {
                // TODO: handle error
            }
        }
    }

    private fun generateQRCode(text: String): Bitmap {
        val size = 200
        val writer = QRCodeWriter()
        val bitMatrix = writer.encode(text, BarcodeFormat.QR_CODE, size, size)
        val bitmap = createBitmap(size, size)

        for (x in 0 until size) {
            for (y in 0 until size) {
                bitmap[x, y] = if (bitMatrix[x, y]) Color.BLACK else Color.WHITE
            }
        }
        return bitmap
    }

    @OptIn(ExperimentalEncodingApi::class)
    private fun bitmapToString(bitmap: Bitmap): String {
        ByteArrayOutputStream().use { baos ->
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos)
            return Base64.encode(baos.toByteArray())
        }
    }
}
