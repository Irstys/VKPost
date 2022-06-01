object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        if (!posts.contains(post)) {
            posts += if (posts.isEmpty()) post.copy(id = 1) else post.copy(id = posts.last().id + 1)
        } else{println("Такой пост уже есть на стене")}
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postForSearch) in posts.withIndex()) {
            if (postForSearch.id == post.id) {

                posts[index] = post.copy(ownerId = posts[index].ownerId, date = posts[index].date)
                return true
            }
        }
        return false
    }

    fun removeAll(){
        posts = emptyArray()

    }

    fun printWall(){
        if (posts.isEmpty()) {
            println("Empty")
        }else {
            for (i in posts) {
                i.toString()
                println(i.toString())
            }
        }
    }
    fun isEmpty(): Boolean {
        return posts.isEmpty()
    }
}
