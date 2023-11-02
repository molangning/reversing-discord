package p394w2;

import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: w2.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13367a {
    /* renamed from: a */
    public static long m2702a(InputStream inputStream, OutputStream outputStream) {
        C13379j.m2677g(inputStream);
        C13379j.m2677g(outputStream);
        byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: b */
    public static int m2701b(InputStream inputStream, byte[] bArr, int i, int i2) {
        C13379j.m2677g(inputStream);
        C13379j.m2677g(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}