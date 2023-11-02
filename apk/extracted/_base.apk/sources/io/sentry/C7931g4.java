package io.sentry;

import io.sentry.exception.C7913a;
import io.sentry.protocol.C8084i;
import io.sentry.protocol.C8098p;
import io.sentry.protocol.C8108u;
import io.sentry.protocol.C8110v;
import io.sentry.protocol.C8112w;
import io.sentry.util.C8229o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

/* renamed from: io.sentry.g4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7931g4 {

    /* renamed from: a */
    private final C8166t4 f21611a;

    public C7931g4(C8166t4 c8166t4) {
        this.f21611a = (C8166t4) C8229o.m18169c(c8166t4, "The SentryStackTraceFactory is required.");
    }

    /* renamed from: b */
    private C8098p m19180b(Throwable th2, C8084i c8084i, Long l, List<C8108u> list, boolean z) {
        String str;
        Package r0 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        C8098p c8098p = new C8098p();
        String message = th2.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        if (list != null && !list.isEmpty()) {
            C8110v c8110v = new C8110v(list);
            if (z) {
                c8110v.m18526e(Boolean.TRUE);
            }
            c8098p.m18583l(c8110v);
        }
        c8098p.m18582m(l);
        c8098p.m18581n(name);
        c8098p.m18585j(c8084i);
        c8098p.m18584k(str);
        c8098p.m18579p(message);
        return c8098p;
    }

    /* renamed from: d */
    private List<C8098p> m19178d(Deque<C8098p> deque) {
        return new ArrayList(deque);
    }

    /* renamed from: a */
    Deque<C8098p> m19181a(Throwable th2) {
        Thread currentThread;
        boolean z;
        C8084i c8084i;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th2 != null && hashSet.add(th2)) {
            if (th2 instanceof C7913a) {
                C7913a c7913a = (C7913a) th2;
                C8084i m19288a = c7913a.m19288a();
                Throwable m19286c = c7913a.m19286c();
                currentThread = c7913a.m19287b();
                z = c7913a.m19285d();
                c8084i = m19288a;
                th2 = m19286c;
            } else {
                currentThread = Thread.currentThread();
                z = false;
                c8084i = null;
            }
            arrayDeque.addFirst(m19180b(th2, c8084i, Long.valueOf(currentThread.getId()), this.f21611a.m18352a(th2.getStackTrace()), z));
            th2 = th2.getCause();
        }
        return arrayDeque;
    }

    /* renamed from: c */
    public List<C8098p> m19179c(Throwable th2) {
        return m19178d(m19181a(th2));
    }

    /* renamed from: e */
    public List<C8098p> m19177e(C8112w c8112w, C8084i c8084i, Throwable th2) {
        C8110v m18509n = c8112w.m18509n();
        if (m18509n == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(m19180b(th2, c8084i, c8112w.m18511l(), m18509n.m18527d(), true));
        return arrayList;
    }
}
