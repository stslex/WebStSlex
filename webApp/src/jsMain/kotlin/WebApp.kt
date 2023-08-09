import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp

@Composable
fun WebApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(32.dp)
        ) {
            Text(
                text = "Hello to my first web site",
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.onBackground
            )
            Spacer(Modifier.height(32.dp))
            Text(
                text = "This site is Made With Jetpack Web Compose (Kotlin/Wasm)",
                style = MaterialTheme.typography.h4,
                color = MaterialTheme.colors.onBackground
            )
            Spacer(Modifier.height(64.dp))
            Spacer(Modifier.height(16.dp))
            Playground(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Composable
fun Playground(
    modifier: Modifier = Modifier
) {
    var resultNumber by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = modifier
            .shadow(
                elevation = 32.dp,
                shape = RoundedCornerShape(32.dp),
            )
            .background(MaterialTheme.colors.secondaryVariant)
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "simple playground",
            style = MaterialTheme.typography.h5,
            color = MaterialTheme.colors.onSecondary
        )
        Spacer(Modifier.height(16.dp))
        Row {
            IconButton(
                onClick = {
                    resultNumber--
                }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = MaterialTheme.colors.onSecondary
                )
            }
            Spacer(Modifier.width(32.dp))
            Text(
                text = resultNumber.toString(),
                style = MaterialTheme.typography.h4,
                color = MaterialTheme.colors.onSecondary
            )
            Spacer(Modifier.width(32.dp))
            IconButton(
                onClick = {
                    resultNumber++
                }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = null,
                    tint = MaterialTheme.colors.onSecondary
                )
            }
        }
    }
}
