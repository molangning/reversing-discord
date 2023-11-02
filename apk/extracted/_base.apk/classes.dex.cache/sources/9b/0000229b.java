package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p036c3.C2390a;
import p094f3.C6308c;
import p094f3.InterfaceC6306b;
import p394w2.C13367a;
import p394w2.C13368b;
import p394w2.C13379j;
import p394w2.C13386n;
import p394w2.InterfaceC13370d;
import p455z2.C14081i;
import p455z2.InterfaceC14078g;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d */
    private static Method f10536d;

    /* renamed from: c */
    private final InterfaceC6306b f10537c = C6308c.m23001i();

    /* renamed from: h */
    private static MemoryFile m30935h(CloseableReference<InterfaceC14078g> closeableReference, int i, byte[] bArr) {
        int length;
        OutputStream outputStream;
        C2390a c2390a;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        C14081i c14081i = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, length + i);
        memoryFile.allowPurging(false);
        try {
            C14081i c14081i2 = new C14081i(closeableReference.m31730D());
            try {
                c2390a = new C2390a(c14081i2, i);
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                c2390a = null;
            }
            try {
                outputStream2 = memoryFile.getOutputStream();
                C13367a.m2702a(c2390a, outputStream2);
                if (bArr != null) {
                    memoryFile.writeBytes(bArr, 0, i, bArr.length);
                }
                CloseableReference.m31715v(closeableReference);
                C13368b.m2699b(c14081i2);
                C13368b.m2699b(c2390a);
                C13368b.m2700a(outputStream2, true);
                return memoryFile;
            } catch (Throwable th3) {
                th = th3;
                outputStream = outputStream2;
                c14081i = c14081i2;
                CloseableReference.m31715v(closeableReference);
                C13368b.m2699b(c14081i);
                C13368b.m2699b(c2390a);
                C13368b.m2700a(outputStream, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            c2390a = null;
        }
    }

    /* renamed from: i */
    private Bitmap m30934i(CloseableReference<InterfaceC14078g> closeableReference, int i, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile m30935h = m30935h(closeableReference, i, bArr);
                try {
                    FileDescriptor m30932k = m30932k(m30935h);
                    InterfaceC6306b interfaceC6306b = this.f10537c;
                    if (interfaceC6306b != null) {
                        Bitmap bitmap = (Bitmap) C13379j.m2676h(interfaceC6306b.mo23011a(m30932k, null, options), "BitmapFactory returned null");
                        if (m30935h != null) {
                            m30935h.close();
                        }
                        return bitmap;
                    }
                    throw new IllegalStateException("WebpBitmapFactory is null");
                } catch (IOException e) {
                    e = e;
                    memoryFile = m30935h;
                    throw C13386n.m2666a(e);
                } catch (Throwable th2) {
                    th = th2;
                    memoryFile = m30935h;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* renamed from: j */
    private synchronized Method m30933j() {
        if (f10536d == null) {
            try {
                f10536d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                throw C13386n.m2666a(e);
            }
        }
        return f10536d;
    }

    /* renamed from: k */
    private FileDescriptor m30932k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) C13379j.m2677g(m30933j().invoke(memoryFile, new Object[0]));
        } catch (Exception e) {
            throw C13386n.m2666a(e);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: c */
    protected Bitmap mo30931c(CloseableReference<InterfaceC14078g> closeableReference, BitmapFactory.Options options) {
        return m30934i(closeableReference, closeableReference.m31730D().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: d */
    protected Bitmap mo30930d(CloseableReference<InterfaceC14078g> closeableReference, int i, BitmapFactory.Options options) {
        byte[] bArr;
        if (DalvikPurgeableDecoder.m30958e(closeableReference, i)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f10523b;
        }
        return m30934i(closeableReference, i, bArr, options);
    }
}