package com.erin.app_01;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
private TextView mTextMessage;
private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
        = new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navigation_account:
                mTextMessage.setText ("Account");
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Username");
                return true;
            case R.id.navigation_shopping:
                mTextMessage.setText("Shopping");
                return true;
            case R.id.navigation_point:
                mTextMessage.setText("Point");
                return true;
    }
        return false;
}
};

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mTextMessage = (TextView) findViewById(R.id.message);
     BottomNavigationView navigation = findViewById(R.id.navigation);
     navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_account, R.id.navigation_shopping, R.id.navigation_point)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navView, navController);


    }


}