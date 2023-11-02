package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p231m9.EnumC10417u;
import p366u9.AbstractC12920n0;
import p366u9.AbstractC12935v;
import p366u9.C12924p0;

/* renamed from: m9.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10408q extends AbstractC2461a {

    /* renamed from: j */
    private final EnumC10417u f27198j;

    /* renamed from: k */
    private final byte[] f27199k;

    /* renamed from: l */
    private final List<Transport> f27200l;

    /* renamed from: m */
    private static AbstractC12935v<AbstractC12920n0> f27197m = AbstractC12935v.m3653p(C12924p0.f33619a, C12924p0.f33620b);
    public static final Parcelable.Creator<C10408q> CREATOR = new C10365a1();

    public C10408q(String str, byte[] bArr, List<Transport> list) {
        C2198p.m33985j(str);
        try {
            this.f27198j = EnumC10417u.m11590a(str);
            this.f27199k = (byte[]) C2198p.m33985j(bArr);
            this.f27200l = list;
        } catch (EnumC10417u.C10418a e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public String m11605A() {
        return this.f27198j.toString();
    }

    public boolean equals(Object obj) {
        List<Transport> list;
        if (!(obj instanceof C10408q)) {
            return false;
        }
        C10408q c10408q = (C10408q) obj;
        if (!this.f27198j.equals(c10408q.f27198j) || !Arrays.equals(this.f27199k, c10408q.f27199k)) {
            return false;
        }
        List<Transport> list2 = this.f27200l;
        if (list2 == null && c10408q.f27200l == null) {
            return true;
        }
        if (list2 == null || (list = c10408q.f27200l) == null || !list2.containsAll(list) || !c10408q.f27200l.containsAll(this.f27200l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27198j, Integer.valueOf(Arrays.hashCode(this.f27199k)), this.f27200l);
    }

    /* renamed from: r */
    public byte[] m11604r() {
        return this.f27199k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 2, m11605A(), false);
        C2464c.m33178f(parcel, 3, m11604r(), false);
        C2464c.m33164t(parcel, 4, m11603z(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public List<Transport> m11603z() {
        return this.f27200l;
    }
}
