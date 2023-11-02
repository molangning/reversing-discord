package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1610l implements Parcelable {
    public static final Parcelable.Creator<C1610l> CREATOR = new C1611a();

    /* renamed from: j */
    final String f4249j;

    /* renamed from: k */
    final String f4250k;

    /* renamed from: l */
    final boolean f4251l;

    /* renamed from: m */
    final int f4252m;

    /* renamed from: n */
    final int f4253n;

    /* renamed from: o */
    final String f4254o;

    /* renamed from: p */
    final boolean f4255p;

    /* renamed from: q */
    final boolean f4256q;

    /* renamed from: r */
    final boolean f4257r;

    /* renamed from: s */
    final Bundle f4258s;

    /* renamed from: t */
    final boolean f4259t;

    /* renamed from: u */
    final int f4260u;

    /* renamed from: v */
    Bundle f4261v;

    /* renamed from: androidx.fragment.app.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1611a implements Parcelable.Creator<C1610l> {
        C1611a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1610l createFromParcel(Parcel parcel) {
            return new C1610l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1610l[] newArray(int i) {
            return new C1610l[i];
        }
    }

    public C1610l(Fragment fragment) {
        this.f4249j = fragment.getClass().getName();
        this.f4250k = fragment.mWho;
        this.f4251l = fragment.mFromLayout;
        this.f4252m = fragment.mFragmentId;
        this.f4253n = fragment.mContainerId;
        this.f4254o = fragment.mTag;
        this.f4255p = fragment.mRetainInstance;
        this.f4256q = fragment.mRemoving;
        this.f4257r = fragment.mDetached;
        this.f4258s = fragment.mArguments;
        this.f4259t = fragment.mHidden;
        this.f4260u = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f4249j);
        sb2.append(" (");
        sb2.append(this.f4250k);
        sb2.append(")}:");
        if (this.f4251l) {
            sb2.append(" fromLayout");
        }
        if (this.f4253n != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f4253n));
        }
        String str = this.f4254o;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f4254o);
        }
        if (this.f4255p) {
            sb2.append(" retainInstance");
        }
        if (this.f4256q) {
            sb2.append(" removing");
        }
        if (this.f4257r) {
            sb2.append(" detached");
        }
        if (this.f4259t) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4249j);
        parcel.writeString(this.f4250k);
        parcel.writeInt(this.f4251l ? 1 : 0);
        parcel.writeInt(this.f4252m);
        parcel.writeInt(this.f4253n);
        parcel.writeString(this.f4254o);
        parcel.writeInt(this.f4255p ? 1 : 0);
        parcel.writeInt(this.f4256q ? 1 : 0);
        parcel.writeInt(this.f4257r ? 1 : 0);
        parcel.writeBundle(this.f4258s);
        parcel.writeInt(this.f4259t ? 1 : 0);
        parcel.writeBundle(this.f4261v);
        parcel.writeInt(this.f4260u);
    }

    C1610l(Parcel parcel) {
        this.f4249j = parcel.readString();
        this.f4250k = parcel.readString();
        this.f4251l = parcel.readInt() != 0;
        this.f4252m = parcel.readInt();
        this.f4253n = parcel.readInt();
        this.f4254o = parcel.readString();
        this.f4255p = parcel.readInt() != 0;
        this.f4256q = parcel.readInt() != 0;
        this.f4257r = parcel.readInt() != 0;
        this.f4258s = parcel.readBundle();
        this.f4259t = parcel.readInt() != 0;
        this.f4261v = parcel.readBundle();
        this.f4260u = parcel.readInt();
    }
}