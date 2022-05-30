package it.kimoterru.tasker.data.repository

import it.kimoterru.tasker.domain.repository.TaskRepository
import it.kimoterru.tasker.data.database.ListTasksDao
import it.kimoterru.tasker.data.database.TaskDao
import it.kimoterru.tasker.data.entity.ListTasksEntity
import it.kimoterru.tasker.data.entity.TaskEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepositoryImpl @Inject constructor(
    private val taskDao: TaskDao,
    private val listTasksDao: ListTasksDao
) : TaskRepository {

    override suspend fun getAllTaskFromDataBase(): List<TaskEntity> {
        return taskDao.getAllTask()
    }

    override suspend fun getTaskById(id: Int): TaskEntity {
        return taskDao.getTaskById(id = id)
    }

    override suspend fun deleteTaskFromDataBase(task: TaskEntity) {
        return taskDao.delete(task = task)
    }

    override suspend fun insertTaskInDataBase(task: TaskEntity) {
        return taskDao.insert(task = task)
    }

    override suspend fun updateTaskInDataBase(task: TaskEntity) {
        return taskDao.update(task = task)
    }

    override suspend fun getAllListTasksFromDataBase(): List<ListTasksEntity> {
        return listTasksDao.getAllListTasks()
    }

    override suspend fun getListTaskById(id: Int): ListTasksEntity {
        return listTasksDao.getListTaskById(id = id)
    }

    override suspend fun deleteListTaskFromDataBase(listTasks: ListTasksEntity) {
        return listTasksDao.delete(listTask = listTasks)
    }

    override suspend fun insertListTaskInDataBase(listTasks: ListTasksEntity) {
        return listTasksDao.insert(listTask = listTasks)
    }

    override suspend fun updateListTaskInDataBase(listTasks: ListTasksEntity) {
        return listTasksDao.update(listTask = listTasks)
    }
}