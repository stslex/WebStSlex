package content

import androidx.compose.runtime.Composable
import components.ContainerInSection
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.*
import style.*

@Composable
fun ProjectNotes() {

    ContainerInSection(WtSections.wtSectionBgGrayLight) {
        H2(attrs = { classes(WtTexts.wtH2) }) {
            Text("My projects available on github")
        }

        Div(attrs = {
            classes(WtRows.wtRow, WtRows.wtRowSizeM, WtOffsets.wtTopOffset24)
        }) {
            FeatureDescriptionBlock("Notes application")
        }
    }
}

@Composable
private fun FeatureDescriptionBlock(description: String) {
    Div(attrs = {
        classes(WtCols.wtCol3, WtCols.wtColMd6, WtCols.wtColSm12, WtOffsets.wtTopOffset48)
    }) {
        Img(
            attrs = { style { width(20.percent) } },
            src = "https://user-images.githubusercontent.com/62352202/166147600-38c2b7e5-31a2-42d3-9e38-fafa03481491.png"
        )
        P(attrs = {
            classes(WtTexts.wtText1, WtTexts.wtText1HardnessHard, WtOffsets.wtTopOffset12)
        }) {
            A(href = "https://stslex.github.io/Notes/") {
                Text(description)
            }
        }
    }
}
