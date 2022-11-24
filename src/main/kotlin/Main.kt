import java.util.*

fun main() {
    val postNew = Post(
        id = 0,
        ownerId = 1,
        date = Date(2022, 10, 31),
        fromId = 1,
        text = "text",
        comments = Comments(),
        likes = Likes(),
        comment = Comment(),
    )

    WallService.add(postNew)
    println(postNew)
    WallService.update(postNew)
    println(postNew)


    WallService.createComment(0, Comment())
}