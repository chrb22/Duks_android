package www.editu.dk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);

		Button register = (Button) findViewById(R.id.register);
		final EditText username = (EditText) findViewById(R.id.username);
		final EditText pass1 = (EditText) findViewById(R.id.password1);
		final EditText pass2 = (EditText) findViewById(R.id.password2);
		final TextView rC = (TextView) findViewById(R.id.rC);
		int passEqual;

		register.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Values values = new Values();
				if (pass1.getText().toString().contentEquals(pass2.getText().toString())) {
						if (values.addUser(username.getText().toString(), pass1.getText().toString())) {
					rC.setText("You are succesfully registered!");
				} else{rC.setText("Username was already taken!");}
			} else{rC.setText("Passwords didn't match!");}
			}
		});
	}
}
