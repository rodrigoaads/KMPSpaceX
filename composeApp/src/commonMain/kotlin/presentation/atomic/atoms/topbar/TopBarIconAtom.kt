package presentation.atomic.atoms.topbar

import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.ProjectColors

@Composable
fun TopBarIconAtom(
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    icon: ImageVector = Icons.AutoMirrored.Filled.ArrowBack
) {
    Icon(
        modifier = modifier,
        imageVector = icon,
        contentDescription = null,
        tint = color
    )
}

@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        TopBarIconAtom(
            color = ProjectColors.Blue
        )
    }
}
