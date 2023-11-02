package com.swmansion.reanimated.layoutReanimation;

import java.util.HashMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface NativeMethodsHolder {
    void cancelAnimation(int i);

    void checkDuplicateSharedTag(int i, int i2);

    void clearAnimationConfig(int i);

    int findPrecedingViewTagForTransition(int i);

    boolean hasAnimation(int i, int i2);

    boolean isLayoutAnimationEnabled();

    void startAnimation(int i, int i2, HashMap<String, Object> hashMap);
}
