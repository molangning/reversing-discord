package fk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000f"}, m14357d2 = {"Lfk/f;", "", "Lokio/Buffer$a;", "cursor", "", "key", "", "b", "", "code", "", "a", "c", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: fk.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6500f {

    /* renamed from: a */
    public static final C6500f f18281a = new C6500f();

    private C6500f() {
    }

    /* renamed from: a */
    public final String m22575a(int i) {
        if (i >= 1000 && i < 5000) {
            if ((1004 <= i && 1006 >= i) || (1015 <= i && 2999 >= i)) {
                return "Code " + i + " is reserved and may not be used.";
            }
            return null;
        }
        return "Code must be in range [1000,5000): " + i;
    }

    /* renamed from: b */
    public final void m22574b(Buffer.C11211a cursor, byte[] key) {
        C9612q.m13917h(cursor, "cursor");
        C9612q.m13917h(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.f29476n;
            int i2 = cursor.f29477o;
            int i3 = cursor.f29478p;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (cursor.m8612a() != -1);
    }

    /* renamed from: c */
    public final void m22573c(int i) {
        boolean z;
        String m22575a = m22575a(i);
        if (m22575a == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        C9612q.m13920e(m22575a);
        throw new IllegalArgumentException(m22575a.toString());
    }
}