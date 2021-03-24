package com.example.projectavocado;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class BoardFragment extends Fragment {


    public BoardFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_board, container, false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textTitle);
        int pos = getArguments().getInt("pos");
        switch (pos){
            case 0:
                textView.setText("Добро пожаловать в наше приложение по выбору лучших напитков!");
                break;
            case 1:
                textView.setText("Выбирайте из огромного списка, который будет у вас под рукой");
                break;
            case 2:
                textView.setText("Делитесь приложением с друзьями и получайте скидки!");
                break;
        }

        return view;
    }
}