package hl.t1.ejemplo05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.udojava.evalex.Expression;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String operation="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        TextView nums = findViewById(R.id.etVisor);
        int v = view.getId();

        switch(v){
            case R.id.button:
                this.operation+="1";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                this.operation+="2";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                this.operation+="3";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                this.operation+="+";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                this.operation+="4";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                this.operation+="5";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                this.operation+="6";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                this.operation+="*";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:
                this.operation+="7";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:
                this.operation+="8";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button11:
                this.operation+="9";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button12:
                this.operation+="-";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button13:
                this.operation="";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button14:
                this.operation+=".";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button15:
                this.operation+="/";
                nums.setText(this.operation);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button16:
                Expression expression=new Expression(this.operation); //This Library Evaluate It
                String result=expression.eval().toString(); //Insert The Data into A String
                nums.setText(result);
                Toast.makeText(this, this.operation, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}