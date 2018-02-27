package id.co.imastudio.multiscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //untuk menunda ke code setelahnya bisa pakai handler
        Handler alias = new Handler();
        alias.postDelayed(new Runnable() {
            @Override
            public void run() {
                //eksekusi kalau delay nya selesai
                startActivity(new Intent(SplashScreenActivity.this,MainActivity.class));
                finish();
            }
            //delay time
        },5000);
    }
}
