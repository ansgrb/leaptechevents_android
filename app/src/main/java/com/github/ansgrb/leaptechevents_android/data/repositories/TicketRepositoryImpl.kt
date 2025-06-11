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
package com.github.ansgrb.leaptechevents_android.data.repositories

import com.github.ansgrb.leaptechevents_android.domain.models.Ticket
import com.github.ansgrb.leaptechevents_android.domain.repositories.TicketRepository
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import javax.inject.Inject

class TicketRepositoryImpl @Inject constructor(
    private val firestore: FirebaseFirestore,
) : TicketRepository {
    override suspend fun getTickets(): List<Ticket> = withContext(Dispatchers.IO) {
        firestore.collection("tickets").get().await().map { it.toObject(Ticket::class.java) }
    }

    override suspend fun getTicket(ticketId: String): Ticket = withContext(Dispatchers.IO) {
        firestore.collection("tickets").document(ticketId).get().await()
            .toObject(Ticket::class.java)!!
    }

    override suspend fun bookTicket(eventId: String, userId: String): Ticket =
        withContext(Dispatchers.IO) {
            val ticket = Ticket(
                id = firestore.collection("tickets").document().id,
                eventId = eventId,
                qrCode = "TEMP_QR_${System.currentTimeMillis()}",
                status = "upcoming"
            )
            firestore.collection("tickets").document(ticket.id).set(ticket).await()
            ticket
        }
}
