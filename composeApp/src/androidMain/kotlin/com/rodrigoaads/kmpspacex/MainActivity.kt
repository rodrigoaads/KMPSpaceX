package com.rodrigoaads.kmpspacex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.toArgb
import presentation.pages.LaunchPage
import theme.ProjectColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.setSystemColors()
        setContent {
            MaterialTheme {
                LaunchPage()
            }
        }
    }
}

fun ComponentActivity.setSystemColors() {
    this.window.statusBarColor = ProjectColors.Blue.toArgb()
    this.window.navigationBarColor = ProjectColors.LightGray.toArgb()
}