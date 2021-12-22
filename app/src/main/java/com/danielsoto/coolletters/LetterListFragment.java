package com.danielsoto.coolletters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LetterListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LetterListFragment extends Fragment {

    List<WordItem> elements;

    public static LetterListFragment newInstance() {
        LetterListFragment fragment = new LetterListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_letter_list, container, false);
    }

    public void init() {
        elements = new ArrayList<>();
        elements.add(new WordItem("A"));
        elements.add(new WordItem("B"));
        elements.add(new WordItem("C"));
        elements.add(new WordItem("D"));
        elements.add(new WordItem("E"));
        elements.add(new WordItem("F"));
        elements.add(new WordItem("G"));
        elements.add(new WordItem("H"));

        ListAdapter listAdapter = new WordItemAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.abecedary_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}