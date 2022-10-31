import java.util.*

fun main() {
    val postNew = Post(
        id = 1,
        ownerId = 1,
        date = Date(2022, 10, 31),
        fromId = 1,
        text = "text",
        comments = Comments(),
        likes = Likes(),
    )
    val service = WallService
    service.add(postNew)
    println(postNew)
    service.update(postNew)
    println(postNew)

}