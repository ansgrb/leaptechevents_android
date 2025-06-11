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
import com.github.ansgrb.leaptechevents_android.domain.repositories.StorageRepository
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class StorageRepositoryImpl @Inject constructor(
    private val storage: FirebaseStorage,
) : StorageRepository {
    override suspend fun uploadImage(eventId: String, uri: Uri): Flow<String> = flow {
        val storageRef = storage.reference.child("event_images/$eventId/${uri.lastPathSegment}")
        val uploadTask = storageRef.putFile(uri).await()
        val downloadUrl = storageRef.downloadUrl.await()
        emit(downloadUrl.toString())
    }

    override suspend fun deleteImage(imageUrl: String): Boolean {
        return try {
            val storageRef = storage.getReferenceFromUrl(imageUrl)
            storageRef.delete().await()
            true
        } catch (e: Exception) {
            false
        }
    }
}