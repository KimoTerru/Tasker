package it.kimoterru.tasker.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import it.kimoterru.tasker.Constants
import it.kimoterru.tasker.data.database.ListTasksDao
import it.kimoterru.tasker.data.database.TaskDao
import it.kimoterru.tasker.data.database.TaskDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideChannelTaskDao(taskDatabase: TaskDatabase): TaskDao {
        return taskDatabase.taskDao()
    }

    @Provides
    @Singleton
    fun provideChannelListTasksDao(taskDatabase: TaskDatabase): ListTasksDao {
        return taskDatabase.listTasksDao()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): TaskDatabase {
        return Room.databaseBuilder(
            appContext, TaskDatabase::class.java, Constants.DATABASE_NAME
        ).build()
    }
}