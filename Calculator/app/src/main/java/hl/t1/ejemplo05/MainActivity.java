package hl.t1.ejemplo05;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.udojava.evalex.Expression;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String operation="";

    @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Objects.requireNonNull(getSupportActionBar()).hide();
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View view){
        TextView nums = findViewById(R.id.etVisor);
        int v = view.getId();

        switch(v){
            case R.id.button:
                this.operation+="1";
                nums.setText(this.operation);
                break;
            case R.id.button2:
                this.operation+="2";
                nums.setText(this.operation);
                break;
            case R.id.button3:
                this.operation+="3";
                nums.setText(this.operation);
                break;
            case R.id.button4:
                this.operation+="+";
                nums.setText(this.operation);
                break;
            case R.id.button5:
                this.operation+="4";
                nums.setText(this.operation);
                break;
            case R.id.button6:
                this.operation+="5";
                nums.setText(this.operation);
                break;
            case R.id.button7:
                this.operation+="6";
                nums.setText(this.operation);
                break;
            case R.id.button8:
                this.operation+="*";
                nums.setText(this.operation);
                break;
            case R.id.button9:
                this.operation+="7";
                nums.setText(this.operation);
                break;
            case R.id.button10:
                this.operation+="8";
                nums.setText(this.operation);
                break;
            case R.id.button11:
                this.operation+="9";
                nums.setText(this.operation);
                break;
            case R.id.button12:
                this.operation+="-";
                nums.setText(this.operation);
                break;
            case R.id.button13:
                this.operation="";
                nums.setText(this.operation);
                break;
            case R.id.button14:
                this.operation+=".";
                nums.setText(this.operation);
                break;
            case R.id.button18:
                this.operation+="0";
                nums.setText(this.operation);
                break;
            case R.id.button15:
                this.operation+="/";
                nums.setText(this.operation);
                break;
            case R.id.button16:
                if (this.operation.equals(""))nums.setText(this.operation);
                else this.operation = this.operation.substring(0,this.operation.length()-1); nums.setText(this.operation);
                break;
            case R.id.button17:

                String last = this.operation.substring(this.operation.length()-1);

                if (this.operation.equals("")){
                    this.operation="0";
                }else if (last.equals("+") || last.equals("-") || last.equals("/") || last.equals("*") || last.equals(".")){
                    Toast.makeText(this, "esta", Toast.LENGTH_SHORT).show();
                    this.operation = this.operation.substring(0,this.operation.length()-1);
                }
                Expression expression=new Expression(this.operation); //This Library Evaluate It
                String result=expression.eval().toString(); //Insert The Data into A String
                nums.setText(result);
                break;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.mitem1:
                Toast.makeText(this, "Elemento 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mitem2:
                Toast.makeText(this, "Elemento 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mitem3:
                Toast.makeText(this, "Creado por Pedro Moraga Castelar", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}