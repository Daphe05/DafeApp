package com.example.uchesapplication.ui.About_Software;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class About_SoftwareViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private MutableLiveData<String> mText;

    public About_SoftwareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ASABORO-OBEDAFE BLESSED. 17CJ022479");
    }

    public LiveData<String> getText() {
        return mText;
    }
}