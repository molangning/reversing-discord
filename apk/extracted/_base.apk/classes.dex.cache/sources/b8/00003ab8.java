package p164j$.time;

import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.EnumC8334b;

/* renamed from: j$.time.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract /* synthetic */ class AbstractC8321g {

    /* renamed from: a */
    static final /* synthetic */ int[] f22351a;

    /* renamed from: b */
    static final /* synthetic */ int[] f22352b;

    static {
        int[] iArr = new int[EnumC8334b.values().length];
        f22352b = iArr;
        try {
            iArr[EnumC8334b.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22352b[EnumC8334b.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22352b[EnumC8334b.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22352b[EnumC8334b.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f22352b[EnumC8334b.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f22352b[EnumC8334b.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f22352b[EnumC8334b.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f22352b[EnumC8334b.DAYS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[EnumC8333a.values().length];
        f22351a = iArr2;
        try {
            iArr2[EnumC8333a.NANO_OF_SECOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f22351a[EnumC8333a.MICRO_OF_SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f22351a[EnumC8333a.MILLI_OF_SECOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f22351a[EnumC8333a.INSTANT_SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
    }
}