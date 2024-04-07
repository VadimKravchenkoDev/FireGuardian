package com.kravchenkovadim.fireguardian.data

import kotlinx.coroutines.flow.Flow

class AddTaskRepoImpl (
    private val dao : AddTaskDao
) :AddTaskRepository{
    override suspend fun insertTask(task: AddTask) {
        dao.insertTask(task)
    }

    override suspend fun insertTask(task: DayListTasks) {
        dao.insertTask(task)
    }

    override suspend fun deleteTask(task: AddTask) {
        dao.deleteTask(task)
    }

    override fun getAllTasksById(taskId: Int): Flow<List<AddTask>> {
        return dao.getAllTasksById(taskId)
    }

    override suspend fun getListTaskById(taskId: Int): DayListTasks {
        return dao.getListTaskById(taskId)
    }

}