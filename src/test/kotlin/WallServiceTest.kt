import org.junit.Test

import org.junit.Assert.*
import java.util.*



class WallServiceTest {
 //   @Before
 //   fun clearBeforeTest() {
   //     WallService.clear()
  //  }
        @Test

        fun add(){
     val service = WallService
            val post = Post(
                id = 0,
                ownerId = 1,
                date = Date(),
                fromId = 1,
                text = "текст",
                comments = Comments(),
                likes = Likes(),
            )

val res = service.add(post)
     assertNotNull(res.id)
        }

    }

