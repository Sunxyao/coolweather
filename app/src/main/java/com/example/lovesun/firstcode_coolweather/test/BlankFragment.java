package com.example.lovesun.firstcode_coolweather.test;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.lovesun.firstcode_coolweather.R;
import com.example.lovesun.firstcode_coolweather.TestActivity;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class BlankFragment extends Fragment {

    private String txtTest;
    private TextView textView;

    @SuppressLint("ValidFragment")
    public BlankFragment(String str) {
        this.txtTest = str;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        textView = (TextView) view.findViewById(R.id.txt_test);
        textView.setText(txtTest);
        return view;
    }

}
