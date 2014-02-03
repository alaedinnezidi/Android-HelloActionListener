package com.example.helloactionlistener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	Button myButton;
	EditText myEditText;
	TextView myTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// init views
		myButton = (Button) findViewById(R.id.button1);
		myEditText = (EditText) findViewById(R.id.editText1);
		myTextView = (TextView) findViewById(R.id.textView1);

		// add Listener to button
		myButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {

		// get editText content
		String editTextContent = myEditText.getText().toString();

		myTextView.setText(editTextContent);

	}

}
