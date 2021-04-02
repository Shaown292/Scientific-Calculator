package com.shaown.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtView;
    TextView txtResult;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnMinus, btnPlus, btnDivision, btnMultiplication, btnEqual, btnAC, btnC, btnPi, btnLog, btnSin, btnCos, btnTan, btnXSquare, btnRoot,
            btnParentheses1, btnParentheses2, btnDot, btnPower;

    String pi = "3.1416";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtView = (TextView) findViewById(R.id.txtView);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btn0 =  findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 =  findViewById(R.id.btn3);
        btn4 =  findViewById(R.id.btn4);
        btn5 =  findViewById(R.id.btn5);
        btn6 =  findViewById(R.id.btn6);
        btn7 =  findViewById(R.id.btn7);
        btn8 =  findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAC =  findViewById(R.id.btnAC);
        btnPower = findViewById(R.id.btnPower);
        btnC =  findViewById(R.id.btnC);
        btnLog =  findViewById(R.id.btnLog);
        btnSin =  findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnTan =  findViewById(R.id.btnTan);
        btnPi =  findViewById(R.id.btnPi);
        btnXSquare = findViewById(R.id.btnXSquare);
        btnRoot = findViewById(R.id.btnRoot);
        btnDivision =  findViewById(R.id.btnDivision);
        btnMinus =  findViewById(R.id.btnMinus);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnPlus =  findViewById(R.id.btnPlus);
        btnParentheses1 =  findViewById(R.id.btnParentheses1);
        btnParentheses2 =  findViewById(R.id.btnParentheses2);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + ".");
            }
        });
        btnParentheses1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "(");
            }
        });
        btnParentheses2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + ")");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "-");
            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "×");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "÷");
            }
        });
        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(btnPi.getText());
                txtView.setText(txtView.getText() + pi);
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "sin");
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "cos");
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "tan");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText("");
                txtResult.setText("");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtView.getText().toString();
                temp = temp.substring(0, temp.length() - 1);
                txtView.setText(temp);
            }
        });
        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtView.getText().toString();
                double r = Math.sqrt(Double.parseDouble(temp));
                txtResult.setText(String.valueOf(r));
            }
        });
        btnXSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double d = Double.parseDouble(txtView.getText().toString());
                Double square = d * d;
                txtResult.setText(String.valueOf(square));
                txtView.setText(d + "²");

            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "log");

            }
        });
        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "^");

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = txtView.getText().toString();
                String replacedstr = val.replace('÷', '/').replace('×', '*');
                double result = eval(replacedstr);
                txtResult.setText(String.valueOf(result));
                txtView.setText(val);
            }

        });


    }
    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }



}