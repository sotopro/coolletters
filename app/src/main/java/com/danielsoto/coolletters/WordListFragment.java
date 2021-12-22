package com.danielsoto.coolletters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WordListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WordListFragment extends Fragment {

    public WordListFragment() {
        // Required empty public constructor
    }

    public static WordListFragment newInstance(String param1, String param2) {
        WordListFragment fragment = new WordListFragment();
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
        return inflater.inflate(R.layout.fragment_word_list, container, false);
    }
}