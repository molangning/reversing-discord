package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.internal.util.C7761d;
import io.sentry.transport.InterfaceC8191q;

/* renamed from: io.sentry.android.core.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7713c0 implements InterfaceC8191q {

    /* renamed from: a */
    private final Context f21166a;

    /* renamed from: b */
    private final InterfaceC8040o0 f21167b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C7714a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21168a;

        static {
            int[] iArr = new int[C7761d.EnumC7762a.values().length];
            f21168a = iArr;
            try {
                iArr[C7761d.EnumC7762a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21168a[C7761d.EnumC7762a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21168a[C7761d.EnumC7762a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7713c0(Context context, InterfaceC8040o0 interfaceC8040o0) {
        this.f21166a = context;
        this.f21167b = interfaceC8040o0;
    }

    @Override // io.sentry.transport.InterfaceC8191q
    /* renamed from: a */
    public boolean mo18296a() {
        return m19914b(C7761d.m19774b(this.f21166a, this.f21167b));
    }

    /* renamed from: b */
    boolean m19914b(C7761d.EnumC7762a enumC7762a) {
        int i = C7714a.f21168a[enumC7762a.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
