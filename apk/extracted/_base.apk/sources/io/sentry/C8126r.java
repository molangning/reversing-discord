package io.sentry;

import io.sentry.protocol.C8114x;
import io.sentry.util.C8229o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p164j$.util.DesugarCollections;

/* renamed from: io.sentry.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8126r implements InterfaceC8270y {

    /* renamed from: j */
    private final Map<Throwable, Object> f22035j = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: k */
    private final C8132r4 f22036k;

    public C8126r(C8132r4 c8132r4) {
        this.f22036k = (C8132r4) C8229o.m18169c(c8132r4, "options are required");
    }

    /* renamed from: a */
    private static List<Throwable> m18457a(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    /* renamed from: b */
    private static <T> boolean m18456b(Map<T, Object> map, List<T> list) {
        for (T t : list) {
            if (map.containsKey(t)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: i */
    public C7923f4 mo18043i(C7923f4 c7923f4, C7831b0 c7831b0) {
        if (this.f22036k.isEnableDeduplication()) {
            Throwable m19258O = c7923f4.m19258O();
            if (m19258O != null) {
                if (!this.f22035j.containsKey(m19258O) && !m18456b(this.f22035j, m18457a(m19258O))) {
                    this.f22035j.put(m19258O, null);
                } else {
                    this.f22036k.getLogger().mo18135c(EnumC8021m4.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c7923f4.m19266G());
                    return null;
                }
            }
        } else {
            this.f22036k.getLogger().mo18135c(EnumC8021m4.DEBUG, "Event deduplication is disabled.", new Object[0]);
        }
        return c7923f4;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: j */
    public /* synthetic */ C8114x mo18042j(C8114x c8114x, C7831b0 c7831b0) {
        return C8264x.m18050a(this, c8114x, c7831b0);
    }
}
