package p282p8;

import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: p8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11453b extends C11455d {

    /* renamed from: h */
    private static List<Runnable> f29774h = new ArrayList();

    /* renamed from: e */
    private boolean f29775e;

    /* renamed from: f */
    private Set<Object> f29776f;

    /* renamed from: g */
    private boolean f29777g;

    public C11453b(zzbv zzbvVar) {
        super(zzbvVar);
        this.f29776f = new HashSet();
    }

    /* renamed from: c */
    public static void m8043c() {
        synchronized (C11453b.class) {
            List<Runnable> list = f29774h;
            if (list != null) {
                for (Runnable runnable : list) {
                    runnable.run();
                }
                f29774h = null;
            }
        }
    }

    /* renamed from: b */
    public void m8044b(boolean z) {
        this.f29777g = z;
    }

    /* renamed from: d */
    public final void m8042d() {
        zzft zzq = m8041a().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            m8044b(zzq.zzc());
        }
        zzq.zzf();
        this.f29775e = true;
    }
}
