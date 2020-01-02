package me.oz.young.smart.dagger.modules;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * 提供OkHttpClient
 *
 * @author 01380154
 */
@Module
public class HttpModule {

    @Provides
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient.Builder().build();
    }

}
