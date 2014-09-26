package com.example.inputnumbers;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText input;
	EditText output;
	Button one;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.editText1);
        output = (EditText) findViewById(R.id.editText2);
        one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {
    			if(v==one){
    				if (input.length()==10){
    					
    				
    			output.setText("Valid Number")	;
    				}
    				else{
    					
    					output.setText("Invalid Number")	;	
    					
    				}
    					
    				
    			}
    			
    		
        
        
        
        
        
        
        
        
        
        }});

        }


    
    
    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
