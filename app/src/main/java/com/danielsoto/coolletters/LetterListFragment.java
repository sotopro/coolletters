package com.danielsoto.coolletters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

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
        View view = inflater.inflate(R.layout.fragment_letter_list, container, false);
        elements = new ArrayList<>();
        elements.add(new WordItem("A"));
        elements.add(new WordItem("B"));
        elements.add(new WordItem("C"));
        elements.add(new WordItem("D"));
        elements.add(new WordItem("E"));
        elements.add(new WordItem("F"));
        elements.add(new WordItem("G"));
        elements.add(new WordItem("H"));

        RecyclerView recyclerView = view.findViewById(R.id.abecedary_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1, RecyclerView.VERTICAL, false));
        WordItemAdapter adapter = new WordItemAdapter(elements);
        recyclerView.setAdapter(adapter);

        return view;
    }
}