package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class FrameBasedAnimationDriver extends AnimationDriver {
    private static final double FRAME_TIME_MILLIS = 16.666666666666668d;
    private int mCurrentLoop;
    private double[] mFrames;
    private double mFromValue;
    private int mIterations;
    private long mStartFrameTimeNanos;
    private double mToValue;

    public FrameBasedAnimationDriver(ReadableMap readableMap) {
        resetConfig(readableMap);
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(ReadableMap readableMap) {
        int i;
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.mFrames;
        if (dArr == null || dArr.length != size) {
            this.mFrames = new double[size];
        }
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mFrames[i2] = array.getDouble(i2);
        }
        double d = 0.0d;
        if (readableMap.hasKey("toValue")) {
            if (readableMap.getType("toValue") == ReadableType.Number) {
                d = readableMap.getDouble("toValue");
            }
            this.mToValue = d;
        } else {
            this.mToValue = 0.0d;
        }
        if (readableMap.hasKey("iterations")) {
            if (readableMap.getType("iterations") == ReadableType.Number) {
                i = readableMap.getInt("iterations");
            } else {
                i = 1;
            }
            this.mIterations = i;
        } else {
            this.mIterations = 1;
        }
        this.mCurrentLoop = 1;
        if (this.mIterations == 0) {
            z = true;
        }
        this.mHasFinished = z;
        this.mStartFrameTimeNanos = -1L;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long j) {
        double d;
        if (this.mStartFrameTimeNanos < 0) {
            this.mStartFrameTimeNanos = j;
            if (this.mCurrentLoop == 1) {
                this.mFromValue = this.mAnimatedValue.mValue;
            }
        }
        int round = (int) Math.round(((j - this.mStartFrameTimeNanos) / 1000000) / FRAME_TIME_MILLIS);
        if (round < 0) {
            C13677a.m1870H(ReactConstants.TAG, "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j + " and mStartFrameTimeNanos " + this.mStartFrameTimeNanos);
        } else if (this.mHasFinished) {
        } else {
            double[] dArr = this.mFrames;
            if (round >= dArr.length - 1) {
                d = this.mToValue;
                int i = this.mIterations;
                if (i != -1 && this.mCurrentLoop >= i) {
                    this.mHasFinished = true;
                } else {
                    this.mStartFrameTimeNanos = -1L;
                    this.mCurrentLoop++;
                }
            } else {
                double d2 = this.mFromValue;
                d = d2 + (dArr[round] * (this.mToValue - d2));
            }
            this.mAnimatedValue.mValue = d;
        }
    }
}