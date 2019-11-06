package app.example.voiceorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class growmart extends AppCompatActivity {
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growmart);

        button= (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Proceed_to_order();
            }
        });

    }

    private void Proceed_to_order() {
        Intent intent23 = new Intent(this, speakandorder.class);
        startActivity(intent23);
    }
}
