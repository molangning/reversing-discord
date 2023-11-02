package p259o6;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import java.util.Map;
import p177jb.C8891c;
import p195k8.C9149a;
import p195k8.C9191p0;
import p259o6.C11015i;

/* renamed from: o6.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11026k implements InterfaceC11051y {

    /* renamed from: a */
    private final Object f28877a = new Object();

    /* renamed from: b */
    private MediaItem.C4367e f28878b;

    /* renamed from: c */
    private InterfaceC11049x f28879c;

    /* renamed from: d */
    private InterfaceC4540f.InterfaceC4543c f28880d;

    /* renamed from: e */
    private String f28881e;

    /* renamed from: b */
    private InterfaceC11049x m9322b(MediaItem.C4367e c4367e) {
        String uri;
        InterfaceC4540f.InterfaceC4543c interfaceC4543c = this.f28880d;
        if (interfaceC4543c == null) {
            interfaceC4543c = new DefaultHttpDataSource.Factory().m28772b(this.f28881e);
        }
        Uri uri2 = c4367e.f11274b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        C11014h0 c11014h0 = new C11014h0(uri, c4367e.f11278f, interfaceC4543c);
        for (Map.Entry<String, String> entry : c4367e.f11275c.entrySet()) {
            c11014h0.m9355e(entry.getKey(), entry.getValue());
        }
        C11015i m9337a = new C11015i.C11017b().m9333e(c4367e.f11273a, C11006g0.f28802d).m9336b(c4367e.f11276d).m9335c(c4367e.f11277e).m9334d(C8891c.m17070k(c4367e.f11279g)).m9337a(c11014h0);
        m9337a.m9338t(0, c4367e.m29844a());
        return m9337a;
    }

    @Override // p259o6.InterfaceC11051y
    /* renamed from: a */
    public InterfaceC11049x mo4725a(MediaItem mediaItem) {
        InterfaceC11049x interfaceC11049x;
        C9149a.m16448e(mediaItem.f11234b);
        MediaItem.C4367e c4367e = mediaItem.f11234b.f11289c;
        if (c4367e != null && C9191p0.f24171a >= 18) {
            synchronized (this.f28877a) {
                if (!C9191p0.m16257c(c4367e, this.f28878b)) {
                    this.f28878b = c4367e;
                    this.f28879c = m9322b(c4367e);
                }
                interfaceC11049x = (InterfaceC11049x) C9149a.m16448e(this.f28879c);
            }
            return interfaceC11049x;
        }
        return InterfaceC11049x.f28914a;
    }
}