package com.kravchenkovadim.fireguardian.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "day_list_tasks")
data class DayListTasks(
    @PrimaryKey
    val id: Int? = null,
    val name: String,
    val time: String,
    val allTasksCount: Int,
    val allSelectedTasksCount: Int
)
