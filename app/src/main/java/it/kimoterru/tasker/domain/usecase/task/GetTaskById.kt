package it.kimoterru.tasker.domain.usecase.task

import it.kimoterru.tasker.data.entity.TaskEntity
import it.kimoterru.tasker.domain.repository.TaskRepository

class GetTaskById(private val repository: TaskRepository) {

    suspend fun invoke(id: Int): TaskEntity {
        return repository.getTaskById(id = id)
    }
}