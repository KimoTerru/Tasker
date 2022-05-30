package it.kimoterru.tasker.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "listTasksItem")
data class ListTasksEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    //val tasks: List<Task>
)

data class Task(
    val task: String?,
    val done: Boolean?,
    val day: String?,
    val clock: String?,
    val color: String?
)