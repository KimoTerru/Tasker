package it.kimoterru.tasker.data.database

import androidx.room.*
import it.kimoterru.tasker.data.entity.TaskEntity

@Dao
interface TaskDao {
    @Query("SELECT * FROM taskItem")
    fun getAllTask(): List<TaskEntity>

    @Query("SELECT * FROM taskItem WHERE id = :id")
    fun getTaskById(id: Int): TaskEntity

    @Insert
    fun insert(task: TaskEntity)

    @Update
    fun update(task: TaskEntity)

    @Delete
    fun delete(task: TaskEntity)
}