import java.util.*

data class Post(
    // идентификатор записи
    var id: Int?,
    // идентификатора владельца стены, на которой размещена запись
    var ownerId: Int?,
    // идентификатор автора записи
    val fromId: Int,
    // время публикации
    var date: Date,
    // текст записи
    val text: String,
    // информация о комментариях
    val comments: Comments,
    // информация о лайках
    val likes: Likes,
    // закреплена ли запись или нет
    val isPinned: Boolean = true,
    // информация о том, может ли текущий пользователь редактировать запись
    val canEdit: Boolean = true,
    val replyOwnerId: Int = 5,
    //id поста с ответом
    val replyPostId: Int = 80,
    // если сообщение помечено "только для друзей"
    val friendlyOnly: Int = 4,
    val reposts: String = "reposts",
    val postType: String = "postType",
    val PostSource: String = "PostSource",
    val Geo: String = "Geo",
    val signerId: Int = 6,
    // содержит историю репостов для текущего поста
    val copyHistory: String = "copyHistory",
    val canPin: Int = 3,
    val canDelete: Int = 1,
    // закреплена ли запись или нет
    val markedAsAds: Int = 2,
    val isFavorite: Boolean = true,
    val attachment: Array<Attachment> = arrayOf(
        GraffitiAttachment(),
        ApplicationContentAttachment(),
        VideoAttachment(),
        PhotoAttachment(),
        AudioAttachment()
    )
)

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var count = 0

    fun createComment(postId: Int, comment: Comment): Comment {

        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                comments += comment
                return comment
            }
        }
           throw PostNotFoundException("Нет такого поста")
        }

    fun clear() {
        posts = emptyArray()
    }

    fun add(post: Post): Post {
        posts += post.copy(id = count++)
        return posts.last()
    }

    fun update(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == newPost.id) {
                post.ownerId = newPost.ownerId
                post.date = newPost.date
                posts[index] = newPost.copy()
                return true
            }
        }
        return false
    }
}

