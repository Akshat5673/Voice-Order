package app.example.voiceorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choosestore extends AppCompatActivity {
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosestore);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GroMart();
            }
        });

        button= (Button) findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Evergreen_Groceries();
            }
        });

        button= (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lucky_grocery_store();
            }
        });
    }

    private void Evergreen_Groceries() {
        Intent intent75 = new Intent(this, evergreenstore.class);
        startActivity(intent75);
    }

    private void Lucky_grocery_store() {
        Intent intent35 = new Intent(this ,luckystore.class);
        startActivity(intent35);
    }

    private void GroMart() {
        Intent intent48= new Intent(this,growmart.class);
        startActivity(intent48);

    }
}
