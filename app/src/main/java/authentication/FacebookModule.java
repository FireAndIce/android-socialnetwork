package authentication;

import com.facebook.CallbackManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Harshal Kshatriya on 15/4/16.
 */
@Module
public class FacebookModule {


    @Provides @Singleton /*static*/ Fb provideSocialNetwork() {
        return new Fb();
    }
//    @Provides
//    CallbackManager provideCallbackManager() {
//        return CallbackManager.Factory.create();
//    }

}
