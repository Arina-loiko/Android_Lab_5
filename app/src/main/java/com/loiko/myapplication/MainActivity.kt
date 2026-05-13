package com.loiko.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.loiko.myapplication.ui.theme.Android_Lab_5_loikoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_Lab_5_loikoTheme {
                Text(
                    modifier = Modifier
                        .background(Color.Green)
                        .padding(top = 48.dp, start = 16.dp, end = 16.dp)
                        .width(100.dp),
                    text = "Hello",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Blue,
                    fontSize = 20.sp,
                    letterSpacing = 2.sp
                )
            }
        }
    }
}
