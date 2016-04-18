package authentication;

import android.content.Context;
import android.content.Intent;

import javax.inject.Singleton;

/**
 * Created by Harshal Kshatriya on 15/4/16.
 */
//@Singleton
public interface ISocialNetwork {
    void init(Context context);
    void login(Context context);
    void logout();
    boolean isLoggedIn();

    void onActivityResult(int requestCode, int resultCode, Intent data);
}
