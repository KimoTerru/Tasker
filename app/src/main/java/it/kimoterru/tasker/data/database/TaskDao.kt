package it.kimoterru.tasker.data.database

import androidx.room.*
import it.kimoterru.tasker.data.model.TaskItem

@Dao
interface TaskDao {
    @Query("SELECT * FROM taskItem")
    fun getAllTask(): List<TaskItem>

    @Query("SELECT * FROM taskItem WHERE id = :id")
    fun getTaskById(id: Int): TaskItem

    @Insert
    fun insert(task: TaskItem)

    @Update
    fun update(task: TaskItem)

    @Delete
    fun delete(task: TaskItem)
}