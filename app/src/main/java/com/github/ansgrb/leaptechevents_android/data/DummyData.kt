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
    val imageUrl: String = "https://res.cloudinary.com/dsswvewxx/image/upload/01_rlna9j.jpg",
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
        id = 1,
        title = "ورشة الرقص الشرقي للسيدات مع شيرين حجازي - Oriental Dance Workshop for Women by Sherin Hegazy",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/01_rlna9j.jpg",
        date = "Friday, June 20, 2025",
        time = "5:00 PM",
        location = "18 Emad El Deen Street, Cairo, Egypt",
        isTrending = true,
        organizedBy = "Studio Emad Eddin",
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
        id = 2,
        title = "Grüne Fête de La Musique 3rd Edition | عيد الموسيقى والبيئة النسخة الثالثة",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/02_wwt2zm.jpg",
        date = "Saturday, June 21, 2025",
        time = "4:00 PM",
        location = "The GrEEK Campus",
        isTrending = true,
        organizedBy = "Goethe-Institut Kairo",
        type = EventType.MUSIC,
        description = "Join us for the 3rd edition of the Grüne Fête de La Musique, a celebration of music and environmental awareness! This year, we are excited to bring you an unforgettable experience at The GrEEK Campus in Cairo.\n" +
                "Date: Saturday, June 21, 2025\n" +
                "Time: 4:00 PM onwards\n" +
                "Location: The GrEEK Campus, Cairo\n" +
                "Organized by: Goethe-Institut Kairo\n" +
                "This event is not just about music; it's about making a positive impact on our environment. Enjoy live performances from talented artists while learning about sustainable practices and how we can all contribute to a greener future.\n" +
                "Don't miss out on this unique opportunity to enjoy great music and support environmental initiatives. See you there!"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),

)

val musicEvents = listOf(
    Event(
        id = 4,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 5,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
)

val entertainmentEvents = listOf(
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
)

val otherEvents = listOf(
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
    ),
    Event(
        id = 3,
        title = "1st Med Diplomacy Program 2025",
        imageUrl = "https://res.cloudinary.com/dsswvewxx/image/upload/03_xvvb8u.jpg",
        date = "Jun 13",
        time = "11:00 PM",
        location = "Cairo, Cairo Governorate, Egypt",
        isTrending = true,
        duration = "2 Days",
        organizedBy = "IFMSA-Egypt and MTI Students' Scientific Society - MTISSS",
        type = EventType.EDUCATIONAL,
        description = "Have you ever thought that a diplomat could be wearing a white coat, holding a stethoscope and an anatomy book? Have you ever imagined that a diplomat could be you?\n" +
                "Global health requires more than just clinical skills; it demands strong advocacy strategies, a diverse set of skills, and a sturdy representation.\n" +
                "IFMSA-Egypt is officially launching the Med Diplomacy Programm. Featuring two transformative workshops:\n" +
                "External Affairs Workshop—Shaping Impact Beyond Borders and Advancing External Relations.\n" +
                "B4C—Mastering Policy-Making.\n" +
                "As we advocate for global health, we call for the world to listen. That means our voice must be steady, clear, and confident.\n" +
                "Now it’s your turn to become the next diplomat to advocate for your cause and credence.\n" +
                "So are you ready, future diplomat?"
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
