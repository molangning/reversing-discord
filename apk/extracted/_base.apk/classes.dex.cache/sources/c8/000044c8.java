package net.time4j;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Iterator;
import net.time4j.base.AbstractC10617d;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10619e;
import p288pj.C11648d;
import p288pj.EnumC11651f;
import p288pj.InterfaceC11650e;

/* renamed from: net.time4j.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10785p0 implements InterfaceC10619e<C10582a0> {

    /* renamed from: c */
    private static final InterfaceC11650e f28155c;

    /* renamed from: d */
    private static final boolean f28156d;

    /* renamed from: e */
    public static final C10785p0 f28157e;

    /* renamed from: f */
    public static final C10785p0 f28158f;

    /* renamed from: a */
    private final boolean f28159a;

    /* renamed from: b */
    private final long f28160b;

    /* renamed from: net.time4j.p0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10787b implements InterfaceC11650e {
        private C10787b() {
        }

        @Override // p288pj.InterfaceC11650e
        /* renamed from: a */
        public long mo7354a() {
            return System.nanoTime();
        }

        @Override // p288pj.InterfaceC11650e
        /* renamed from: b */
        public String mo7353b() {
            return "";
        }
    }

    static {
        InterfaceC11650e interfaceC11650e;
        String property = System.getProperty("java.vm.name");
        Iterator it = AbstractC10617d.m11026c().mo11022g(InterfaceC11650e.class).iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC11650e = (InterfaceC11650e) it.next();
                if (property.equals(interfaceC11650e.mo7353b())) {
                    break;
                }
            } else {
                interfaceC11650e = null;
                break;
            }
        }
        if (interfaceC11650e == null) {
            interfaceC11650e = new C10787b();
        }
        f28155c = interfaceC11650e;
        f28156d = Boolean.getBoolean("net.time4j.systemclock.nanoTime");
        f28157e = new C10785p0(false, m10227a());
        f28158f = new C10785p0(true, m10227a());
    }

    private C10785p0(boolean z, long j) {
        this.f28159a = z;
        this.f28160b = j;
    }

    /* renamed from: a */
    private static long m10227a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        int i = 0;
        while (i < 10) {
            if (f28156d) {
                j = System.nanoTime();
            } else {
                j = f28155c.mo7354a();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis == currentTimeMillis2) {
                break;
            }
            i++;
            currentTimeMillis = currentTimeMillis2;
        }
        return C10616c.m11029m(C10616c.m11033i(C11648d.m7361w().m7366p(C10616c.m11040b(currentTimeMillis, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)), 1000000000L) + (C10616c.m11038d(currentTimeMillis, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * 1000000), j);
    }

    /* renamed from: b */
    public static C10582a0 m10226b() {
        return f28157e.m10225c();
    }

    /* renamed from: d */
    private long m10224d() {
        long mo7354a;
        if (f28156d) {
            mo7354a = System.nanoTime();
        } else {
            mo7354a = f28155c.mo7354a();
        }
        return C10616c.m11036f(mo7354a, this.f28160b);
    }

    /* renamed from: c */
    public C10582a0 m10225c() {
        if ((this.f28159a || f28156d) && C11648d.m7361w().m7373C()) {
            long m10224d = m10224d();
            return C10582a0.m11146p0(C10616c.m11040b(m10224d, 1000000000), C10616c.m11038d(m10224d, 1000000000), EnumC11651f.UTC);
        }
        long currentTimeMillis = System.currentTimeMillis();
        return C10582a0.m11146p0(C10616c.m11040b(currentTimeMillis, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA), C10616c.m11038d(currentTimeMillis, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * 1000000, EnumC11651f.POSIX);
    }
}