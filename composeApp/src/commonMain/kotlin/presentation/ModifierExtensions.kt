package presentation

import androidx.compose.ui.Modifier

fun Modifier.concatenateWithCondition(
    condition: Boolean,
    modifier: Modifier
) = this.then(
    if (condition) {
        modifier
    } else {
        Modifier
    }
)