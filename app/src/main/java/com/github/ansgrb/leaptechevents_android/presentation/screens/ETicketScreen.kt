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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.github.ansgrb.leaptechevents_android.presentation.viewmodels.ETicketViewModel
import com.github.ansgrb.leaptechevents_android.presentation.viewmodels.stringToBitmap


@Composable
fun ETicketScreen(
    navController: NavController,
    ticketId: String,
    viewModel: ETicketViewModel = hiltViewModel(),
) {
    val ticket = viewModel.ticket.collectAsState(initial = null).value

    LaunchedEffect(ticketId) {
        viewModel.loadTicket(ticketId)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        ticket?.let {
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val qrBitmap = stringToBitmap(it.qrCode)
                qrBitmap?.let {
                    Image(
                        bitmap = it.asImageBitmap(),
                        contentDescription = "QR Code",
                        modifier = Modifier.size(200.dp)
                    )
                }

                Text(text = it.qrCode, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "This is your reservation's reference code", fontSize = 12.sp)

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = "COMEDY SHOW", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Text(text = "13 November, 2019", fontSize = 16.sp)
                Text(text = "Salmiya Theatre", fontSize = 16.sp)

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "Gold Ticket", fontSize = 16.sp)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "A3 A4 A5", fontSize = 16.sp)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "3", fontSize = 16.sp)
                }
            }
        }
    }
}


