import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import java.util.*


class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test

    fun add() {
        // val service = WallService
        val post = Post(
            id = 1,
            ownerId = 1,
            date = Date(),
            fromId = 1,
            text = "текст",
            comments = Comments(),
            likes = Likes(),
        )

        WallService.add(post)
        assertEquals(1, post.id)
    }

    @Test

    fun update() {

        val post = Post(
            id = 1,
            ownerId = 1,
            date = Date(),
            fromId = 1,
            text = "текст",
            comments = Comments(),
            likes = Likes(),
        )
        WallService.add(post)
        val update = Post(1, 2, 3, Date(), "hello", Comments(), Likes())
        val result = WallService.update(update)
        assertTrue(result)
    }

    @Test
    fun updateOfPost() {
        val post = Post(
            id = 8,
            ownerId = 1,
            date = Date(),
            fromId = 2,
            text = "lalala",
            comments = Comments(),
            likes = Likes(),
        )

        WallService.add(post)
        val update = Post(9, 4, 7, Date(), "hi", Comments(), Likes())
        val result = WallService.update(update)

        assertFalse(result)
    }
}






