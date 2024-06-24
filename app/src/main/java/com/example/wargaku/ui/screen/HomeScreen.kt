package com.example.wargaku.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wargaku.ui.component.ButtonTambahPenduduk
import com.example.wargaku.ui.component.CardPenduduk

@Composable
fun HomeScreen(modifier: Modifier = Modifier, navigateTo: (String) -> Unit) {
    Scaffold(
        floatingActionButton = {
            ButtonTambahPenduduk(
                onClick = { navigateTo("AddPeople") },
                modifier = modifier
            )
        }
    ) { innerPadding ->
        Box(modifier = modifier.padding(innerPadding)) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
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
fun DefaultPreviewHomeScreen() {
    HomeScreen(navigateTo = {})
}
