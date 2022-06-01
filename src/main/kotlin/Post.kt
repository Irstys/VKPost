data class Post(
    val id: Int = 0,
    //	Идентификатор записи.
    val ownerId: Int? = null,
    //Идентификатор владельца стены, на которой размещена запись. В версиях API ниже 5.7 это поле называется to_id.
    val fromId: Int? = null,
    //Идентификатор автора записи (от чьего имени опубликована запись).
    val createdBy: Int? = null,
    //Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
    val date: Long? = null,
    //	Время публикации записи в формате unixtime.
    val text: String? = null,
    //Текст записи.
    val replyOwnerId: Int? = null,
    //	Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    val replyPostId: Int? = null,
    //	Идентификатор записи, в ответ на которую была оставлена текущая.
    val postType: String ="post",
    //string	Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    val signerId: Int? = null,
    //integer	Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    val friendsOnly: Boolean? = null,
    //integer, [1]	1, если запись была создана с опцией «Только для друзей».

    var comments: Comments? = null,

    val copyright:Copyright? = null,

    val likes:Likes? = null,

    val reposts:Reposts? = null,

    val views:Views? = null,

    val canPin: Boolean = false,
    //integer, [0,1]	Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    val canDelete: Boolean = false,
    //integer, [0,1]	Информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    val canEdit: Boolean = false,
    //integer, [0,1]	Информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    val isPinned: Boolean = false,
    //integer, [1]	Информация о том, что запись закреплена.
    val markedAsAds: Boolean = false,
    //integer, [0,1]	Информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    val isFavorite: Boolean = false,
    //boolean	true, если объект добавлен в закладки у текущего пользователя.

    val donut:Donut? = null,

    val postponedId: Int? = null,
    //integer	Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
)
{
    override fun toString(): String {
        return "post $id author $fromId with text $text"
    }
}