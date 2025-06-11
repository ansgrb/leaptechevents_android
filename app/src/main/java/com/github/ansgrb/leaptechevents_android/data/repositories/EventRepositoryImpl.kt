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

import android.net.Uri
import com.github.ansgrb.leaptechevents_android.domain.models.Event
import com.github.ansgrb.leaptechevents_android.domain.repositories.EventRepository
import com.github.ansgrb.leaptechevents_android.domain.repositories.StorageRepository
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import javax.inject.Inject

class EventRepositoryImpl @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val storageRepository: StorageRepository
) : EventRepository {
    override suspend fun getEvents(): List<Event> = withContext(Dispatchers.IO) {
        firestore.collection("events").get().await().map { it.toObject(Event::class.java) }
    }

    override suspend fun getEventDetails(eventId: String): Event = withContext(Dispatchers.IO) {
        firestore.collection("events").document(eventId).get().await().toObject(Event::class.java)!!
    }

    override suspend fun addEvent(event: Event, imageUri: Uri?): Event = withContext(Dispatchers.IO) {
        val eventWithImage = if (imageUri != null) {
            val imageUrl = storageRepository.uploadImage(event.id, imageUri).first()
            event.copy(imageUrl = imageUrl)
        } else event
        firestore.collection("events").document(event.id).set(eventWithImage).await()
        eventWithImage
    }
}
