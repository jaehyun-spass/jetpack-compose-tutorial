package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF0a3041)
                ) {
                    AppScreen()
                }
            }
        }
    }
}

@Composable
fun AppScreen() {
    MainProfile("Jennifer Doe", "Android Developer Extraordinaire")
}

@Composable
private fun MainProfile(name: String, position: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
        )
        Text(
            text = name,
            color = Color.White,
            fontSize = 48.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(bottom =4.dp)

        )
        Text(
            text = position,
            color = Color(0xFF3ddc84)
        )
    }
}

@Composable
fun AdditionalInfoRow() {
    Row() {
        Icon(
            imageVector = Icons.Filled.Phone,
            contentDescription = "Phone number",
            tint = Color(0xFF3ddc84)
        )
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFF0a3041
)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        AppScreen()
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFF0a3041
)
@Composable
fun AdditionalInfoRowPreview() {
    BusinessCardTheme {
        AdditionalInfoRow()
    }
}