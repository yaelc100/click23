package com.example.user.click23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tex,tex1,tex2;
    Button btn,btn1,btn2,btn3;
    int x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        tex=(TextView)findViewById(R.id.tex);
        tex1=(TextView)findViewById(R.id.tex1);
        tex2=(TextView)findViewById(R.id.tex2);


    }

    public void click(View view) {
        Random rnd=new Random();
        x=rnd.nextInt(10)+1;
        y=rnd.nextInt(10)+1;
        tex1.setText(x);
        tex2.setText(y);



    }

    public void small(View view) {
        if(x<y)
            tex.setText("true");
        else
            tex.setText("false");
    }

    public void equal(View view) {
        if(x==y)
            tex.setText("true");
        else
            tex.setText("false");
    }

    public void big(View view) {
        if(x>y)
            tex.setText("true");
        else
            tex.setText("false");
    }
}
