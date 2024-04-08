package com.kravchenkovadim.fireguardian.data

import kotlinx.coroutines.flow.Flow

class TaskRepoImpl(
    private val dao: TaskDao
) : TaskRepository {
    override suspend fun insertTask(task: Task) {
        dao.insertTask(task)
    }

    override suspend fun insertTask(task: DayListTasks) {
        dao.insertTask(task)
    }

    override suspend fun deleteTask(task: Task) {
        dao.deleteTask(task)
    }

    override fun getAllTasksById(taskId: Int): Flow<List<Task>> {
        return dao.observeAllTasksById(taskId)
    }

    override suspend fun getListTaskById(taskId: Int): DayListTasks {
        return dao.getListTaskById(taskId)
    }

}