package ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import kotlinx.browser.window
import ui.theme.UIConst.EVENT_CHANGE
import ui.theme.UIConst.MEDIA_DARK

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    var isDarkTheme by remember {
        mutableStateOf(isWindowInDarkTheme)
    }

    window.matchMedia(MEDIA_DARK).addEventListener(
        type = EVENT_CHANGE,
        callback = { isDarkTheme = isWindowInDarkTheme }
    )

    MaterialTheme(
        colors = if (isDarkTheme) appDarkColors else appLightColors,
        typography = appTypography,
        shapes = appShapes,
        content = content
    )
}

private val isWindowInDarkTheme: Boolean
    get() = window.matchMedia(MEDIA_DARK).matches