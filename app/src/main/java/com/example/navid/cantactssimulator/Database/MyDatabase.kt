package com.example.navid.cantactssimulator.Database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.navid.cantactssimulator.Model.Contact

@Database(entities = arrayOf(Contact::class),version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun myDao(): MyDao
}