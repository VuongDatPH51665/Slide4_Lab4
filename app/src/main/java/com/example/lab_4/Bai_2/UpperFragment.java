package com.example.lab_4.Bai_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab_4.R;

public class UpperFragment extends Fragment {
    TextView tvReceivedData;

    public UpperFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_upper, container, false);
        tvReceivedData = view.findViewById(R.id.tv_received_data);
        return view;
    }

    public void displayReceivedData(String data) {
        if (tvReceivedData != null) {
            tvReceivedData.setText(data);
        }
    }

}
