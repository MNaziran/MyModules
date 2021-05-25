package sg.edu.rp.c346.id20028828.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnC346, btnC203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC346 = findViewById(R.id.buttonC346);
        btnC203 = findViewById(R.id.buttonC203);

        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modulecode", "C346");
                intent.putExtra("modulename", "Android Programming");
                intent.putExtra("acadyear", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("modcred", 4);
                intent.putExtra("venue", "E62E");
                startActivity(intent);

            }
        });
        btnC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modulecode", "C203");
                intent.putExtra("modulename", "Web Application Development in PHP");
                intent.putExtra("acadyear", 2021);
                intent.putExtra("sem", 1);
                intent.putExtra("modcred", 4);
                intent.putExtra("venue", "W67N");
                startActivity(intent);
            }
        });
    }
}