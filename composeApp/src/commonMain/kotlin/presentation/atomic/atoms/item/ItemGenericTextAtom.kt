package presentation.atomic.atoms.item

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.ProjectDimens

@Composable
fun ItemGenericTextAtom(
    text: String,
    modifier: Modifier = Modifier,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = ProjectDimens.Text.smallText,
    color: Color = Color.Black
) {
    Text(
        modifier = modifier,
        text = text,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight
    )
}

@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        ItemGenericTextAtom(
            text = "Lorem ipsum, 2006",
            fontWeight = FontWeight.Bold,
            fontSize = ProjectDimens.Text.mediumText
        )
    }
}

@Preview
@Composable
private fun DescriptionPreview() {
    MaterialTheme {
        ItemGenericTextAtom(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        )
    }
}