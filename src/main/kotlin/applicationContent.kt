class ApplicationContentAttachment : Attachment() {
    override val type = "applicationContent"
}
data class ApplicationContent(
    val ownerId: Int = 4,
    val photo_130: String = " ",
    val photo_604: String = " ",
)