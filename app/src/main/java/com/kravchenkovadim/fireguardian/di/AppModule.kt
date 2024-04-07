package com.kravchenkovadim.fireguardian.di

import android.app.Application
import androidx.room.Room
import com.kravchenkovadim.fireguardian.data.AddTaskRepoImpl
import com.kravchenkovadim.fireguardian.data.AddTaskRepository
import com.kravchenkovadim.fireguardian.data.DayListRepoImpl
import com.kravchenkovadim.fireguardian.data.DayListRepository
import com.kravchenkovadim.fireguardian.data.MainDb
import com.kravchenkovadim.fireguardian.data.NoteRepoImpl
import com.kravchenkovadim.fireguardian.data.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMaidDb(app: Application): MainDb{
        return Room.databaseBuilder(
            app,
            MainDb::class.java,
            "day_list_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideShopRepo(db : MainDb) : DayListRepository{
        return DayListRepoImpl(db.dayListDao)
    }

    @Provides
    @Singleton
    fun provideAddItemRepo(db : MainDb) : AddTaskRepository{
        return AddTaskRepoImpl(db.addTaskDao)
    }

    @Provides
    @Singleton
    fun provideNoteRepo(db : MainDb) : NoteRepository {
        return  NoteRepoImpl(db.noteDao)
    }
}