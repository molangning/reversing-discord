package td;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import md.C10438c;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\n"}, m14357d2 = {"Ltd/h;", "Ltd/a;", "Lmd/c;", "sourceFrame", "targetFrame", "", "a", "release", "<init>", "()V", "litr_release"}, m14356k = 1, m14355mv = {1, 4, 2})
/* renamed from: td.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12663h implements InterfaceC12655a {
    @Override // td.InterfaceC12655a
    /* renamed from: a */
    public void mo4587a(C10438c sourceFrame, C10438c targetFrame) {
        ByteBuffer byteBuffer;
        C9612q.m13917h(sourceFrame, "sourceFrame");
        C9612q.m13917h(targetFrame, "targetFrame");
        ByteBuffer byteBuffer2 = sourceFrame.f27261b;
        if (byteBuffer2 != null && (byteBuffer = targetFrame.f27261b) != null) {
            byteBuffer.put(byteBuffer2);
            targetFrame.f27261b.flip();
            MediaCodec.BufferInfo bufferInfo = targetFrame.f27262c;
            bufferInfo.offset = 0;
            MediaCodec.BufferInfo bufferInfo2 = sourceFrame.f27262c;
            bufferInfo.size = bufferInfo2.size;
            bufferInfo.presentationTimeUs = bufferInfo2.presentationTimeUs;
            bufferInfo.flags = bufferInfo2.flags;
            return;
        }
        throw new IllegalArgumentException("Source or target frame doesn't have a buffer, cannot process it!");
    }

    @Override // td.InterfaceC12655a
    public void release() {
    }
}