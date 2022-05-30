package it.kimoterru.tasker.domain.usecase.task

data class TaskUseCases(
    val getAllTasks: GetAllTasks,
    val getTaskById: GetTaskById,
    val insertTask: InsertTask,
    val deleteTask: DeleteTask
)