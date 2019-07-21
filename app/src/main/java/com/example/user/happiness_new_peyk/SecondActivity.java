package com.example.user.happiness_new_peyk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;

public class SecondActivity extends AppCompatActivity {

   // private ImageView imageView;
   // Bitmap image= imageView.getDrawingCache();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imageView= findViewById(R.id.Profile_image);
        Bitmap bitmap = getIntent().getParcelableExtra("image");

        // ImageView imageView= findViewById(R.id.img);
       // TextView textView=findViewById(R.id.title);

        Bundle bundle = getIntent().getExtras();

        String str = bundle.getString("image");
     //   String s=bundle.getString("title");

      //  textView.setText(s);
        imageView.setImageBitmap(bitmap);



       // Bundle bundle = getIntent().getExtras();

       // String str = bundle.getString("image");
       // imageView.setImageBitmap(image);




        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    private void createDirectoryAndSaveFile(Bitmap imageToSave, String fileName){

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

    }


}
