#import "RnInAppReview.h"

@implementation RnInAppReview

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(launchReviewFlow:(RCTResponseSenderBlock)callback)
{
    // TODO: Implement some actually useful functionality
    callback(@[[NSString stringWithFormat: @"launchReviewFlow"]]);
}

@end
