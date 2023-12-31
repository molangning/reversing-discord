package com.facebook.react.module.model;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactModuleInfo {
    private final boolean mCanOverrideExistingModule;
    private String mClassName;
    private final boolean mHasConstants;
    private final boolean mIsCxxModule;
    private final boolean mIsTurboModule;
    private final String mName;
    private final boolean mNeedsEagerInit;

    public ReactModuleInfo(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.mName = str;
        this.mClassName = str2;
        this.mCanOverrideExistingModule = z;
        this.mNeedsEagerInit = z2;
        this.mHasConstants = z3;
        this.mIsCxxModule = z4;
        this.mIsTurboModule = z5;
    }

    public boolean canOverrideExistingModule() {
        return this.mCanOverrideExistingModule;
    }

    public String className() {
        return this.mClassName;
    }

    public boolean hasConstants() {
        return this.mHasConstants;
    }

    public boolean isCxxModule() {
        return this.mIsCxxModule;
    }

    public boolean isTurboModule() {
        return this.mIsTurboModule;
    }

    public String name() {
        return this.mName;
    }

    public boolean needsEagerInit() {
        return this.mNeedsEagerInit;
    }
}
