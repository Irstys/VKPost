import org.junit.Assert.assertEquals
import org.junit.Test

class WallServiceTest {

    val post1 = Post(id = 1, date = System.currentTimeMillis(),fromId = 3679,text = "Приветствуем Вас")
    val post2 = Post(id = 2, date = System.currentTimeMillis(),fromId = 3675,text = "Здесь будут сообщения")
    val post3 = Post(id = 4, date = System.currentTimeMillis(),fromId = 3675,text = "Здесь будут сообщения")

    @Test
    fun add() {
        val post:Post=post1
        val result:Post=WallService.add(post)

        assertEquals(post,result)
    }

    @Test
    fun add_fail() {
        WallService.removeAll()
        WallService.add(post1)
        WallService.add(post2)
        val result:Post=WallService.add(post3)

        assertEquals(post1,result)

    }
    @Test
    fun add_right() {
        WallService.removeAll()
        WallService.add(post1)
        WallService.add(post2)
        val result:Post=WallService.add(post3)

        assertEquals(post2,result)

    }
    @Test
    fun update_fail() {
        val post4 = post3.copy(text = "Стена для новостей")
        val result=WallService.update(post4)
        assertEquals(true,result)
    }
    @Test
    fun update_right() {
        val post4 = post1.copy(text = "Стена для новостей")
        val result=WallService.update(post4)
        assertEquals(true,result)
    }

    @Test
    fun removeAll() {
        WallService.removeAll()
        val result = WallService.isEmpty()
        assertEquals("Empty",result)
    }
    fun removeAll_fail() {
        WallService.removeAll()
        WallService.add(post1)
        val result = WallService.isEmpty()
        assertEquals("Empty",result)
    }
    @Test
    fun printWall() {
        WallService.removeAll()
        WallService.add(post1)
        val result = WallService.printWall()
        assertEquals(post1.toString(),result)
    }
    @Test(expected = WallService.PostNotFoundException::class)
    fun shouldThrow() {
        WallService.removeAll()
        WallService.add(post3)
        val comment = Comment(
            id = 44,
            fromId = 2341234,
            postId = 2,
            date = 343212,
            text = "Комментируем пост id=2"
        )

        WallService.createComment(comment)
    }


}