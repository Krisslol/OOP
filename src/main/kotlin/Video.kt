class VideoAttachment: Attachment() {
    override val type = "video"
}

data class Video(
    val ownerId: Int = 4,
    val photo_130: String = " ",
    val photo_604: String = " ",
    val title: String = " ",
    val description: String = " ",
    val duration: String = " ",
)