package io.sentry;

import io.sentry.protocol.C8108u;
import io.sentry.protocol.C8110v;
import io.sentry.protocol.C8112w;
import io.sentry.util.C8229o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.u4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8208u4 {

    /* renamed from: a */
    private final C8166t4 f22139a;

    /* renamed from: b */
    private final C8132r4 f22140b;

    public C8208u4(C8166t4 c8166t4, C8132r4 c8132r4) {
        this.f22139a = (C8166t4) C8229o.m18169c(c8166t4, "The SentryStackTraceFactory is required.");
        this.f22140b = (C8132r4) C8229o.m18169c(c8132r4, "The SentryOptions is required");
    }

    /* renamed from: d */
    private C8112w m18244d(boolean z, StackTraceElement[] stackTraceElementArr, Thread thread) {
        C8112w c8112w = new C8112w();
        c8112w.m18500w(thread.getName());
        c8112w.m18499x(Integer.valueOf(thread.getPriority()));
        c8112w.m18502u(Long.valueOf(thread.getId()));
        c8112w.m18504s(Boolean.valueOf(thread.isDaemon()));
        c8112w.m18497z(thread.getState().name());
        c8112w.m18506q(Boolean.valueOf(z));
        List<C8108u> m18352a = this.f22139a.m18352a(stackTraceElementArr);
        if (this.f22140b.isAttachStacktrace() && m18352a != null && !m18352a.isEmpty()) {
            C8110v c8110v = new C8110v(m18352a);
            c8110v.m18526e(Boolean.TRUE);
            c8112w.m18498y(c8110v);
        }
        return c8112w;
    }

    /* renamed from: a */
    public List<C8112w> m18247a() {
        HashMap hashMap = new HashMap();
        Thread currentThread = Thread.currentThread();
        hashMap.put(currentThread, currentThread.getStackTrace());
        return m18245c(hashMap, null, false);
    }

    /* renamed from: b */
    public List<C8112w> m18246b(List<Long> list, boolean z) {
        return m18245c(Thread.getAllStackTraces(), list, z);
    }

    /* renamed from: c */
    List<C8112w> m18245c(Map<Thread, StackTraceElement[]> map, List<Long> list, boolean z) {
        boolean z2;
        Thread currentThread = Thread.currentThread();
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            if (!map.containsKey(currentThread)) {
                map.put(currentThread, currentThread.getStackTrace());
            }
            for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
                Thread key = entry.getKey();
                if ((key == currentThread && !z) || (list != null && list.contains(Long.valueOf(key.getId())))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(m18244d(z2, entry.getValue(), entry.getKey()));
            }
            return arrayList;
        }
        return null;
    }
}