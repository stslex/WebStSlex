package content

import androidx.compose.runtime.Composable
import components.ContainerInSection
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.*
import sources.StringSources
import style.*

@Composable
fun Description() {
    ContainerInSection {
        Div(
            {
                classes(WtRows.wtRow, WtRows.wtRowSizeM)
            }) {

            Div({
                classes(
                    WtCols.wtCol10,
                    WtCols.wtColMd8,
                    WtCols.wtColSm12,
                    WtOffsets.wtTopOffsetSm12
                )
            }) {
                H1(attrs = { classes(WtTexts.wtHero) }) {
                    Text("My personal site")
                }
                Div({
                    classes(WtDisplay.wtDisplayMdNone)
                }) {
                    IntroAboutComposeWeb()
                }
            }
        }
    }
}

@Composable
private fun IntroAboutComposeWeb() {
    Div({
        classes(WtRows.wtRow, WtRows.wtRowSizeM)
    }) {
        Div({
            classes(WtCols.wtCol9, WtCols.wtColMd9, WtCols.wtColSm12)
        }) {

            P({
                classes(WtTexts.wtSubtitle2, WtOffsets.wtTopOffset24)
            }) {
                Text(StringSources.descriptionTitle)
            }

            P({ classes(WtTexts.wtText1, WtOffsets.wtTopOffset24) }) {
                Text("Reactive web UIs for Kotlin, based on Google's ")
                A(href = "https://developer.android.com/jetpack/compose", attrs = {
                    classes(WtTexts.wtLink)
                    target(ATarget.Blank)
                }) {
                    Text("modern toolkit")
                }
                Text(" and brought by JetBrains")
            }

            A(
                attrs = {
                    classes(WtTexts.wtButton, WtOffsets.wtTopOffset24)
                    target(ATarget.Blank)
                },
                href = "https://github.com/stslex/WebStSlex"
            ) {
                Text("Explore on GitHub")
            }
        }
    }
}