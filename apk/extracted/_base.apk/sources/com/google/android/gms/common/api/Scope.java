package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class Scope extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C4606a();

    /* renamed from: j */
    final int f12646j;

    /* renamed from: k */
    private final String f12647k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i, String str) {
        C2198p.m33988g(str, "scopeUri must not be null or empty");
        this.f12646j = i;
        this.f12647k = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f12647k.equals(((Scope) obj).f12647k);
    }

    public int hashCode() {
        return this.f12647k.hashCode();
    }

    /* renamed from: r */
    public String m28243r() {
        return this.f12647k;
    }

    public String toString() {
        return this.f12647k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12646j);
        C2464c.m33168p(parcel, 2, m28243r(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
