package com.example.user.happiness_new_peyk;

import android.app.usage.ExternalStorageStats;
import android.graphics.Bitmap;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.io.File;
import java.io.FileOutputStream;

import static java.security.AccessController.getContext;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final ImageView imageView= findViewById(R.id.image);
        Button button = (Button) findViewById(R.id.button);
        Bundle bundle = getIntent().getExtras();
        final String str = bundle.getString("image");

        Picasso.with(this).load(str).into(imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Picasso.with(getApplicationContext()).load(str).into(new Target() {
                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {

                       // boolean success = false;
                        try{
                            File file = new File ( Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)+toString()+"\"/HIR_IMG\"");
                            if(!file.exists()){
                                file.mkdirs();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(file,new Date().toString() + ".jpg"));
                            bitmap.compress(Bitmap.CompressFormat.JPEG,90,fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();

                          //  Toast.makeText(getApplicationContext(), "Save", Toast.LENGTH_LONG).show();

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                     /*   if (success) {
                            Toast.makeText(getApplicationContext(), "Image saved with success", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Error during image saving", Toast.LENGTH_LONG).show();
                        }*/

                    }

                    @Override
                    public void onBitmapFailed(Drawable errorDrawable) {

                    }

                    @Override
                    public void onPrepareLoad(Drawable placeHolderDrawable) {

                    }
                });

            }
        });


    }

   /* private void createDirectoryAndSaveFile(Bitmap imageToSave, String fileName){

        File direcet =new File(Environment.getExternalStorageDirectory()+ "/DirName");
        if(!direcet.exists()){
            File file=new File("/sdcard/DirName/");
            file.mkdirs();
        }

        File file2 = new File(new File("/sdcard/DirName/"), fileName);
        if (file2.exists()) {
            file2.delete();
        }

        try {
            FileOutputStream out = new FileOutputStream(file2);
            imageToSave.compress(Bitmap.CompressFormat.JPEG, 100, out);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/


}
