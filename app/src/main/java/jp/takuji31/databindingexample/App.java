package jp.takuji31.databindingexample;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

/**
 * @author Takuji Nishibayashi
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AndroidThreeTen.init(this);
    }
}
