package p397w5;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: w5.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13398g {

    /* renamed from: w5.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC13399a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC13398g m2651a() {
        return new C13392b(EnumC13399a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC13398g m2648d() {
        return new C13392b(EnumC13399a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC13398g m2647e(long j) {
        return new C13392b(EnumC13399a.OK, j);
    }

    /* renamed from: f */
    public static AbstractC13398g m2646f() {
        return new C13392b(EnumC13399a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo2650b();

    /* renamed from: c */
    public abstract EnumC13399a mo2649c();
}