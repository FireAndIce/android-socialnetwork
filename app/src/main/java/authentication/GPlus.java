package authentication;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Harshal Kshatriya on 16/4/16.
 */
public class GPlus {

    private Context mContext;

    GoogleApiClient mGoogleApiClient;

    public void init(Context context) {
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(context)
                .enableAutoManage((FragmentActivity) context /* FragmentActivity */, new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(ConnectionResult connectionResult) {

                    }
                }/* OnConnectionFailedListener */)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();


    }

    public void login(Context context) {

    }

    public void logout() {

    }

    public boolean isLoggedIn() {
        return false;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }


}
