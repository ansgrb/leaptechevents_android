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
package com.github.ansgrb.leaptechevents_android.data

enum class EventType {
    TRENDING,
    MUSIC,
    ENTERTAINMENT,
    THEATER,
    WORKSHOP,
    GAMES,
    COMEDY,
    CULTURAL,
    SPORTS,
    EDUCATIONAL
}

data class Event(
    val id: Int = 0,
    val title: String = "Event Title",
    val imageUrl: String = "https://collection.cloudinary.com/dsswvewxx/6da05f81b6967427b69bc74ba0dadb63",
    val date: String = "13-16 JUNE",
    val time: String = "7:00 PM",
    val location: String = "Kuwait",
    val duration: String = "3 hours",
    val isTrending: Boolean = false,
    val organizedBy: String = "Leap Tech",
    val type: EventType = EventType.ENTERTAINMENT,
    val description: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
)

val trendingEvents = listOf(
    Event(
        1, "The Show Live", "https://i.imgur.com/L3k93tM.jpeg", isTrending = true,
        type = EventType.ENTERTAINMENT,
    ),
    Event(
        2,
        "Wagef! Comedian Mohamed Helmy",
        "https://i.imgur.com/G4P4B0r.jpeg",
        isTrending = true,
        type = EventType.COMEDY,
    ),
)

val musicEvents = listOf(
    Event(
        3,
        "Lost In Sound",
        "https://i.imgur.com/2U2Yd0g.jpeg",
        type = EventType.MUSIC,
        date = "June 18th, 2025",
    ),
    Event(
        4, "Firket Al Akhwa", "https://i.imgur.com/T0bC07G.jpeg",
        type = EventType.MUSIC,
    ),
)

val entertainmentEvents = listOf(
    Event(
        5,
        "Tamer Hosny & Tamer Ashour",
        "https://i.imgur.com/x0R6NnI.jpeg",
        type = EventType.ENTERTAINMENT,
        date = "13 JUN",
    ),
    Event(
        6,
        "Angham",
        "https://i.imgur.com/R3pXJzU.jpeg",
        type = EventType.ENTERTAINMENT,
        date = "20 JUNE",
    ),
    Event(
        7, "J's World - Experience", "https://i.imgur.com/Z4w2f0y.jpeg", type = EventType.ENTERTAINMENT,
    ),
    Event(
        8, "Al Qarya Al Tarfihiya", "https://i.imgur.com/R0X7B93.jpeg", type = EventType.ENTERTAINMENT,
    ),
)

val otherEvents = listOf(
    Event(
        9, "Hikayat Adnan", "https://i.imgur.com/aA6Nl6R.jpeg",
    ),
    Event(
        10, "Enayat Markaza - Eid Al Adha", "https://i.imgur.com/N7b003K.jpeg",
    ),
    Event(
        11, "Idaret Alalaqat Al Insania", "https://i.imgur.com/Dckp0E2.jpeg",
    ),
    Event(
        12, "The White Room", "https://i.imgur.com/k6lP0s9.jpeg",
    ),
    Event(
        13, "Classical Music Concert", "https://i.imgur.com/XGfD8sT.jpeg", date = "12/06/2025",
    ),
    Event(
        14, "Kifaan Qat'ah", "https://i.imgur.com/QhT8jK7.jpeg",
    ),
    Event(
        15, "Eish Al Hadara", "https://i.imgur.com/Lp75xJ9.jpeg",
    ),

//    Event(
//        id = 1,
//        title = "",
//        imageUrl = "",
//        date = "",
//        time = "",
//        location = "",
//        duration = "3 hours",
//        isTrending = false,
//        organizedBy = "",
//        type = "Entertainment",
//        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
//    )
)
