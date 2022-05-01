import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            Span({ style { padding(15.px) } }) {
                H1 {
                    Text("First testing WebSite")
                }
            }
        }

        Div(attrs = { style { padding(25.px) } }, content = {
            A(
                href = "https://stslex.github.io/Notes/"
            ) {
                H2(attrs = { style { padding(15.px) } }, content = { Text("Notes") })
            }
        })

        Div({ style { padding(25.px) } }) {
            Button(attrs = {
                onClick { count -= 1 }
            }) {
                Text("-")
            }

            Span({ style { padding(15.px) } }) {
                Text("$count")
            }

            Button(attrs = {
                onClick { count += 1 }
            }) {
                Text("+")
            }
        }
    }
}
