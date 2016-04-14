package kr.hs.emirim.tldms0940.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Mbutton[]=new Button[4];
    TextView RTextView;
    EditText EText01;
    EditText EText02;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//이 문장 아래서 findViewById를 해줘야 함
        Mbutton[0]=(Button)findViewById(R.id.but_plus);
        Mbutton[1]=(Button)findViewById(R.id.but_minus);
        Mbutton[2]=(Button)findViewById(R.id.but_mul);
        Mbutton[3]=(Button)findViewById(R.id.but_div);
        RTextView = (TextView)findViewById(R.id.text_result);
        EText01 = (EditText)findViewById(R.id.edit_number01);
        EText02 = (EditText)findViewById(R.id.edit_number02);

        for(i=0; i<Mbutton.length; i++)
        {
            Mbutton[i].setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View v) {
        //2개의 EditText에 입력된 값을 반환받는다.
        String num1Str = EText01.getText().toString();
        String num2Str = EText02.getText().toString();

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        double result=0.0;

        switch(v.getId())//객체가 가지고 있는 아이디 값
        {
            case R.id.but_plus:
                result = num1+num2;
                break;
            case R.id.but_minus:
                result = num1-num2;
                break;
            case R.id.but_mul:
                result = num1*num2;
                break;
            case R.id.but_div:
                result = (double)num1/num2;
                break;
        }
        RTextView.setText("* 계산 결과 : "+result);
    }
}

