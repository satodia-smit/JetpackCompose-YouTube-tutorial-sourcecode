package com.coder.thehyper.navoption.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.coder.thehyper.navoption.NavOption

@Composable
fun NavOptionUI(data: NavOption) {

    TextButton(
        onClick = { },
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                imageVector = data.aIcon,
                contentDescription = null, // decorative
                colorFilter = ColorFilter.tint(
                    MaterialTheme.colors.secondaryVariant
                )
            )
            Spacer(Modifier.width(16.dp))
            Text(
                text = data.aLabel,
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.secondaryVariant,
            )
        }
    }


}