package me.oz.young.smart.dagger.modules;

import dagger.Module;
import dagger.Provides;
import me.oz.young.smart.dagger.entities.SimCard;

/**
 * @author 01380154
 */
@Module
public class SimCardModule {

    @Provides
    public SimCard provideSimCard() {
        return new SimCard("15500000000");
    }


}
