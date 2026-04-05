package com.example.nearbychat;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<Message> {

    private final Activity context;
    private final List<Message> messages;

    public MessageAdapter(Activity context, List<Message> messages) {
        super(context, 0, messages);
        this.context = context;
        this.messages = messages;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.message_item, parent, false);
        }

        Message currentMessage = messages.get(position);

        LinearLayout rowRoot = listItemView.findViewById(R.id.messageRowRoot);
        LinearLayout messageBubble = listItemView.findViewById(R.id.messageBubble);
        TextView tvMessageText = listItemView.findViewById(R.id.tvMessageText);
        ImageView ivMessageImage = listItemView.findViewById(R.id.ivMessageImage);

        if (currentMessage.isSentByMe()) {
            rowRoot.setGravity(Gravity.END);
            messageBubble.setBackgroundResource(R.drawable.message_sent);
            tvMessageText.setTextColor(0xFFFFFFFF);
        } else {
            rowRoot.setGravity(Gravity.START);
            messageBubble.setBackgroundResource(R.drawable.message_received);
            tvMessageText.setTextColor(0xFF333333);
        }

        if (currentMessage.getText() != null && !currentMessage.getText().isEmpty()) {
            tvMessageText.setVisibility(View.VISIBLE);
            tvMessageText.setText(currentMessage.getText());
        } else {
            tvMessageText.setVisibility(View.GONE);
        }

        if (currentMessage.getImageResId() != null) {
            ivMessageImage.setVisibility(View.VISIBLE);
            ivMessageImage.setImageResource(currentMessage.getImageResId());
        } else {
            ivMessageImage.setVisibility(View.GONE);
        }

        return listItemView;
    }
}