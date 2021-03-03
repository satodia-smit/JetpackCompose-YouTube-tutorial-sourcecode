package com.coder.thehyper

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colors.background) {
                loadUI()
            }
        }
    }
}

@Preview
@Composable
fun loadUI() {
    Column(modifier = Modifier.padding(5.dp)) {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .verticalScroll(rememberScrollState())
        ) {
            listOfMemories().forEach { memoryData ->
                loadMemoryCard(memoryData = memoryData)
            }
        }
    }
}
