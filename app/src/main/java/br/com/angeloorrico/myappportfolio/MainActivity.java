package br.com.angeloorrico.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actv_main);
    }

    public void openApp(View view) {
        String selectedApp = "";

        switch (view.getId()) {
            case R.id.bt_popular_movies:
                selectedApp = getString(R.string.app_popular_movies);
                break;
            case R.id.bt_stock_hawk:
                selectedApp = getString(R.string.app_stock_hawk);
                break;
            case R.id.bt_build_it_bigger:
                selectedApp = getString(R.string.app_build_it_bigger);
                break;
            case R.id.bt_make_your_app_material:
                selectedApp = getString(R.string.app_make_your_app_material);
                break;
            case R.id.bt_go_ubiquitous:
                selectedApp = getString(R.string.app_go_ubiquitous);
                break;
            case R.id.bt_capstone:
                selectedApp = getString(R.string.app_capstone);
                break;
        }

        Toast.makeText(this, selectedApp + " " + getString(R.string.under_development),
                Toast.LENGTH_SHORT).show();
    }
}
