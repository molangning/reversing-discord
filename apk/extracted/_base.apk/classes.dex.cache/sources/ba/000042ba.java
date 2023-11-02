package p228m6;

import android.media.MediaCodec;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: m6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10264b {

    /* renamed from: a */
    public byte[] f26730a;

    /* renamed from: b */
    public byte[] f26731b;

    /* renamed from: c */
    public int f26732c;

    /* renamed from: d */
    public int[] f26733d;

    /* renamed from: e */
    public int[] f26734e;

    /* renamed from: f */
    public int f26735f;

    /* renamed from: g */
    public int f26736g;

    /* renamed from: h */
    public int f26737h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f26738i;

    /* renamed from: j */
    private final C10266b f26739j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m6.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10266b {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f26740a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f26741b;

        /* renamed from: b */
        public void m11981b(int i, int i2) {
            this.f26741b.set(i, i2);
            this.f26740a.setPattern(this.f26741b);
        }

        private C10266b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f26740a = cryptoInfo;
            this.f26741b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C10264b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f26738i = cryptoInfo;
        this.f26739j = C9191p0.f24171a >= 24 ? new C10266b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo m11985a() {
        return this.f26738i;
    }

    /* renamed from: b */
    public void m11984b(int i) {
        if (i == 0) {
            return;
        }
        if (this.f26733d == null) {
            int[] iArr = new int[1];
            this.f26733d = iArr;
            this.f26738i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f26733d;
        iArr2[0] = iArr2[0] + i;
    }

    /* renamed from: c */
    public void m11983c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f26735f = i;
        this.f26733d = iArr;
        this.f26734e = iArr2;
        this.f26731b = bArr;
        this.f26730a = bArr2;
        this.f26732c = i2;
        this.f26736g = i3;
        this.f26737h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f26738i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (C9191p0.f24171a >= 24) {
            ((C10266b) C9149a.m16448e(this.f26739j)).m11981b(i3, i4);
        }
    }
}