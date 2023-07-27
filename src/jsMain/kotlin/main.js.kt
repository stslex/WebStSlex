import androidx.compose.ui.window.Window
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    setCanvasFullScreen()
    onWasmReady {
        Window("ComposeTarget") {
            WebStSlex()
        }
    }
}

private fun setCanvasFullScreen() {
    document.getElementById("ComposeTarget")?.apply {
        requestFullscreen()
        setAttribute("width", window.innerWidth.toString())
        setAttribute("height", window.innerHeight.toString())
    }
}