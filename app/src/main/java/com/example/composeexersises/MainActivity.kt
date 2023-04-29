package com.example.composeexersises

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeexersises.ui.theme.ComposeExersisesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExersisesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeBackgroundImage(
                        title = stringResource(R.string.title),
                        desc = stringResource(R.string.desc),
                        desc2 = stringResource(R.string.desc2))
                }
            }
        }
    }
}

@Composable
fun ComposeBackgroundImage(title : String, desc: String, desc2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(verticalArrangement = Arrangement.Top) {
        Image(painter = image, contentDescription = null, contentScale = ContentScale.FillWidth)
        ComposeText(
            title = stringResource(R.string.title),
            desc = stringResource(R.string.desc),
            desc2 = stringResource(R.string.desc2),
            modifier = Modifier
        )
    }
}

@Composable
fun ComposeText(title: String, desc: String, desc2: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 36.sp,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp)
        )
        Text(
            text = desc,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(top = 16.dp, end = 16.dp, start = 16.dp)
        )
        Text(
            text = desc2,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(top = 16.dp, end = 16.dp, start = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeExersisesTheme {
        ComposeBackgroundImage(
            title = stringResource(R.string.title),
            desc = stringResource(R.string.desc),
            desc2 = stringResource(R.string.desc2))
    }
}