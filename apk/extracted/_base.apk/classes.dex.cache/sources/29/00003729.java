package p153i8;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p195k8.C9191p0;

/* renamed from: i8.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7449g extends AbstractC7448f {

    /* renamed from: e */
    private final ContentResolver f19995e;

    /* renamed from: f */
    private Uri f19996f;

    /* renamed from: g */
    private AssetFileDescriptor f19997g;

    /* renamed from: h */
    private FileInputStream f19998h;

    /* renamed from: i */
    private long f19999i;

    /* renamed from: j */
    private boolean f20000j;

    /* renamed from: i8.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C7450a extends IOException {
        public C7450a(IOException iOException) {
            super(iOException);
        }
    }

    public C7449g(Context context) {
        super(false);
        this.f19995e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        try {
            Uri uri = c4515a.f12257a;
            this.f19996f = uri;
            m20652q(c4515a);
            AssetFileDescriptor openAssetFileDescriptor = this.f19995e.openAssetFileDescriptor(uri, "r");
            this.f19997g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f19998h = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(c4515a.f12263g + startOffset) - startOffset;
                if (skip == c4515a.f12263g) {
                    long j = c4515a.f12264h;
                    if (j != -1) {
                        this.f19999i = j;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f19999i = -1L;
                            } else {
                                long position = size - channel.position();
                                this.f19999i = position;
                                if (position < 0) {
                                    throw new EOFException();
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.f19999i = j2;
                            if (j2 < 0) {
                                throw new EOFException();
                            }
                        }
                    }
                    this.f20000j = true;
                    m20651r(c4515a);
                    return this.f19999i;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + uri);
        } catch (IOException e) {
            throw new C7450a(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f19996f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f19998h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f19998h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19997g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C7450a(e);
                    }
                } finally {
                    this.f19997g = null;
                    if (this.f20000j) {
                        this.f20000j = false;
                        m20653p();
                    }
                }
            } catch (Throwable th2) {
                this.f19998h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f19997g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f19997g = null;
                        if (this.f20000j) {
                            this.f20000j = false;
                            m20653p();
                        }
                        throw th2;
                    } catch (IOException e2) {
                        throw new C7450a(e2);
                    }
                } finally {
                    this.f19997g = null;
                    if (this.f20000j) {
                        this.f20000j = false;
                        m20653p();
                    }
                }
            }
        } catch (IOException e3) {
            throw new C7450a(e3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f19996f;
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f19999i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C7450a(e);
            }
        }
        int read = ((FileInputStream) C9191p0.m16243j(this.f19998h)).read(bArr, i, i2);
        if (read == -1) {
            if (this.f19999i == -1) {
                return -1;
            }
            throw new C7450a(new EOFException());
        }
        long j2 = this.f19999i;
        if (j2 != -1) {
            this.f19999i = j2 - read;
        }
        m20654o(read);
        return read;
    }
}