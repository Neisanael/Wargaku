package com.example.wargaku.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.wargaku.ui.component.FieldTextCari

@Composable
fun SearchScreen(modifier: Modifier = Modifier){
    FieldTextCari(modifier)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewSearchScreen(){
    SearchScreen()
}