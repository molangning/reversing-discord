package p008a7;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p195k8.C9183l0;
import p195k8.C9208y;
import p296q6.InterfaceC11748k;

/* renamed from: a7.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC0052i0 {

    /* renamed from: a7.i0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0053a {

        /* renamed from: a */
        public final String f177a;

        /* renamed from: b */
        public final int f178b;

        /* renamed from: c */
        public final byte[] f179c;

        public C0053a(String str, int i, byte[] bArr) {
            this.f177a = str;
            this.f178b = i;
            this.f179c = bArr;
        }
    }

    /* renamed from: a7.i0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0054b {

        /* renamed from: a */
        public final int f180a;

        /* renamed from: b */
        public final String f181b;

        /* renamed from: c */
        public final List<C0053a> f182c;

        /* renamed from: d */
        public final byte[] f183d;

        public C0054b(int i, String str, List<C0053a> list, byte[] bArr) {
            List<C0053a> unmodifiableList;
            this.f180a = i;
            this.f181b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f182c = unmodifiableList;
            this.f183d = bArr;
        }
    }

    /* renamed from: a7.i0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC0055c {
        /* renamed from: a */
        SparseArray<InterfaceC0052i0> mo41285a();

        /* renamed from: b */
        InterfaceC0052i0 mo41284b(int i, C0054b c0054b);
    }

    /* renamed from: a7.i0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0056d {

        /* renamed from: a */
        private final String f184a;

        /* renamed from: b */
        private final int f185b;

        /* renamed from: c */
        private final int f186c;

        /* renamed from: d */
        private int f187d;

        /* renamed from: e */
        private String f188e;

        public C0056d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: d */
        private void m41286d() {
            if (this.f187d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* renamed from: a */
        public void m41289a() {
            int i;
            int i2 = this.f187d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.f185b;
            } else {
                i = i2 + this.f186c;
            }
            this.f187d = i;
            this.f188e = this.f184a + this.f187d;
        }

        /* renamed from: b */
        public String m41288b() {
            m41286d();
            return this.f188e;
        }

        /* renamed from: c */
        public int m41287c() {
            m41286d();
            return this.f187d;
        }

        public C0056d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f184a = str;
            this.f185b = i2;
            this.f186c = i3;
            this.f187d = Integer.MIN_VALUE;
            this.f188e = "";
        }
    }

    /* renamed from: a */
    void mo41202a(C9208y c9208y, int i);

    /* renamed from: b */
    void mo41201b(C9183l0 c9183l0, InterfaceC11748k interfaceC11748k, C0056d c0056d);

    /* renamed from: c */
    void mo41200c();
}