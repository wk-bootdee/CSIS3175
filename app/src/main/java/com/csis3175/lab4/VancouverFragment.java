package com.csis3175.lab4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class VancouverFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_vancouver, container, false);
        Button vancouverButton = view.findViewById(R.id.btn_reveal_vancouver_info);
        vancouverButton.setOnClickListener(v -> {
            Toast.makeText(getContext(), R.string.vancouver_facts, Toast.LENGTH_LONG).show();
        });
        return view;
    }
}