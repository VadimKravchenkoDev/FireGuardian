package com.kravchenkovadim.fireguardian.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface TaskDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(item: Task)

    @Delete
    suspend fun deleteTask(task: Task)

    @Query("SELECT * FROM task WHERE listId = :taskId")
    fun getAllTasksById(taskId: Int): Flow<List<Task>>

    @Query("SELECT * FROM day_list_tasks WHERE id = :taskId")
    suspend fun getListTaskById(taskId: Int): DayListTasks

    @Update
    suspend fun insertTask(task: DayListTasks)
}