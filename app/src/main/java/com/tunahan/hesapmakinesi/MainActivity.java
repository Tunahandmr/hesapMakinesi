package com.tunahan.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.textView);

    }

    public void topla (View view){
       int a = Integer.parseInt( editText.getText().toString());
       int b=  Integer.parseInt(editText2.getText().toString()) ;

        textView.setText("Result : "+ (a+b));
    }

    public void cikar (View view){
        int a = Integer.parseInt( editText.getText().toString());
        int b=  Integer.parseInt(editText2.getText().toString()) ;
        textView.setText("Result : "+ (a-b));

    }

    public void carp (View view){
        int a = Integer.parseInt( editText.getText().toString());
        int b=  Integer.parseInt(editText2.getText().toString()) ;
        textView.setText("Result : "+ (a*b));

    }

    public void bol (View view){
        int a = Integer.parseInt( editText.getText().toString());
        int b=  Integer.parseInt(editText2.getText().toString()) ;
        textView.setText("Result : "+ (a/b));

    }

}