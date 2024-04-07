package com.kravchenkovadim.fireguardian.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "add_task")
data class AddTask (
    @PrimaryKey
    val id : Int? = null,
    val name: String,
    val isCheck: Boolean,
    val listId: Int
)