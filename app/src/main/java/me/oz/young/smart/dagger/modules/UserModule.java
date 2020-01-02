package me.oz.young.smart.dagger.modules;

import android.content.Context;
import android.util.Log;


import dagger.Module;
import dagger.Provides;
import me.oz.young.smart.dagger.entities.SimCard;
import me.oz.young.smart.dagger.entities.Phone;
import me.oz.young.smart.dagger.entities.User;
import okhttp3.OkHttpClient;

/**
 * 用户Module类
 *
 * @author 01380154
 */
@Module(includes = {SimCardModule.class, HttpModule.class})
public class UserModule {

    private Context mContext;
    private String TAG = getClass().getSimpleName();

    public UserModule(Context context) {
        Log.d(TAG, "UserModule Construct >> " + context);
        this.mContext = context;
    }

    @Provides
    public Phone providerPhone(SimCard client, OkHttpClient okHttpClient) {
        Phone phone = new Phone();
        phone.setNumber("15507718189");
        return phone;
    }

    @Provides
    public User providerUserPhone(Phone phone) {
        User user = new User();
        user.setName("Ozz");
        user.setAge(28);
        user.setPhone(phone);
        return user;
    }

}
