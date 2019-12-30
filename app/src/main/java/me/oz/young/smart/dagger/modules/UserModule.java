package me.oz.young.smart.dagger.modules;

import android.content.Context;
import android.util.Log;


import dagger.Module;
import dagger.Provides;
import me.oz.young.smart.dagger.entities.SimCard;
import me.oz.young.smart.dagger.entities.Phone;
import me.oz.young.smart.dagger.entities.User;

@Module(includes = SimCardModule.class)
public class UserModule {

    private Context mContext;
    private String TAG = getClass().getSimpleName();

//    使用@Provides注释的方法，如果有两个返回类型相同，会出现错误
//    错误: [Dagger/DuplicateBindings] me.oz.young.smart.dagger.entities.User is bound multiple times:
//    @Provides
//    public User provideUser() {
//        User user = new User();
//        user.setAge(18);
//        user.setName("Oz");
//        return user;
//    }

//    @Singleton
    public UserModule(Context context) {
        Log.d(TAG, "UserModule Construct >> " + context);
        this.mContext = context;
    }

    @Provides
//    @Singleton
    public Phone providerPhone(SimCard client) {
        Phone phone = new Phone();
        phone.setNumber("15507718189");
        return phone;
    }

    @Provides
//    @Singleton
    public User providerUserPhone(Phone phone) {
        User user = new User();
        user.setName("Ozz");
        user.setAge(28);
        user.setPhone(phone);
        return user;
    }

}
