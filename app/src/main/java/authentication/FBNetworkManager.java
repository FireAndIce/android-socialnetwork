package authentication;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Lazy;

/**
 * Created by Harshal Kshatriya on 15/4/16.
 */
@Singleton
public class FBNetworkManager {
    private static final String TAG = FBNetworkManager.class.getCanonicalName();
    //    User user;
//    @Inject /*@Singleton*/ Lazy<ISocialNetwork> network;
    @Inject Fb network;

/*
    @Inject
//    @Singleton
    public FBNetworkManager(Lazy<ISocialNetwork> network) {
        this.network = network;
    }
*/
    @Inject
    public FBNetworkManager(Fb network) {
        this.network = network;
    }
    public void initNetwork(Context context) {
        Log.d(TAG, "In initNetwork");
        network.init(context);
    }
    public void userLogin(Context context) {
        network.login(context);
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        network.onActivityResult(requestCode, resultCode, data);
    }
}
