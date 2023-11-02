package p275p1;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p122gk.C6843p;

/* renamed from: p1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC11368c implements Closeable {

    /* renamed from: p */
    private static final String[] f29583p = new String[128];

    /* renamed from: j */
    int f29584j;

    /* renamed from: k */
    int[] f29585k = new int[32];

    /* renamed from: l */
    String[] f29586l = new String[32];

    /* renamed from: m */
    int[] f29587m = new int[32];

    /* renamed from: n */
    boolean f29588n;

    /* renamed from: o */
    boolean f29589o;

    /* renamed from: p1.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C11369a {

        /* renamed from: a */
        final String[] f29590a;

        /* renamed from: b */
        final C6843p f29591b;

        private C11369a(String[] strArr, C6843p c6843p) {
            this.f29590a = strArr;
            this.f29591b = c6843p;
        }

        /* renamed from: a */
        public static C11369a m8241a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    AbstractC11368c.m8245V(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.mo8586o0();
                }
                return new C11369a((String[]) strArr.clone(), C6843p.m21800r(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: p1.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC11370b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f29583p[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f29583p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: H */
    public static AbstractC11368c m8247H(BufferedSource bufferedSource) {
        return new C11372e(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m8245V(okio.BufferedSink r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = p275p1.AbstractC11368c.f29583p
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.mo8607N(r8, r4, r3)
        L2e:
            r7.mo8608K(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.mo8607N(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p275p1.AbstractC11368c.m8245V(okio.BufferedSink, java.lang.String):void");
    }

    /* renamed from: A */
    public abstract String mo8238A();

    /* renamed from: D */
    public abstract String mo8234D();

    /* renamed from: I */
    public abstract EnumC11370b mo8228I();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void m8246Q(int i) {
        int i2 = this.f29584j;
        int[] iArr = this.f29585k;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f29585k = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f29586l;
                this.f29586l = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f29587m;
                this.f29587m = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C11366a("Nesting too deep at " + m8242o());
            }
        }
        int[] iArr3 = this.f29585k;
        int i3 = this.f29584j;
        this.f29584j = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: R */
    public abstract int mo8226R(C11369a c11369a);

    /* renamed from: S */
    public abstract void mo8225S();

    /* renamed from: U */
    public abstract void mo8224U();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public final C11367b m8244Y(String str) {
        throw new C11367b(str + " at path " + m8242o());
    }

    /* renamed from: h */
    public abstract void mo8221h();

    /* renamed from: i */
    public abstract void mo8220i();

    /* renamed from: j */
    public abstract void mo8219j();

    /* renamed from: m */
    public abstract void mo8217m();

    /* renamed from: o */
    public final String m8242o() {
        return C11371d.m8239a(this.f29584j, this.f29585k, this.f29586l, this.f29587m);
    }

    /* renamed from: q */
    public abstract boolean mo8216q();

    /* renamed from: s */
    public abstract boolean mo8215s();

    /* renamed from: t */
    public abstract double mo8214t();

    /* renamed from: v */
    public abstract int mo8212v();
}
