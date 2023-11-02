package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C0624a;
import java.lang.reflect.Method;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1927b extends AbstractC1926a {

    /* renamed from: d */
    private final SparseIntArray f5323d;

    /* renamed from: e */
    private final Parcel f5324e;

    /* renamed from: f */
    private final int f5325f;

    /* renamed from: g */
    private final int f5326g;

    /* renamed from: h */
    private final String f5327h;

    /* renamed from: i */
    private int f5328i;

    /* renamed from: j */
    private int f5329j;

    /* renamed from: k */
    private int f5330k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1927b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0624a(), new C0624a(), new C0624a());
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: A */
    public void mo34986A(byte[] bArr) {
        if (bArr != null) {
            this.f5324e.writeInt(bArr.length);
            this.f5324e.writeByteArray(bArr);
            return;
        }
        this.f5324e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: C */
    protected void mo34985C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5324e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: E */
    public void mo34984E(int i) {
        this.f5324e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: G */
    public void mo34983G(Parcelable parcelable) {
        this.f5324e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: I */
    public void mo34982I(String str) {
        this.f5324e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: a */
    public void mo34981a() {
        int i = this.f5328i;
        if (i >= 0) {
            int i2 = this.f5323d.get(i);
            int dataPosition = this.f5324e.dataPosition();
            this.f5324e.setDataPosition(i2);
            this.f5324e.writeInt(dataPosition - i2);
            this.f5324e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: b */
    protected AbstractC1926a mo34980b() {
        Parcel parcel = this.f5324e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5329j;
        if (i == this.f5325f) {
            i = this.f5326g;
        }
        int i2 = i;
        return new C1927b(parcel, dataPosition, i2, this.f5327h + "  ", this.f5320a, this.f5321b, this.f5322c);
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: g */
    public boolean mo34979g() {
        return this.f5324e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: i */
    public byte[] mo34978i() {
        int readInt = this.f5324e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5324e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: k */
    protected CharSequence mo34977k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5324e);
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: m */
    public boolean mo34976m(int i) {
        while (this.f5329j < this.f5326g) {
            int i2 = this.f5330k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f5324e.setDataPosition(this.f5329j);
            int readInt = this.f5324e.readInt();
            this.f5330k = this.f5324e.readInt();
            this.f5329j += readInt;
        }
        if (this.f5330k == i) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: o */
    public int mo34975o() {
        return this.f5324e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: q */
    public <T extends Parcelable> T mo34974q() {
        return (T) this.f5324e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: s */
    public String mo34973s() {
        return this.f5324e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: w */
    public void mo34972w(int i) {
        mo34981a();
        this.f5328i = i;
        this.f5323d.put(i, this.f5324e.dataPosition());
        mo34984E(0);
        mo34984E(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1926a
    /* renamed from: y */
    public void mo34971y(boolean z) {
        this.f5324e.writeInt(z ? 1 : 0);
    }

    private C1927b(Parcel parcel, int i, int i2, String str, C0624a<String, Method> c0624a, C0624a<String, Method> c0624a2, C0624a<String, Class> c0624a3) {
        super(c0624a, c0624a2, c0624a3);
        this.f5323d = new SparseIntArray();
        this.f5328i = -1;
        this.f5330k = -1;
        this.f5324e = parcel;
        this.f5325f = i;
        this.f5326g = i2;
        this.f5329j = i;
        this.f5327h = str;
    }
}
