package com.example.wrcomic_uxproject.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wrcomic_uxproject.Comics;
import com.example.wrcomic_uxproject.MyComicAdapter2;
import com.example.wrcomic_uxproject.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.id_recyclerview2);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        Comics[] Comic_data = new Comics[]{
                new Comics("Fairytail Vol. 62", "Fairy Tail (stylized as FAIRY TAIL) is a Japanese manga series written and illustrated by Hiro Mashima.",
                        R.mipmap.ic_comic1),
                new Comics("SAO Magazine Vol. 4", "Sword Art Online (Japanese: ソードアート・オンライン, Hepburn: Sōdo Āto Onrain) is a Japanese light novel series written by Reki Kawahara and illustrated by abec.",
                        R.mipmap.ic_comic5_foreground),
                new Comics ("Attack on Titan Vol 26", "Attack on Titan (Japanese: 進撃の巨人, Hepburn: Shingeki no Kyojin, lit. \"The Attack Titan\") is a Japanese manga series written and illustrated by Hajime Isayama.",
                        R.mipmap.ic_comic3),
                new Comics ("Marvel Comics #1000", "Marvel Comics is the brand name and primary imprint of Marvel Worldwide Inc., formerly Marvel Publishing, Inc. and Marvel Comics Group, a publisher of American comic books and related media.",
                        R.mipmap.ic_comic7_foreground),
                new Comics (" Non-stop Spiderman", "Non-Stop Spider-Man #1 rockets out on March 10 from Marvel Comics. Veteran writer Joe Kelly takes the reader on an intense joyride thanks to a simple plot. Penciler Chris Bachalo provides a highly dynamic look for the plot’s pace.",
                        R.mipmap.ic_comic2),
                new Comics ("Demon Slayer Vol. 10", "Demon Slayer: Kimetsu no Yaiba (Japanese: 鬼滅の刃, Hepburn: Kimetsu no Yaiba, lit. \"Blade of Demon Destruction\"[4]) is a Japanese manga series written and illustrated by Koyoharu Gotouge. ",
                        R.mipmap.ic_comic8_foreground),
                new Comics("Ninja Hattori-kun", "Ninja Hattori-kun (忍者ハットリくん), known as Ninja Hattori and Hattori, the Little Ninja in some countries, is a Japanese manga series written and illustrated by duo Fujiko Fujio (and later by Fujiko A. Fujio) which was serialized between 1964 and 1988.",
                        R.mipmap.ic_comic4_foreground),
                new Comics("Hai Miiko #33", "Kocchi Muite! Miiko (Japanese: こっちむいて!みい子, lit. \"Look This Way, Miiko!\") is a Japanese shōjo comedy manga series by Eriko Ono. It has been published by Shogakukan in Ciao since 1995 and collected in 32 bound volumes.",
                        R.mipmap.ic_comic9_foreground),
                new Comics ("Bungou Stray Dogs Vol. 1", "Bungo Stray Dogs (Japanese: 文豪ストレイドッグス, Hepburn: Bungō Sutorei Doggusu, lit. \"Literary Stray Dogs\") is a Japanese manga series written by Kafka Asagiri and illustrated by Sango Harukawa, which has been serialized in Kadokawa Shoten's seinen manga magazine Young Ace since 2012. ",
                        R.mipmap.ic_comic6_foreground),
                new Comics("My Hero Academia ", "My Hero Academia (Japanese: 僕のヒーローアカデミア, Hepburn: Boku no Hīrō Akademia) is a Japanese superhero manga series written and illustrated by Kōhei Horikoshi. ",
                        R.mipmap.ic_comic10_foreground)
        };

        MyComicAdapter2 myComicAdapter2 = new MyComicAdapter2(Comic_data, SlideshowFragment.this);
        recyclerView.setAdapter(myComicAdapter2);

    }
}