// Ubicación: src/com/example/recyclerview/WordListAdapter.java
package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {

    private final LayoutInflater mInflater;
    private final LinkedList<String> mWordList;

    // Constructor to initialize the adapter with context and word list
    public WordListAdapter(Context context, LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    // Create a new ViewHolder when needed
    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for each list item
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        // Return a new ViewHolder with the inflated layout
        return new WordViewHolder(mItemView);
    }

    // Bind data to the ViewHolder
    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        // Retrieve the data for the current position
        String mCurrent = mWordList.get(position);
        // Set the data to the TextView in the ViewHolder
        holder.wordItemView.setText(mCurrent);
    }

    // Return the total number of items in the data set
    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
