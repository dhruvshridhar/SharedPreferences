package in.blogspot.tecnopandit.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences=this.getSharedPreferences("in.blogspot.tecnopandit.sharedpreferences", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("myname","Dhruv").apply();
        String k=sharedPreferences.getString("myname","not found");
        Toast.makeText(this,k,Toast.LENGTH_LONG).show();
    }
}
