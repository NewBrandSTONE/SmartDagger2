package me.oz.young.smart.dagger;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import me.oz.young.smart.dagger.components.DaggerRoleComponent;
import me.oz.young.smart.dagger.entities.Role;

/**
 * MainActivity
 *
 * @author 01380154
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    Role role1;

    @Inject
    Role role2;

    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerRoleComponent.create().inject(this);

        Log.d(TAG, "onCreate: 1 " + role1);
        Log.d(TAG, "onCreate: 2 " + role2);
    }
}
