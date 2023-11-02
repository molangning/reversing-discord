package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;

/* renamed from: io.sentry.android.core.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7809t implements InterfaceC8040o0 {

    /* renamed from: a */
    private final String f21359a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C7810a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21360a;

        static {
            int[] iArr = new int[EnumC8021m4.values().length];
            f21360a = iArr;
            try {
                iArr[EnumC8021m4.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21360a[EnumC8021m4.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21360a[EnumC8021m4.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21360a[EnumC8021m4.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21360a[EnumC8021m4.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C7809t() {
        this("Sentry");
    }

    /* renamed from: e */
    private int m19677e(EnumC8021m4 enumC8021m4) {
        int i = C7810a.f21360a[enumC8021m4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 4 ? 3 : 7;
            }
            return 5;
        }
        return 4;
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: a */
    public void mo18137a(EnumC8021m4 enumC8021m4, Throwable th2, String str, Object... objArr) {
        mo18136b(enumC8021m4, String.format(str, objArr), th2);
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: b */
    public void mo18136b(EnumC8021m4 enumC8021m4, String str, Throwable th2) {
        int i = C7810a.f21360a[enumC8021m4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Log.d(this.f21359a, str, th2);
                        return;
                    } else {
                        Log.wtf(this.f21359a, str, th2);
                        return;
                    }
                }
                Log.e(this.f21359a, str, th2);
                return;
            }
            Log.w(this.f21359a, str, th2);
            return;
        }
        Log.i(this.f21359a, str, th2);
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: c */
    public void mo18135c(EnumC8021m4 enumC8021m4, String str, Object... objArr) {
        Log.println(m19677e(enumC8021m4), this.f21359a, String.format(str, objArr));
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: d */
    public boolean mo18134d(EnumC8021m4 enumC8021m4) {
        return true;
    }

    public C7809t(String str) {
        this.f21359a = str;
    }
}
