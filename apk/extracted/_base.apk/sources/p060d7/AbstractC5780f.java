package p060d7;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import p195k8.C9149a;

/* renamed from: d7.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC5780f implements InterfaceC5775b {
    @Override // p060d7.InterfaceC5775b
    /* renamed from: a */
    public final Metadata mo24517a(C5778d c5778d) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) C9149a.m16448e(c5778d.f26743l);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        if (c5778d.m11989k()) {
            return null;
        }
        return mo16477b(c5778d, byteBuffer);
    }

    /* renamed from: b */
    protected abstract Metadata mo16477b(C5778d c5778d, ByteBuffer byteBuffer);
}
