package com.dolev.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,
    button7,button8,button9,buttonAdd,buttonSub,buttonDivision,
    buttonMul,button10,buttonC,buttonEqual;

    EditText curnchifyEditText;

    float mValueOne,mValueTwo;

    boolean crunchifyAddition,mSubtract,crunchifyMultiplication,crunchchifyDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button11);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonMul = (Button) findViewById(R.id.button13);
        buttonAdd = (Button) findViewById(R.id.button16);
        buttonSub = (Button) findViewById(R.id.button15);
        buttonDivision = (Button) findViewById(R.id.button14);
        buttonC = (Button) findViewById(R.id.button12);
        buttonEqual = (Button) findViewById(R.id.button17);
        curnchifyEditText = (EditText) findViewById(R.id.edt);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curnchifyEditText.setText(curnchifyEditText.getText() + "1");
            }

        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curnchifyEditText.setText(curnchifyEditText.getText() +"2");
            }

        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curnchifyEditText.setText(curnchifyEditText.getText() +"3");
            }

        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curnchifyEditText.setText(curnchifyEditText.getText() +"4");
            }

        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curnchifyEditText.setText(curnchifyEditText.getText() +"5");
            }

        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curnchifyEditText.setText(curnchifyEditText.getText() +"6");
            }

        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curnchifyEditText.setText(curnchifyEditText.getText() +"7");
            }

        });


        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curnchifyEditText.setText(curnchifyEditText.getText() +"8");
            }

        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curnchifyEditText.setText(curnchifyEditText.getText() +"9");
            }

        });

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                curnchifyEditText.setText(curnchifyEditText.getText() +"0");
            }

        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curnchifyEditText==null){
                    curnchifyEditText.setText("");
                }else{
                    mValueOne = Float.parseFloat(curnchifyEditText.getText()+ "");
                    crunchifyAddition = true;
                    curnchifyEditText.setText(null);


                }

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(curnchifyEditText.getText() + "");
                mSubtract = true;
                curnchifyEditText.setText(null);


            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(curnchifyEditText.getText()+"");
                crunchifyMultiplication = true;
                curnchifyEditText.setText(null);

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(curnchifyEditText.getText() + "");
                crunchchifyDivision=true;
                curnchifyEditText.setText(null);

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(curnchifyEditText.getText() + "");

                if(crunchifyAddition == true){
                    curnchifyEditText.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if(mSubtract == true){
                    curnchifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if(crunchifyMultiplication == true){
                    curnchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }
                if(crunchchifyDivision == true){
                    curnchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchchifyDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curnchifyEditText.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curnchifyEditText.setText(curnchifyEditText.getText() + ".");
            }
        });
    }





    public void onnumberclick(View view) {

        Log.i("dolev","view called"+view);


    }
}
