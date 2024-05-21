package presentation.atomic.molecules.item

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.atomic.atoms.item.ItemGenericTextAtom
import presentation.atomic.atoms.item.ItemImageAtom
import theme.ProjectDimens

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ItemMolecule(
    title: String,
    description: String,
    imageUrl: String?,
    modifier: Modifier = Modifier,
    onCLick: () -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(
                max = 150.dp
            ),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(ProjectDimens.Shape.defaultCardShape),
        onClick = onCLick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(ProjectDimens.Card.defaultCardPadding)
        ) {
            ItemImageAtom(
                modifier = Modifier
                    .padding(end = ProjectDimens.Padding.mediumPadding),
                url = imageUrl
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                ItemGenericTextAtom(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    fontSize = ProjectDimens.Text.mediumText
                )
                ItemGenericTextAtom(
                    modifier = Modifier
                        .padding(top = ProjectDimens.Padding.detailPadding),
                    text = description
                )
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        ItemMolecule(
            modifier = Modifier
                .padding(8.dp),
            title = "Lorem ipsum, 2006",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            imageUrl = null
        ) {}
    }
}