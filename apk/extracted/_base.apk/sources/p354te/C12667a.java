package p354te;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: te.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12667a implements Parcelable {
    public static final Parcelable.Creator<C12667a> CREATOR = new C12668a();

    /* renamed from: j */
    private final String f32836j;

    /* renamed from: k */
    private final float f32837k;

    /* renamed from: l */
    private final float f32838l;

    /* renamed from: te.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C12668a implements Parcelable.Creator<C12667a> {
        C12668a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C12667a createFromParcel(Parcel parcel) {
            return new C12667a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C12667a[] newArray(int i) {
            return new C12667a[i];
        }
    }

    public C12667a(String str, float f, float f2) {
        this.f32836j = str;
        this.f32837k = f;
        this.f32838l = f2;
    }

    /* renamed from: a */
    public String m4570a() {
        return this.f32836j;
    }

    /* renamed from: b */
    public float m4569b() {
        return this.f32837k;
    }

    /* renamed from: d */
    public float m4568d() {
        return this.f32838l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32836j);
        parcel.writeFloat(this.f32837k);
        parcel.writeFloat(this.f32838l);
    }

    protected C12667a(Parcel parcel) {
        this.f32836j = parcel.readString();
        this.f32837k = parcel.readFloat();
        this.f32838l = parcel.readFloat();
    }
}
