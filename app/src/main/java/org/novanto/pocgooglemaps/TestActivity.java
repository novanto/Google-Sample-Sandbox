package org.novanto.pocgooglemaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import id.privy.livenessfirebasesdk.LivenessApp;
import id.privy.livenessfirebasesdk.entity.LivenessItem;
import id.privy.livenessfirebasesdk.listener.PrivyCameraLivenessCallBackListener;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        final LivenessApp livenessApp = new LivenessApp.Builder(this).setDebugMode(false).build();


        Button b = findViewById(R.id.button_open);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                livenessApp.start(new PrivyCameraLivenessCallBackListener() {
                    @Override
                    public void success(LivenessItem livenessItem) {
                        Toast.makeText(TestActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void failed(Throwable t) {

                    }
                });
            }
        });
    }
}
