package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.C1134c;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4808a implements Parcelable {
    public static final Parcelable.Creator<C4808a> CREATOR = new C4809a();

    /* renamed from: j */
    private final C4841l f13400j;

    /* renamed from: k */
    private final C4841l f13401k;

    /* renamed from: l */
    private final InterfaceC4811c f13402l;

    /* renamed from: m */
    private C4841l f13403m;

    /* renamed from: n */
    private final int f13404n;

    /* renamed from: o */
    private final int f13405o;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4809a implements Parcelable.Creator<C4808a> {
        C4809a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4808a createFromParcel(Parcel parcel) {
            return new C4808a((C4841l) parcel.readParcelable(C4841l.class.getClassLoader()), (C4841l) parcel.readParcelable(C4841l.class.getClassLoader()), (InterfaceC4811c) parcel.readParcelable(InterfaceC4811c.class.getClassLoader()), (C4841l) parcel.readParcelable(C4841l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4808a[] newArray(int i) {
            return new C4808a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4810b {

        /* renamed from: e */
        static final long f13406e = C4853t.m27227a(C4841l.m27264b(1900, 0).f13508o);

        /* renamed from: f */
        static final long f13407f = C4853t.m27227a(C4841l.m27264b(2100, 11).f13508o);

        /* renamed from: a */
        private long f13408a;

        /* renamed from: b */
        private long f13409b;

        /* renamed from: c */
        private Long f13410c;

        /* renamed from: d */
        private InterfaceC4811c f13411d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C4810b(C4808a c4808a) {
            this.f13408a = f13406e;
            this.f13409b = f13407f;
            this.f13411d = C4816f.m27321a(Long.MIN_VALUE);
            this.f13408a = c4808a.f13400j.f13508o;
            this.f13409b = c4808a.f13401k.f13508o;
            this.f13410c = Long.valueOf(c4808a.f13403m.f13508o);
            this.f13411d = c4808a.f13402l;
        }

        /* renamed from: a */
        public C4808a m27339a() {
            C4841l m27263d;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f13411d);
            C4841l m27263d2 = C4841l.m27263d(this.f13408a);
            C4841l m27263d3 = C4841l.m27263d(this.f13409b);
            InterfaceC4811c interfaceC4811c = (InterfaceC4811c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f13410c;
            if (l == null) {
                m27263d = null;
            } else {
                m27263d = C4841l.m27263d(l.longValue());
            }
            return new C4808a(m27263d2, m27263d3, interfaceC4811c, m27263d, null);
        }

        /* renamed from: b */
        public C4810b m27338b(long j) {
            this.f13410c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4811c extends Parcelable {
        /* renamed from: p */
        boolean mo27320p(long j);
    }

    /* synthetic */ C4808a(C4841l c4841l, C4841l c4841l2, InterfaceC4811c interfaceC4811c, C4841l c4841l3, C4809a c4809a) {
        this(c4841l, c4841l2, interfaceC4811c, c4841l3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4808a)) {
            return false;
        }
        C4808a c4808a = (C4808a) obj;
        if (this.f13400j.equals(c4808a.f13400j) && this.f13401k.equals(c4808a.f13401k) && C1134c.m37835a(this.f13403m, c4808a.f13403m) && this.f13402l.equals(c4808a.f13402l)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C4841l m27348h(C4841l c4841l) {
        if (c4841l.compareTo(this.f13400j) < 0) {
            return this.f13400j;
        }
        if (c4841l.compareTo(this.f13401k) > 0) {
            return this.f13401k;
        }
        return c4841l;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13400j, this.f13401k, this.f13403m, this.f13402l});
    }

    /* renamed from: j */
    public InterfaceC4811c m27347j() {
        return this.f13402l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C4841l m27346k() {
        return this.f13401k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m27345r() {
        return this.f13405o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C4841l m27344u() {
        return this.f13403m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13400j, 0);
        parcel.writeParcelable(this.f13401k, 0);
        parcel.writeParcelable(this.f13403m, 0);
        parcel.writeParcelable(this.f13402l, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public C4841l m27343x() {
        return this.f13400j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public int m27342y() {
        return this.f13404n;
    }

    private C4808a(C4841l c4841l, C4841l c4841l2, InterfaceC4811c interfaceC4811c, C4841l c4841l3) {
        this.f13400j = c4841l;
        this.f13401k = c4841l2;
        this.f13403m = c4841l3;
        this.f13402l = interfaceC4811c;
        if (c4841l3 != null && c4841l.compareTo(c4841l3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c4841l3 != null && c4841l3.compareTo(c4841l2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f13405o = c4841l.m27266H(c4841l2) + 1;
        this.f13404n = (c4841l2.f13505l - c4841l.f13505l) + 1;
    }
}
