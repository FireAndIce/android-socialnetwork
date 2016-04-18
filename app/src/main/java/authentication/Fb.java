package authentication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

//import com.bluelinelabs.logansquare.LoganSquare;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Singleton;

/*import in.dash.dashlib.R;
import in.dash.dashlib.network.FBLoginHttpRequest;
import in.dash.dashlib.network.FBLoginHttpResponse;*/

/**
 * Created by Harshal Kshatriya on 15/4/16.
 */
//@Singleton
public class Fb implements ISocialNetwork{
    private int count = 0;
    private static final String TAG = "Fb";
    Context mContext;
    CallbackManager mCallbackManager;

//    @Singleton
    @Inject
    public Fb() {


    }

//    @Override
    public void init(Context context) {

        this.setContext(mContext);
        FacebookSdk.sdkInitialize(context);
        mCallbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d(TAG, "success");
            }

            @Override
            public void onCancel() {
                Log.d(TAG, "cancel");
            }

            @Override
            public void onError(FacebookException error) {
                Log.d(TAG, "error");
            }
        });
        Log.d(TAG, "SDK initialized.");
        count++;
        Log.d(TAG, " " + count);
    }

    public void login(Context context) {
        LoginManager.getInstance().logInWithReadPermissions((Activity) context, Arrays.asList("public_profile"));
        count++;
        Log.d(TAG, " " + count);
    }

//    @Override
    public void logout() {

    }

//    @Override
    public boolean isLoggedIn() {
        return false;
    }

//    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        count++;
        Log.d(TAG, " " + count);
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }

    public void setContext(Context context) {
        this.mContext = context;
    }
}

