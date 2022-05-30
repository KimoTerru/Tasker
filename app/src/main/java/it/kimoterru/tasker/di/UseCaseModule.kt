package it.kimoterru.tasker.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import it.kimoterru.tasker.domain.repository.TaskRepository
import it.kimoterru.tasker.domain.usecase.task.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideTaskUseCases(repository: TaskRepository): TaskUseCases {
        return TaskUseCases(
            getAllTasks = GetAllTasks(repository),
            getTaskById = GetTaskById(repository),
            insertTask = InsertTask(repository),
            deleteTask = DeleteTask(repository)
        )
    }
}