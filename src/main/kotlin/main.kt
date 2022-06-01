fun main() {
    val userId=454328

   val post1 = Post(id = 353, date = System.currentTimeMillis(),fromId = 3679,text = "Приветствуем Вас")
    val post2 = Post(id = 456, date = System.currentTimeMillis(),fromId = userId,text = "Здесь будут сообщения")

    WallService.add(post1)
    WallService.add(post2)
    println(WallService.printWall())
    val post3 = WallService.add(post2)
    println(post3.toString())
    val post4 = post3.copy(text = "Стена для новостей")
    println(post4.toString())
    WallService.update(post4)
    println(WallService.printWall())
    WallService.isEmpty()
}