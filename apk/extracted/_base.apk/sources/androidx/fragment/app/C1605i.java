package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1605i implements Parcelable {
    public static final Parcelable.Creator<C1605i> CREATOR = new C1606a();

    /* renamed from: j */
    ArrayList<C1610l> f4233j;

    /* renamed from: k */
    ArrayList<String> f4234k;

    /* renamed from: l */
    C1575b[] f4235l;

    /* renamed from: m */
    int f4236m;

    /* renamed from: n */
    String f4237n;

    /* renamed from: o */
    ArrayList<String> f4238o;

    /* renamed from: p */
    ArrayList<Bundle> f4239p;

    /* renamed from: q */
    ArrayList<FragmentManager.C1567l> f4240q;

    /* renamed from: androidx.fragment.app.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1606a implements Parcelable.Creator<C1605i> {
        C1606a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1605i createFromParcel(Parcel parcel) {
            return new C1605i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1605i[] newArray(int i) {
            return new C1605i[i];
        }
    }

    public C1605i() {
        this.f4237n = null;
        this.f4238o = new ArrayList<>();
        this.f4239p = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f4233j);
        parcel.writeStringList(this.f4234k);
        parcel.writeTypedArray(this.f4235l, i);
        parcel.writeInt(this.f4236m);
        parcel.writeString(this.f4237n);
        parcel.writeStringList(this.f4238o);
        parcel.writeTypedList(this.f4239p);
        parcel.writeTypedList(this.f4240q);
    }

    public C1605i(Parcel parcel) {
        this.f4237n = null;
        this.f4238o = new ArrayList<>();
        this.f4239p = new ArrayList<>();
        this.f4233j = parcel.createTypedArrayList(C1610l.CREATOR);
        this.f4234k = parcel.createStringArrayList();
        this.f4235l = (C1575b[]) parcel.createTypedArray(C1575b.CREATOR);
        this.f4236m = parcel.readInt();
        this.f4237n = parcel.readString();
        this.f4238o = parcel.createStringArrayList();
        this.f4239p = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f4240q = parcel.createTypedArrayList(FragmentManager.C1567l.CREATOR);
    }
}
