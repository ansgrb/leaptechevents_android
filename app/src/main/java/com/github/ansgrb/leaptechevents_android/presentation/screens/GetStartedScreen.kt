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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.ansgrb.leaptechevents_android.R
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import com.github.ansgrb.leaptechevents_android.presentation.components.GradientButton

@Composable
@Preview
fun GetStartedScreen(
    onGetStartedClick: () -> Unit = {},
) {
    val backgroundBrush = Brush.verticalGradient(
        colors = listOf(
            colorResource(R.color.dark_purple),
            colorResource(R.color.light_purple).copy(alpha = 0.7f)
        )
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = backgroundBrush)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.Start

        ) {
            val styledText = buildAnnotatedString {
                append("Discover your\nFuture")
                withStyle(style = SpanStyle(color = colorResource(R.color.gold))) {
                    append(" Events")
                }
                append("\nEasily")
            }
            Text(
                text = styledText,
                color = Color.White,
                fontSize = 49.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Start,
                lineHeight = 50.sp,
                modifier = Modifier.padding(top = 80.dp)
            )
            Text(
                text = stringResource(R.string.subtitle_splash),
                color = colorResource(R.color.gold),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                maxLines = 2,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(top = 24.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ticket_01),
                    contentDescription = "Ticket illustration",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxWidth(0.8f)
                )
            }
            GradientButton(
                onClick = onGetStartedClick,
                text = "Get Started",
                modifier = Modifier
                    .padding(bottom = 40.dp)

            )
        }
    }
}