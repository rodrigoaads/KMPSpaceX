package presentation.atomic.molecules.error

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kmpspacex.composeapp.generated.resources.Res
import kmpspacex.composeapp.generated.resources.try_again_text
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.atomic.atoms.error.ErrorTextAtom
import theme.ProjectColors
import theme.ProjectDimens

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ErrorMolecule(
    modifier: Modifier = Modifier,
    onClickRetry: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ErrorTextAtom(
            modifier = Modifier
                .padding(bottom = ProjectDimens.Padding.detailPadding)
        )
        Button(
            onClick = onClickRetry,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = ProjectColors.Blue,
                contentColor = Color.White
            )
        ) {
            Text(
                text = stringResource(Res.string.try_again_text),
                fontSize = ProjectDimens.Text.mediumText
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        ErrorMolecule {}
    }
}