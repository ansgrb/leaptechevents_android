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
import android.graphics.BitmapFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.ansgrb.leaptechevents_android.domain.models.Ticket
import com.github.ansgrb.leaptechevents_android.domain.usecases.GetTicketUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.ByteArrayInputStream
import javax.inject.Inject
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

@HiltViewModel
class ETicketViewModel @Inject constructor(
    private val getTicketUseCase: GetTicketUseCase,
) : ViewModel() {
    private val _ticket = MutableStateFlow<Ticket?>(null)
    val ticket: StateFlow<Ticket?> = _ticket

    fun loadTicket(ticketId: String) {
        viewModelScope.launch {
            _ticket.value = getTicketUseCase(ticketId)
        }
    }
}

@OptIn(ExperimentalEncodingApi::class)
fun stringToBitmap(encodedString: String): Bitmap? {
    return try {
        val decodedBytes = Base64.decode(encodedString)
        BitmapFactory.decodeStream(ByteArrayInputStream(decodedBytes))
    } catch (e: Exception) {
        null
    }
}
