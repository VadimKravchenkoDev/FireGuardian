package com.kravchenkovadim.fireguardian.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface DayListRepository {

    suspend fun insertTask(task: DayListTasks)

    suspend fun deleteTask(task: DayListTasks)

    fun getAllTasks(): Flow<List<DayListTasks>>
}