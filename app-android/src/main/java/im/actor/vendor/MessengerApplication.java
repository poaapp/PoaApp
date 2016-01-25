package im.actor.vendor;

import im.actor.sdk.ActorSDK;
import im.actor.sdk.ActorSDKApplication;
import im.actor.sdk.ActorStyle;

public class MessengerApplication extends ActorSDKApplication {

    @Override
    public void onConfigureActorSDK() {
        // Overriding app name
        ActorSDK.sharedActor().setAppName(getString(R.string.app_name));
    }
}
