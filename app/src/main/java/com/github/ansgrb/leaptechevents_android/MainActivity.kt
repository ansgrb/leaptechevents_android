package com.github.ansgrb.leaptechevents_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.github.ansgrb.leaptechevents_android.ui.theme.LeapTechEventsAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LeapTechEventsAndroidTheme {
//                val navController = rememberNavController()

            }
        }
    }
}