package com.kravchenkovadim.fireguardian.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class Task (
    @PrimaryKey
    val id : Int? = null,
    val name: String,
    val isCheck: Boolean,
    val listId: Int
)