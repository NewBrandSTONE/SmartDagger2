package me.oz.young.smart.dagger.components;

import javax.inject.Singleton;

import dagger.Component;
import me.oz.young.smart.dagger.MainActivity;
import me.oz.young.smart.dagger.modules.RoleModule;

/**
 * 角色容器
 *
 * @author O.z Young
 * @version 2020-01-03
 */
@Singleton
@Component(modules = RoleModule.class)
public interface RoleComponent {

    void inject(MainActivity mainActivity);

}
