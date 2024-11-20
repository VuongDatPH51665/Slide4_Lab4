package com.example.lab_4.Bai_3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.lab_4.fragment;
import com.example.lab_4.fragment2;

public class adapter extends FragmentStateAdapter {
    public adapter(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0){
            return new fragment();
        }
        return new fragment2();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
