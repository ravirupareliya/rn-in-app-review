#import "RnInAppReview.h"
#import <StoreKit/StoreKit.h>

@implementation RnInAppReview

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(launchReviewFlow:(RCTResponseSenderBlock)callback)
{
    // TODO: Implement some actually useful functionality
    if (@available(iOS 10.3, *)) {
        [SKStoreReviewController requestReview];
        callback(@[[NSString stringWithFormat: @"true"]]);
    }else
    callback(@[[NSString stringWithFormat: @"false"]]);
}

@end
