package com.example.catappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Database extends AppCompatActivity {

    public ArrayList<CatObject> catList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        catList = new ArrayList<>();




    }

    public void setDefault(){
        catList.add("Ragdoll", R.drawable.ragdoll);

    }

}