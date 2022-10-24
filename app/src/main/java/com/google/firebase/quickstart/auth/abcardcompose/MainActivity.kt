package com.google.firebase.quickstart.auth.abcardcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.quickstart.auth.abcardcompose.ui.theme.AbCardComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    AbCards()
        }
    }
}
@Composable
fun AbSimpleCard(){
    val paddingModifier  = Modifier.padding(10.dp)
    Card(elevation = 10.dp, modifier = paddingModifier) {
        Text(text = "Simple Card with elevation",
            modifier = paddingModifier)
    }
}

@Composable
fun AbCardWithShape() {
    val paddingModifier = Modifier.padding(10.dp)
    Card(shape = RoundedCornerShape(20.dp),elevation = 10.dp, modifier = paddingModifier) {
        Text(text = "Round corner shape", modifier = paddingModifier)
    }
}

@Composable
fun AbCardWithBorder() {
    val paddingModifier = Modifier.padding(10.dp)
    Card(
        elevation = 10.dp,
        border = BorderStroke(1.dp, Color.Blue),
        modifier = paddingModifier
    ) {
        Text(text = "Card with blue border", modifier = paddingModifier)
    }
}

@Composable
fun AbCardWithMultipleViews() {
    val paddingModifier = Modifier.padding(10.dp)
    Card(
        elevation = 10.dp,
        modifier = paddingModifier
    ) {
        Column(modifier = paddingModifier){
            Text(text = "First Text")
            Text(text = "Second Text")
        }
    }
}

@Composable
fun AbCardWithContentColor() {
    val paddingModifier = Modifier.padding(10.dp)
    Card(
        elevation = 10.dp,
        contentColor = Color.Blue,
        modifier = paddingModifier
    ) {
        Column() {
            Text(text = "Text with card content color (Blue)",
                modifier = paddingModifier)
            Text(text = "Text with card custom color",
                color = Color.Black,
                modifier = paddingModifier)

        }
    }
}
@Composable
fun AbCards()
{
  Column {

          AbSimpleCard()
          AbCardWithShape()
          AbCardWithBorder()
          AbCardWithMultipleViews()
          AbCardWithContentColor()


  }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun defaultPreview()
{
     AbCards()
}