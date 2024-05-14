package presentation.atomic.molecules.topbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import kmpspacex.composeapp.generated.resources.Res
import kmpspacex.composeapp.generated.resources.app_name
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.atomic.atoms.topbar.TopBarIconAtom
import presentation.atomic.atoms.topbar.TopBarTextAtom
import theme.ProjectColors
import theme.ProjectDimens

@Composable
fun TopBarMolecule(
    title: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = ProjectColors.Blue,
    icon: ImageVector? = Icons.AutoMirrored.Filled.ArrowBack
) {
    TopAppBar(
        modifier = modifier
            .fillMaxWidth(),
        backgroundColor = backgroundColor
    ) {
        if (icon != null) {
            TopBarIconAtom(
                icon = icon
            )
        }
        TopBarTextAtom(
            modifier = Modifier
                .padding(start = ProjectDimens.TopBar.iconEndPadding),
            text = title
        )
    }
}

@OptIn(ExperimentalResourceApi::class)
@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        TopBarMolecule(
            title = stringResource(Res.string.app_name)
        )
    }
}