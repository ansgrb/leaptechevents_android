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
        1,
        "ورشة الرقص الشرقي للسيدات مع شيرين حجازي - Oriental Dance Workshop for Women by Sherin Hegazy",
        "https://placehold.co/600x400",
        date = "Friday, June 20, 2025",
        time = "5:00 PM",
        location = "18 Emad El Deen Street, Cairo, Egypt",
        isTrending = true,
        type = EventType.WORKSHOP,
        description = "Studio Emad Eddin is pleased to host a special Oriental Dance workshop for women led by dancer and trainer Sherin Hegazy.\n" +
                "This workshop offers a safe, energy-filled space to explore oriental dance both as an art form and a powerful tool for reconnecting with the body, embracing femininity in a natural, free, and refined way.\n" +
                "Open to all levels, the workshop balances fun and learning, focusing on the fundamentals and techniques of oriental dance through thoughtful exercises that help participants understand, move, and enjoy their bodies without judgment or comparison.\n" +
                "Oriental dance is not just about step, it's a body language that allows expression, connection, and inner freedom. We dance to celebrate ourselves, to feel, to heal, and to simply enjoy who we are.\n" +
                "About the trainer:\n" +
                "Sherin Hegazy is a dancer, trainer, and movement designer specializing in oriental and contemporary dance. She is the founder of the troupe “Awalem Khafeya”. Her journey began in 1999 with renowned ballet trainer Diana Calenti. In 2008, she joined the Cairo Contemporary Dance Workshop Program at Studio Emad Eddin under Laurence Rondoni, and later completed the “Bothour” trainer’s program (2014/2015) at Ezzat Contemporary Dance Studio.\n" +
                "Workshop Dates:\n" +
                "Four days: Friday & Saturday – June 20, 21, 27, 28, 2025\n" +
                "Time: 5:00 PM to 7:00 PM\n" +
                "Cost: 1000EGP\n" +
                "Register now to secure your place!\n" +
                "https://forms.gle/NKYvjF8EeYokNhqZA\""
    ),
    Event(
        2,
        "Wagef! Comedian Mohamed Helmy",
        "https://placehold.co/600x400",
        isTrending = true,
        type = EventType.COMEDY,
    ),
)

val musicEvents = listOf(
    Event(
        3,
        "Lost In Sound",
        "https://placehold.co/600x400",
        type = EventType.MUSIC,
        date = "June 18th, 2025",
    ),
    Event(
        4, "Firket Al Akhwa", "https://placehold.co/600x400",
        type = EventType.MUSIC,
    ),
)

val entertainmentEvents = listOf(
    Event(
        5,
        "Tamer Hosny & Tamer Ashour",
        "https://placehold.co/600x400",
        type = EventType.ENTERTAINMENT,
        date = "13 JUN",
    ),
    Event(
        6,
        "Angham",
        "https://placehold.co/600x400",
        type = EventType.ENTERTAINMENT,
        date = "20 JUNE",
    ),
    Event(
        7, "J's World - Experience", "https://placehold.co/600x400", type = EventType.ENTERTAINMENT,
    ),
    Event(
        8, "Al Qarya Al Tarfihiya", "https://placehold.co/600x400", type = EventType.ENTERTAINMENT,
    ),
)

val otherEvents = listOf(
    Event(
        9, "Hikayat Adnan", "https://placehold.co/600x400",
    ),
    Event(
        10, "Enayat Markaza - Eid Al Adha", "https://placehold.co/600x400",
    ),
    Event(
        11, "Idaret Alalaqat Al Insania", "https://placehold.co/600x400",
    ),
    Event(
        12, "The White Room", "https://placehold.co/600x400",
    ),
    Event(
        13, "Classical Music Concert", "https://placehold.co/600x400", date = "12/06/2025",
    ),
    Event(
        14, "Kifaan Qat'ah", "https://placehold.co/600x400",
    ),
    Event(
        15, "Eish Al Hadara", "https://placehold.co/600x400",
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
