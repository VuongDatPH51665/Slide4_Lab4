package com.example.lab_4.Bai_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab_4.R;

public class LowerFragment extends Fragment {

    EditText etDataToSend;
    Button btnSend;

    public LowerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lower, container, false);
        etDataToSend = view.findViewById(R.id.et_data_to_send);
        btnSend = view.findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToUpperFragment();
            }
        });

        return view;
    }

    private void sendDataToUpperFragment() {
        String data = etDataToSend.getText().toString().trim();
        if (!data.isEmpty()) {
            UpperFragment upperFragment = (UpperFragment) getParentFragmentManager().findFragmentById(R.id.fragment_container_top);
            if (upperFragment != null) {
                upperFragment.displayReceivedData(data);
            }
        }
    }

}
