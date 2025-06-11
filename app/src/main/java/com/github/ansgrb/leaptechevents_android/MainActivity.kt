package com.github.ansgrb.leaptechevents_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.ansgrb.leaptechevents_android.presentation.screens.BookingScreen
import com.github.ansgrb.leaptechevents_android.presentation.screens.ETicketScreen
import com.github.ansgrb.leaptechevents_android.presentation.screens.EventDetailScreen
import com.github.ansgrb.leaptechevents_android.presentation.screens.EventListScreen
import com.github.ansgrb.leaptechevents_android.presentation.screens.LoginScreen
import com.github.ansgrb.leaptechevents_android.presentation.screens.TicketHistoryScreen
import com.github.ansgrb.leaptechevents_android.ui.theme.LeapTechEventsAndroidTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LeapTechEventsAndroidTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "login") {
                    composable("login") {
                        LoginScreen(navController)
                    }
                    composable("event_list") {
                        EventListScreen(navController)
                    }
                    composable("event_detail/{eventId}") { backStackEntry ->
                        EventDetailScreen(
                            navController,
                            eventId = backStackEntry.arguments?.getString("eventId") ?: ""
                        )
                    }
                    composable("booking/{eventId}") { backStackEntry ->
                        BookingScreen(
                            navController,
                            eventId = backStackEntry.arguments?.getString("eventId") ?: ""
                        )
                    }
                    composable("e_ticket/{ticketId}") { backStackEntry ->
                        ETicketScreen(
                            navController,
                            ticketId = backStackEntry.arguments?.getString("ticketId") ?: ""
                        )
                    }
                    composable("ticket_history") {
                        TicketHistoryScreen(navController)
                    }
                }
            }
        }
    }
}