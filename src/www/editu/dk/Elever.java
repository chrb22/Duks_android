package www.editu.dk;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Elever extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.elever);
		
		
		Button back = (Button) findViewById(R.id.back);
		TextView eleverListe = (TextView) findViewById(R.id.elever);
		ArrayList<String> elever = new ArrayList<String>();
		
		elever.add("Navn1");
		elever.add("Navn2");
		elever.add("Navn3");
		elever.add("Navn4");
		elever.add("Navn5");
		elever.add("Navn6");
		elever.add("Navn7");
		elever.add("Navn8");
		elever.add("Navn9");
		elever.add("Navn10");
		elever.add("Navn11");
		elever.add("Navn13");
		elever.add("Navn14");
		elever.add("Navn15");
		elever.add("Navn16");
		elever.add("Navn17");
		elever.add("Navn18");
		elever.add("Navn19");
		elever.add("Navn20");
		elever.add("Navn21");
		elever.add("Navn22");
		elever.add("Navn23");
		elever.add("Navn24");
		elever.add("Navn25");
		elever.add("Navn26");
		elever.add("Navn27");
		elever.add("Navn28");
		elever.add("Navn29");
		elever.add("Navn30");

		
		String string ="";
		
		for(int i=0;elever.toArray().length>i;i++) {
			string += elever.toArray()[i] + "\n";
		}
		eleverListe.setText(string);
		
        back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					Class ourClass = Class.forName("www.editu.dk.Generator");
					Intent ourIntent = new Intent(Elever.this, ourClass);
					startActivity(ourIntent);
					} catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
			}
		});
	}
}