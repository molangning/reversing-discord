package p441y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: y8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13932c extends AbstractC2461a {
    public static final Parcelable.Creator<C13932c> CREATOR = new C13943n();

    /* renamed from: j */
    private final String f35878j;
    @Deprecated

    /* renamed from: k */
    private final int f35879k;

    /* renamed from: l */
    private final long f35880l;

    public C13932c(String str, int i, long j) {
        this.f35878j = str;
        this.f35879k = i;
        this.f35880l = j;
    }

    public C13932c(String str, long j) {
        this.f35878j = str;
        this.f35880l = j;
        this.f35879k = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13932c) {
            C13932c c13932c = (C13932c) obj;
            if (((m1141r() != null && m1141r().equals(c13932c.m1141r())) || (m1141r() == null && c13932c.m1141r() == null)) && m1140z() == c13932c.m1140z()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(m1141r(), Long.valueOf(m1140z()));
    }

    /* renamed from: r */
    public String m1141r() {
        return this.f35878j;
    }

    public final String toString() {
        C2190n.C2191a m34002d = C2190n.m34002d(this);
        m34002d.m34001a(ZeroconfModule.KEY_SERVICE_NAME, m1141r());
        m34002d.m34001a("version", Long.valueOf(m1140z()));
        return m34002d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 1, m1141r(), false);
        C2464c.m33174j(parcel, 2, this.f35879k);
        C2464c.m33171m(parcel, 3, m1140z());
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public long m1140z() {
        long j = this.f35880l;
        return j == -1 ? this.f35879k : j;
    }
}