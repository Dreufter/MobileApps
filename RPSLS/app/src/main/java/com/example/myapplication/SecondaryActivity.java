package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity implements View.OnClickListener {

    String[] variable_importada=new String[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        /*Para tomar datos desde otros activities se usa la variable tipo Bundle*/
        Bundle bundle = getIntent().getExtras();
        variable_importada=bundle.getStringArray("frase");
        TextView[] tv = {findViewById(R.id.textView), findViewById(R.id.textView2)};
        tv[0].setText(variable_importada[1]);
        tv[1].setText(variable_importada[0]);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button6:
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
                break;

            case R.id.button7:
                finish();
                break;
        }
    }
}