package com.kravchenkovadim.fireguardian.data

import kotlinx.coroutines.flow.Flow

class DayListRepoImpl(
    private val dao: DayListDao
) :DayListRepository{
    override suspend fun insertTask(task: DayListTasks) {
        dao.insertTask(task)
    }

    override suspend fun deleteTask(task: DayListTasks) {
       dao.deleteTask(task)
    }

    override fun getAllTasks(): Flow<List<DayListTasks>> {
        return dao.getAllTasks()
    }

}