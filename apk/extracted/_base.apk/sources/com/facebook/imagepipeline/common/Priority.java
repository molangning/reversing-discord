package com.facebook.imagepipeline.common;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum Priority {
    LOW,
    MEDIUM,
    HIGH;

    /* renamed from: a */
    public static Priority m31191a(Priority priority, Priority priority2) {
        return priority.ordinal() > priority2.ordinal() ? priority : priority2;
    }
}
