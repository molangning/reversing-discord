package p020b0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: b0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1964a implements Parcelable {

    /* renamed from: j */
    private final Parcelable f5410j;

    /* renamed from: k */
    public static final AbstractC1964a f5409k = new C1965a();
    public static final Parcelable.Creator<AbstractC1964a> CREATOR = new C1966b();

    /* renamed from: b0.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1965a extends AbstractC1964a {
        C1965a() {
            super((C1965a) null);
        }
    }

    /* renamed from: b0.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1966b implements Parcelable.ClassLoaderCreator<AbstractC1964a> {
        C1966b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AbstractC1964a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public AbstractC1964a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC1964a.f5409k;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public AbstractC1964a[] newArray(int i) {
            return new AbstractC1964a[i];
        }
    }

    /* synthetic */ AbstractC1964a(C1965a c1965a) {
        this();
    }

    /* renamed from: a */
    public final Parcelable m34884a() {
        return this.f5410j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5410j, i);
    }

    private AbstractC1964a() {
        this.f5410j = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1964a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f5410j = parcelable == f5409k ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1964a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f5410j = readParcelable == null ? f5409k : readParcelable;
    }
}
