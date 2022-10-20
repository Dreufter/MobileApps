package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int[] views ={ R.id.nameField, R.id.surnameField, R.id.mailField, R.id.messageField};

    @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.mitem1:
                Toast.makeText(this, "Creado por Pedro Moraga Castelar", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void onClick(View view) {
        CheckBox checkBox = findViewById(R.id.checkBox);
        switch (view.getId()){
            case R.id.cancelBtn:
                for (int i=0; i< views.length; i++){
                    TextView textView = findViewById(views[i]);
                    textView.setText("");
                }
                checkBox.setChecked(false);
                break;
            case R.id.confirmBtn:
                String[] params = new String[4];
                boolean suscription;
                for (int i=0; i< views.length; i++){
                    TextView textView = findViewById(views[i]);
                    params[i] = textView.getText().toString();
                }
                suscription = checkBox.isChecked();
                Mail data = new Mail(params[0], params[1], params[2], params[3], suscription);
                System.out.println(data);
                break;
        }
    }
}