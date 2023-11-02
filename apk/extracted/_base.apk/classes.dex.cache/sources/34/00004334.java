package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.C2464c;
import p231m9.EnumC10398m;
import p366u9.C12905g;
import p366u9.C12909i;

/* renamed from: m9.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10386h extends AbstractC10388i {
    public static final Parcelable.Creator<C10386h> CREATOR = new C10407p0();

    /* renamed from: j */
    private final EnumC10398m f27139j;

    /* renamed from: k */
    private final String f27140k;

    public C10386h(int i, String str) {
        try {
            this.f27139j = EnumC10398m.m11626b(i);
            this.f27140k = str;
        } catch (EnumC10398m.C10399a e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public String m11637A() {
        return this.f27140k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10386h)) {
            return false;
        }
        C10386h c10386h = (C10386h) obj;
        if (!C2190n.m34004b(this.f27139j, c10386h.f27139j) || !C2190n.m34004b(this.f27140k, c10386h.f27140k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27139j, this.f27140k);
    }

    @Override // p231m9.AbstractC10388i
    /* renamed from: r */
    public byte[] mo11635r() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        C12909i m3685a = C12905g.m3691a(this).m3685a("errorCode", this.f27139j.m11627a());
        String str = this.f27140k;
        if (str != null) {
            m3685a.m3684b("errorMessage", str);
        }
        return m3685a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 2, m11636z());
        C2464c.m33168p(parcel, 3, m11637A(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public int m11636z() {
        return this.f27139j.m11627a();
    }
}