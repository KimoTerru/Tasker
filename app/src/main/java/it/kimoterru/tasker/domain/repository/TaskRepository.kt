package it.kimoterru.tasker.domain.repository

import it.kimoterru.tasker.data.model.TaskItem

interface TaskRepository {

    suspend fun getAllTaskFromDataBase(): List<TaskItem>

    suspend fun getTaskById(id: Int): TaskItem

    suspend fun deleteTaskFromDataBase(task: TaskItem)

    suspend fun insertTaskInDataBase(task: TaskItem)

    suspend fun updateTaskInDataBase(task: TaskItem)
}