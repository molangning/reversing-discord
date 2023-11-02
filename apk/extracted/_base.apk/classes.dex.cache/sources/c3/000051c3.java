package p418x6;

import java.nio.ByteBuffer;
import java.util.UUID;
import p195k8.C9197r;
import p195k8.C9208y;

/* renamed from: x6.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13715l {

    /* renamed from: x6.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13716a {

        /* renamed from: a */
        private final UUID f35338a;

        /* renamed from: b */
        private final int f35339b;

        /* renamed from: c */
        private final byte[] f35340c;

        public C13716a(UUID uuid, int i, byte[] bArr) {
            this.f35338a = uuid;
            this.f35339b = i;
            this.f35340c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m1667a(UUID uuid, byte[] bArr) {
        return m1666b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m1666b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i;
        int i2;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i3 = i + 32;
        if (uuidArr != null) {
            i3 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.putInt(i3);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i2 = 16777216;
        } else {
            i2 = 0;
        }
        allocate.putInt(i2);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static boolean m1665c(byte[] bArr) {
        return m1664d(bArr) != null;
    }

    /* renamed from: d */
    private static C13716a m1664d(byte[] bArr) {
        C9208y c9208y = new C9208y(bArr);
        if (c9208y.m16092f() < 32) {
            return null;
        }
        c9208y.m16099P(0);
        if (c9208y.m16084n() != c9208y.m16097a() + 4 || c9208y.m16084n() != 1886614376) {
            return null;
        }
        int m1796c = AbstractC13691a.m1796c(c9208y.m16084n());
        if (m1796c > 1) {
            C9197r.m16178h("PsshAtomUtil", "Unsupported pssh version: " + m1796c);
            return null;
        }
        UUID uuid = new UUID(c9208y.m16075w(), c9208y.m16075w());
        if (m1796c == 1) {
            c9208y.m16098Q(c9208y.m16107H() * 16);
        }
        int m16107H = c9208y.m16107H();
        if (m16107H != c9208y.m16097a()) {
            return null;
        }
        byte[] bArr2 = new byte[m16107H];
        c9208y.m16088j(bArr2, 0, m16107H);
        return new C13716a(uuid, m1796c, bArr2);
    }

    /* renamed from: e */
    public static byte[] m1663e(byte[] bArr, UUID uuid) {
        C13716a m1664d = m1664d(bArr);
        if (m1664d == null) {
            return null;
        }
        if (!uuid.equals(m1664d.f35338a)) {
            C9197r.m16178h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + m1664d.f35338a + ".");
            return null;
        }
        return m1664d.f35340c;
    }

    /* renamed from: f */
    public static UUID m1662f(byte[] bArr) {
        C13716a m1664d = m1664d(bArr);
        if (m1664d == null) {
            return null;
        }
        return m1664d.f35338a;
    }

    /* renamed from: g */
    public static int m1661g(byte[] bArr) {
        C13716a m1664d = m1664d(bArr);
        if (m1664d == null) {
            return -1;
        }
        return m1664d.f35339b;
    }
}