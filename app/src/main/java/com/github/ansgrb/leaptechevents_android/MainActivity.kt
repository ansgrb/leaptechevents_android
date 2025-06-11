package com.github.ansgrb.leaptechevents_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.ansgrb.leaptechevents_android.ui.theme.LeapTechEventsAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LeapTechEventsAndroidTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "login") {
                    composable("login") {
                        // TODO: Handle login logic
                    }
                    composable("event_list") {
                        // TODO: Handle event list logic
                    }
                    composable("event_detail/{eventId}") { backStackEntry ->
                        // TODO : Handle event detail logic
                    }
                    composable("booking/{eventId}") { backStackEntry ->
                        // TODO: Handle booking logic
                    }
                    composable("e_ticket/{ticketId}") { backStackEntry ->
                        // TODO: Handle e-ticket logic
                    }
                    composable("ticket_history") {
                        // TODO: Handle ticket history logic
                    }
                    composable("qr_scanner") {
                        // TODO: Handle QR scanner logic
                    }
                }
            }
        }
    }
}