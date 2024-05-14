package presentation.atomic.organisms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.LaunchModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.atomic.molecules.item.ItemMolecule
import theme.ProjectDimens

@Composable
fun LaunchOrganism(
    list: List<LaunchModel>,
    modifier: Modifier = Modifier,
    onCLick: (Int) -> Unit
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(ProjectDimens.Padding.mediumPadding),
        contentPadding = PaddingValues(ProjectDimens.Padding.smallPadding)
    ) {
        items(list) { model ->
            ItemMolecule(
                title = model.title,
                description = model.description,
                imageUrl = model.imageUrl
            ) {
                onCLick.invoke(model.id)
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        LaunchOrganism(
            listOf(
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
            )
        ) {}
    }
}