package com.facebook.react.bridge;

import android.content.Context;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class ContextBaseJavaModule extends BaseJavaModule {
    private final Context mContext;

    public ContextBaseJavaModule(Context context) {
        this.mContext = context;
    }

    public final Context getContext() {
        return this.mContext;
    }
}