package com.kravchenkovadim.fireguardian.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [DayListTasks::class, AddTask::class, NoteItem::class],
    version = 1
)
abstract class MainDb :RoomDatabase() {
    abstract val dayListDao : DayListDao
    abstract val addTaskDao : AddTaskDao
    abstract val noteDao: NoteDao
}