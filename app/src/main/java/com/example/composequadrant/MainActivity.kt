package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Combinning()
                }
            }
        }
    }
}

@Composable
fun Combinning(modifier: Modifier= Modifier) {
    Column(
        modifier= Modifier
            .fillMaxSize()

    ) {
        Row(
            modifier= Modifier.weight(1f)
        ) {
            Quadrant(
                stringResource(R.string.text_composable),
                stringResource(R.string.text_compossable_text),0xFFEADDFF,modifier = Modifier.weight(1f))
            Quadrant(
                stringResource(R.string.image_composable),
                stringResource(R.string.image_compossable_text),0xFFD0BCFF,modifier = Modifier.weight(1f))
        }
        Row(
            modifier= Modifier.weight(1f)
        ) {
            Quadrant(
                stringResource(R.string.row_composable),
                stringResource(R.string.rowcompossabletext),0xFFB69DF8,modifier = Modifier.weight(1f))
            Quadrant(stringResource(R.string.column_composable),
                stringResource(R.string.coloumncompossabletext),0xFFF6EDFF,modifier = Modifier.weight(1f))
        }
    }
}


@Composable
fun Quadrant(
    first: String, second: String,
    tcolor: Long,
    modifier: Modifier = Modifier) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .background(color = Color(tcolor))
                .fillMaxSize()
        ) {
            Text(
                text=first,
                fontWeight = Bold,
                modifier= Modifier.padding(16.dp)
            )
            Text(
                text=second,
                textAlign = TextAlign.Justify,
                modifier= Modifier.padding(10.dp)
            )
        }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Combinning()
    }
}