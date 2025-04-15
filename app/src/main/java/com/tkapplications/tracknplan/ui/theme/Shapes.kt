package com.tkapplications.tracknplan.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

data class Shape(val container: Shape, val button: Shape)

val LocalShape = staticCompositionLocalOf { Shape(
        container = RectangleShape,
        button = RectangleShape
    )
}