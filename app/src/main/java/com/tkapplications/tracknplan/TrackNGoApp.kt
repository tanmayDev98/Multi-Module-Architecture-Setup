package com.tkapplications.tracknplan

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tkapplications.tracknplan.ui.theme.TrackNGoTheme

@Composable
fun TrackNGoApp(modifier: Modifier) {
    Surface {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(modifier = modifier) {
                Text(
                    "Hello, Welcome to Track N Go!",
                )
                Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).height(42.dp), onClick = {}, shape = TrackNGoTheme.shape.button) {
                    Text(
                        "Click Me",
                    )
                }
            }
        }
    }
}