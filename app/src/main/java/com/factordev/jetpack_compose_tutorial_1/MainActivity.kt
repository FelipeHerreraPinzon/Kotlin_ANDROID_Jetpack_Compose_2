package com.factordev.jetpack_compose_tutorial_1

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.factordev.jetpack_compose_tutorial_1.ui.theme.JetpackComposeTutorial1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            JetpackComposeTutorial1Theme() {
                MyComponent()
            }
           // MyImage()
           // MyTexts()
        }
    }
}

@Composable
fun MyComponent(){
    Row(modifier = Modifier
        .background(Color.White)
        .padding(8.dp)) {
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyImage(){
    Image(painterResource(R.drawable.ic_launcher_foreground),
        "mi imagen",
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
        )

}

@Composable
fun MyTexts(){
    Column(modifier = Modifier.padding(8.dp)){
        MyText(
            text = "Hola Jetpack Compose !!!",
            MaterialTheme.colorScheme.primary,
            MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        MyText(text = "Preparado ?",
            MaterialTheme.colorScheme.tertiary,
            MaterialTheme.typography.titleLarge
        )
    }

}


@Composable
fun MyText(text: String, color: Color, bodyLarge: TextStyle){
    Text(text, color = color)
}

@Preview
@Composable
fun PreviewComponent(){
    JetpackComposeTutorial1Theme {
        MyComponent()
    }
  //  MyImage()

}

