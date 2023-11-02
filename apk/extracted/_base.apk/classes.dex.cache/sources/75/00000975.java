package p029b9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p029b9.InterfaceC2177j;
import p042c9.AbstractC2461a;
import p441y8.C13932c;
import p441y8.C13935f;

/* renamed from: b9.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2165f extends AbstractC2461a {
    public static final Parcelable.Creator<C2165f> CREATOR = new C2173h1();

    /* renamed from: j */
    final int f6118j;

    /* renamed from: k */
    final int f6119k;

    /* renamed from: l */
    int f6120l;

    /* renamed from: m */
    String f6121m;

    /* renamed from: n */
    IBinder f6122n;

    /* renamed from: o */
    Scope[] f6123o;

    /* renamed from: p */
    Bundle f6124p;

    /* renamed from: q */
    Account f6125q;

    /* renamed from: r */
    C13932c[] f6126r;

    /* renamed from: s */
    C13932c[] f6127s;

    /* renamed from: t */
    boolean f6128t;

    /* renamed from: u */
    int f6129u;

    /* renamed from: v */
    boolean f6130v;

    /* renamed from: w */
    private String f6131w;

    public C2165f(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C13932c[] c13932cArr, C13932c[] c13932cArr2, boolean z, int i4, boolean z2, String str2) {
        this.f6118j = i;
        this.f6119k = i2;
        this.f6120l = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f6121m = "com.google.android.gms";
        } else {
            this.f6121m = str;
        }
        if (i < 2) {
            this.f6125q = iBinder != null ? BinderC2144a.m34124e(InterfaceC2177j.AbstractBinderC2178a.m34026c(iBinder)) : null;
        } else {
            this.f6122n = iBinder;
            this.f6125q = account;
        }
        this.f6123o = scopeArr;
        this.f6124p = bundle;
        this.f6126r = c13932cArr;
        this.f6127s = c13932cArr2;
        this.f6128t = z;
        this.f6129u = i4;
        this.f6130v = z2;
        this.f6131w = str2;
    }

    /* renamed from: r */
    public final String m34048r() {
        return this.f6131w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C2173h1.m34031a(this, parcel, i);
    }

    public C2165f(int i, String str) {
        this.f6118j = 6;
        this.f6120l = C13935f.f35885a;
        this.f6119k = i;
        this.f6128t = true;
        this.f6131w = str;
    }
}