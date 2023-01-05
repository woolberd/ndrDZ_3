package com.example.ndrdz_3.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ndrdz_3.NamesAdapter;
import com.example.ndrdz_3.R;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private final List<String> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_names);

        list.add("Harry Potter");
        list.add("A meter apart");
        list.add("Three meters above the sky");
        list.add("After");
        list.add("Wednesday");
        list.add("Cruella");
        list.add("Avatar");
        list.add("Titanic");
        list.add("Alone at home");
        list.add("Alone at home 2");
        list.add("Harry Potter 2");
        list.add("Harry Potter 3");
        list.add("Harry Potter 4");
        list.add("Harry Potter 5");
        list.add("Harry Potter 6");
        list.add("Harry Potter 7(first)");
        list.add("Harry Potter 7(second)");

        NamesAdapter name = new NamesAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()
                , RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(name);
    }
}