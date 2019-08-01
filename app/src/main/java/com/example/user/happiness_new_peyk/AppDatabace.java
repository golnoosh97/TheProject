package com.example.user.happiness_new_peyk;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {AllimagesItem.class},version = 1)
public abstract class AppDatabace extends RoomDatabase {

   // private static AppDatabace INSTANCE;
    public abstract Items items();

   /* public static AppDatabace getAppDatabace(Context context){
        if(INSTANCE == null){

            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabace.class, "user-database")
                            .allowMainThreadQueries()
                            .build();
        }

        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }*/


}
