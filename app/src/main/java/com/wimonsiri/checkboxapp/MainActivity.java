package com.wimonsiri.checkboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CheckBox appleCheckBox , bananaCheckBox , grapeCheckBox , orangeCheckBox;
    private Button btnSubmit;
    private TextView show;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appleCheckBox = (CheckBox) findViewById(R.id.appleCheckBox);
        bananaCheckBox = (CheckBox) findViewById(R.id.bananaCheckBox);
        grapeCheckBox = (CheckBox) findViewById(R.id.grapeCheckBox);
        orangeCheckBox = (CheckBox) findViewById(R.id.orangeCheckBox);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        show = (TextView) findViewById(R.id.show);

        btnSubmit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String message = "";
        if(appleCheckBox.isChecked()) message += "selected Apple\n" ;
        else message += "No selected CheckBox 1\n";

        if(bananaCheckBox.isChecked()) message += "selected Banana\n" ;
        else message += "No selected CheckBox 2\n";

        if(grapeCheckBox.isChecked()) message += "selected Grape\n" ;
        else message += "No selected CheckBox 3\n";

        if(orangeCheckBox.isChecked()) message += "selected Orange\n" ;
        else message += "No selected CheckBox 4\n";
        show.setText(message);
    }

}