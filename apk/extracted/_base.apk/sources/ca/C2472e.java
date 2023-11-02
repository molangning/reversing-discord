package ca;

import p029b9.C2190n;
import p461z8.C14107a;

/* renamed from: ca.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2472e implements C14107a.InterfaceC14111d {

    /* renamed from: j */
    public final String f6820j;

    /* renamed from: k */
    public final int f6821k;

    /* renamed from: l */
    public final String f6822l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2472e)) {
            return false;
        }
        C2472e c2472e = (C2472e) obj;
        String str = c2472e.f6820j;
        if (C2190n.m34004b(null, null) && C2190n.m34004b(null, null) && C2190n.m34004b(null, null) && this.f6821k == c2472e.f6821k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(null, Boolean.FALSE, null, null, Integer.valueOf(this.f6821k));
    }
}
