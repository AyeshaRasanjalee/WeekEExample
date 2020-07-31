package com.example.tutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //creating the key to
    public static final String EXTRA_MESSAGE="com.example.tutorial1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){//onclick that button

    Intent i = new Intent(this, DisplayMessageActivity.class );//Intend(where the intend starts,Destination)
        EditText et =findViewById(R.id.editTextTextPersonName);//capture the value
        String s= et.getText().toString();//getting the text

            i.putExtra(EXTRA_MESSAGE,s);//(string,string)

            startActivity(i);//(Intend,intend)
    }
}