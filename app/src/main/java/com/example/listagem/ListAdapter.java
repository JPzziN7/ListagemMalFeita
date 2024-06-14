package com.example.listagem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MessageViewHolder> {
    List<String> items = new ArrayList<>();

    @Override
    public int getItemCount() {
        return items.size();
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_card_view, parent, false);
        return new MessageViewHolder(card);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        // Bind your data here
        String item = items.get(position);
        holder.message.setText(item);
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder {
        TextView message;

        public MessageViewHolder(View itemView) {
            super(itemView);
            message = itemView.findViewById(R.id.textView2);
        }
    }
}
