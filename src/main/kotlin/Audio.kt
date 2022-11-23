import java.util.*

class AudioAttachment:Attachment() {
    override var type = "video"

}

data class Audio(
    val ownerId: Int = 98,
    val artist: String = " ",
    val title: String = " ",
    val duration: String = " ",
    val date: Date = Date(),
)