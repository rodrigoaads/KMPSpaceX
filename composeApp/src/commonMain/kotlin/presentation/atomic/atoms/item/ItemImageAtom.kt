package presentation.atomic.atoms.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.seiko.imageloader.rememberImagePainter
import kmpspacex.composeapp.generated.resources.Res
import kmpspacex.composeapp.generated.resources.compose_multiplatform
import kmpspacex.composeapp.generated.resources.ic_rocket
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ItemImageAtom(
    url: String?,
    modifier: Modifier = Modifier
) {
    val internalModifier = modifier
        .size(70.dp)
    
    if (url != null) {
        Image(
                modifier = internalModifier
                    .clip(CircleShape),
                painter = rememberImagePainter(url),
                contentDescription = null,
                contentScale = ContentScale.Crop
            ) 
    } else {
        Icon(
            modifier = internalModifier,
            painter = painterResource(Res.drawable.ic_rocket),
            tint = Color.Gray,
            contentDescription = null
        )
    }
}

@Preview
@Composable
private fun Preview() {
    MaterialTheme {
        ItemImageAtom(
            url = null
        )
    }
}
