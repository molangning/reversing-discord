package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TrackingAnimatedNode extends AnimatedNode {
    private final JavaOnlyMap mAnimationConfig;
    private final int mAnimationId;
    private final NativeAnimatedNodesManager mNativeAnimatedNodesManager;
    private final int mToValueNode;
    private final int mValueNode;

    public TrackingAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.mAnimationId = readableMap.getInt("animationId");
        this.mToValueNode = readableMap.getInt("toValue");
        this.mValueNode = readableMap.getInt("value");
        this.mAnimationConfig = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "TrackingAnimatedNode[" + this.mTag + "]: animationID: " + this.mAnimationId + " toValueNode: " + this.mToValueNode + " valueNode: " + this.mValueNode + " animationConfig: " + this.mAnimationConfig;
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        this.mAnimationConfig.putDouble("toValue", ((ValueAnimatedNode) this.mNativeAnimatedNodesManager.getNodeById(this.mToValueNode)).getValue());
        this.mNativeAnimatedNodesManager.startAnimatingNode(this.mAnimationId, this.mValueNode, this.mAnimationConfig, null);
    }
}