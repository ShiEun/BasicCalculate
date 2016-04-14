package kr.hs.emirim.tldms0940.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    Button Mbutton01;
    Button Mbutton02;
    Button Mbutton03;
    Button Mbutton04;
    TextView RTextView;
    EditText MText01;
    EditText MText02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RTextView = (TextView)findViewById(R.id.textV_result);
        MText01 = (EditText)findViewById(R.id.edit_number01);
        MText02 = (EditText)findViewById(R.id.edit_number02);
    }

    protected  void onClick(Button mbutton01)
    {


    }
}

