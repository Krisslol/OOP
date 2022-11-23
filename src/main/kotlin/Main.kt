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

    WallService.add(postNew)
    println(postNew)
    WallService.update(postNew)
    println(postNew)

}