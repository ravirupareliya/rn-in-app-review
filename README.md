# rn-in-app-review

## Getting started

`$ npm install rn-in-app-review --save`
<br>or<br>
`$ yarn add rn-in-app-review`

### Mostly automatic installation

`$ react-native link rn-in-app-review`

## Usage
```javascript
import RnInAppReview from 'rn-in-app-review';

RNInAppReview.launchReviewFlow((isSuccessful)=>console.log('RNInAppReview ' , isSuccessful))

```

## When to request an in-app review

Follow [Guideline](https://github.com/ravirupareliya/rn-in-app-review/blob/master/Guidelines.md) to get clear idea about when to launch or use in app review.
