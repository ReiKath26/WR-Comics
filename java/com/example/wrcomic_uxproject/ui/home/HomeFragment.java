package com.example.wrcomic_uxproject.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wrcomic_uxproject.Comics;
import com.example.wrcomic_uxproject.MyComicAdapter;
import com.example.wrcomic_uxproject.R;
import com.example.wrcomic_uxproject.Slider_adapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderView;

public class HomeFragment extends Fragment{


    SliderView sliderView;
    RecyclerView recyclerView;

    int[] images = {
            R.mipmap.ic_comic1,
            R.mipmap.ic_comic2,
            R.mipmap.ic_comic3
    };



    private HomeViewModel homeViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        sliderView = view.findViewById(R.id.image_slider);
        recyclerView = view.findViewById(R.id.id_recyclerview);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        Comics[] Comics_data = new Comics[]{
                new Comics("Attack on Titan Volume 26", "Attack on " +
                        "Titan (Japanese: 進撃の巨人, Hepburn: Shingeki no Kyojin, lit. \"The Attack Titan\") " +
                        "is a Japanese manga series written and illustrated by Hajime Isayama.", R.mipmap.ic_comic3),
                new Comics("Non-Stop Spider Man", "Non-Stop Spider-Man #1 rockets out on March " +
                        "10 from Marvel Comics. Veteran writer Joe Kelly takes the reader on an intense joyride thanks to " +
                        "a simple plot. Penciler Chris Bachalo provides a highly dynamic look for the plot’s pace.", R.mipmap.ic_comic2),
                new Comics("Ninja Hattori-kun", "Ninja Hattori-kun (忍者ハットリくん), known as Ninja Hattori " +
                        "and Hattori, the Little Ninja in some countries, is a Japanese manga series written and illustrated by duo Fujiko " +
                        "Fujio (and later by Fujiko A. Fujio) which was serialized between 1964 and 1988.", R.mipmap.ic_comic4_foreground)
        };

        MyComicAdapter myComicAdapter = new MyComicAdapter(Comics_data, HomeFragment.this);
        recyclerView.setAdapter(myComicAdapter);

        Slider_adapter sliderAdapter = new Slider_adapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.SLIDE);
        sliderView.setAutoCycle(true);
    }


}