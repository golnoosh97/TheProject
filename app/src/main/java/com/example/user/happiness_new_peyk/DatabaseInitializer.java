package com.example.user.happiness_new_peyk;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

/*public class DatabaseInitializer {

    private static final String TAG = DatabaseInitializer.class.getName();

    public static void populateAsync(@NonNull final  AppDatabace db) {
        PopulateDbAsync task = new PopulateDbAsync(db);
        task.execute();
    }

    public static void populateSync(@NonNull final  AppDatabace db) {
        populateWithTestData(db);
    }

    private static List_Items list_items(final  AppDatabace db, List_Items list_items) {
        db.items().insertAll(list_items);
        return list_items;
    }

    private static void populateWithTestData( AppDatabace db) {
        List_Items list_items = new List_Items();
        AllimagesItem allimagesItem = new AllimagesItem();
       // List<AllimagesItem> allimagesItemList1= allimagesItem.getTitle();

        list_items.setTitle(allimagesItem.getTitle());
        list_items(db, list_items);

        List<List_Items> list_itemsList = db.items().getAll();
        Log.d(DatabaseInitializer.TAG, "Rows Count: " + list_itemsList.size());


    }
    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final  AppDatabace mDb;

        PopulateDbAsync( AppDatabace db) {
            mDb = db;
        }

        @Override
        protected Void doInBackground(final Void... params) {
            populateWithTestData(mDb);
            return null;
        }

    }

}*/
