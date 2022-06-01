fun main() {
    val userId=454328
    val post1 = Post(id = 353, date = System.currentTimeMillis(),ownerId = 3679,text = "Приветствуем Вас")
    val post2 = Post(id = 456, date = System.currentTimeMillis(),ownerId = userId,text = "Здесь будут сообщения")

    WallService.add(post1)
    WallService.add(post2)

    val post3 = post2.copy(text = "Стена для новостей")
    WallService.update(post3)

}