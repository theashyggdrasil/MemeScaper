package theashyggdrasil.memeskaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnLoad = findViewById(R.id.btnLoadImage);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(getApplicationContext(), UploadImage.class);
                startActivity(intent);
            }
        });

        final Button btnWebImage = findViewById(R.id.btnUrlImage);
        btnWebImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(getApplicationContext(), WebImage.class);
                startActivity(intent);
            }
        });

        final Button btnFakeText = findViewById(R.id.btnFakeText);
        btnFakeText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(getApplicationContext(), FakeText.class);
                startActivity(intent);
            }
        });
    }


}
