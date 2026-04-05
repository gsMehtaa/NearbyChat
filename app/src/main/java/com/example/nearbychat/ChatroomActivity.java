package com.example.nearbychat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ChatroomActivity extends AppCompatActivity {

    Button btnDrawingCanvas, btnSend, tabHome, tabChatroom, tabTools;
    EditText etMessage;
    ListView listViewMessages;

    ArrayList<Message> messageList;
    MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);

        btnDrawingCanvas = findViewById(R.id.btnDrawingCanvas);
        btnSend = findViewById(R.id.btnSend);
        etMessage = findViewById(R.id.etMessage);
        listViewMessages = findViewById(R.id.listViewMessages);

        tabHome = findViewById(R.id.tabHome);
        tabChatroom = findViewById(R.id.tabChatroom);
        tabTools = findViewById(R.id.tabTools);

        messageList = new ArrayList<>();

        messageAdapter = new MessageAdapter(this, messageList);
        listViewMessages.setAdapter(messageAdapter);

        btnDrawingCanvas.setOnClickListener(v -> {
            Intent intent = new Intent(ChatroomActivity.this, ToolsActivity.class);
            startActivity(intent);
        });

        btnSend.setOnClickListener(v -> {
            String messageText = etMessage.getText().toString().trim();

            if (!messageText.isEmpty()) {
                messageList.add(new Message(messageText, null, true));
                messageAdapter.notifyDataSetChanged();
                etMessage.setText("");
                listViewMessages.smoothScrollToPosition(messageList.size() - 1);
            }
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