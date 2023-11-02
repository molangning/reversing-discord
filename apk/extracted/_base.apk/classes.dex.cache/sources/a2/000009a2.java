package p029b9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: b9.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2210t extends AbstractC2461a {
    public static final Parcelable.Creator<C2210t> CREATOR = new C2219x();

    /* renamed from: j */
    private final int f6212j;

    /* renamed from: k */
    private List<C2187m> f6213k;

    public C2210t(int i, List<C2187m> list) {
        this.f6212j = i;
        this.f6213k = list;
    }

    /* renamed from: A */
    public final void m33963A(C2187m c2187m) {
        if (this.f6213k == null) {
            this.f6213k = new ArrayList();
        }
        this.f6213k.add(c2187m);
    }

    /* renamed from: r */
    public final int m33962r() {
        return this.f6212j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f6212j);
        C2464c.m33164t(parcel, 2, this.f6213k, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public final List<C2187m> m33961z() {
        return this.f6213k;
    }
}