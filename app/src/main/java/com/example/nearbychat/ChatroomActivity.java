package com.example.nearbychat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ChatroomActivity extends AppCompatActivity {

    Button btnDrawingCanvas, btnSend, tabHome, tabChatroom, tabTools;
    EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);

        btnDrawingCanvas = findViewById(R.id.btnDrawingCanvas);
        btnSend = findViewById(R.id.btnSend);
        etMessage = findViewById(R.id.etMessage);

        tabHome = findViewById(R.id.tabHome);
        tabChatroom = findViewById(R.id.tabChatroom);
        tabTools = findViewById(R.id.tabTools);

        btnDrawingCanvas.setOnClickListener(v -> {
            Intent intent = new Intent(ChatroomActivity.this, ToolsActivity.class);
            startActivity(intent);
        });

        btnSend.setOnClickListener(v -> {
            // teammates will add real send logic later
        });

        tabHome.setOnClickListener(v -> {
            Intent intent = new Intent(ChatroomActivity.this, MainActivity.class);
            startActivity(intent);
        });

        tabChatroom.setOnClickListener(v -> {
            // already on Chatroom
        });

        tabTools.setOnClickListener(v -> {
            Intent intent = new Intent(ChatroomActivity.this, ToolsActivity.class);
            startActivity(intent);
        });
    }
}