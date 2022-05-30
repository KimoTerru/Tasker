package it.kimoterru.tasker.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import it.kimoterru.tasker.data.entity.ListTasksEntity
import it.kimoterru.tasker.data.entity.TaskEntity

@Database(
    entities = [TaskEntity::class, ListTasksEntity::class],
    version = 1
)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
    abstract fun listTasksDao(): ListTasksDao
}