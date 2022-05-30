package it.kimoterru.tasker.domain.usecase.task

import it.kimoterru.tasker.data.entity.TaskEntity
import it.kimoterru.tasker.domain.repository.TaskRepository

class InsertTask(private val repository: TaskRepository) {

    suspend fun invoke(task: TaskEntity) {
        return repository.insertTaskInDataBase(task = task)
    }
}