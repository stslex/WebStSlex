package ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import kotlinx.browser.window
import ui.components.base.Image

@Composable
fun GithubHeader(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .width(IntrinsicSize.Min)
                .height(IntrinsicSize.Min)
                .clip(RoundedCornerShape(32.dp))
                .shadow(8.dp)
                .clickable {
                    window.location.assign("https://github.com/stslex")
                }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape),
                    url = "https://avatars.githubusercontent.com/u/62352202?v=4"
                )
                Spacer(Modifier.height(32.dp))
                Text(
                    modifier = Modifier.weight(1f),
                    text = "St Slex",
                    style = MaterialTheme.typography.h6,
                    color = MaterialTheme.colors.onBackground,
                    maxLines = 1
                )
            }
        }
        Spacer(Modifier.width(32.dp))
        Text(
            modifier = Modifier.weight(1f),
            text = "Hello to my first web site",
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onBackground
        )
    }
}