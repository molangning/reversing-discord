package p040c7;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p213l8.C10064b;

/* renamed from: c7.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2448y {
    /* renamed from: a */
    public static void m33287a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m33286b(MediaFormat mediaFormat, C10064b c10064b) {
        if (c10064b != null) {
            m33284d(mediaFormat, "color-transfer", c10064b.f26167l);
            m33284d(mediaFormat, "color-standard", c10064b.f26165j);
            m33284d(mediaFormat, "color-range", c10064b.f26166k);
            m33287a(mediaFormat, "hdr-static-info", c10064b.f26168m);
        }
    }

    /* renamed from: c */
    public static void m33285c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: d */
    public static void m33284d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: e */
    public static void m33283e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
