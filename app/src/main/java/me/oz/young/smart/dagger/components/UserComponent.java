package me.oz.young.smart.dagger.components;

import dagger.Component;
import me.oz.young.smart.dagger.MainActivity;
import me.oz.young.smart.dagger.modules.UserModule;

@Component(modules = {UserModule.class})
public interface UserComponent {

    void inject(MainActivity activity);

}
