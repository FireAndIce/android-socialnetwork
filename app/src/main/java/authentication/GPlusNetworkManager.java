package authentication;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.common.SignInButton;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Harshal Kshatriya on 16/4/16.
 */
public class GPlusNetworkManager {
    private static final String TAG = GPlusNetworkManager.class.getCanonicalName();

    @Inject GPlus network;

    @Singleton
    @Inject
    public GPlusNetworkManager(GPlus network) {
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
//        network.onActivityResult(requestCode, resultCode, data);
    }

    public void setupButton(SignInButton signInButton) {
        signInButton.setSize(SignInButton.SIZE_STANDARD);
    }
}
