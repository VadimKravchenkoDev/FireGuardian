package com.kravchenkovadim.fireguardian.data


import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    suspend fun insertTask(task: Task)

    suspend fun deleteTask(task: Task)

    fun getAllTasksById(taskId: Int): Flow<List<Task>>

    suspend fun getListTaskById(taskId: Int): DayListTasks

    suspend fun insertTask(task: DayListTasks)
}