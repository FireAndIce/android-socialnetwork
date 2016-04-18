package authentication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Harshal Kshatriya on 16/4/16.
 */
@Module
public class GPlusModule {

    @Provides GPlus provideGplusNetwork() {
        return new GPlus();
    }
}
