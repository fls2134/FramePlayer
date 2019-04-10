package com.example.frameplayer.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.frameplayer.R;
import com.example.frameplayer.camera.CameraActivity1;
import com.example.frameplayer.camera.CameraActivity2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton cameraButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("hello","aaaaa");
        cameraButton = (ImageButton)findViewById(R.id.camerabutton);
        cameraButton.setOnClickListener(this);
        Log.d("hello","bbbb");

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, CameraActivity2.class));
        Log.d("hello","intentSuccess");
    }
}
