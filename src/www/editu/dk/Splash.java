package www.editu.dk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        Thread timer = new Thread () {
        	public void run() {
        		try {
        			sleep(0000); //5000
        		} catch(InterruptedException e) {
        			e.printStackTrace();
        		} finally{
        			Intent openGenerator = new Intent("www.editu.dk.MENU");
        			startActivity(openGenerator);
        		}
        	}
        };
        timer.start();
    }

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
    
}