package curso.android.todolist.model

data class Task(
    val title: String,
    val description: String,
    val date: String,
    val time: String,
    var id: Int = 0
)