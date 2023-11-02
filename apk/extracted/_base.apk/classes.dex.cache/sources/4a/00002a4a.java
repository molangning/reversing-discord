package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import p010a9.C0091a;
import p029b9.C2194o;
import p298q8.C11793a;
import p384v8.C13156o;
import p441y8.C13934e;
import p441y8.C13937h;
import p461z8.AbstractC14121e;
import p461z8.AbstractC14124f;

/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4599b extends AbstractC14121e<GoogleSignInOptions> {

    /* renamed from: k */
    private static final C4603f f12633k = new C4603f(null);

    /* renamed from: l */
    static int f12634l = 1;

    public C4599b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C11793a.f30772c, googleSignInOptions, new C0091a());
    }

    /* renamed from: E */
    private final synchronized int m28257E() {
        int i;
        i = f12634l;
        if (i == 1) {
            Context m617t = m617t();
            C13934e m1136k = C13934e.m1136k();
            int mo1120f = m1136k.mo1120f(m617t, C13937h.f35888a);
            if (mo1120f == 0) {
                i = 4;
                f12634l = 4;
            } else if (m1136k.mo1125a(m617t, mo1120f, null) == null && DynamiteModule.m28058a(m617t, "com.google.android.gms.auth.api.fallback") != 0) {
                i = 3;
                f12634l = 3;
            } else {
                i = 2;
                f12634l = 2;
            }
        }
        return i;
    }

    /* renamed from: C */
    public Task<Void> m28259C() {
        boolean z;
        AbstractC14124f m629h = m629h();
        Context m617t = m617t();
        if (m28257E() == 3) {
            z = true;
        } else {
            z = false;
        }
        return C2194o.m33998c(C13156o.m3087a(m629h, m617t, z));
    }

    /* renamed from: D */
    public Task<Void> m28258D() {
        boolean z;
        AbstractC14124f m629h = m629h();
        Context m617t = m617t();
        if (m28257E() == 3) {
            z = true;
        } else {
            z = false;
        }
        return C2194o.m33998c(C13156o.m3086b(m629h, m617t, z));
    }
}