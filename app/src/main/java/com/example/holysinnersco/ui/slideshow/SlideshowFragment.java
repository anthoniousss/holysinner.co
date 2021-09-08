package com.example.holysinnersco.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.holysinnersco.BuyActivity;
import com.example.holysinnersco.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    private Button BuyIt1;
    private Button BuyIt2;
    private Button BuyIt3;
    private Button BuyIt4;
    private Button BuyIt5;
    private Button BuyIt6;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        BuyIt1 = (Button) root.findViewById(R.id.harga_1_btn);
        BuyIt2 = (Button) root.findViewById(R.id.harga_2_btn);
        BuyIt3 = (Button) root.findViewById(R.id.harga_3_btn);
        BuyIt4 = (Button) root.findViewById(R.id.harga_4_btn);
        BuyIt5 = (Button) root.findViewById(R.id.harga_5_btn);
        BuyIt6 = (Button) root.findViewById(R.id.harga_6_btn);


        BuyIt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BuyActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}
