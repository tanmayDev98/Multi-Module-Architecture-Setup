package com.tkapplications.tracknplan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.tkapplications.tracknplan.ui.theme.TrackNGoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val modifier = Modifier
        setContent {
            TrackNGoAppTheme  {
                TrackNGoApp(modifier = modifier.fillMaxSize())
            }
        }
    }
}