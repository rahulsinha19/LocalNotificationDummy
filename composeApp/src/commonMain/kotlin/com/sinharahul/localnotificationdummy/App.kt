package com.sinharahul.localnotificationdummy

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.sinharahul.localnotificationdummy.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        HomeScreen()
    }
}