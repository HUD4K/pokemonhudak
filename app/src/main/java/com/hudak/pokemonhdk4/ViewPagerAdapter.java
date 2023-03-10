package com.hudak.pokemonhdk4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.hudak.pokemonhdk4.page1;
import com.hudak.pokemonhdk4.page2;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity)
    {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return  new page1();
            default:
                return  new page2();
        }
    }
    @Override
    public int getItemCount() {return 2;}
}