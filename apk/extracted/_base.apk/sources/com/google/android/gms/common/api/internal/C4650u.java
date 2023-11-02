package com.google.android.gms.common.api.internal;

import p010a9.C0093b;
import p010a9.C0118p;
import p029b9.C2190n;
import p441y8.C13932c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4650u {

    /* renamed from: a */
    private final C0093b<?> f12767a;

    /* renamed from: b */
    private final C13932c f12768b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4650u(C0093b c0093b, C13932c c13932c, C0118p c0118p) {
        this.f12767a = c0093b;
        this.f12768b = c13932c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4650u)) {
            C4650u c4650u = (C4650u) obj;
            if (C2190n.m34004b(this.f12767a, c4650u.f12767a) && C2190n.m34004b(this.f12768b, c4650u.f12768b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f12767a, this.f12768b);
    }

    public final String toString() {
        return C2190n.m34002d(this).m34001a("key", this.f12767a).m34001a("feature", this.f12768b).toString();
    }
}
