package com.kravchenkovadim.fireguardian.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface AddTaskDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(item: AddTask)

    @Delete
    suspend fun deleteTask(task: AddTask)

    @Query("SELECT * FROM add_task WHERE listId = :taskId")
    fun getAllTasksById(taskId: Int): Flow<List<AddTask>>

    @Query("SELECT * FROM day_list_tasks WHERE id = :taskId")
    suspend fun getListTaskById(taskId: Int): DayListTasks

    @Update
    suspend fun insertTask(task: DayListTasks)
}