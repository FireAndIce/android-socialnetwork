package authentication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Harshal Kshatriya on 15/4/16.
 */
@Module
public class ISocialNetworkModule {

    @Provides @Singleton /*static*/ ISocialNetwork provideSocialNetwork() {
        return new Fb();
    }
}
