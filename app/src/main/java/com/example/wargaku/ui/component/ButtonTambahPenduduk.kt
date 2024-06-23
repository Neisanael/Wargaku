package com.example.wargaku.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.wargaku.R
import androidx.compose.ui.unit.dp

@Composable
fun ButtonTambahPenduduk() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .padding(12.dp)
            .size(60.dp),
        containerColor = Color(0xFF0FA4AF)
    ) {
        Icon(
            Icons.Default.Add,
            contentDescription = "Add",
            tint = Color.Black,
            modifier = Modifier
                .size(48.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewButtonTambahPenduduk() {
    ButtonTambahPenduduk()
}