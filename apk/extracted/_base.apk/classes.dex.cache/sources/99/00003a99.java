package p164j$.time.chrono;

import p164j$.time.temporal.EnumC8333a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract /* synthetic */ class AbstractC8291e {

    /* renamed from: a */
    static final /* synthetic */ int[] f22291a;

    static {
        int[] iArr = new int[EnumC8333a.values().length];
        f22291a = iArr;
        try {
            iArr[EnumC8333a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22291a[EnumC8333a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}