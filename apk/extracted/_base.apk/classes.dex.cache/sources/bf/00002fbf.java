package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface ViewHierarchyObserver {
    void onViewCreate(View view, ViewGroup viewGroup, Snapshot snapshot);

    void onViewRemoval(View view, ViewGroup viewGroup, Runnable runnable);

    void onViewUpdate(View view, Snapshot snapshot, Snapshot snapshot2);
}