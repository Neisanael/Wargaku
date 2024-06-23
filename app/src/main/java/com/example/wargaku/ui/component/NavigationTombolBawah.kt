package com.example.wargaku.ui.component

import android.widget.RadioGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun NavigationTombolBawah() {
    var selectedButton by remember { mutableStateOf("Home") }
    BottomAppBar(
        containerColor = Color(0xFF0FA4AF),
        modifier = Modifier
            .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomBarButton(
                Icons.Default.Home,
                "Home",
                selected = selectedButton == "Home"
            ) { selectedButton = "Home" }

            BottomBarButton(
                Icons.Default.Search,
                "Search",
                selected = selectedButton == "Search"
            ) { selectedButton = "Search" }

            BottomBarButton(
                Icons.Default.Person,
                "Profile",
                selected = selectedButton == "Profile"
            ) { selectedButton = "Profile" }
        }
    }
}

@Composable
fun BottomBarButton(
    icon: ImageVector,
    contentDescription: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val tint = if (selected) Color.Black else Color.White

    Icon(
        imageVector = icon,
        contentDescription = contentDescription,
        tint = tint,
        modifier = Modifier
            .size(60.dp)
            .padding(12.dp)
            .clickable(onClick = onClick)
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreviewNavigationTombolBawah() {
    NavigationTombolBawah()
}