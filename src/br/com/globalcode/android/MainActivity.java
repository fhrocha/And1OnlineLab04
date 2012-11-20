package br.com.globalcode.android;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void clearFields(View view) {

		final EditText editTextName = (EditText)this.findViewById(R.id.editTextName);
        final EditText editTextPassword = (EditText)this.findViewById(R.id.editTextPass);
        final TextView textViewStatus = (TextView)this.findViewById(R.id.txtViewStatus);
        
        editTextName.setText("");
        editTextPassword.setText("");
        textViewStatus.setText("");
        
        editTextName.requestFocus();
    }
    
    public void checkLogin(View view) {
    	
		final EditText editTextName = (EditText)this.findViewById(R.id.editTextName);
        final EditText editTextPassword = (EditText)this.findViewById(R.id.editTextPass);
        final TextView textViewStatus = (TextView)this.findViewById(R.id.txtViewStatus);
        
        if( "Fábio".equalsIgnoreCase(editTextName.getText().toString()) &&
        		"123".equals(editTextPassword.getText().toString()) ) {
        	
        	textViewStatus.setText("Login OK!");
        	textViewStatus.setTextColor(Color.BLACK);
        } else {
        	
        	textViewStatus.setText("Access Denied");
        	textViewStatus.setTextColor(Color.RED);
        }
    }

}
