package it.kimoterru.tasker.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import it.kimoterru.tasker.data.model.TaskItem

@Database(entities = [TaskItem::class], version = 1)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}