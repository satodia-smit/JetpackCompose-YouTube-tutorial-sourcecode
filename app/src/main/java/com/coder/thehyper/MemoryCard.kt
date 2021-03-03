package com.coder.thehyper

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun loadMemoryCard(memoryData: MemoryData) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .shadow(5.dp)
    ) {
        Image(painter = painterResource(id = memoryData.aImageRes), contentDescription = null)
        Text(
            text = memoryData.aYear,
            modifier = Modifier.padding(5.dp),
            color = Color.Yellow,
            fontSize = 30.sp
        )
    }
}