package authentication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Harshal Kshatriya on 15/4/16.
 */

@Component(modules = {FacebookModule.class, GPlusModule.class})
@Singleton
public interface ISNetworkComponent {
//    @Provides
    FBNetworkManager fbNetworkManager();
    GPlusNetworkManager gplusNetworkManager();
}
