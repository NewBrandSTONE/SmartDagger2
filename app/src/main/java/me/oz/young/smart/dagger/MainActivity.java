package me.oz.young.smart.dagger;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import me.oz.young.smart.dagger.components.DaggerUserComponent;
import me.oz.young.smart.dagger.entities.User;

public class MainActivity extends AppCompatActivity {

    private String TAG = getClass().getSimpleName();

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent.create().inject(this);
        Log.d(TAG, "user>> " + user);
    }
}
