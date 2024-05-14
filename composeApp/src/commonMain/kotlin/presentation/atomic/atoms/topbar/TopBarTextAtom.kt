package presentation.atomic.atoms.topbar

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import kmpspacex.composeapp.generated.resources.Res
import kmpspacex.composeapp.generated.resources.app_name
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.ProjectColors
import theme.ProjectDimens

@Composable
fun TopBarTextAtom(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White
) {
    Text(
        modifier = modifier,
        text = text,
        color = color,
        fontWeight = FontWeight.Bold,
        fontSize = ProjectDimens.TopBar.textSize
    )
}

@OptIn(ExperimentalResourceApi::class)
@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        TopBarTextAtom(
            text = stringResource(Res.string.app_name),
            color = ProjectColors.Blue
        )
    }
}