package p229m7;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p151i6.C7390b;
import p195k8.C9149a;
import p195k8.C9191p0;
import p229m7.InterfaceC10341s;
import p229m7.InterfaceC10353z;

/* renamed from: m7.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC10353z {

    /* renamed from: m7.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10354a {

        /* renamed from: a */
        public final int f27085a;

        /* renamed from: b */
        public final InterfaceC10341s.C10342a f27086b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C10355a> f27087c;

        /* renamed from: d */
        private final long f27088d;

        /* renamed from: m7.z$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C10355a {

            /* renamed from: a */
            public Handler f27089a;

            /* renamed from: b */
            public InterfaceC10353z f27090b;

            public C10355a(Handler handler, InterfaceC10353z interfaceC10353z) {
                this.f27089a = handler;
                this.f27090b = interfaceC10353z;
            }
        }

        public C10354a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        /* renamed from: h */
        private long m11698h(long j) {
            long m20791d = C7390b.m20791d(j);
            if (m20791d == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f27088d + m20791d;
        }

        /* renamed from: k */
        public /* synthetic */ void m11695k(InterfaceC10353z interfaceC10353z, MediaLoadData mediaLoadData) {
            interfaceC10353z.mo11716B(this.f27085a, this.f27086b, mediaLoadData);
        }

        /* renamed from: l */
        public /* synthetic */ void m11694l(InterfaceC10353z interfaceC10353z, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            interfaceC10353z.mo11712o(this.f27085a, this.f27086b, loadEventInfo, mediaLoadData);
        }

        /* renamed from: m */
        public /* synthetic */ void m11693m(InterfaceC10353z interfaceC10353z, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            interfaceC10353z.mo11717A(this.f27085a, this.f27086b, loadEventInfo, mediaLoadData);
        }

        /* renamed from: n */
        public /* synthetic */ void m11692n(InterfaceC10353z interfaceC10353z, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            interfaceC10353z.mo11714i(this.f27085a, this.f27086b, loadEventInfo, mediaLoadData, iOException, z);
        }

        /* renamed from: o */
        public /* synthetic */ void m11691o(InterfaceC10353z interfaceC10353z, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            interfaceC10353z.mo11715b(this.f27085a, this.f27086b, loadEventInfo, mediaLoadData);
        }

        /* renamed from: p */
        public /* synthetic */ void m11690p(InterfaceC10353z interfaceC10353z, InterfaceC10341s.C10342a c10342a, MediaLoadData mediaLoadData) {
            interfaceC10353z.mo11713n(this.f27085a, c10342a, mediaLoadData);
        }

        /* renamed from: A */
        public void m11711A(LoadEventInfo loadEventInfo, int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            m11710B(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, m11698h(j), m11698h(j2)));
        }

        /* renamed from: B */
        public void m11710B(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<C10355a> it = this.f27087c.iterator();
            while (it.hasNext()) {
                C10355a next = it.next();
                final InterfaceC10353z interfaceC10353z = next.f27090b;
                C9191p0.m16302F0(next.f27089a, new Runnable() { // from class: m7.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10353z.C10354a.this.m11691o(interfaceC10353z, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m11709C(InterfaceC10353z interfaceC10353z) {
            Iterator<C10355a> it = this.f27087c.iterator();
            while (it.hasNext()) {
                C10355a next = it.next();
                if (next.f27090b == interfaceC10353z) {
                    this.f27087c.remove(next);
                }
            }
        }

        /* renamed from: D */
        public void m11708D(int i, long j, long j2) {
            m11707E(new MediaLoadData(1, i, null, 3, null, m11698h(j), m11698h(j2)));
        }

        /* renamed from: E */
        public void m11707E(final MediaLoadData mediaLoadData) {
            final InterfaceC10341s.C10342a c10342a = (InterfaceC10341s.C10342a) C9149a.m16448e(this.f27086b);
            Iterator<C10355a> it = this.f27087c.iterator();
            while (it.hasNext()) {
                C10355a next = it.next();
                final InterfaceC10353z interfaceC10353z = next.f27090b;
                C9191p0.m16302F0(next.f27089a, new Runnable() { // from class: m7.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10353z.C10354a.this.m11690p(interfaceC10353z, c10342a, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: F */
        public C10354a m11706F(int i, InterfaceC10341s.C10342a c10342a, long j) {
            return new C10354a(this.f27087c, i, c10342a, j);
        }

        /* renamed from: g */
        public void m11699g(Handler handler, InterfaceC10353z interfaceC10353z) {
            C9149a.m16448e(handler);
            C9149a.m16448e(interfaceC10353z);
            this.f27087c.add(new C10355a(handler, interfaceC10353z));
        }

        /* renamed from: i */
        public void m11697i(int i, Format format, int i2, Object obj, long j) {
            m11696j(new MediaLoadData(1, i, format, i2, obj, m11698h(j), -9223372036854775807L));
        }

        /* renamed from: j */
        public void m11696j(final MediaLoadData mediaLoadData) {
            Iterator<C10355a> it = this.f27087c.iterator();
            while (it.hasNext()) {
                C10355a next = it.next();
                final InterfaceC10353z interfaceC10353z = next.f27090b;
                C9191p0.m16302F0(next.f27089a, new Runnable() { // from class: m7.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10353z.C10354a.this.m11695k(interfaceC10353z, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m11689q(LoadEventInfo loadEventInfo, int i) {
            m11688r(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: r */
        public void m11688r(LoadEventInfo loadEventInfo, int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            m11687s(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, m11698h(j), m11698h(j2)));
        }

        /* renamed from: s */
        public void m11687s(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<C10355a> it = this.f27087c.iterator();
            while (it.hasNext()) {
                C10355a next = it.next();
                final InterfaceC10353z interfaceC10353z = next.f27090b;
                C9191p0.m16302F0(next.f27089a, new Runnable() { // from class: m7.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10353z.C10354a.this.m11694l(interfaceC10353z, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m11686t(LoadEventInfo loadEventInfo, int i) {
            m11685u(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: u */
        public void m11685u(LoadEventInfo loadEventInfo, int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            m11684v(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, m11698h(j), m11698h(j2)));
        }

        /* renamed from: v */
        public void m11684v(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<C10355a> it = this.f27087c.iterator();
            while (it.hasNext()) {
                C10355a next = it.next();
                final InterfaceC10353z interfaceC10353z = next.f27090b;
                C9191p0.m16302F0(next.f27089a, new Runnable() { // from class: m7.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10353z.C10354a.this.m11693m(interfaceC10353z, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* renamed from: w */
        public void m11683w(LoadEventInfo loadEventInfo, int i, int i2, Format format, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            m11681y(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, m11698h(j), m11698h(j2)), iOException, z);
        }

        /* renamed from: x */
        public void m11682x(LoadEventInfo loadEventInfo, int i, IOException iOException, boolean z) {
            m11683w(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* renamed from: y */
        public void m11681y(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z) {
            Iterator<C10355a> it = this.f27087c.iterator();
            while (it.hasNext()) {
                C10355a next = it.next();
                final InterfaceC10353z interfaceC10353z = next.f27090b;
                C9191p0.m16302F0(next.f27089a, new Runnable() { // from class: m7.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10353z.C10354a.this.m11692n(interfaceC10353z, loadEventInfo, mediaLoadData, iOException, z);
                    }
                });
            }
        }

        /* renamed from: z */
        public void m11680z(LoadEventInfo loadEventInfo, int i) {
            m11711A(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        private C10354a(CopyOnWriteArrayList<C10355a> copyOnWriteArrayList, int i, InterfaceC10341s.C10342a c10342a, long j) {
            this.f27087c = copyOnWriteArrayList;
            this.f27085a = i;
            this.f27086b = c10342a;
            this.f27088d = j;
        }
    }

    /* renamed from: A */
    void mo11717A(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* renamed from: B */
    void mo11716B(int i, InterfaceC10341s.C10342a c10342a, MediaLoadData mediaLoadData);

    /* renamed from: b */
    void mo11715b(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* renamed from: i */
    void mo11714i(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    /* renamed from: n */
    void mo11713n(int i, InterfaceC10341s.C10342a c10342a, MediaLoadData mediaLoadData);

    /* renamed from: o */
    void mo11712o(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);
}