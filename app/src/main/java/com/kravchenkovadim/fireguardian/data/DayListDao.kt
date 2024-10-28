package com.kravchenkovadim.fireguardian.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
@Dao
interface DayListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: DayListTasks)
    @Delete
    suspend fun deleteTask(task: DayListTasks)
    @Query("SELECT * FROM day_list_tasks")
    fun getAllTasks(): Flow<List<DayListTasks>>
}