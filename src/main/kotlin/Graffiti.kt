class GraffitiAttachment : Attachment() {
    override val type = "graffiti"
}

data class Graffiti(
    val ownerId: Int = 4,
    val photo_130: String = " ",
    val photo_604: String = " ",
)
