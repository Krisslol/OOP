import java.util.Date

class PhotoAttachment() :Attachment() {
    override val type = "photo"
}
data class Photo(
    val albumId:Int = 5,
    val ownerId:Int = 8,
    val userId:Int = 84,
    val text:String = " ",
    val date: Date = Date(),

    )