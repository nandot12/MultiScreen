package id.co.imastudio.multiscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        String tmpung = getIntent().getStringExtra("nando_kece");
        Toast.makeText(this, tmpung, Toast.LENGTH_SHORT).show();




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
