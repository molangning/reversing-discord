package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.cache.InterfaceC4521a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p153i8.InterfaceC7453j;
import p195k8.C9149a;
import p195k8.C9156c0;
import p195k8.C9191p0;
import p195k8.C9197r;

/* renamed from: com.google.android.exoplayer2.upstream.cache.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4524b implements InterfaceC7453j {

    /* renamed from: a */
    private final InterfaceC4521a f12306a;

    /* renamed from: b */
    private final long f12307b;

    /* renamed from: c */
    private final int f12308c;

    /* renamed from: d */
    private C4515a f12309d;

    /* renamed from: e */
    private long f12310e;

    /* renamed from: f */
    private File f12311f;

    /* renamed from: g */
    private OutputStream f12312g;

    /* renamed from: h */
    private long f12313h;

    /* renamed from: i */
    private long f12314i;

    /* renamed from: j */
    private C9156c0 f12315j;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4525a extends InterfaceC4521a.C4522a {
        public C4525a(IOException iOException) {
            super(iOException);
        }
    }

    public C4524b(InterfaceC4521a interfaceC4521a, long j) {
        this(interfaceC4521a, j, 20480);
    }

    /* renamed from: a */
    private void m28718a() {
        OutputStream outputStream = this.f12312g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            C9191p0.m16233o(this.f12312g);
            this.f12312g = null;
            this.f12311f = null;
            this.f12306a.mo28719h((File) C9191p0.m16243j(this.f12311f), this.f12313h);
        } catch (Throwable th2) {
            C9191p0.m16233o(this.f12312g);
            this.f12312g = null;
            this.f12311f = null;
            ((File) C9191p0.m16243j(this.f12311f)).delete();
            throw th2;
        }
    }

    /* renamed from: c */
    private void m28717c(C4515a c4515a) {
        long j = c4515a.f12264h;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.f12314i, this.f12310e);
        }
        this.f12311f = this.f12306a.mo28726a((String) C9191p0.m16243j(c4515a.f12265i), c4515a.f12263g + this.f12314i, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f12311f);
        if (this.f12308c > 0) {
            C9156c0 c9156c0 = this.f12315j;
            if (c9156c0 == null) {
                this.f12315j = new C9156c0(fileOutputStream, this.f12308c);
            } else {
                c9156c0.m16432a(fileOutputStream);
            }
            this.f12312g = this.f12315j;
        } else {
            this.f12312g = fileOutputStream;
        }
        this.f12313h = 0L;
    }

    @Override // p153i8.InterfaceC7453j
    /* renamed from: b */
    public void mo20650b(C4515a c4515a) {
        long j;
        C9149a.m16448e(c4515a.f12265i);
        if (c4515a.f12264h == -1 && c4515a.m28768d(2)) {
            this.f12309d = null;
            return;
        }
        this.f12309d = c4515a;
        if (c4515a.m28768d(4)) {
            j = this.f12307b;
        } else {
            j = Long.MAX_VALUE;
        }
        this.f12310e = j;
        this.f12314i = 0L;
        try {
            m28717c(c4515a);
        } catch (IOException e) {
            throw new C4525a(e);
        }
    }

    @Override // p153i8.InterfaceC7453j
    public void close() {
        if (this.f12309d == null) {
            return;
        }
        try {
            m28718a();
        } catch (IOException e) {
            throw new C4525a(e);
        }
    }

    @Override // p153i8.InterfaceC7453j
    public void write(byte[] bArr, int i, int i2) {
        C4515a c4515a = this.f12309d;
        if (c4515a == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f12313h == this.f12310e) {
                    m28718a();
                    m28717c(c4515a);
                }
                int min = (int) Math.min(i2 - i3, this.f12310e - this.f12313h);
                ((OutputStream) C9191p0.m16243j(this.f12312g)).write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.f12313h += j;
                this.f12314i += j;
            } catch (IOException e) {
                throw new C4525a(e);
            }
        }
    }

    public C4524b(InterfaceC4521a interfaceC4521a, long j, int i) {
        C9149a.m16446g(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i2 != 0 && j < 2097152) {
            C9197r.m16178h("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f12306a = (InterfaceC4521a) C9149a.m16448e(interfaceC4521a);
        this.f12307b = i2 == 0 ? Long.MAX_VALUE : j;
        this.f12308c = i;
    }
}
