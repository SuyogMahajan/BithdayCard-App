package com.example.birthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycardapp.ui.theme.BirthdayCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

fun add(a: Int, b: Int): Int {
    return a + b
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Composable
fun screen() {

    Box() {

        Image(
            painter = painterResource(id = R.drawable.android_party),
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(modifier = Modifier.padding(top = 20.dp)) {
            Text(text = "Happy Birthday virat !!!",fontSize = 34.sp, modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally))
            Text("-from messi",fontSize = 30.sp, modifier = Modifier.fillMaxWidth().padding(10.dp).wrapContentWidth(Alignment.End))
        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    BirthdayCardAppTheme {
        screen()
    }
}

//project
//       src
//       res
//          drawable
//          mipmap
//          value
//          xml

// 3 standard basic layouts
//        Box
//        Row
//        Column

// Modifiers - beautifies your element or layout
