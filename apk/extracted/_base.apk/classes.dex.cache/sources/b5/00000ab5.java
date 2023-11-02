package p043cb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.SimpleArrayMap;
import p020b0.AbstractC1964a;

/* renamed from: cb.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2485a extends AbstractC1964a {
    public static final Parcelable.Creator<C2485a> CREATOR = new C2486a();

    /* renamed from: l */
    public final SimpleArrayMap<String, Bundle> f6843l;

    /* renamed from: cb.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C2486a implements Parcelable.ClassLoaderCreator<C2485a> {
        C2486a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C2485a createFromParcel(Parcel parcel) {
            return new C2485a(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public C2485a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C2485a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public C2485a[] newArray(int i) {
            return new C2485a[i];
        }
    }

    /* synthetic */ C2485a(Parcel parcel, ClassLoader classLoader, C2486a c2486a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f6843l + "}";
    }

    @Override // p020b0.AbstractC1964a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f6843l.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f6843l.m39525j(i2);
            bundleArr[i2] = this.f6843l.m39521n(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C2485a(Parcelable parcelable) {
        super(parcelable);
        this.f6843l = new SimpleArrayMap<>();
    }

    private C2485a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f6843l = new SimpleArrayMap<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f6843l.put(strArr[i], bundleArr[i]);
        }
    }
}