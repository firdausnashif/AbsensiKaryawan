package com.daus.absensikaryawan.database

import androidx.room.Database
import com.daus.absensikaryawan.model.ModelDatabase
import androidx.room.RoomDatabase
import com.daus.absensikaryawan.database.dao.DatabaseDao

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}