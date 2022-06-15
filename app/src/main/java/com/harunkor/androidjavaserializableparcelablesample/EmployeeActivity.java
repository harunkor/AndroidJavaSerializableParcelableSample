package com.harunkor.androidjavaserializableparcelablesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EmployeeActivity extends AppCompatActivity {

    private  EmployeeParcelable employeeParcelable;
    private  EmployeeSerializable employeeSerializable;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        result = findViewById(R.id.employee_text);
        employeeParcelable = getIntent().getParcelableExtra("Employee");
        employeeSerializable = (EmployeeSerializable) getIntent().getSerializableExtra("Employee");
        if(employeeParcelable == null){
            result.setText(employeeSerializable.getName()+" "+employeeSerializable.getAge()+" "
                    + employeeSerializable.getAddress());
        }else {
            result.setText(employeeParcelable.getName()+" "+employeeParcelable.getAge()+" "
                    + employeeParcelable.getAddress());

        }



    }
}