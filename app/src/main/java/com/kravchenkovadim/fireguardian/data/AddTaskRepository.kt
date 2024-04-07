package com.kravchenkovadim.fireguardian.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface AddTaskRepository {
    suspend fun insertTask(item: AddTask)

    suspend fun deleteTask(task: AddTask)

    fun getAllTasksById(taskId: Int): Flow<List<AddTask>>

    suspend fun getListTaskById(taskId: Int): DayListTasks

    suspend fun insertTask(task: DayListTasks)
}