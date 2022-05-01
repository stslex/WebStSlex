package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.boxSizing
import org.jetbrains.compose.web.css.flex
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Main
import org.jetbrains.compose.web.dom.Section
import style.WtContainer
import style.WtOffsets
import style.WtSections

@Composable
fun MainContentLayout(content: @Composable () -> Unit) {
    Main({
        style {
            flex("1 0 auto")
            boxSizing("border-box")
        }
    }) {
        content()
    }
}

@Composable
fun ContainerInSection(sectionThemeStyleClass: String? = null, content: @Composable () -> Unit) {
    Section({
        if (sectionThemeStyleClass != null) {
            classes(WtSections.wtSection, sectionThemeStyleClass)
        } else {
            classes(WtSections.wtSection)
        }
    }) {
        Div({
            classes(WtContainer.wtContainer, WtOffsets.wtTopOffset96)
        }) {
            content()
        }
    }
}