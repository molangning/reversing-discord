package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SpringAnimation extends AnimationDriver {
    private static final double MAX_DELTA_TIME_SEC = 0.064d;
    private static final double SOLVER_TIMESTEP_SEC = 0.001d;
    private int mCurrentLoop;
    private final PhysicsState mCurrentState;
    private double mDisplacementFromRestThreshold;
    private double mEndValue;
    private double mInitialVelocity;
    private int mIterations;
    private long mLastTime;
    private double mOriginalValue;
    private boolean mOvershootClampingEnabled;
    private double mRestSpeedThreshold;
    private double mSpringDamping;
    private double mSpringMass;
    private boolean mSpringStarted;
    private double mSpringStiffness;
    private double mStartValue;
    private double mTimeAccumulator;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class PhysicsState {
        double position;
        double velocity;

        private PhysicsState() {
        }
    }

    public SpringAnimation(ReadableMap readableMap) {
        PhysicsState physicsState = new PhysicsState();
        this.mCurrentState = physicsState;
        physicsState.velocity = readableMap.getDouble("initialVelocity");
        resetConfig(readableMap);
    }

    private void advance(double d) {
        double d2;
        double d3;
        if (isAtRest()) {
            return;
        }
        double d4 = MAX_DELTA_TIME_SEC;
        if (d <= MAX_DELTA_TIME_SEC) {
            d4 = d;
        }
        this.mTimeAccumulator += d4;
        double d5 = this.mSpringDamping;
        double d6 = this.mSpringMass;
        double d7 = this.mSpringStiffness;
        double d8 = -this.mInitialVelocity;
        double sqrt = d5 / (Math.sqrt(d7 * d6) * 2.0d);
        double sqrt2 = Math.sqrt(d7 / d6);
        double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
        double d9 = this.mEndValue - this.mStartValue;
        double d10 = this.mTimeAccumulator;
        if (sqrt < 1.0d) {
            double exp = Math.exp((-sqrt) * sqrt2 * d10);
            double d11 = sqrt * sqrt2;
            double d12 = d8 + (d11 * d9);
            double d13 = d10 * sqrt3;
            d3 = this.mEndValue - ((((d12 / sqrt3) * Math.sin(d13)) + (Math.cos(d13) * d9)) * exp);
            d2 = ((d11 * exp) * (((Math.sin(d13) * d12) / sqrt3) + (Math.cos(d13) * d9))) - (((Math.cos(d13) * d12) - ((sqrt3 * d9) * Math.sin(d13))) * exp);
        } else {
            double exp2 = Math.exp((-sqrt2) * d10);
            double d14 = this.mEndValue - (((((sqrt2 * d9) + d8) * d10) + d9) * exp2);
            d2 = exp2 * ((d8 * ((d10 * sqrt2) - 1.0d)) + (d10 * d9 * sqrt2 * sqrt2));
            d3 = d14;
        }
        PhysicsState physicsState = this.mCurrentState;
        physicsState.position = d3;
        physicsState.velocity = d2;
        if (isAtRest() || (this.mOvershootClampingEnabled && isOvershooting())) {
            if (this.mSpringStiffness > 0.0d) {
                double d15 = this.mEndValue;
                this.mStartValue = d15;
                this.mCurrentState.position = d15;
            } else {
                double d16 = this.mCurrentState.position;
                this.mEndValue = d16;
                this.mStartValue = d16;
            }
            this.mCurrentState.velocity = 0.0d;
        }
    }

    private double getDisplacementDistanceForState(PhysicsState physicsState) {
        return Math.abs(this.mEndValue - physicsState.position);
    }

    private boolean isAtRest() {
        if (Math.abs(this.mCurrentState.velocity) <= this.mRestSpeedThreshold && (getDisplacementDistanceForState(this.mCurrentState) <= this.mDisplacementFromRestThreshold || this.mSpringStiffness == 0.0d)) {
            return true;
        }
        return false;
    }

    private boolean isOvershooting() {
        if (this.mSpringStiffness > 0.0d) {
            double d = this.mStartValue;
            double d2 = this.mEndValue;
            if ((d < d2 && this.mCurrentState.position > d2) || (d > d2 && this.mCurrentState.position < d2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(ReadableMap readableMap) {
        int i;
        this.mSpringStiffness = readableMap.getDouble("stiffness");
        this.mSpringDamping = readableMap.getDouble("damping");
        this.mSpringMass = readableMap.getDouble("mass");
        this.mInitialVelocity = this.mCurrentState.velocity;
        this.mEndValue = readableMap.getDouble("toValue");
        this.mRestSpeedThreshold = readableMap.getDouble("restSpeedThreshold");
        this.mDisplacementFromRestThreshold = readableMap.getDouble("restDisplacementThreshold");
        this.mOvershootClampingEnabled = readableMap.getBoolean("overshootClamping");
        boolean z = true;
        if (readableMap.hasKey("iterations")) {
            i = readableMap.getInt("iterations");
        } else {
            i = 1;
        }
        this.mIterations = i;
        if (i != 0) {
            z = false;
        }
        this.mHasFinished = z;
        this.mCurrentLoop = 0;
        this.mTimeAccumulator = 0.0d;
        this.mSpringStarted = false;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long j) {
        long j2 = j / 1000000;
        if (!this.mSpringStarted) {
            if (this.mCurrentLoop == 0) {
                this.mOriginalValue = this.mAnimatedValue.mValue;
                this.mCurrentLoop = 1;
            }
            PhysicsState physicsState = this.mCurrentState;
            double d = this.mAnimatedValue.mValue;
            physicsState.position = d;
            this.mStartValue = d;
            this.mLastTime = j2;
            this.mTimeAccumulator = 0.0d;
            this.mSpringStarted = true;
        }
        advance((j2 - this.mLastTime) / 1000.0d);
        this.mLastTime = j2;
        this.mAnimatedValue.mValue = this.mCurrentState.position;
        if (isAtRest()) {
            int i = this.mIterations;
            if (i != -1 && this.mCurrentLoop >= i) {
                this.mHasFinished = true;
                return;
            }
            this.mSpringStarted = false;
            this.mAnimatedValue.mValue = this.mOriginalValue;
            this.mCurrentLoop++;
        }
    }
}