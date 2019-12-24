package me.oz.young.smart.dagger.modules;

import dagger.Module;
import dagger.Provides;
import me.oz.young.smart.dagger.entities.User;

@Module
public class UserModule {

    @Provides
    public User provideUser() {
        User user = new User();
        user.setAge(18);
        user.setName("Oz");
        return user;
    }

}
