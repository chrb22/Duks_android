package www.editu.dk;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{
	
	String classes[] = {"Login","Generator","Elever","Info","Register"};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_expandable_list_item_1, classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		String menuOpen = classes[position];
		try {
		Class ourClass = Class.forName("www.editu.dk." + menuOpen);
		Intent ourIntent = new Intent(Menu.this, ourClass);
		startActivity(ourIntent);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
