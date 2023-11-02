package p119g9;

import android.os.SystemClock;

/* renamed from: g9.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6582e implements InterfaceC6581d {

    /* renamed from: a */
    private static final C6582e f18718a = new C6582e();

    private C6582e() {
    }

    /* renamed from: c */
    public static InterfaceC6581d m22380c() {
        return f18718a;
    }

    @Override // p119g9.InterfaceC6581d
    /* renamed from: a */
    public final long mo22382a() {
        return System.currentTimeMillis();
    }

    @Override // p119g9.InterfaceC6581d
    /* renamed from: b */
    public final long mo22381b() {
        return SystemClock.elapsedRealtime();
    }
}