package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C0626b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p063da.C5788a;
import p063da.C5800m;
import p385v9.C13216u0;
import p385v9.C13218v0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Update extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<Update> CREATOR = new C4681e0();

    /* renamed from: j */
    final int f12846j;

    /* renamed from: k */
    final int f12847k;

    /* renamed from: l */
    public final Message f12848l;

    /* renamed from: m */
    public final C5800m f12849m;

    /* renamed from: n */
    public final C5788a f12850n;

    /* renamed from: o */
    public final C13218v0 f12851o;

    /* renamed from: p */
    public final byte[] f12852p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Update(int i, int i2, Message message, C5800m c5800m, C5788a c5788a, C13218v0 c13218v0, byte[] bArr) {
        this.f12846j = i;
        boolean m28044z = m28044z(i2, 2);
        bArr = true == m28044z ? null : bArr;
        c13218v0 = true == m28044z ? null : c13218v0;
        c5788a = true == m28044z ? null : c5788a;
        c5800m = true == m28044z ? null : c5800m;
        this.f12847k = true == m28044z ? 2 : i2;
        this.f12848l = message;
        this.f12849m = c5800m;
        this.f12850n = c5788a;
        this.f12851o = c13218v0;
        this.f12852p = bArr;
    }

    /* renamed from: z */
    public static boolean m28044z(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        if (this.f12847k == update.f12847k && C2190n.m34004b(this.f12848l, update.f12848l) && C2190n.m34004b(this.f12849m, update.f12849m) && C2190n.m34004b(this.f12850n, update.f12850n) && C2190n.m34004b(this.f12851o, update.f12851o) && Arrays.equals(this.f12852p, update.f12852p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(Integer.valueOf(this.f12847k), this.f12848l, this.f12849m, this.f12850n, this.f12851o, this.f12852p);
    }

    /* renamed from: r */
    public final boolean m28045r(int i) {
        return m28044z(this.f12847k, i);
    }

    public final String toString() {
        C0626b c0626b = new C0626b();
        if (m28044z(this.f12847k, 1)) {
            c0626b.add("FOUND");
        }
        if (m28044z(this.f12847k, 2)) {
            c0626b.add("LOST");
        }
        if (m28044z(this.f12847k, 4)) {
            c0626b.add("DISTANCE");
        }
        if (m28044z(this.f12847k, 8)) {
            c0626b.add("BLE_SIGNAL");
        }
        if (m28044z(this.f12847k, 16)) {
            c0626b.add("DEVICE");
        }
        if (m28044z(this.f12847k, 32)) {
            c0626b.add("BLE_RECORD");
        }
        String obj = c0626b.toString();
        String valueOf = String.valueOf(this.f12848l);
        String valueOf2 = String.valueOf(this.f12849m);
        String valueOf3 = String.valueOf(this.f12850n);
        String valueOf4 = String.valueOf(this.f12851o);
        String valueOf5 = String.valueOf(C13216u0.m3020a(this.f12852p));
        return "Update{types=" + obj + ", message=" + valueOf + ", distance=" + valueOf2 + ", bleSignal=" + valueOf3 + ", device=" + valueOf4 + ", bleRecord=" + valueOf5 + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12846j);
        C2464c.m33174j(parcel, 2, this.f12847k);
        C2464c.m33170n(parcel, 3, this.f12848l, i, false);
        C2464c.m33170n(parcel, 4, this.f12849m, i, false);
        C2464c.m33170n(parcel, 5, this.f12850n, i, false);
        C2464c.m33170n(parcel, 6, this.f12851o, i, false);
        C2464c.m33178f(parcel, 7, this.f12852p, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
