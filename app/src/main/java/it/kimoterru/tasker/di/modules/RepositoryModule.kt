package it.kimoterru.tasker.di.modules

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import it.kimoterru.tasker.data.repository.TaskRepositoryImpl
import it.kimoterru.tasker.domain.repository.TaskRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWallpaperRepository(
        taskRepositoryImpl: TaskRepositoryImpl
    ): TaskRepository
}