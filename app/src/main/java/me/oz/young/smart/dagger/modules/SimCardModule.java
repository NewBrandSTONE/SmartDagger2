package me.oz.young.smart.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.oz.young.smart.dagger.entities.SimCard;

@Module
public class SimCardModule {

    @Provides
//    @Singleton
    public SimCard provideSimCard() {
        return new SimCard("15500000000");
    }


}
