package com.example.uchesapplication.ui.About_Software;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.uchesapplication.R;
import com.example.uchesapplication.ui.gallery.GalleryViewModel;

public class About_SoftwareFragment extends Fragment {

    private About_SoftwareViewModel about_softwareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        about_softwareViewModel =
                new ViewModelProvider(this).get(About_SoftwareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_about_software, container, false);
        final TextView textView = root.findViewById(R.id.text_about_software);
        about_softwareViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}