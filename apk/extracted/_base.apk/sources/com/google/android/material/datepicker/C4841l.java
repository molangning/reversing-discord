package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4841l implements Comparable<C4841l>, Parcelable {
    public static final Parcelable.Creator<C4841l> CREATOR = new C4842a();

    /* renamed from: j */
    private final Calendar f13503j;

    /* renamed from: k */
    final int f13504k;

    /* renamed from: l */
    final int f13505l;

    /* renamed from: m */
    final int f13506m;

    /* renamed from: n */
    final int f13507n;

    /* renamed from: o */
    final long f13508o;

    /* renamed from: p */
    private String f13509p;

    /* renamed from: com.google.android.material.datepicker.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4842a implements Parcelable.Creator<C4841l> {
        C4842a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4841l createFromParcel(Parcel parcel) {
            return C4841l.m27264b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4841l[] newArray(int i) {
            return new C4841l[i];
        }
    }

    private C4841l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m27224d = C4853t.m27224d(calendar);
        this.f13503j = m27224d;
        this.f13504k = m27224d.get(2);
        this.f13505l = m27224d.get(1);
        this.f13506m = m27224d.getMaximum(7);
        this.f13507n = m27224d.getActualMaximum(5);
        this.f13508o = m27224d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4841l m27264b(int i, int i2) {
        Calendar m27217k = C4853t.m27217k();
        m27217k.set(1, i);
        m27217k.set(2, i2);
        return new C4841l(m27217k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C4841l m27263d(long j) {
        Calendar m27217k = C4853t.m27217k();
        m27217k.setTimeInMillis(j);
        return new C4841l(m27217k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C4841l m27262e() {
        return new C4841l(C4853t.m27219i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public long m27268A() {
        return this.f13503j.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public C4841l m27267G(int i) {
        Calendar m27224d = C4853t.m27224d(this.f13503j);
        m27224d.add(2, i);
        return new C4841l(m27224d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public int m27266H(C4841l c4841l) {
        if (this.f13503j instanceof GregorianCalendar) {
            return ((c4841l.f13505l - this.f13505l) * 12) + (c4841l.f13504k - this.f13504k);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C4841l c4841l) {
        return this.f13503j.compareTo(c4841l.f13503j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4841l)) {
            return false;
        }
        C4841l c4841l = (C4841l) obj;
        if (this.f13504k == c4841l.f13504k && this.f13505l == c4841l.f13505l) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m27261h() {
        int firstDayOfWeek = this.f13503j.get(7) - this.f13503j.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f13506m;
        }
        return firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13504k), Integer.valueOf(this.f13505l)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public long m27260k(int i) {
        Calendar m27224d = C4853t.m27224d(this.f13503j);
        m27224d.set(5, i);
        return m27224d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m27259r(long j) {
        Calendar m27224d = C4853t.m27224d(this.f13503j);
        m27224d.setTimeInMillis(j);
        return m27224d.get(5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13505l);
        parcel.writeInt(this.f13504k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public String m27258z() {
        if (this.f13509p == null) {
            this.f13509p = C4815e.m27324c(this.f13503j.getTimeInMillis());
        }
        return this.f13509p;
    }
}
