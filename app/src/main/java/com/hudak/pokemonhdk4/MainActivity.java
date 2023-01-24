package com.hudak.pokemonhdk4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //< create >
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //</ create >

        //< get elements >
        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        //</ get elements >


        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager2,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        if(position == 0){
                            tab.setText("CHOOSE");
                        }
                        else if(position == 1){
                            tab.setText("HISTORY");
                        }
                    }
                }).attach();
    }
}