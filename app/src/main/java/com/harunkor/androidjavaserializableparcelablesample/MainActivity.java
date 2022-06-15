package com.harunkor.androidjavaserializableparcelablesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button serializableButton;
    private Button parcelableButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serializableButton = findViewById(R.id.serializablebutton);
        parcelableButton = findViewById(R.id.parcelablebutton);
        intent = new Intent(this,EmployeeActivity.class);

        parcelableButton.setOnClickListener(view -> {
            parcelableSendData();
        });

        serializableButton.setOnClickListener(view -> {
            serializableSendData();
        });

    }

    private void serializableSendData(){
        EmployeeSerializable employeeSerializable = new EmployeeSerializable("John",29,"Boston");
        employeeSerializable.setAge(56);
        intent.putExtra("Employee",employeeSerializable);
        startActivity(intent);

    }

    private void  parcelableSendData(){
        EmployeeParcelable employeeParcelable = new EmployeeParcelable("Nicol",45,"Rotterdam");
        employeeParcelable.setAge(33);
        intent.putExtra("Employee",employeeParcelable);
        startActivity(intent);

    }
}