package com.example.navid.cantactssimulator.Model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "contacts")
data class Contact
    (
        @ColumnInfo(name="name") var name:String ,
        @ColumnInfo(name="tell") var tell:String ,
        @ColumnInfo(name="email") var email:String ,
        @ColumnInfo(name="image") var image:String
    ) { @PrimaryKey(autoGenerate = true) @ColumnInfo(name="id") var id:Int=0 }
