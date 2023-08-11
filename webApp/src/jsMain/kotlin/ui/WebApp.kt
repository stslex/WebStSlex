package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.components.GithubHeader
import ui.components.Playground

@Composable
fun WebApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(32.dp)
        ) {
            item {
                GithubHeader()
            }
            item { Spacer(Modifier.height(32.dp)) }
            item {
                Text(
                    text = "This site is Made With Jetpack Web Compose (Kotlin/Wasm)",
                    style = MaterialTheme.typography.h4,
                    color = MaterialTheme.colors.onBackground
                )
            }
            item { Spacer(Modifier.height(80.dp)) }
            item {
                Playground()
            }
        }
    }
}
