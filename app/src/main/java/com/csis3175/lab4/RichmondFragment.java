package com.csis3175.lab4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class RichmondFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_richmond, container, false);
        Button button = view.findViewById(R.id.btn_reveal_richmond_info);
        button.setOnClickListener(e -> {
            Toast.makeText(getContext(), R.string.richmond_facts, Toast.LENGTH_LONG).show();
        });
        return view;
    }
}