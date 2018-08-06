package com.example.navid.cantactssimulator.Database

import android.arch.persistence.room.*
import com.example.navid.cantactssimulator.Model.Contact

@Dao
interface MyDao
    {
        @Query("SELECT * FROM contacts")
        fun getAll():List<Contact>

        @Query("SELECT * FROM contacts WHERE id = :id")
        fun getUserById(id:Int):Contact

        @Query("DELETE FROM contacts")
        fun deleteAll()

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertUser(user:Contact)

        @Delete
        fun deleteUser(user:Contact)

        @Query("UPDATE contacts SET name=:name , tell=:tell , email=:email , image=:image WHERE id=:id")
        fun updateUser(name:String,tell:String,email:String,image:String,id:Int)

        @Query("DELETE FROM contacts WHERE id=:id")
        fun deleteUserById(id:Int)
    }
