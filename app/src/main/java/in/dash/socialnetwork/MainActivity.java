package in.dash.socialnetwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;

import java.util.Arrays;

import authentication.DaggerISNetworkComponent;
import authentication.ISNetworkComponent;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getCanonicalName();
    @Bind(R.id.button_fb) Button facebookButton;
    @Bind (R.id.loginbutton_fb) LoginButton loginButton;
    @Bind(R.id.button_gplus) Button gPlusButton;
    @Bind(R.id.sign_in_button) SignInButton gPlusSignInButton;
    CallbackManager callbackManager;
    ISNetworkComponent isNetworkComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isNetworkComponent = DaggerISNetworkComponent.builder().build();
        isNetworkComponent.fbNetworkManager().initNetwork(this);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        facebookButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                isNetworkComponent.fbNetworkManager().userLogin(MainActivity.this);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        isNetworkComponent.fbNetworkManager().onActivityResult(requestCode, resultCode, data);
//        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
