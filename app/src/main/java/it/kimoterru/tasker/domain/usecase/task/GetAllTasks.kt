package it.kimoterru.tasker.domain.usecase.task

import it.kimoterru.tasker.data.entity.TaskEntity
import it.kimoterru.tasker.domain.repository.TaskRepository

class GetAllTasks(private val taskRepository: TaskRepository) {

    suspend fun invoke(): List<TaskEntity> {
        return taskRepository.getAllTaskFromDataBase()
    }
}