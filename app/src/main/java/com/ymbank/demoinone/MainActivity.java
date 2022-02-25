package com.ymbank.demoinone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.ymbank.demoinone.databinding.ActivityMainBinding;
import com.ymbank.lib1.Friend;
import com.ymbank.lib1.Parent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        ConstraintLayout root = inflate.getRoot();
        Friend friend = new Friend();
        String name = friend.getName();

        setContentView(root);
    }
}