package com.coder.thehyper.navoption

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import com.coder.thehyper.R

fun listOfNavOptionSource() = mutableListOf(
    NavOption(aIcon = Icons.Default.Favorite, "My All Memories"),
    NavOption(aIcon = Icons.Default.Add, "Create new Memory"),
    NavOption(aIcon = Icons.Default.Close, "Memory's Dustbin")
)

fun listOfNavOptionHorizontalSource() = mutableListOf(
    NavOptionHorizontal(aImage = R.drawable.pic2, "With Her"),
    NavOptionHorizontal(aImage = R.drawable.pic3, "Family Diaries"),
    NavOptionHorizontal(aImage = R.drawable.pic4, "College Memories")
)