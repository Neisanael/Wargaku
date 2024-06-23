package com.example.wargaku

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wargaku.ui.component.ButtonTambahPenduduk
import com.example.wargaku.ui.component.CardPenduduk
import com.example.wargaku.ui.component.FieldTextCari
import com.example.wargaku.ui.component.NavigationTombolBawah

@Composable
fun App() {
    Scaffold(
        bottomBar = {
            NavigationTombolBawah()
        },
        floatingActionButton = {
            FieldTextCari()
        }) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp) // Additional padding for the content
            ) {
                items(5) {
                    CardPenduduk(modifier = Modifier.padding(vertical = 8.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    App()
}



