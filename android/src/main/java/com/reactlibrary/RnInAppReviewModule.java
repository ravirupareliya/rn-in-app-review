package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RnInAppReviewModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RnInAppReviewModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RnInAppReview";
    }

    @ReactMethod
    public void launchReviewFlow(Callback callback) {
        // TODO: Implement some actually useful functionality
        callback.invoke("launchReviewFlow ");
    }
}
