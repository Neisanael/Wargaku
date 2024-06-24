package com.example.wargaku.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonKembali(onClick: () -> Unit = {}) { // Provide a default empty lambda
    Icon(
        imageVector = Icons.Default.ArrowBack,
        contentDescription = "Panah Kembali",
        modifier = Modifier
            .size(24.dp) // Set the size of the icon
            .clickable { onClick() } // Set the click event
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewButtonKembali() {
    ButtonKembali()
}