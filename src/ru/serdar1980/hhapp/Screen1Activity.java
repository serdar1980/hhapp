package ru.serdar1980.hhapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Screen1Activity extends Activity {
	
	private static final int RU_SERDAR_REQUEST_CODE=1;
    
	private Button send;
	private EditText fio;
    private EditText bithday;
    private Spinner gender;
    private EditText position;
    private EditText salary;
    private EditText phone;
    private EditText email;
    private TextView answer;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);
        
        send = (Button) findViewById(R.id.btnSend);
        fio = (EditText) findViewById(R.id.fio);
        bithday = (EditText) findViewById(R.id.bithday);
        gender = (Spinner) findViewById(R.id.gender);
        position = (EditText) findViewById(R.id.position);
        salary= (EditText) findViewById(R.id.salary);
        phone = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);
        answer =(TextView) findViewById(R.id.replayAnswerTxt);
        
        	
        String answerTxtR = getIntent().getStringExtra("answerTxt");
        if(answerTxtR != null && answerTxtR.length()>0){
        	TextView answerInfo =(TextView) findViewById(R.id.textAnswer);
     	   answer.setText(answerTxtR);
     	   answer.setVisibility(View.VISIBLE);
     	   answerInfo.setVisibility(View.VISIBLE);
     	 	   
     		
     	   TextView temp =(TextView) findViewById(R.id.textView0);
     		  TextView temp1 =(TextView) findViewById(R.id.textView1);
     		  TextView temp2 =(TextView) findViewById(R.id.textView2);
     		  TextView temp3 =(TextView) findViewById(R.id.textView3);
     		  TextView temp4 =(TextView) findViewById(R.id.textView4);
     		  TextView temp5 =(TextView) findViewById(R.id.textView5);
     		  TextView temp6 =(TextView) findViewById(R.id.textView6);
     	     
     		temp.setVisibility(View.GONE); 
     		temp1.setVisibility(View.GONE); 
     		temp2.setVisibility(View.GONE); 
     		temp3.setVisibility(View.GONE); 
     		temp4.setVisibility(View.GONE); 
     		temp5.setVisibility(View.GONE); 
     		temp6.setVisibility(View.GONE); 
      	   
           send.setVisibility(View.GONE); 
           fio.setVisibility(View.GONE);
           bithday.setVisibility(View.GONE);
           gender.setVisibility(View.GONE);
           position.setVisibility(View.GONE);
           salary.setVisibility(View.GONE);
           phone.setVisibility(View.GONE);
           email.setVisibility(View.GONE);
        }
        
        /*
        
        
        
        
        if(answerTxtR.length()>0){
     	   answer.setText(answerTxtR);
     	   answer.setVisibility(View.VISIBLE);
        }
        */
       //String fioR = getIntent().getStringExtra("fioTxt");
       //fioR=fioR+"1";
       /*String bithdayR = getIntent().getStringExtra("bithTxt");
       String genderR = getIntent().getStringExtra("genderTxt");
       String positionR = getIntent().getStringExtra("positionTxt");
       String salaryR = getIntent().getStringExtra("salaryTxt");
       String phoneR = getIntent().getStringExtra("phoneTxt");
       String emailR = getIntent().getStringExtra("emailTxt");
       String answerTxtR = getIntent().getStringExtra("answerTxt");
       fi
       fio.setText(fioR);
       bithday.setText(bithdayR);
       //gender.setsetText(genderR);
       position.setText(positionR);
       salary.setText(salaryR);
       phone.setText(phoneR);
       email.setText(emailR);
       */
       
       
       
    }
    
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	
    	 answer =(TextView) findViewById(R.id.replayAnswerTxt);
         String answerTxtR = getIntent().getStringExtra("answerTxt");
        
         if(requestCode ==RU_SERDAR_REQUEST_CODE){
        	 
       	   answer.setText(answerTxtR);
       	   
         }
         answer.setVisibility(View.VISIBLE);
    }
    
    public void goNewView(View v){
        switch (v.getId()) {
            case R.id.btnSend:
                // √оворим между какими Activity будет происходить св€зь
                Intent intent = new Intent(this, Screen2Activity.class);
     
                // указываем первым параметром ключ, а второе значение
                // по ключу мы будем получать значение с Intent
                intent.putExtra("fioTxt", fio.getText().toString());
                intent.putExtra("bithTxt", bithday.getText().toString());
                intent.putExtra("genderTxt", gender.getSelectedItem().toString());
                intent.putExtra("positionTxt", position.getText().toString());
                intent.putExtra("salaryTxt", salary.getText().toString());
                intent.putExtra("phoneTxt", phone.getText().toString());
                intent.putExtra("emailTxt", email.getText().toString());
                
                // показываем новое Activity
                startActivity(intent);
                break;
            default:
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.screen1, menu);
        return true;
    }
    
}
