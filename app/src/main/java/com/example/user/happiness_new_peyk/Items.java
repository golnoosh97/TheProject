package com.example.user.happiness_new_peyk;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface Items {

   // @Query("SELECT * FROM List_Items")
   // List<List_Items>getAll();

    @Query("SELECT title FROM AllimagesItem")
    //AllimagesItem getTitle(String title);
    List<AllimagesItem>getTitle();

   // @Query("SELECT COUNT(title) from AllimagesItem")
   // int countTitles();

    @Update
    void update (List<AllimagesItem> allimagesItems);

    @Insert
    void insertAll(List<AllimagesItem> allimagesItems);

    @Delete
    void delete(AllimagesItem allimagesItem);
}
