package presentation

import androidx.compose.ui.Modifier

fun Modifier.concateWithCondition(
    condition: Boolean,
    modifier: Modifier
) = this.then(
    if (condition) {
        modifier
    } else {
        Modifier
    }
)