package p298q8;

import android.os.Bundle;
import p029b9.C2190n;
import p461z8.C14107a;

/* renamed from: q8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11797c implements C14107a.InterfaceC14111d {

    /* renamed from: k */
    public static final C11797c f30790k = new C11797c(new Bundle(), null);

    /* renamed from: j */
    private final Bundle f30791j;

    /* synthetic */ C11797c(Bundle bundle, C11801g c11801g) {
        this.f30791j = bundle;
    }

    /* renamed from: a */
    public final Bundle m6841a() {
        return new Bundle(this.f30791j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11797c)) {
            return false;
        }
        return C2190n.m34005a(this.f30791j, ((C11797c) obj).f30791j);
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f30791j);
    }
}