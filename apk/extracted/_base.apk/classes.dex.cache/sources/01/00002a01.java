package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4539e;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.Map;
import p153i8.C7454k;
import p153i8.InterfaceC7472x;

/* renamed from: com.google.android.exoplayer2.upstream.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4539e implements DataSource {

    /* renamed from: a */
    public static final C4539e f12369a = new C4539e();

    /* renamed from: b */
    public static final DataSource.Factory f12370b = new DataSource.Factory() { // from class: i8.q
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            return C4539e.m28635o();
        }
    };

    private C4539e() {
    }

    /* renamed from: o */
    public static /* synthetic */ C4539e m28635o() {
        return new C4539e();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public /* synthetic */ Map mo6321d() {
        return C7454k.m20649a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: f */
    public void mo6320f(InterfaceC7472x interfaceC7472x) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return null;
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}