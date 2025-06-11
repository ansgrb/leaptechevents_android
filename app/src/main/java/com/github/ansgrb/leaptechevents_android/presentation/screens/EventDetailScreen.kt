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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.github.ansgrb.leaptechevents_android.presentation.viewmodels.EventDetailViewModel

@Composable
fun EventDetailScreen(
    navController: NavController,
    eventId: String,
    viewModel: EventDetailViewModel = hiltViewModel(),
) {
    val event = viewModel.event.collectAsState(initial = null).value

    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        event?.let {
            Text(text = it.title)
            Text(text = it.date)
            Text(text = it.location)
            Text(text = it.details)
            Button(
                onClick = {
                    navController.navigate("booking/${it.id}")
                }
            ) {
                Text("Book Ticket")
            }
        }
    }
}
