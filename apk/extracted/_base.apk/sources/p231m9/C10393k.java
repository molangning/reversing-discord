package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p029b9.C2198p;

/* renamed from: m9.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10393k implements Parcelable {
    public static final Parcelable.Creator<C10393k> CREATOR = new C10411r0();

    /* renamed from: j */
    private InterfaceC10363a f27145j;

    /* renamed from: m9.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10394a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C10394a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 51
                r0.<init>(r1)
                java.lang.String r1 = "Algorithm with COSE value "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " not supported"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p231m9.C10393k.C10394a.<init>(int):void");
        }
    }

    private C10393k(InterfaceC10363a interfaceC10363a) {
        this.f27145j = (InterfaceC10363a) C2198p.m33985j(interfaceC10363a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C10393k m11630a(int i) {
        EnumC10396l[] values;
        EnumC10422w enumC10422w;
        if (i == EnumC10422w.LEGACY_RS1.mo11585a()) {
            enumC10422w = EnumC10422w.RS1;
        } else {
            EnumC10422w[] values2 = EnumC10422w.values();
            int length = values2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    EnumC10422w enumC10422w2 = values2[i2];
                    if (enumC10422w2.mo11585a() == i) {
                        enumC10422w = enumC10422w2;
                        break;
                    }
                    i2++;
                } else {
                    for (EnumC10422w enumC10422w3 : EnumC10396l.values()) {
                        if (enumC10422w3.mo11585a() == i) {
                            enumC10422w = enumC10422w3;
                        }
                    }
                    throw new C10394a(i);
                }
            }
        }
        return new C10393k(enumC10422w);
    }

    /* renamed from: b */
    public int m11629b() {
        return this.f27145j.mo11585a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10393k) || this.f27145j.mo11585a() != ((C10393k) obj).f27145j.mo11585a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27145j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27145j.mo11585a());
    }
}
