package me.oz.young.smart.dagger;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import me.oz.young.smart.dagger.components.DaggerUserComponent;
import me.oz.young.smart.dagger.entities.User;
import me.oz.young.smart.dagger.modules.SimCardModule;
import me.oz.young.smart.dagger.modules.UserModule;

public class MainActivity extends AppCompatActivity {

    private String TAG = getClass().getSimpleName();

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerUserComponent.create().inject(this);
        DaggerUserComponent.builder()
                .userModule(new UserModule(this))
                .simCardModule(new SimCardModule())
                .build()
                .inject(this);
        Log.d(TAG, "user>> " + user);
    }
}
