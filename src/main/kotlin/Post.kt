import java.util.*

data class Post(
    // идентификатор записи
    var id: Int,
    // идентификатора владельца стены, на которой размещена запись
    var ownerId: Int,
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
    val canEdit: Boolean = true
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