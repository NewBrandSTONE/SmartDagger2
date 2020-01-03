package me.oz.young.smart.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.oz.young.smart.dagger.entities.Role;

/**
 * 角色Model
 *
 * @author O.z Young
 * @version 2020-01-03
 */
@Module
public class RoleModule {

    @Provides
    @Singleton
    Role provideOkHttpClient() {
        return new Role();
    }

}
