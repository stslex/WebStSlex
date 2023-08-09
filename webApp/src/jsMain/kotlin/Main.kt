import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.window.CanvasBasedWindow
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.skiko.wasm.onWasmReady
import org.w3c.dom.events.EventListener

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        CanvasBasedWindow("WebStSlex") {
            WebAppTheme {
                WebApp()
            }
        }
    }
}

@Composable
fun WebAppTheme(
    content: @Composable () -> Unit
) {
    var isDarkTheme by remember {
        mutableStateOf(isWindowInDarkTheme)
    }

    window.matchMedia("(prefers-color-scheme: dark)").addEventListener("change", EventListener {
        isDarkTheme = isWindowInDarkTheme
    })

    MaterialTheme(
        colors = if (isDarkTheme) {
            darkColors()
        } else {
            lightColors()
        },
        content = {
            document.head?.style?.backgroundColor ="red"
            document.body?.style?.backgroundColor = MaterialTheme.colors.background.toArgb().toString()
            content()
        }
    )
}

private val isWindowInDarkTheme: Boolean
    get() = window.matchMedia("(prefers-color-scheme: dark)").matches
