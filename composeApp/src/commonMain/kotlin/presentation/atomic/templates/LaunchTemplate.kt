package presentation.atomic.templates

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.LaunchModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.atomic.atoms.error.ErrorTextAtom
import presentation.atomic.molecules.error.ErrorMolecule
import presentation.atomic.organisms.LaunchOrganism
import presentation.concatenateWithCondition

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun LaunchTemplate(
    isLoading: Boolean,
    showError: Boolean,
    list: List<LaunchModel>,
    modifier: Modifier = Modifier,
    onCLickLaunch: (Int) -> Unit,
    onRefresh: () -> Unit
) {
    
    val pullRefreshState = rememberPullRefreshState(
        refreshing = isLoading,
        onRefresh = onRefresh
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .concatenateWithCondition(
                condition = isLoading || showError,
                modifier = Modifier
                    .pullRefresh(pullRefreshState)
            )
    ) {
        if (!showError) {
            LaunchOrganism(
                list = list,
                onCLick = onCLickLaunch
            )
        } else {
            ErrorMolecule {
                onRefresh.invoke()
            }
        }

        PullRefreshIndicator(
            modifier = Modifier
                .align(Alignment.TopCenter),
            state = pullRefreshState,
            refreshing = isLoading
        )
    }
}

@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        LaunchTemplate(
            isLoading = false,
            list = listOf(
                LaunchModel(
                    id = 1,
                    imageUrl = null,
                    title = "Lorem ipsum, 2006",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
                ),
                LaunchModel(
                    id = 1,
                    imageUrl = null,
                    title = "Lorem ipsum, 2006",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
                ),
                LaunchModel(
                    id = 1,
                    imageUrl = null,
                    title = "Lorem ipsum, 2006",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
                ),
                LaunchModel(
                    id = 1,
                    imageUrl = null,
                    title = "Lorem ipsum, 2006",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
                )
            ),
            showError = false,
            onCLickLaunch = {}
        ) {}
    }
}