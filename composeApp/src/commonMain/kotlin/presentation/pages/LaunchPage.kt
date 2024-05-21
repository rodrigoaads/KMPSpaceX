package presentation.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import data.repository.SpaceXRepository
import data.repository.SpaceXRepositoryImpl
import kmpspacex.composeapp.generated.resources.Res
import kmpspacex.composeapp.generated.resources.app_name
import kotlinx.coroutines.launch
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

    var uiModel by remember { mutableStateOf(UiModel()) }
    val repository: SpaceXRepository = SpaceXRepositoryImpl()

    val scope = rememberCoroutineScope()

    val getData = {
        scope.launch {
            uiModel = uiModel.copy(
                isLoading = true
            )
            try {
                repository.getLaunches().run {
                    uiModel = uiModel.copy(
                        list = this,
                        isLoading = false,
                        error = false
                    )
                }
            } catch (e: Exception) {
                uiModel = uiModel.copy(
                    error = true,
                    isLoading = false
                )
            }
        }
    }

    LaunchedEffect(Unit) {
        getData.invoke()
    }

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
            isLoading = uiModel.isLoading,
            list = uiModel.list,
            onCLickLaunch = { id ->

            },
            showError = uiModel.error
        ) {
            getData.invoke()
        }
    }
}