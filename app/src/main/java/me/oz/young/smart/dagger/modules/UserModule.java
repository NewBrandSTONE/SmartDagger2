package me.oz.young.smart.dagger.modules;

import android.content.Context;
import android.util.Log;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import me.oz.young.smart.dagger.entities.Phone;
import me.oz.young.smart.dagger.entities.SimCard;
import me.oz.young.smart.dagger.entities.User;

/**
 * 用户Module类
 *
 * @author 01380154
 */
@Module(includes = {SimCardModule.class})
public class UserModule {

    private Context mContext;
    private String TAG = getClass().getSimpleName();

    public UserModule(Context context) {
        Log.d(TAG, "UserModule Construct >> " + context);
        this.mContext = context;
    }

    @Provides
    public Phone providerPhone(SimCard client) {
        Phone phone = new Phone();
        phone.setNumber("15507718189");
        return phone;
    }

    @Provides
    @Named("release")
    public User providerUserPhone(Phone phone) {
        User user = new User();
        user.setName("Ozz_Release");
        user.setAge(28);
        user.setPhone(phone);
        return user;
    }

    @Provides
    @Named("dev")
    public User provideUserForDev(Phone phone) {
        User user = new User();
        user.setName("Ozz_Dev");
        user.setAge(28);
        user.setPhone(phone);
        return user;
    }

}
