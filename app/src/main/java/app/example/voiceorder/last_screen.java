package app.example.voiceorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class last_screen extends AppCompatActivity {
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_screen);

        button = (Button) findViewById(R.id.gohome);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Home();
            }
        });

    }

    private void Home() {
        Intent intent5= new Intent(this,MainActivity.class);
        startActivity(intent5);
    }
    Intent intent24 = getIntent();

}
