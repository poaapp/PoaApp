//
//  Copyright (c) 2014-2015 Actor LLC. <https://actor.im>
//

import UIKit
import ActorSDK
import Fabric
import Crashlytics

@UIApplicationMain
class AppDelegate: ActorApplicationDelegate {

    override init() {
        super.init()
        Fabric.with([Crashlytics.self])
        ActorSDK.sharedActor().createActor()
    }
    
    override func application(application: UIApplication, didFinishLaunchingWithOptions launchOptions: [NSObject : AnyObject]?) -> Bool {
        super.application(application, didFinishLaunchingWithOptions: launchOptions)
        // Showing
        ActorSDK.sharedActor().presentMessengerInNewWindow()
        return true
    }
}