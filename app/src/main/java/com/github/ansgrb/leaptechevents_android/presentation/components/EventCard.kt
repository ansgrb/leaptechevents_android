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
package com.github.ansgrb.leaptechevents_android.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.github.ansgrb.leaptechevents_android.data.Event

@Composable
fun EventCard(
    event: Event,
    onClick: (Event) -> Unit,
    showTypeChip: Boolean = false, // default to false cuz not all sections needs to show the type chip
) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(240.dp)
            .clickable { onClick(event) },
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
    ) {
        Column {
            Box {
                AsyncImage(
                    model = event.imageUrl,
                    contentDescription = event.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(130.dp)
                        .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp))
                )
                // Only show type chip if showTypeChip is true
                if (showTypeChip) {
                    Card(
                        modifier = Modifier
                            .padding(8.dp)
                            .align(Alignment.TopStart),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0x80000000)
                        ),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text(
                            text = event.type.name,
                            color = Color.White,
                            fontSize = 10.sp,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                }
            }
            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = event.title,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "${event.date} • ${event.location}",
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            }
        }
    }
}

