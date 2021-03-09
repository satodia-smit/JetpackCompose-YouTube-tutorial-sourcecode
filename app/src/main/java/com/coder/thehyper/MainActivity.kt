package com.coder.thehyper

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = Color.Green) {
                loadUI()
            }

        }
    }

    @Composable
    fun loadUI() {

        val memoryData = remember { mutableStateOf(MemoryData()) }
        memoryData.value = listOfMemories()[0]

        val quoteSize = remember { mutableStateOf(15) }

        Column(modifier = Modifier.fillMaxHeight()) {

            TopAppBar(title = { Text(text = "Memory Book") })
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .shadow(5.dp)
            ) {
                Row() {
                    Text(
                        text = "Life of THE HYPER CODER",
                        color = Color.Gray,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(all = 10.dp)
                    )

                    Button(
                        onClick = {
                            when {
                                listOfMemories().indexOf(memoryData.value) == listOfMemories().size - 1 -> {
                                    memoryData.value = listOfMemories()[0]
                                }
                                else -> {
                                    memoryData.value =
                                        listOfMemories()[listOfMemories().indexOf(memoryData.value) + 1]
                                }
                            }
                        },
                        modifier = Modifier
                            .padding(all = 10.dp)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Change", color = Color.White)
                    }

                }
            }

            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .shadow(5.dp)
            ) {
                Column {
                    Image(
                        painter = painterResource(id = memoryData.value.aImageRes),
                        contentDescription = null
                    )
                    Text(
                        text = memoryData.value.aQuoute,
                        modifier = Modifier.padding(5.dp),
                        color = Color.DarkGray,
                        fontSize = quoteSize.value.sp
                    )
                }
            }

            Button(
                onClick = { quoteSize.value = quoteSize.value + 1 }, modifier = Modifier
                    .padding(all = 10.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Increase Font Size", color = Color.White)
            }
        }
    }
}
