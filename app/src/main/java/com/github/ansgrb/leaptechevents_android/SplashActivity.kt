package com.github.ansgrb.leaptechevents_android

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.ansgrb.leaptechevents_android.presentation.components.GradientButton

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SplashScreen(
                onGetStartedClick = {
                    startActivity(Intent(this, MainActivity::class.java))
                }
            )
        }
    }
}

@Composable
@Preview
fun SplashScreen(
    onGetStartedClick: () -> Unit = {},
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ConstraintLayout {
            val (
                background,
                logo,
                title,
                subtitle,
                startbtn,
            ) = createRefs()

            // background
            Image(
                painter = painterResource(R.drawable.abstractbackground),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .constrainAs(background) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )

            // logo
//            Image(
//                painter = painterResource(R.drawable.leaptechlogo),
//                contentDescription = null,
//                modifier = Modifier
//                    .constrainAs(logo) {
//                        top.linkTo(parent.top, margin = 100.dp)
//                        start.linkTo(parent.start)
//                        end.linkTo(parent.end)
//                    }
//            )

            // title
            val styledText = buildAnnotatedString {
                append("Discover your\nFuture")
                withStyle(style = SpanStyle(color = colorResource(id = R.color.gold))) {
                    append(" Events")
                }
                append("\nEasily")
            }
            Text(
                text = styledText,
                fontSize = 53.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 32.dp)
                    .padding(horizontal = 16.dp)
                    .constrainAs(title) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    },
            )

            // subtitle
            Text(
                text = stringResource(R.string.subtitle_splash),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.gold),
                modifier = Modifier
                    .padding(top = 32.dp, start = 16.dp)
                    .constrainAs(subtitle) {
                        top.linkTo(title.bottom)
                        start.linkTo(title.start)
                    }
            )

            // logo
            Image(
                painter = painterResource(R.drawable.ticket_01),
                contentDescription = null,
                modifier = Modifier
                    .constrainAs(logo) {
                        top.linkTo(subtitle.bottom, margin = 4.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )

            // start button
            Box(
                modifier = Modifier
                    .constrainAs(startbtn) {
                        bottom.linkTo(parent.bottom)
//                        start.linkTo(parent.start)
//                        end.linkTo(parent.end)
                    }
            ) {
                GradientButton(
                    onClick = onGetStartedClick,
                    text = "Get Started",
                    padding = 32
                )
            }

        }
    }
}