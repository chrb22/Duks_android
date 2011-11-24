package www.editu.dk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Info extends Activity {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        
        Button back = (Button) findViewById(R.id.back);
        TextView TextView =(TextView) findViewById(R.id.text);
        
        
        back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					Class ourClass = Class.forName("www.editu.dk.Generator");
					Intent ourIntent = new Intent(Info.this, ourClass);
					startActivity(ourIntent);
					} catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
			}
		});
        
//
        
        String textArray[] =
        	{
        		"Hello",
        		"My name is:",
        		"???",
        		":D",
        		"What is your name?",
        		"Simon?",
        		"Bye"
        	};
        	
        String text = "";
        
		for(int i=0;textArray.length>i;i++) {
			text += textArray[i] + "\n";
		}
		
		TextView.setText(text);
    }
}
