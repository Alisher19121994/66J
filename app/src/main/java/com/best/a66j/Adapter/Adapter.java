package com.best.a66j.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.best.a66j.Module.User;
import com.best.a66j.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<User> list;

    public Adapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adapter, parent, false);
        return new Mode(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = list.get(position);
        if (holder instanceof Mode) {
            TextView a = ((Mode) holder).a;
            a.setText(user.getName());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Mode extends RecyclerView.ViewHolder {
        View view;
        TextView a;

        public Mode(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            a = itemView.findViewById(R.id.item_detail);
        }
    }
}
