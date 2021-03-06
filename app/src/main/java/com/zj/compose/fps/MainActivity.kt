package com.zj.compose.fps

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zj.compose.fps.ui.page.list.ComposeListActivity
import com.zj.compose.fps.ui.page.particle.ComposeParticleActivity
import com.zj.compose.fps.ui.theme.ComposefpsTheme
import com.zj.view.page.particle.ParticleActivity
import com.zj.view.page.recyclerview.RecyclerViewActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposefpsTheme {
                // A surface container using the 'background' color from the theme
                ItemList()
            }
        }
    }
}

@Composable
fun ItemList() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(44.dp)
            .clip(RoundedCornerShape(16)),
            onClick = {
                context.startActivity(Intent(context, ComposeListActivity::class.java))
            }) {
            Text(text = "Compose List Fps测试")
        }

        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(44.dp)
            .clip(RoundedCornerShape(16)),
            onClick = {
                context.startActivity(Intent(context, RecyclerViewActivity::class.java))
            }) {
            Text(text = "RecyclerView List Fps测试")
        }

        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(44.dp)
            .clip(RoundedCornerShape(16)),
            onClick = {
                context.startActivity(Intent(context, ComposeParticleActivity::class.java))
            }) {
            Text(text = "Compose 粒子动画 Fps测试")
        }

        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(44.dp)
            .clip(RoundedCornerShape(16)),
            onClick = {
                context.startActivity(Intent(context, ParticleActivity::class.java))
            }) {
            Text(text = "View 粒子动画 Fps测试")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposefpsTheme {
        Greeting("Android")
    }
}