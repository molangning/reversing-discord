package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p366u9.C12913k;

/* renamed from: m9.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10426y extends AbstractC2461a {
    public static final Parcelable.Creator<C10426y> CREATOR = new C10375d0();

    /* renamed from: l */
    public static final C10426y f27243l = new C10426y(EnumC10427a.SUPPORTED.toString(), null);

    /* renamed from: m */
    public static final C10426y f27244m = new C10426y(EnumC10427a.NOT_SUPPORTED.toString(), null);

    /* renamed from: j */
    private final EnumC10427a f27245j;

    /* renamed from: k */
    private final String f27246k;

    /* renamed from: m9.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC10427a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");
        
        public static final Parcelable.Creator<EnumC10427a> CREATOR = new C10385g1();

        /* renamed from: j */
        private final String f27251j;

        EnumC10427a(String str) {
            this.f27251j = str;
        }

        /* renamed from: a */
        public static EnumC10427a m11576a(String str) {
            EnumC10427a[] values;
            for (EnumC10427a enumC10427a : values()) {
                if (str.equals(enumC10427a.f27251j)) {
                    return enumC10427a;
                }
            }
            throw new C10428b(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f27251j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f27251j);
        }
    }

    /* renamed from: m9.y$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10428b extends Exception {
        public C10428b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10426y(String str, String str2) {
        C2198p.m33985j(str);
        try {
            this.f27245j = EnumC10427a.m11576a(str);
            this.f27246k = str2;
        } catch (C10428b e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10426y)) {
            return false;
        }
        C10426y c10426y = (C10426y) obj;
        if (!C12913k.m3681a(this.f27245j, c10426y.f27245j) || !C12913k.m3681a(this.f27246k, c10426y.f27246k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27245j, this.f27246k});
    }

    /* renamed from: r */
    public String m11578r() {
        return this.f27246k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 2, m11577z(), false);
        C2464c.m33168p(parcel, 3, m11578r(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m11577z() {
        return this.f27245j.toString();
    }
}
