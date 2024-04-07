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
    suspend fun insertItem(item: DayListTasks)
    @Delete
    suspend fun deleteItem(item: DayListTasks)
    @Query("SELECT * FROM day_list_tasks")
    fun getAllItems(): Flow<List<DayListTasks>>
}