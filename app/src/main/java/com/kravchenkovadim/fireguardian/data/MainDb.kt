package com.kravchenkovadim.fireguardian.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [DayListTasks::class, Task::class, NoteItem::class],
    version = 1
)
abstract class MainDb :RoomDatabase() {
    abstract val dayListDao : DayListDao
    abstract val taskDao : TaskDao
    abstract val noteDao: NoteDao
}