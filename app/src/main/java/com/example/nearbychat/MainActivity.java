package com.example.nearbychat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button tabHome, tabChatroom, tabTools, btnStartAdvertising, btnDiscoverDevices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartAdvertising = findViewById(R.id.btnStartAdvertising);
        btnDiscoverDevices = findViewById(R.id.btnDiscoverDevices);

        tabHome = findViewById(R.id.tabHome);
        tabChatroom = findViewById(R.id.tabChatroom);
        tabTools = findViewById(R.id.tabTools);

        btnStartAdvertising.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChatroomActivity.class);
            startActivity(intent);
        });

        btnDiscoverDevices.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChatroomActivity.class);
            startActivity(intent);
        });

        tabHome.setOnClickListener(v -> {
            // already on Home
        });

        tabChatroom.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChatroomActivity.class);
            startActivity(intent);
        });

        tabTools.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ToolsActivity.class);
            startActivity(intent);
        });
    }
}