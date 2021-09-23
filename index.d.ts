declare module 'rn-in-app-review' {
  export type Callback = (success: boolean) => void;

  export default class InAppReview {
    static launchReviewFlow(callback: Callback): void;
  }
}
