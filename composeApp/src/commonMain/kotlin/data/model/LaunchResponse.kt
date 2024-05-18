package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import model.LaunchModel

@Serializable
data class LaunchResponse(
    @SerialName("flight_number") val id: Int,
    @SerialName("mission_name") val name: String?,
    @SerialName("launch_year") val launchYear: String?,
    val details: String?,
    val links: Links
) {
    fun toLaunchModel(): LaunchModel {
        return LaunchModel(
            id = this.id,
            imageUrl = this.links.image,
            title = "${this.name ?: ""}, ${this.launchYear ?: ""}",
            description = this.details ?: ""
        )
    }
}

@Serializable
data class Links(
    @SerialName("mission_patch") val image: String?
)