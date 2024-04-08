package com.kravchenkovadim.fireguardian.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "day_list_tasks")
data class DayListTasks(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int = 0,
    val name: String,
    val time: String,
    val allTasksCount: Int,
    val allSelectedTasksCount: Int
)
