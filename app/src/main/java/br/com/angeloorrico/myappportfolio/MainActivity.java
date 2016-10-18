package br.com.angeloorrico.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actv_main);
    }

    public void openApp(View view) {
        Button bt = (Button) view;
        Snackbar.make(view, String.format(getString(R.string.under_development), bt.getText()),
                Snackbar.LENGTH_SHORT).show();
    }

}
