package com.example.basiclayout

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiclayout.ui.theme.BasicLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(modifier = Modifier.padding(all = 24.dp)) {
//                Header()
//
//                Spacer(modifier = Modifier.height(24.dp))

                Layout4()
            }
        }
    }
}

//@Composable
//fun Header() {
//    Row(
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier
//            .fillMaxWidth()
//    ) {
//        Box {
//            Text(text = "Settings")
//        }
//
//        Box {
//            Text(text = "profile")
//        }
//    }
//}

@Composable
fun Layout4() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth())
    {
        Header()

        ProductList()
    }

    Button(onClick = {}) {

    }
}

@Composable
fun Header() {
    Text(text = "Køb Køb Køb")
}

@Composable
fun ProductList() {
    Column {
        Product("jkasbdjkasbdkjsb")
        Product("hej hej ")
        Product("bbbbb")
    }
}

@Composable
fun Product(text:String) {
    Row(
        modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Image(
            painter = painterResource(id = R.drawable.productimage),
            contentDescription = "My Image",
            modifier = Modifier.size(100.dp)
        )

        Text(text = text)

        Button(onClick = {}) {
            Text("+")
        }
    }
}