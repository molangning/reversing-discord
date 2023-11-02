package p153i8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* renamed from: i8.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7473y extends AbstractC7448f {

    /* renamed from: e */
    private final int f20067e;

    /* renamed from: f */
    private final byte[] f20068f;

    /* renamed from: g */
    private final DatagramPacket f20069g;

    /* renamed from: h */
    private Uri f20070h;

    /* renamed from: i */
    private DatagramSocket f20071i;

    /* renamed from: j */
    private MulticastSocket f20072j;

    /* renamed from: k */
    private InetAddress f20073k;

    /* renamed from: l */
    private InetSocketAddress f20074l;

    /* renamed from: m */
    private boolean f20075m;

    /* renamed from: n */
    private int f20076n;

    /* renamed from: i8.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7474a extends IOException {
        public C7474a(IOException iOException) {
            super(iOException);
        }
    }

    public C7473y() {
        this(2000);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        Uri uri = c4515a.f12257a;
        this.f20070h = uri;
        String host = uri.getHost();
        int port = this.f20070h.getPort();
        m20652q(c4515a);
        try {
            this.f20073k = InetAddress.getByName(host);
            this.f20074l = new InetSocketAddress(this.f20073k, port);
            if (this.f20073k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f20074l);
                this.f20072j = multicastSocket;
                multicastSocket.joinGroup(this.f20073k);
                this.f20071i = this.f20072j;
            } else {
                this.f20071i = new DatagramSocket(this.f20074l);
            }
            try {
                this.f20071i.setSoTimeout(this.f20067e);
                this.f20075m = true;
                m20651r(c4515a);
                return -1L;
            } catch (SocketException e) {
                throw new C7474a(e);
            }
        } catch (IOException e2) {
            throw new C7474a(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f20070h = null;
        MulticastSocket multicastSocket = this.f20072j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f20073k);
            } catch (IOException unused) {
            }
            this.f20072j = null;
        }
        DatagramSocket datagramSocket = this.f20071i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20071i = null;
        }
        this.f20073k = null;
        this.f20074l = null;
        this.f20076n = 0;
        if (this.f20075m) {
            this.f20075m = false;
            m20653p();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f20070h;
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f20076n == 0) {
            try {
                this.f20071i.receive(this.f20069g);
                int length = this.f20069g.getLength();
                this.f20076n = length;
                m20654o(length);
            } catch (IOException e) {
                throw new C7474a(e);
            }
        }
        int length2 = this.f20069g.getLength();
        int i3 = this.f20076n;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f20068f, length2 - i3, bArr, i, min);
        this.f20076n -= min;
        return min;
    }

    public C7473y(int i) {
        this(i, 8000);
    }

    public C7473y(int i, int i2) {
        super(true);
        this.f20067e = i2;
        byte[] bArr = new byte[i];
        this.f20068f = bArr;
        this.f20069g = new DatagramPacket(bArr, 0, i);
    }
}
