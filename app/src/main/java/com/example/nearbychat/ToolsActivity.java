package com.example.nearbychat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ToolsActivity extends AppCompatActivity {

    Button tabHome, tabChatroom, tabTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

        tabHome = findViewById(R.id.tabHome);
        tabChatroom = findViewById(R.id.tabChatroom);
        tabTools = findViewById(R.id.tabTools);

        tabHome.setOnClickListener(v -> {
            Intent intent = new Intent(ToolsActivity.this, MainActivity.class);
            startActivity(intent);
        });

        tabChatroom.setOnClickListener(v -> {
            Intent intent = new Intent(ToolsActivity.this, ChatroomActivity.class);
            startActivity(intent);
        });

        tabTools.setOnClickListener(v -> {
            // already on Tools
        });
    }
}