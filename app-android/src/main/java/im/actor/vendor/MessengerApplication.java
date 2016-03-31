package im.actor.vendor;

import com.crashlytics.android.Crashlytics;

import android.graphics.Color;

import com.crashlytics.android.Crashlytics;

import im.actor.sdk.ActorSDK;
import im.actor.sdk.ActorSDKApplication;
import im.actor.sdk.ActorStyle;
import io.fabric.sdk.android.Fabric;

public class MessengerApplication extends ActorSDKApplication {

    @Override
    public void onConfigureActorSDK() {
        // Overriding app name

        ActorSDK.sharedActor().setAppName(getString(R.string.app_vendor_name));
        ActorSDK.sharedActor().setCustomApplicationName(getString(R.string.app_vendor_name));
        ActorSDK.sharedActor().setEndpoints(new String[]{"tcp://app.poaapp.co.tz:9070"});

        ActorStyle style = ActorSDK.sharedActor().style;
        style.setMainColor(Color.parseColor("#ED1C24"));
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());

    }
}
