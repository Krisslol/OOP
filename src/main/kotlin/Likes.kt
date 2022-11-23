data class Likes(
    // число пользователей, которым понравилась запись
    var count: Int = 0,
    // Понравился ли пользователю пост
    var userLikes: Boolean = false,
    //  Может ли пользователь лайкнуть пост
    var canLike: Boolean = true,
    // Может ли пользователь делать репосты
    var canPublish: Boolean = true
)