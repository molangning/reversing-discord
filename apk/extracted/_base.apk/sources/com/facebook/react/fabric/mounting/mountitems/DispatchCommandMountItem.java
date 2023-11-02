package com.facebook.react.fabric.mounting.mountitems;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class DispatchCommandMountItem implements MountItem {
    private int mNumRetries = 0;

    public int getRetries() {
        return this.mNumRetries;
    }

    public void incrementRetries() {
        this.mNumRetries++;
    }
}
