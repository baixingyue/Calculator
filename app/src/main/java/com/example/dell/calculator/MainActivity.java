package com.example.dell.calculator;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String figure;
    String str="";
    String[] s1={};
    double sum=0;
    double num1=0;
    double num2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        Button btnOne=(Button)findViewById(R.id.buttonOne);
        Button btnTwo=(Button)findViewById(R.id.buttonTwo);
        Button btnThree=(Button)findViewById(R.id.buttonThree);
        Button btnFour=(Button)findViewById(R.id.buttonFour);
        Button btnFive=(Button)findViewById(R.id.buttonFive);
        Button btnSix=(Button)findViewById(R.id.buttonSix);
        Button btnSeven=(Button)findViewById(R.id.button1Seven);
        Button btnEight=(Button)findViewById(R.id.button1Eight);
        Button btnNine=(Button)findViewById(R.id.button1Nine);
        Button btnZero=(Button)findViewById(R.id.button1Zero);
        Button btnPoint=(Button)findViewById(R.id.button1Point);
        Button btnClear=(Button)findViewById(R.id.buttonClear);
        Button btnMimus=(Button)findViewById(R.id.buttonMinus);
        Button btnMul=(Button)findViewById(R.id.buttonMul);
        Button btnPlus=(Button)findViewById(R.id.buttonPlus);
        Button btnEqual=(Button)findViewById(R.id.buttonEqual);
        Button btn=(Button)findViewById(R.id.button);
        final TextView txtResult=(TextView)findViewById(R.id.textResult1);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "1");

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "0");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = txtResult.getText().toString();
                if(str.equals(""))
                {
                    txtResult.setText(txtResult.getText() + "0.");
                }
                else
                {
                    txtResult.setText(txtResult.getText() + ".");
                }

            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "+");
                figure="+";
            }

        });
        btnMimus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "-");
                figure="-";
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "*");
                figure="*";
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "/");
                figure="/";
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                str = txtResult.getText().toString();
                if (figure.equals("+")) {
                    s1 = str.split("\\+");
                    for(int i=0;i<s1.length;i++)
                    {
                        sum+=Double.parseDouble(s1[i]);
                    }
                    txtResult.setText(String.valueOf(sum));
                    sum=0;
                }
                if (figure.equals("-")) {
                    s1 = str.split("-");
                    num1 = Double.parseDouble(s1[0]);
                    num2=Double.parseDouble(s1[1]);
                    sum=num1-num2;
                    txtResult.setText(String.valueOf(sum));
                }
                if (figure.equals("/")) {
                    s1 = str.split("/");
                    num1=Double.parseDouble(s1[0]);
                    num2=Double.parseDouble(s1[1]);
                    sum=num1/num2;
                    txtResult.setText(String.valueOf(sum));
                }
                if (figure.equals("*")) {
                    s1 = str.split("\\*");
                    sum=1;
                    for(int i=0;i<s1.length;i++)
                    {
                        sum*=Double.parseDouble(s1[i]);
                    }
                    txtResult.setText(String.valueOf(sum));
                    sum=1;
                }

            }

        });
    }

}
