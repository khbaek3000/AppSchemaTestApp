package com.example.brianbaek.appschematestapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btWalletAppExcute, btHostAppExcute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btWalletAppExcute = (Button) findViewById(R.id.btWalletAppExcute);
        btHostAppExcute = (Button) findViewById(R.id.btHostAppExcute);


        btWalletAppExcute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appExcuteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("schemetest://"));
                startActivity(appExcuteIntent);
            }
        });

        btHostAppExcute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hostAppExcuteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("schemetest2://"));
                startActivity(hostAppExcuteIntent);
            }
        });

    }
}
