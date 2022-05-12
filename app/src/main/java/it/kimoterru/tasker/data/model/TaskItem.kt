package it.kimoterru.tasker.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "taskItem")
data class TaskItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val task: String?,
    val done: Boolean?,
    val day: String?,
    val clock: String?,
    val color: String?
)