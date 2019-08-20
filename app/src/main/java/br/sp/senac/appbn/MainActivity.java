package br.sp.senac.appbn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.mRecent:
                        Toast.makeText(getApplicationContext(),"cliquei em Recent",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mFavorite:
                        Toast.makeText(getApplicationContext(),"cliquei em Favorito",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mLocation:
                        Toast.makeText(getApplicationContext(),"cliquei em Location",Toast.LENGTH_LONG).show();
                        break;
                }
                return false;
            }
        });
    }
}
