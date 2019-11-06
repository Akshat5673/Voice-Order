package app.example.voiceorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class luckystore extends AppCompatActivity {
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luckystore);

        button= (Button) findViewById(R.id.button243);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Proceed_to_Order();
            }
        });
    }

    private void Proceed_to_Order() {
        Intent intent111 =new Intent(this, speakandorder.class);
        startActivity(intent111);
    }
}
