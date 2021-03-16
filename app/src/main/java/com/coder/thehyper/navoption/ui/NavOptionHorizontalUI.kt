package com.coder.thehyper.navoption.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.thehyper.navoption.NavOptionHorizontal


@Composable
fun NavOptionHorizontalUI(data: NavOptionHorizontal) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(23.dp),
        backgroundColor = MaterialTheme.colors.secondaryVariant

    ) {
        Column(

        ) {
            Image(
                painter = painterResource(id = data.aImage),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp),
                contentScale = ContentScale.Crop

            )
            Text(
                text = data.aDes,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(5.dp),
                color = Color.White,
                fontSize = 15.sp
            )
        }


    }
}