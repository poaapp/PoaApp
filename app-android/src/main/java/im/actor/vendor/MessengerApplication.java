package im.actor.vendor;

import com.crashlytics.android.Crashlytics;

import im.actor.sdk.ActorSDK;
import im.actor.sdk.ActorSDKApplication;
import im.actor.sdk.ActorStyle;
import io.fabric.sdk.android.Fabric;

public class MessengerApplication extends ActorSDKApplication {

    @Override
    public void onCreate() {
        Fabric.with(this, new Crashlytics());
        super.onCreate();
    }

    @Override
    public void onConfigureActorSDK() {
        // Overriding app name
        ActorSDK.sharedActor().setAppName(getString(R.string.app_name));
    }
}
