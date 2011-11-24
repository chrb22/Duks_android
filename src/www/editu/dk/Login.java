package www.editu.dk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		final Values va;

		
		Button bLogin = (Button) findViewById(R.id.bLogin);
		Button bRegister = (Button) findViewById(R.id.bRegister);
		final EditText user = (EditText) findViewById(R.id.user);
		final EditText pass = (EditText) findViewById(R.id.pass);
		final TextView msg = (TextView) findViewById(R.id.msg);

		bLogin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Values users = new Values();
				for(int i = 0;i<users.getLength();i++) {
					if(user.getText().toString().contentEquals(users.getUser(i))
						&&
						pass.getText().toString().contentEquals(users.getPassword(i))) {
						users.setCurrentUser(i);
						msg.setText("Logged In as " + users.getCurrentUserName());
						break;
					} else{msg.setText("Bad Login or Password!");}
				}
			}
		});
	}

}