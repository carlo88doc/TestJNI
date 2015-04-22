package reply.jnitest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.loadLibrary("reply_jnitest_NativeConnector");


    }

    @Override
    protected void onResume() {
        super.onResume();

         String nativeText = new NativeConnector().getNativeText();

        Toast.makeText(getApplicationContext(), nativeText, Toast.LENGTH_LONG).show();
    }
}
