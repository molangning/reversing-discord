package p098f7;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p060d7.AbstractC5780f;
import p060d7.C5778d;
import p195k8.C9149a;
import p195k8.C9208y;

/* renamed from: f7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6316b extends AbstractC5780f {
    @Override // p060d7.AbstractC5780f
    /* renamed from: b */
    protected Metadata mo16477b(C5778d c5778d, ByteBuffer byteBuffer) {
        return new Metadata(m22995c(new C9208y(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public C6314a m22995c(C9208y c9208y) {
        return new C6314a((String) C9149a.m16448e(c9208y.m16074x()), (String) C9149a.m16448e(c9208y.m16074x()), c9208y.m16109F(), c9208y.m16109F(), Arrays.copyOfRange(c9208y.m16094d(), c9208y.m16093e(), c9208y.m16092f()));
    }
}