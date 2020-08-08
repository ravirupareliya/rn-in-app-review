package com.reactlibrary;

import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;

public class RnInAppReviewModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    ReviewManager manager;
    public RnInAppReviewModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        manager = ReviewManagerFactory.create(reactContext);
    }

    @Override
    public String getName() {
        return "RnInAppReview";
    }

    @ReactMethod
    public void launchReviewFlow(final Callback callback) {
        Task<ReviewInfo> request = manager.requestReviewFlow();
        request.addOnCompleteListener(new OnCompleteListener<ReviewInfo>() {
            @Override
            public void onComplete(@NonNull Task<ReviewInfo> task) {
                if (task.isSuccessful()) {
                    // We can get the ReviewInfo object
                    ReviewInfo reviewInfo = task.getResult();
                    Task<Void> flow = manager.launchReviewFlow(getCurrentActivity(), reviewInfo);
                    flow.addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Log.e("launchReviewFlow", "onComplete() called with: isSuccessful = [" + task.isSuccessful() + "]");
                            callback.invoke(task.isSuccessful());
                        }
                    });
                } else {
                    // There was some problem, continue regardless of the result.
                    Log.e("launchReviewFlow", "onComplete() called with: failed = [" + task.getException() + "]");
                    callback.invoke(task.getException().getMessage());
                }
            }
        });
    }
}
