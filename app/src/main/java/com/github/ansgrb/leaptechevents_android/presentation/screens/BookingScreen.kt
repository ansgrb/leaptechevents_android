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
package com.github.ansgrb.leaptechevents_android.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.github.ansgrb.leaptechevents_android.presentation.viewmodels.BookingViewModel
import kotlinx.coroutines.launch

@Composable
fun BookingScreen(
    navController: NavController,
    eventId: String,
    viewModel: BookingViewModel = hiltViewModel(),
) {
    val isBookingSuccess = viewModel.isBookingSuccess.collectAsState().value
    val userId = viewModel.currentUserId
    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Booking for Event $eventId")
        Button(onClick = {
            scope.launch {
                viewModel.bookTicket(eventId, userId ?: "") { ticket ->
                    navController.navigate("e_ticket/${ticket.id}")
                }
            }
        }) {
            Text("Confirm Booking")
        }
        if (isBookingSuccess) {
            Text(text = "Booking Successful!")
        }
    }
}
