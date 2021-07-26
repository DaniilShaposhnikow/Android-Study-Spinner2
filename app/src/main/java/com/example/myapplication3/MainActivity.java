package com.example.myapplication3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private PhonesExpert phonesExpert = new PhonesExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view)
    {
        TextView brandsTextView = (TextView)findViewById(R.id.brands);
        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        String selectedPhone = String.valueOf(spinner1.getSelectedItem());
        brandsTextView.setText(phonesExpert.getPhones(selectedPhone));
    }
}


