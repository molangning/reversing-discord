package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1575b implements Parcelable {
    public static final Parcelable.Creator<C1575b> CREATOR = new C1576a();

    /* renamed from: j */
    final int[] f4152j;

    /* renamed from: k */
    final ArrayList<String> f4153k;

    /* renamed from: l */
    final int[] f4154l;

    /* renamed from: m */
    final int[] f4155m;

    /* renamed from: n */
    final int f4156n;

    /* renamed from: o */
    final String f4157o;

    /* renamed from: p */
    final int f4158p;

    /* renamed from: q */
    final int f4159q;

    /* renamed from: r */
    final CharSequence f4160r;

    /* renamed from: s */
    final int f4161s;

    /* renamed from: t */
    final CharSequence f4162t;

    /* renamed from: u */
    final ArrayList<String> f4163u;

    /* renamed from: v */
    final ArrayList<String> f4164v;

    /* renamed from: w */
    final boolean f4165w;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1576a implements Parcelable.Creator<C1575b> {
        C1576a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1575b createFromParcel(Parcel parcel) {
            return new C1575b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1575b[] newArray(int i) {
            return new C1575b[i];
        }
    }

    public C1575b(C1574a c1574a) {
        int size = c1574a.f4120c.size();
        this.f4152j = new int[size * 5];
        if (c1574a.f4126i) {
            this.f4153k = new ArrayList<>(size);
            this.f4154l = new int[size];
            this.f4155m = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                FragmentTransaction.C1573a c1573a = c1574a.f4120c.get(i);
                int i3 = i2 + 1;
                this.f4152j[i2] = c1573a.f4137a;
                ArrayList<String> arrayList = this.f4153k;
                Fragment fragment = c1573a.f4138b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f4152j;
                int i4 = i3 + 1;
                iArr[i3] = c1573a.f4139c;
                int i5 = i4 + 1;
                iArr[i4] = c1573a.f4140d;
                int i6 = i5 + 1;
                iArr[i5] = c1573a.f4141e;
                iArr[i6] = c1573a.f4142f;
                this.f4154l[i] = c1573a.f4143g.ordinal();
                this.f4155m[i] = c1573a.f4144h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f4156n = c1574a.f4125h;
            this.f4157o = c1574a.f4128k;
            this.f4158p = c1574a.f4151v;
            this.f4159q = c1574a.f4129l;
            this.f4160r = c1574a.f4130m;
            this.f4161s = c1574a.f4131n;
            this.f4162t = c1574a.f4132o;
            this.f4163u = c1574a.f4133p;
            this.f4164v = c1574a.f4134q;
            this.f4165w = c1574a.f4135r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C1574a m36318a(FragmentManager fragmentManager) {
        C1574a c1574a = new C1574a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.f4152j.length) {
            FragmentTransaction.C1573a c1573a = new FragmentTransaction.C1573a();
            int i3 = i + 1;
            c1573a.f4137a = this.f4152j[i];
            if (FragmentManager.m36479H0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1574a + " op #" + i2 + " base fragment #" + this.f4152j[i3]);
            }
            String str = this.f4153k.get(i2);
            if (str != null) {
                c1573a.f4138b = fragmentManager.m36423g0(str);
            } else {
                c1573a.f4138b = null;
            }
            c1573a.f4143g = Lifecycle.State.values()[this.f4154l[i2]];
            c1573a.f4144h = Lifecycle.State.values()[this.f4155m[i2]];
            int[] iArr = this.f4152j;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            c1573a.f4139c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            c1573a.f4140d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            c1573a.f4141e = i9;
            int i10 = iArr[i8];
            c1573a.f4142f = i10;
            c1574a.f4121d = i5;
            c1574a.f4122e = i7;
            c1574a.f4123f = i9;
            c1574a.f4124g = i10;
            c1574a.m36354f(c1573a);
            i2++;
            i = i8 + 1;
        }
        c1574a.f4125h = this.f4156n;
        c1574a.f4128k = this.f4157o;
        c1574a.f4151v = this.f4158p;
        c1574a.f4126i = true;
        c1574a.f4129l = this.f4159q;
        c1574a.f4130m = this.f4160r;
        c1574a.f4131n = this.f4161s;
        c1574a.f4132o = this.f4162t;
        c1574a.f4133p = this.f4163u;
        c1574a.f4134q = this.f4164v;
        c1574a.f4135r = this.f4165w;
        c1574a.m36325t(1);
        return c1574a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f4152j);
        parcel.writeStringList(this.f4153k);
        parcel.writeIntArray(this.f4154l);
        parcel.writeIntArray(this.f4155m);
        parcel.writeInt(this.f4156n);
        parcel.writeString(this.f4157o);
        parcel.writeInt(this.f4158p);
        parcel.writeInt(this.f4159q);
        TextUtils.writeToParcel(this.f4160r, parcel, 0);
        parcel.writeInt(this.f4161s);
        TextUtils.writeToParcel(this.f4162t, parcel, 0);
        parcel.writeStringList(this.f4163u);
        parcel.writeStringList(this.f4164v);
        parcel.writeInt(this.f4165w ? 1 : 0);
    }

    public C1575b(Parcel parcel) {
        this.f4152j = parcel.createIntArray();
        this.f4153k = parcel.createStringArrayList();
        this.f4154l = parcel.createIntArray();
        this.f4155m = parcel.createIntArray();
        this.f4156n = parcel.readInt();
        this.f4157o = parcel.readString();
        this.f4158p = parcel.readInt();
        this.f4159q = parcel.readInt();
        this.f4160r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4161s = parcel.readInt();
        this.f4162t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4163u = parcel.createStringArrayList();
        this.f4164v = parcel.createStringArrayList();
        this.f4165w = parcel.readInt() != 0;
    }
}