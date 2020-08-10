# rn-in-app-review

## Getting started

`$ npm install rn-in-app-review --save`
<br>or<br>
`$ yarn add rn-in-app-review`

### For React Native < 0.60

`$ react-native link rn-in-app-review`

### For React Native >= 0.60

`$ cd ios`
`$ pod install`

## Usage
```javascript
import RnInAppReview from 'rn-in-app-review';

RNInAppReview.launchReviewFlow((isSuccessful)=>console.log('RNInAppReview ' , isSuccessful))

```

## When to request an in-app review

Follow [Guideline](https://github.com/ravirupareliya/rn-in-app-review/blob/master/Guidelines.md) to get clear idea about when to launch or use in app review.

- [How To Test In App Review For Android?](https://developer.android.com/guide/playcore/in-app-review/test)
- [Test In App Review For iOS](https://developer.apple.com/design/human-interface-guidelines/ios/system-capabilities/ratings-and-reviews/)