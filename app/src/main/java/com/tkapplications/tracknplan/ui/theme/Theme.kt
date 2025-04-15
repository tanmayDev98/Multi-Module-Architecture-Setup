package com.tkapplications.tracknplan.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

// Dark Theme Colors
//To set appropriate dark theme colors
private val DarkColorScheme = darkColorScheme(
    primary = Lawn_Green,
    onPrimary = Black,
    secondary = Light_Greenette,
    onSecondary = Armor_Wash,
    background = Armor_Wash,
    onBackground = PinBall,
    surface = Color(0xFF1C1C1C),
    onSurface = PinBall,
    error = Color(0xFFCF6679),
    onError = Black
)

// Light Theme Colors
private val LightColorScheme = lightColorScheme(
    primary = Lawn_Green,
    onPrimary = White,
    secondary = Light_Greenette,
    onSecondary = Black,
    tertiary = PinBall,
    onTertiary = Black,
    background = White,
    onBackground = Black,
    surface = White,
    onSurface = Black
)

private val shape = Shape(
    container = RoundedCornerShape(24.dp),
    button = RoundedCornerShape(10.dp),
)

@Composable
fun TrackNGoAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    CompositionLocalProvider(LocalShape provides shape) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}

object TrackNGoTheme {
    val shape: Shape
        @Composable get() = LocalShape.current
}