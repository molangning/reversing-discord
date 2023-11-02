package md;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: md.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10438c {

    /* renamed from: a */
    public final int f27260a;

    /* renamed from: b */
    public final ByteBuffer f27261b;

    /* renamed from: c */
    public final MediaCodec.BufferInfo f27262c;

    public C10438c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f27260a = i;
        this.f27261b = byteBuffer;
        if (bufferInfo == null) {
            this.f27262c = new MediaCodec.BufferInfo();
        } else {
            this.f27262c = bufferInfo;
        }
    }
}