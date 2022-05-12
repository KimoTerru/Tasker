package it.kimoterru.tasker.data.repository

import it.kimoterru.tasker.data.database.TaskDao
import it.kimoterru.tasker.data.model.TaskItem
import it.kimoterru.tasker.domain.repository.TaskRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepositoryImpl @Inject constructor(
    private val taskDao: TaskDao
) : TaskRepository {

    override suspend fun getAllTaskFromDataBase(): List<TaskItem> {
        return taskDao.getAllTask()
    }

    override suspend fun getTaskById(id: Int): TaskItem {
        return taskDao.getTaskById(id)
    }

    override suspend fun deleteTaskFromDataBase(task: TaskItem) {
        return taskDao.delete(task)
    }

    override suspend fun insertTaskInDataBase(task: TaskItem) {
        return taskDao.insert(task)
    }

    override suspend fun updateTaskInDataBase(task: TaskItem) {
        return taskDao.update(task)
    }
}