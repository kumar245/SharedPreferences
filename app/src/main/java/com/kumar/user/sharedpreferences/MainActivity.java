package com.kumar.user.sharedpreferences;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    sharedPreference shred;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         shred=new sharedPreference(this);
        e1= (EditText) findViewById(R.id.uName);
        e2= (EditText) findViewById(R.id.passWord);
    }

    public void registerButton(View view) {

        shred.saveData(e1.getText().toString(),e2.getText().toString());

    }

    public void loadButton(View view) {
        String Data = shred.LoadData();
        Toast.makeText(this, Data, Toast.LENGTH_SHORT).show();
    }
}
