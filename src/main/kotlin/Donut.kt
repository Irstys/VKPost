import Placeholder

data class Donut (
    //object	Информация о записи VK Donut:
    val is_donut: Boolean = false,
    //(boolean) — запись доступна только платным подписчикам VK Donut;
    val paidDuration: Int = 0,
    // (integer) — время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    val placeholder:Placeholder,
    val canPublishFreeCopy: Boolean = false,
    //  (boolean) — можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
    val editMode: String = "all",
    // — информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
    //all — всю информацию о VK Donut.
    //duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.
)

