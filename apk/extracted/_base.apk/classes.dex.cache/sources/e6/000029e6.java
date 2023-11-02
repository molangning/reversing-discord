package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p153i8.AbstractC7448f;
import p195k8.C9149a;
import p195k8.C9191p0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RawResourceDataSource extends AbstractC7448f {

    /* renamed from: e */
    private final Resources f12250e;

    /* renamed from: f */
    private final String f12251f;

    /* renamed from: g */
    private Uri f12252g;

    /* renamed from: h */
    private AssetFileDescriptor f12253h;

    /* renamed from: i */
    private InputStream f12254i;

    /* renamed from: j */
    private long f12255j;

    /* renamed from: k */
    private boolean f12256k;

    /* renamed from: com.google.android.exoplayer2.upstream.RawResourceDataSource$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4514a extends IOException {
        public C4514a(String str) {
            super(str);
        }

        public C4514a(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f12250e = context.getResources();
        this.f12251f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        int parseInt;
        String str;
        Uri uri = c4515a.f12257a;
        this.f12252g = uri;
        if (!TextUtils.equals("rawresource", uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) C9149a.m16448e(uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str2 = (String) C9149a.m16448e(uri.getPath());
                if (str2.startsWith("/")) {
                    str2 = str2.substring(1);
                }
                String host = uri.getHost();
                StringBuilder sb2 = new StringBuilder();
                if (TextUtils.isEmpty(host)) {
                    str = "";
                } else {
                    str = host + ":";
                }
                sb2.append(str);
                sb2.append(str2);
                parseInt = this.f12250e.getIdentifier(sb2.toString(), "raw", this.f12251f);
                if (parseInt == 0) {
                    throw new C4514a("Resource not found.");
                }
            } else {
                throw new C4514a("URI must either use scheme rawresource or android.resource");
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) C9149a.m16448e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new C4514a("Resource identifier must be an integer.");
            }
        }
        m20652q(c4515a);
        AssetFileDescriptor openRawResourceFd = this.f12250e.openRawResourceFd(parseInt);
        this.f12253h = openRawResourceFd;
        if (openRawResourceFd != null) {
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.f12254i = fileInputStream;
            try {
                fileInputStream.skip(openRawResourceFd.getStartOffset());
                if (fileInputStream.skip(c4515a.f12263g) >= c4515a.f12263g) {
                    long j = c4515a.f12264h;
                    long j2 = -1;
                    if (j != -1) {
                        this.f12255j = j;
                    } else {
                        long length = openRawResourceFd.getLength();
                        if (length != -1) {
                            j2 = length - c4515a.f12263g;
                        }
                        this.f12255j = j2;
                    }
                    this.f12256k = true;
                    m20651r(c4515a);
                    return this.f12255j;
                }
                throw new EOFException();
            } catch (IOException e) {
                throw new C4514a(e);
            }
        }
        throw new C4514a("Resource is compressed: " + uri);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f12252g = null;
        try {
            try {
                InputStream inputStream = this.f12254i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f12254i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f12253h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C4514a(e);
                    }
                } finally {
                    this.f12253h = null;
                    if (this.f12256k) {
                        this.f12256k = false;
                        m20653p();
                    }
                }
            } catch (Throwable th2) {
                this.f12254i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f12253h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f12253h = null;
                        if (this.f12256k) {
                            this.f12256k = false;
                            m20653p();
                        }
                        throw th2;
                    } catch (IOException e2) {
                        throw new C4514a(e2);
                    }
                } finally {
                    this.f12253h = null;
                    if (this.f12256k) {
                        this.f12256k = false;
                        m20653p();
                    }
                }
            }
        } catch (IOException e3) {
            throw new C4514a(e3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f12252g;
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12255j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C4514a(e);
            }
        }
        int read = ((InputStream) C9191p0.m16243j(this.f12254i)).read(bArr, i, i2);
        if (read == -1) {
            if (this.f12255j == -1) {
                return -1;
            }
            throw new C4514a(new EOFException());
        }
        long j2 = this.f12255j;
        if (j2 != -1) {
            this.f12255j = j2 - read;
        }
        m20654o(read);
        return read;
    }
}