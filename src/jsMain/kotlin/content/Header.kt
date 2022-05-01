package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import style.*

@Composable
fun WebHeader() {
    Section(
        attrs = {
            classes(WtSections.wtSectionBgGrayDark)
        }
    ) {
        Div({ classes(WtContainer.wtContainer) }) {
            Div({
                classes(WtRows.wtRow, WtRows.wtRowSmAlignItemsCenter)
            }) {
                Logo()
            }
        }
    }
}

@Composable
fun Logo() {
    Div(attrs = {
        classes(WtCols.wtColInline)
    }) {
        Div(
            attrs = {
                classes(WtTexts.wtSubtitle2, WtOffsets.wtTopOffset24)
                style {
                    padding(15.px)
                    color(Color.white)
                }
            }
        ) {
            H1 {
                Img(
                    attrs = {
                        style {
                            width(5.percent)
                            paddingRight(40.px)
                        }
                    },
                    src = "https://avatars.githubusercontent.com/u/62352202?v=4"
                )
                Text("Ilya Stepanyuk")
            }
        }
    }
}