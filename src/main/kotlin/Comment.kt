import java.util.*

data class Comment(
    val id: Int = 0,
    val fromId: Int = 2,
    val date: Date = Date(),
    val text: String = "hh"
)