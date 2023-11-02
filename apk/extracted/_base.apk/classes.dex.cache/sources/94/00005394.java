package p467zf;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0007¨\u0006\t"}, m14357d2 = {"Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "a", "", "c", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: zf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14179b {
    /* renamed from: a */
    public static final long m517a(InputStream inputStream, OutputStream out, int i) {
        C9612q.m13917h(inputStream, "<this>");
        C9612q.m13917h(out, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m516b(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m517a(inputStream, outputStream, i);
    }

    /* renamed from: c */
    public static final byte[] m515c(InputStream inputStream) {
        C9612q.m13917h(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m516b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C9612q.m13918g(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}