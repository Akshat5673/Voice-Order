package app.example.voiceorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class order_confirmation extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);

        button =(Button) findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Change_Order();
            }
        });


        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Confirm_Order();
            }
        });
    }

    private void Change_Order() {
        Intent intent00 =new Intent(this, speakandorder.class);
        startActivity(intent00);
    }

    private void Confirm_Order() {
        Intent intent24= new Intent(this,last_screen.class);
        startActivity(intent24);
    }

}
