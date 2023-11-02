package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C4616d;
import p029b9.C2198p;

/* renamed from: com.google.android.gms.common.api.internal.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4620e {
    /* renamed from: a */
    public static <L> C4616d<L> m28180a(L l, Looper looper, String str) {
        C2198p.m33984k(l, "Listener must not be null");
        C2198p.m33984k(looper, "Looper must not be null");
        C2198p.m33984k(str, "Listener type must not be null");
        return new C4616d<>(looper, l, str);
    }

    /* renamed from: b */
    public static <L> C4616d.C4617a<L> m28179b(L l, String str) {
        C2198p.m33984k(l, "Listener must not be null");
        C2198p.m33984k(str, "Listener type must not be null");
        C2198p.m33988g(str, "Listener type must not be empty");
        return new C4616d.C4617a<>(l, str);
    }
}
