import java.util.*
data class Post(
    // идентификатор записи
    var id: Int?,
    // идентификатора владельца стены, на которой размещена запись
    var ownerId: Int?,
    // идентификатор автора записи
    val fromId: Int,
    // кто разместил пост
    val createdBy: Int,
    // время публикации
    var date: Date,
    // текст записи
    val text: String,
    //id автора, который ответил на пост
    val replyOwnerId: Int,
    //id поста с ответом
    val replyPostId: Int,
    // если сообщение помечено "только для друзей"
    val friendlyOnly: Int,
    // информация о комментариях
    val comments: String,
    // информация о лайках
    val likes: Int,
    // инфа о репостах
    val reposts: String,
    val postType: String,
    val PostSource: String,
    val Geo: String,
    val signerId: Int,
    // содержит историю репостов для текущего поста
    val copyHistory: String,
    val canPin: Int,
    val canDelete: Int,
    // закреплена ли запись или нет
    val isPinned: Boolean = true,
    // информация о том, может ли текущий пользователь редактировать запись
    val canEdit: Boolean = true,
    val markedAsAds: Int,
    val isFavorite: Boolean
)

object WallService {
    private var posts = emptyArray<Post>()
    private var count = 0
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
