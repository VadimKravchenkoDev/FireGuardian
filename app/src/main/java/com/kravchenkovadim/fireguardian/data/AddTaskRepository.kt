package com.kravchenkovadim.fireguardian.data


import kotlinx.coroutines.flow.Flow

interface AddTaskRepository {
    suspend fun insertTask(task: AddTask)

    suspend fun deleteTask(task: AddTask)

    fun getAllTasksById(taskId: Int): Flow<List<AddTask>>

    suspend fun getListTaskById(taskId: Int): DayListTasks

    suspend fun insertTask(task: DayListTasks)
}