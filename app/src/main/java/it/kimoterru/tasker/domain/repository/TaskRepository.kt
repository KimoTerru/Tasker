package it.kimoterru.tasker.domain.repository

import it.kimoterru.tasker.data.entity.ListTasksEntity
import it.kimoterru.tasker.data.entity.TaskEntity

interface TaskRepository {

    suspend fun getAllTaskFromDataBase(): List<TaskEntity>

    suspend fun getTaskById(id: Int): TaskEntity

    suspend fun deleteTaskFromDataBase(task: TaskEntity)

    suspend fun insertTaskInDataBase(task: TaskEntity)

    suspend fun updateTaskInDataBase(task: TaskEntity)

    suspend fun getAllListTasksFromDataBase(): List<ListTasksEntity>

    suspend fun getListTaskById(id: Int): ListTasksEntity

    suspend fun deleteListTaskFromDataBase(listTasks: ListTasksEntity)

    suspend fun insertListTaskInDataBase(listTasks: ListTasksEntity)

    suspend fun updateListTaskInDataBase(listTasks: ListTasksEntity)
}