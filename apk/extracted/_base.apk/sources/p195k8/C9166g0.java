package p195k8;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.C4550h;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* renamed from: k8.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9166g0 {

    /* renamed from: a */
    private static final Object f24130a = new Object();

    /* renamed from: b */
    private static final Object f24131b = new Object();

    /* renamed from: c */
    private static boolean f24132c = false;

    /* renamed from: d */
    private static long f24133d = 0;

    /* renamed from: e */
    private static String f24134e = "time.android.com";

    /* renamed from: k8.g0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9168b {
        /* renamed from: a */
        void mo16391a(IOException iOException);

        /* renamed from: b */
        void mo16390b();
    }

    /* renamed from: k8.g0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C9169c implements C4550h.InterfaceC4552b<C4550h.InterfaceC4555e> {

        /* renamed from: j */
        private final InterfaceC9168b f24135j;

        public C9169c(InterfaceC9168b interfaceC9168b) {
            this.f24135j = interfaceC9168b;
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: j */
        public void mo5356j(C4550h.InterfaceC4555e interfaceC4555e, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: k */
        public void mo5355k(C4550h.InterfaceC4555e interfaceC4555e, long j, long j2) {
            if (this.f24135j != null) {
                if (!C9166g0.m16396k()) {
                    this.f24135j.mo16391a(new IOException(new ConcurrentModificationException()));
                } else {
                    this.f24135j.mo16390b();
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: o */
        public C4550h.C4553c mo5351o(C4550h.InterfaceC4555e interfaceC4555e, long j, long j2, IOException iOException, int i) {
            InterfaceC9168b interfaceC9168b = this.f24135j;
            if (interfaceC9168b != null) {
                interfaceC9168b.mo16391a(iOException);
            }
            return C4550h.f12387f;
        }
    }

    /* renamed from: k8.g0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C9170d implements C4550h.InterfaceC4555e {
        private C9170d() {
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
        /* renamed from: a */
        public void mo6277a() {
            synchronized (C9166g0.f24130a) {
                synchronized (C9166g0.f24131b) {
                    if (C9166g0.f24132c) {
                        return;
                    }
                    long m16402e = C9166g0.m16402e();
                    synchronized (C9166g0.f24131b) {
                        long unused = C9166g0.f24133d = m16402e;
                        boolean unused2 = C9166g0.f24132c = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
        /* renamed from: c */
        public void mo6276c() {
        }
    }

    /* renamed from: e */
    static /* synthetic */ long m16402e() {
        return m16395l();
    }

    /* renamed from: g */
    private static void m16400g(byte b, byte b2, int i, long j) {
        if (b != 3) {
            if (b2 != 4 && b2 != 5) {
                throw new IOException("SNTP: Untrusted mode: " + ((int) b2));
            } else if (i != 0 && i <= 15) {
                if (j != 0) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            } else {
                throw new IOException("SNTP: Untrusted stratum: " + i);
            }
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    /* renamed from: h */
    public static long m16399h() {
        long j;
        synchronized (f24131b) {
            if (f24132c) {
                j = f24133d;
            } else {
                j = -9223372036854775807L;
            }
        }
        return j;
    }

    /* renamed from: i */
    public static String m16398i() {
        String str;
        synchronized (f24131b) {
            str = f24134e;
        }
        return str;
    }

    /* renamed from: j */
    public static void m16397j(C4550h c4550h, InterfaceC9168b interfaceC9168b) {
        if (m16396k()) {
            if (interfaceC9168b != null) {
                interfaceC9168b.mo16390b();
                return;
            }
            return;
        }
        if (c4550h == null) {
            c4550h = new C4550h("SntpClient");
        }
        c4550h.m28615n(new C9170d(), new C9169c(interfaceC9168b), 1);
    }

    /* renamed from: k */
    public static boolean m16396k() {
        boolean z;
        synchronized (f24131b) {
            z = f24132c;
        }
        return z;
    }

    /* renamed from: l */
    private static long m16395l() {
        InetAddress byName = InetAddress.getByName(m16398i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m16392o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b = bArr[0];
            long m16393n = m16393n(bArr, 24);
            long m16393n2 = m16393n(bArr, 32);
            long m16393n3 = m16393n(bArr, 40);
            m16400g((byte) ((b >> 6) & 3), (byte) (b & 7), bArr[1] & 255, m16393n3);
            long j2 = (j + (((m16393n2 - m16393n) + (m16393n3 - j)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    datagramSocket.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* renamed from: m */
    private static long m16394m(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    /* renamed from: n */
    private static long m16393n(byte[] bArr, int i) {
        long m16394m = m16394m(bArr, i);
        long m16394m2 = m16394m(bArr, i + 4);
        if (m16394m == 0 && m16394m2 == 0) {
            return 0L;
        }
        return ((m16394m - 2208988800L) * 1000) + ((m16394m2 * 1000) / 4294967296L);
    }

    /* renamed from: o */
    private static void m16392o(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j2 + 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) (j3 >> 24);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j3 >> 16);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j3 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j3 >> 0);
        long j4 = ((j - (j2 * 1000)) * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j4 >> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j4 >> 16);
        bArr[i7] = (byte) (j4 >> 8);
        bArr[i7 + 1] = (byte) (Math.random() * 255.0d);
    }
}
