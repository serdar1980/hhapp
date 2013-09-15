package ru.serdar1980.hhapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Screen2Activity extends Activity {
 
    private Button replay;
    private TextView fioTxt;
    private TextView bithTxt;
    private TextView genderTxt;
    private TextView positionTxt;
    private TextView salaryTxt;
    private TextView phoneTxt;
    private TextView emailTxt;
    private EditText answerTxt;
    private static final int RU_SERDAR_REQUEST_CODE_OK=1;
    private static final int RU_SERDAR_REQUEST_CODE_ERR=0;
    
    private String fio ;
    private String bithday ;
    private String gender ;
    private String position ;
    private String salary ;
    private String phone ;
    private String email ;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        
        replay = (Button) findViewById(R.id.btnReplay);
        fioTxt = (TextView) findViewById(R.id.fioTxt);
       
        bithTxt = (TextView) findViewById(R.id.bithTxt);
        genderTxt = (TextView) findViewById(R.id.genderTxt);
        positionTxt = (TextView) findViewById(R.id.positionTxt);
        salaryTxt= (TextView) findViewById(R.id.salaryTxt);
        phoneTxt = (TextView) findViewById(R.id.phoneTxt);
        emailTxt = (TextView) findViewById(R.id.emailTxt);
        
        answerTxt =(EditText) findViewById(R.id.answerTxt);
        
        
        fio = getIntent().getStringExtra("fioTxt");
        bithday = getIntent().getStringExtra("bithTxt");
        gender = getIntent().getStringExtra("genderTxt");
        position = getIntent().getStringExtra("positionTxt");
        salary = getIntent().getStringExtra("salaryTxt");
        phone = getIntent().getStringExtra("phoneTxt");
        email = getIntent().getStringExtra("emailTxt");
		
        fioTxt.setText(fioTxt.getText().toString() + " " + fio);
        bithTxt.setText(bithTxt.getText().toString() + " " + bithday);
        genderTxt.setText(genderTxt.getText().toString() + " " + gender);
        positionTxt.setText(positionTxt.getText().toString() + " " + position);
        salaryTxt.setText(salaryTxt.getText().toString() + " " + salary);
        phoneTxt.setText(phoneTxt.getText().toString() + " " + phone);
        emailTxt.setText(emailTxt.getText().toString() + " " + email);
        /* */
    }
    
    public void replay(View v){
        switch (v.getId()) {
            case R.id.btnReplay:
                Intent intent = new Intent(this, Screen1Activity.class);
                
                String answer =answerTxt.getText().toString();
                
                intent.putExtra("answerTxt", answer);
                // возвращение данных
                // intent.putExtra("fioTxt", fio);
                intent.putExtra("bithTxt", bithday);
                intent.putExtra("genderTxt", gender);
                intent.putExtra("positionTxt", position);
                intent.putExtra("salaryTxt", salary);
                intent.putExtra("phoneTxt", phone);
                intent.putExtra("emailTxt", email);
                
               startActivity(intent);	
                
                break;
            default:
                break;
        }
    }
 
}

