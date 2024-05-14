package presentation.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kmpspacex.composeapp.generated.resources.Res
import kmpspacex.composeapp.generated.resources.app_name
import model.LaunchModel
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import presentation.atomic.molecules.topbar.TopBarMolecule
import presentation.atomic.templates.LaunchTemplate
import theme.ProjectColors

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LaunchPage(
    modifier: Modifier = Modifier
) {

    Scaffold(
        modifier = modifier
            .fillMaxSize(),
        topBar = {
            TopBarMolecule(
                title = stringResource(Res.string.app_name),
                icon = null
            )
        }
    ) { padding ->
        LaunchTemplate(
            modifier = Modifier
                .padding(padding)
                .background(ProjectColors.LightGray),
            isLoading = false,
            list = listOf(),
            onCLickLaunch = { id ->

            },
            showError = false
        )
    }
}