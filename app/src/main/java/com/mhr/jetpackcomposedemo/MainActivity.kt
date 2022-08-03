package com.mhr.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    private val fontFamily = FontFamily(
        Font(R.font.comfortaa_bold, FontWeight.Bold),
        Font(R.font.comfortaa_light, FontWeight.Light),
        Font(R.font.comfortaa_medium, FontWeight.Medium),
        Font(R.font.comfortaa_regular, FontWeight.Normal),
        Font(R.font.comfortaa_semibold, FontWeight.SemiBold)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF101010))
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp,
                                fontStyle = FontStyle.Normal,
                            )
                        ) {
                            append("H")
                        }
                        append("itesh ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp,
                                fontStyle = FontStyle.Normal,
                            )
                        ) {
                            append("M")
                        }
                        append("odhwadia")
                    },
                    color = Color.Blue,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),

        ) {
    }
}


