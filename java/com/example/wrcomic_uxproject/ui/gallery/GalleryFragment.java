package com.example.wrcomic_uxproject.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.wrcomic_uxproject.R;

public class GalleryFragment extends Fragment {

    Button btn_aboutus, btn_contactus;
    TextView title, desc;

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_aboutus = view.findViewById(R.id.btn_abt_us);
        btn_contactus = view.findViewById(R.id.btn_cntct_us);
        title = view.findViewById(R.id.AbtUs);
        desc = view.findViewById(R.id.DescAbtUs);

        btn_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title.setText("About Us");
                desc.setText("WR Comic is an android based application aimed to help get a fresh first hand comic with a reasonable price.");
            }
        });

        btn_contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title.setText("Contact Us");
                desc.setText("+62-875-4728-181/wrcomics@comic.ac.id");
            }
        });
    }

}