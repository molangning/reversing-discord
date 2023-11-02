package p213l8;

import android.view.Surface;
import p040c7.C2427l;
import p040c7.C2428m;

/* renamed from: l8.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10073g extends C2427l {

    /* renamed from: l */
    public final int f26200l;

    /* renamed from: m */
    public final boolean f26201m;

    public C10073g(Throwable th2, C2428m c2428m, Surface surface) {
        super(th2, c2428m);
        boolean z;
        this.f26200l = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z = false;
        } else {
            z = true;
        }
        this.f26201m = z;
    }
}
