package com.example.lab_4.Bai_3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.example.lab_4.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class tab_actityty extends AppCompatActivity {
    TabLayout tabs;
    ViewPager2 pager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tab);
        tabs = findViewById(R.id.tabs);
        pager2 = findViewById(R.id.pager);

        adapter adapter = new adapter(this);
        pager2.setAdapter(adapter);

        new TabLayoutMediator(tabs, pager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("image");
                        break;
                    case 1:
                        tab.setText("text");
                        break;
                }
            }
        }).attach();

    }
}