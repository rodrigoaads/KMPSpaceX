package presentation.atomic.atoms.error

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import kmpspacex.composeapp.generated.resources.Res
import kmpspacex.composeapp.generated.resources.error_text
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.ProjectDimens

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ErrorTextAtom(
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = stringResource(Res.string.error_text),
        fontSize = ProjectDimens.Text.mediumText,
        color = Color.Gray,
        textAlign = TextAlign.Center
    )
}

@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        ErrorTextAtom()
    }
}