package com.atatechminutes.viewbindingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.atatechminutes.viewbindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mainBinding.saveBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if ( Integer.parseInt(mainBinding.ageED.getText().toString()) > 21 ){
                            Toast.makeText(MainActivity.this, "Hello " + mainBinding.nameED.getText().toString(), Toast.LENGTH_LONG).show();
                        }else {
                            Toast.makeText(MainActivity.this, "Access Denied", Toast.LENGTH_LONG).show();
                        }

                    }
                }
        );
    }
}