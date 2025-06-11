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
package com.github.ansgrb.leaptechevents_android.data.di

import com.github.ansgrb.leaptechevents_android.data.repositories.EventRepositoryImpl
import com.github.ansgrb.leaptechevents_android.data.repositories.StorageRepositoryImpl
import com.github.ansgrb.leaptechevents_android.data.repositories.TicketRepositoryImpl
import com.github.ansgrb.leaptechevents_android.data.repositories.UserRepositoryImpl
import com.github.ansgrb.leaptechevents_android.domain.repositories.EventRepository
import com.github.ansgrb.leaptechevents_android.domain.repositories.StorageRepository
import com.github.ansgrb.leaptechevents_android.domain.repositories.TicketRepository
import com.github.ansgrb.leaptechevents_android.domain.repositories.UserRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    fun provideFirestore(): FirebaseFirestore = FirebaseFirestore.getInstance()

    @Provides
    @Singleton
    fun provideAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    @Singleton
    fun provideStorage(): FirebaseStorage = FirebaseStorage.getInstance()

    @Provides
    @Singleton
    fun provideEventRepository(firestore: FirebaseFirestore, storageRepository: StorageRepository): EventRepository =
        EventRepositoryImpl(firestore, storageRepository)

    @Provides
    @Singleton
    fun provideTicketRepository(firestore: FirebaseFirestore): TicketRepository =
        TicketRepositoryImpl(firestore)

    @Provides
    @Singleton
    fun provideUserRepository(auth: FirebaseAuth): UserRepository =
        UserRepositoryImpl(auth)

    @Provides
    @Singleton
    fun provideStorageRepository(storage: FirebaseStorage): StorageRepository =
        StorageRepositoryImpl(storage)
}