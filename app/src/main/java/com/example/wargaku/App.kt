package com.example.wargaku

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.wargaku.ui.component.NavigationTombolBawah
import com.example.wargaku.ui.screen.AddPeopleScreen
import com.example.wargaku.ui.screen.HomeScreen
import com.example.wargaku.ui.screen.ProfileScreen
import com.example.wargaku.ui.screen.SearchScreen

@Composable
fun App() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != "AddPeople") {
                NavigationTombolBawah(navController)
            }
        },
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "Home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("Home") { HomeScreen(navigateTo = { screen -> navController.navigate(screen) }) }
            composable("Search") { SearchScreen() }
            composable("Profile") { ProfileScreen() }
            composable("AddPeople") { AddPeopleScreen() }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    App()
}



