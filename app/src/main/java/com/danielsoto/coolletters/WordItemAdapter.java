package com.danielsoto.coolletters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordItemAdapter extends RecyclerView.Adapter<WordItemAdapter.ViewHolder> {
    private List<WordItem> wordItemData;
    private LayoutInflater inflater;
    private Context context;

    public WordItemAdapter(List<WordItem> itemList, Context context) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.wordItemData = itemList;
    }

    @Override
    public int getItemCount() { return wordItemData.size(); }

    @Override
    public WordItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_view, null);
        return new WordItemAdapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final  WordItemAdapter.ViewHolder holder, final int position) {
        holder.bindData(wordItemData.get(position));
    }

    public void setItems(List<WordItem> items) { wordItemData = items;}

    public  class ViewHolder extends  RecyclerView.ViewHolder {
        Button letter;
        ViewHolder(View itemView) {
            super(itemView);
            letter = itemView.findViewById(R.id.button_item);
        }

        void bindData(final WordItem item) {
            letter.setText(item.letter);
        }
    }

}
