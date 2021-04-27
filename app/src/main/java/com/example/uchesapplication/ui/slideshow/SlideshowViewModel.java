package com.example.uchesapplication.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("A population is a distinct group of individuals, whether that group comprises a nation or a group of people with a common characteristic" +
                "\nThis statistic shows the total population of male and female per state in 2016.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}