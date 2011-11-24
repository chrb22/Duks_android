package www.editu.dk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Generator extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.generator);

		Button gen = (Button) findViewById(R.id.gen);
		Button info = (Button) findViewById(R.id.info);
		Button elever = (Button) findViewById(R.id.elever);
		Button editS = (Button) findViewById(R.id.skolerB);
		Button editK = (Button) findViewById(R.id.klasserB);

		Spinner spinnerS = (Spinner) findViewById(R.id.skolerS);
		Spinner spinnerK = (Spinner) findViewById(R.id.klasserS);

		TextView duks1 = (TextView) findViewById(R.id.duks1);
		TextView duks2 = (TextView) findViewById(R.id.duks2);
		TextView reserve = (TextView) findViewById(R.id.reserve);

		spinnerS.setPrompt("Vælg Skole");
		spinnerK.setPrompt("Vælg Klasse");

//
//
//
		
		String spinnerSArray[] = {"1","2","3"};
		
	    Spinner spinnerSA = new Spinner(this);
	    ArrayAdapter<String> spinnerArrayAdapterS = new ArrayAdapter<String>(
	            this, android.R.layout.simple_spinner_item, spinnerSArray);
	    spinnerArrayAdapterS.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );

	    spinnerSA = (Spinner) findViewById(R.id.skolerS);
	    spinnerSA.setAdapter(spinnerArrayAdapterS);
	    
//
	    
		String spinnerKArray[] = {"4","5","6"};
		
	    Spinner spinnerKA = new Spinner(this);
	    ArrayAdapter<String> spinnerArrayAdapterK = new ArrayAdapter<String>(
	            this, android.R.layout.simple_spinner_item, spinnerKArray);
	    spinnerArrayAdapterK.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );

	    spinnerKA = (Spinner) findViewById(R.id.klasserS);
	    spinnerKA.setAdapter(spinnerArrayAdapterK);
	    
//
//
//
	    
        elever.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					Class ourClass = Class.forName("www.editu.dk.Elever");
					Intent ourIntent = new Intent(Generator.this, ourClass);
					startActivity(ourIntent);
					} catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
			}
		});
        
//
        
        info.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					Class ourClass = Class.forName("www.editu.dk.Info");
					Intent ourIntent = new Intent(Generator.this, ourClass);
					startActivity(ourIntent);
					} catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
			}
		});
        
        
	}
}
