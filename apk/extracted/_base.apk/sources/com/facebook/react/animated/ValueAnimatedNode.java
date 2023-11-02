package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class ValueAnimatedNode extends AnimatedNode {
    double mOffset;
    double mValue;
    private AnimatedNodeValueListener mValueListener;

    public ValueAnimatedNode() {
        this.mValue = Double.NaN;
        this.mOffset = 0.0d;
    }

    public void extractOffset() {
        this.mOffset += this.mValue;
        this.mValue = 0.0d;
    }

    public void flattenOffset() {
        this.mValue += this.mOffset;
        this.mOffset = 0.0d;
    }

    public Object getAnimatedObject() {
        return null;
    }

    public double getValue() {
        if (Double.isNaN(this.mOffset + this.mValue)) {
            update();
        }
        return this.mOffset + this.mValue;
    }

    public void onValueUpdate() {
        AnimatedNodeValueListener animatedNodeValueListener = this.mValueListener;
        if (animatedNodeValueListener == null) {
            return;
        }
        animatedNodeValueListener.onValueUpdate(getValue());
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "ValueAnimatedNode[" + this.mTag + "]: value: " + this.mValue + " offset: " + this.mOffset;
    }

    public void setValueListener(AnimatedNodeValueListener animatedNodeValueListener) {
        this.mValueListener = animatedNodeValueListener;
    }

    public ValueAnimatedNode(ReadableMap readableMap) {
        this.mValue = Double.NaN;
        this.mOffset = 0.0d;
        this.mValue = readableMap.getDouble("value");
        this.mOffset = readableMap.getDouble("offset");
    }
}
