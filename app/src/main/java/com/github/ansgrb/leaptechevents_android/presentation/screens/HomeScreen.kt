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

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.github.ansgrb.leaptechevents_android.R
import com.github.ansgrb.leaptechevents_android.data.Event
import com.github.ansgrb.leaptechevents_android.data.EventType
import com.github.ansgrb.leaptechevents_android.data.entertainmentEvents
import com.github.ansgrb.leaptechevents_android.data.musicEvents
import com.github.ansgrb.leaptechevents_android.data.otherEvents
import com.github.ansgrb.leaptechevents_android.data.trendingEvents


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onEventClick: (Event) -> Unit,
    onSearchClick: () -> Unit,
    onMyTicketsClick: () -> Unit,
    onSignInClick: () -> Unit,
    onMenuClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
//                        Text(text = "LeapTech Events")
                        Image(
                            painter = painterResource(R.drawable.leaptechlogo),
                            contentDescription = "LeapTech Logo",
                            modifier = Modifier.height(30.dp)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onMenuClick) {
                        Icon(Icons.Filled.Menu, "Menu", tint = Color.White)
                    }
                },
                actions = {
                    IconButton(onClick = onSearchClick) {
                        Icon(Icons.Filled.Person, "Profile", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(R.color.dark_purple),
                    titleContentColor = Color.White
                )
            )
        },
        content = { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(R.color.dark_purple))
                    .padding(paddingValues)
            ) {
                item {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(350.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .clickable {
                                    onEventClick(
                                        Event(
                                            1,
                                            "Main Event",
                                            "https://collection.cloudinary.com/dsswvewxx/ba36173a7df92e2ca78d8d0f19d84676",
                                            date = "",
                                            time = "",
                                            location = "",
                                            duration = "",
                                            isTrending = false,
                                            organizedBy = "",
                                            type = EventType.ENTERTAINMENT,
                                            description = "Join us for the main event of the year! " +
                                                    "Experience an unforgettable night filled with excitement and entertainment."
                                        )
                                    )
                                }
                        ) {
//                            AsyncImage(
//                                model = "https://collection.cloudinary.com/dsswvewxx/ba36173a7df92e2ca78d8d0f19d84676",
//                                contentDescription = "Main Event",
//                                modifier = Modifier.fillMaxSize(),
//                                contentScale = ContentScale.Crop
//                            )
                            Image(
                                painter = painterResource(id = R.drawable.mainevent_03),
                                contentDescription = "Main Event",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

//                            Column(
//                                modifier = Modifier
//                                    .fillMaxSize()
//                                    .background(Color.Black.copy(alpha = 0.5f))
//                                    .padding(16.dp),
//                                verticalArrangement = Arrangement.Bottom,
//                                horizontalAlignment = Alignment.End
//                            ) {
//                                // don't know if we want to add a water mark here
//                                Image(
//                                    painter = painterResource(R.drawable.leaptechlogo),
//                                    contentDescription = "LeapTech Logo",
//                                    modifier = Modifier.height(20.dp)
//                                )
//                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        OutlinedTextField(
                            value = "",
                            onValueChange = { /* do nothing for now */ },
                            placeholder = {
                                Text(
                                    "Search for events you love",
                                    color = Color.Gray
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onSearchClick() },
                            leadingIcon = {
                                Icon(
                                    Icons.Filled.Search,
                                    "Search",
                                    tint = Color.White
                                )
                            },
                            enabled = false, // make it non-editable, just a clickable placeholder
                            colors = TextFieldDefaults.colors(
                                focusedIndicatorColor = colorResource(R.color.gold),
                                unfocusedIndicatorColor = Color.Gray,
                                cursorColor = Color.White,
                                unfocusedTextColor = Color.White,
                                focusedTextColor = Color.White,
                                disabledContainerColor = Color.DarkGray,
                                disabledTextColor = Color.White,
                                disabledIndicatorColor = Color.Gray,
                                disabledLeadingIconColor = Color.White
                            ),
                            shape = RoundedCornerShape(8.dp)
                        )
                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "Trending 🔥",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(trendingEvents) { event ->
                                EventCard(event = event, onClick = onEventClick, showTypeChip = true)
                            }
                        }
                        Text(
                            text = "Music",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(musicEvents) { event ->
                                EventCard(event = event, onClick = onEventClick)
                            }
                        }
                        Text(
                            text = "Entertainment",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(entertainmentEvents) { event ->
                                EventCard(event = event, onClick = onEventClick)
                            }
                        }
                        Text(
                            text = "BackStage Group",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(otherEvents.filter { it.id == 9 || it.id == 10 }) { event ->
                                EventCard(event = event, onClick = onEventClick)
                            }
                        }
                        Text(
                            text = "Trend",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(otherEvents.filter { it.id == 11 || it.id == 12 }) { event ->
                                EventCard(event = event, onClick = onEventClick)
                            }
                        }
                    }
                }
            }
        }

    )
}

@Composable
fun EventCard(
    event: Event,
    onClick: (Event) -> Unit,
    showTypeChip: Boolean = false // default to false cuz not all sections needs to show the type chip
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

@Preview(
    name = "Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showSystemUi = true
)
@Preview(
    name = "Light Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showSystemUi = true
)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        onEventClick = {},
        onSearchClick = {},
        onMyTicketsClick = {},
        onSignInClick = {},
        onMenuClick = {}
    )
}