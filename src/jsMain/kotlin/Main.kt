import components.MainContentLayout
import content.Description
import content.ProjectNotes
import content.WebHeader
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import style.AppStylesheet

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStylesheet)
        WebHeader()
        MainContentLayout {
            Description()
            ProjectNotes()
        }
    }
}