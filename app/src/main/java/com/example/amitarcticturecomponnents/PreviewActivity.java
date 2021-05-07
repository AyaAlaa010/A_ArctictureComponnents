package com.example.amitarcticturecomponnents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import com.example.amitarcticturecomponnents.databinding.ActivityPreviewBinding;

public class PreviewActivity extends AppCompatActivity {
Person person;
ActivityPreviewBinding binding;
    private static final String TAG = "PreviewActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_preview);
        person=getIntent().getParcelableExtra("person");
        Log.i(TAG, "onCreate:  888888888888 "+person.toString());
        binding.setPerson(person);



    }
}