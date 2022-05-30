package it.kimoterru.tasker.data.database

import androidx.room.*
import it.kimoterru.tasker.data.entity.ListTasksEntity

@Dao
interface ListTasksDao {
    @Query("SELECT * FROM listTasksItem")
    fun getAllListTasks(): List<ListTasksEntity>

    @Query("SELECT * FROM listTasksItem WHERE id = :id")
    fun getListTaskById(id: Int): ListTasksEntity

    @Insert
    fun insert(listTask: ListTasksEntity)

    @Update
    fun update(listTask: ListTasksEntity)

    @Delete
    fun delete(listTask: ListTasksEntity)
}