package com.example.floatingactionbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void boton1(View view) {

        Intent b= new Intent(this, MainActivity.class);
        startActivity(b);

    }

    public void boton2(View view) {
        Intent b2 = new Intent(this, boton2.class);
        startActivity(b2);
    }
}
