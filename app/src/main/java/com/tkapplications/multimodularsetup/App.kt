package com.tkapplications.multimodularsetup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tkapplications.multimodularsetup.ui.theme.AppTheme

@Composable
fun App(modifier: Modifier) {
    Scaffold(topBar = {}, bottomBar = {}) {innerPadding ->
        Column(modifier =
            modifier.fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Hello, Welcome to Multi Modular Architecture Setup!",
            )
            Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).height(42.dp), onClick = {}, shape = AppTheme.shape.button) {
                Text(
                    "Click Me",
                )
            }
        }
    }
}