package xyz.jiaci.plugin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Plugin1_MainActivity extends AppCompatActivity {
    private String TAG = "Plugin1_MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG,"onCreate_start");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"onCreate_end");
    }
}
