import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun WebStSlex() {
    AppTheme {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = "test"
            )
        }
    }
}

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    isSystemInDarkTheme() // todo check and change colors
    MaterialTheme(
        colors = if (isSystemInDarkTheme()) {
            darkColors()
        } else {
            lightColors()
        }
    ) {
        ProvideTextStyle(LocalTextStyle.current.copy(letterSpacing = 0.sp)) {
            content()
        }
    }
}