package p229m7;

import android.os.Handler;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import java.io.IOException;
import java.util.HashMap;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p195k8.C9191p0;
import p229m7.InterfaceC10341s;
import p229m7.InterfaceC10353z;
import p259o6.InterfaceC11045v;

/* renamed from: m7.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC10292f<T> extends AbstractC10277a {

    /* renamed from: p */
    private final HashMap<T, C10294b> f26816p = new HashMap<>();

    /* renamed from: q */
    private Handler f26817q;

    /* renamed from: r */
    private InterfaceC7472x f26818r;

    /* renamed from: m7.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class C10293a implements InterfaceC10353z, InterfaceC11045v {

        /* renamed from: j */
        private final T f26819j;

        /* renamed from: k */
        private InterfaceC10353z.C10354a f26820k;

        /* renamed from: l */
        private InterfaceC11045v.C11046a f26821l;

        public C10293a(T t) {
            this.f26820k = AbstractC10292f.this.m11954v(null);
            this.f26821l = AbstractC10292f.this.m11956t(null);
            this.f26819j = t;
        }

        /* renamed from: a */
        private boolean m11924a(int i, InterfaceC10341s.C10342a c10342a) {
            InterfaceC10341s.C10342a c10342a2;
            if (c10342a != null) {
                c10342a2 = AbstractC10292f.this.mo11780E(this.f26819j, c10342a);
                if (c10342a2 == null) {
                    return false;
                }
            } else {
                c10342a2 = null;
            }
            int m11929G = AbstractC10292f.this.m11929G(this.f26819j, i);
            InterfaceC10353z.C10354a c10354a = this.f26820k;
            if (c10354a.f27085a != m11929G || !C9191p0.m16257c(c10354a.f27086b, c10342a2)) {
                this.f26820k = AbstractC10292f.this.m11955u(m11929G, c10342a2, 0L);
            }
            InterfaceC11045v.C11046a c11046a = this.f26821l;
            if (c11046a.f28909a != m11929G || !C9191p0.m16257c(c11046a.f28910b, c10342a2)) {
                this.f26821l = AbstractC10292f.this.m11957s(m11929G, c10342a2);
                return true;
            }
            return true;
        }

        /* renamed from: c */
        private MediaLoadData m11923c(MediaLoadData mediaLoadData) {
            long m11930F = AbstractC10292f.this.m11930F(this.f26819j, mediaLoadData.f11761f);
            long m11930F2 = AbstractC10292f.this.m11930F(this.f26819j, mediaLoadData.f11762g);
            if (m11930F == mediaLoadData.f11761f && m11930F2 == mediaLoadData.f11762g) {
                return mediaLoadData;
            }
            return new MediaLoadData(mediaLoadData.f11756a, mediaLoadData.f11757b, mediaLoadData.f11758c, mediaLoadData.f11759d, mediaLoadData.f11760e, m11930F, m11930F2);
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: A */
        public void mo11717A(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m11924a(i, c10342a)) {
                this.f26820k.m11684v(loadEventInfo, m11923c(mediaLoadData));
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: B */
        public void mo11716B(int i, InterfaceC10341s.C10342a c10342a, MediaLoadData mediaLoadData) {
            if (m11924a(i, c10342a)) {
                this.f26820k.m11696j(m11923c(mediaLoadData));
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: D */
        public void mo9295D(int i, InterfaceC10341s.C10342a c10342a, Exception exc) {
            if (m11924a(i, c10342a)) {
                this.f26821l.m9278l(exc);
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: b */
        public void mo11715b(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m11924a(i, c10342a)) {
                this.f26820k.m11710B(loadEventInfo, m11923c(mediaLoadData));
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: e */
        public void mo9294e(int i, InterfaceC10341s.C10342a c10342a) {
            if (m11924a(i, c10342a)) {
                this.f26821l.m9277m();
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: i */
        public void mo11714i(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (m11924a(i, c10342a)) {
                this.f26820k.m11681y(loadEventInfo, m11923c(mediaLoadData), iOException, z);
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: n */
        public void mo11713n(int i, InterfaceC10341s.C10342a c10342a, MediaLoadData mediaLoadData) {
            if (m11924a(i, c10342a)) {
                this.f26820k.m11707E(m11923c(mediaLoadData));
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: o */
        public void mo11712o(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m11924a(i, c10342a)) {
                this.f26820k.m11687s(loadEventInfo, m11923c(mediaLoadData));
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: t */
        public void mo9293t(int i, InterfaceC10341s.C10342a c10342a) {
            if (m11924a(i, c10342a)) {
                this.f26821l.m9280j();
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: u */
        public void mo9292u(int i, InterfaceC10341s.C10342a c10342a) {
            if (m11924a(i, c10342a)) {
                this.f26821l.m9279k();
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: v */
        public void mo9291v(int i, InterfaceC10341s.C10342a c10342a) {
            if (m11924a(i, c10342a)) {
                this.f26821l.m9281i();
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: z */
        public void mo9290z(int i, InterfaceC10341s.C10342a c10342a) {
            if (m11924a(i, c10342a)) {
                this.f26821l.m9282h();
            }
        }
    }

    /* renamed from: m7.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C10294b {

        /* renamed from: a */
        public final InterfaceC10341s f26823a;

        /* renamed from: b */
        public final InterfaceC10341s.InterfaceC10343b f26824b;

        /* renamed from: c */
        public final InterfaceC10353z f26825c;

        public C10294b(InterfaceC10341s interfaceC10341s, InterfaceC10341s.InterfaceC10343b interfaceC10343b, InterfaceC10353z interfaceC10353z) {
            this.f26823a = interfaceC10341s;
            this.f26824b = interfaceC10343b;
            this.f26825c = interfaceC10353z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p229m7.AbstractC10277a
    /* renamed from: A */
    public void mo11739A(InterfaceC7472x interfaceC7472x) {
        this.f26818r = interfaceC7472x;
        this.f26817q = C9191p0.m16215x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p229m7.AbstractC10277a
    /* renamed from: C */
    public void mo11738C() {
        for (C10294b c10294b : this.f26816p.values()) {
            c10294b.f26823a.mo11736a(c10294b.f26824b);
            c10294b.f26823a.mo11733d(c10294b.f26825c);
        }
        this.f26816p.clear();
    }

    /* renamed from: E */
    protected abstract InterfaceC10341s.C10342a mo11780E(T t, InterfaceC10341s.C10342a c10342a);

    /* renamed from: F */
    protected long m11930F(T t, long j) {
        return j;
    }

    /* renamed from: G */
    protected int m11929G(T t, int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void m11928H(T t, InterfaceC10341s interfaceC10341s, Timeline timeline);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public final void m11927J(final T t, InterfaceC10341s interfaceC10341s) {
        C9149a.m16452a(!this.f26816p.containsKey(t));
        InterfaceC10341s.InterfaceC10343b interfaceC10343b = new InterfaceC10341s.InterfaceC10343b() { // from class: m7.e
            @Override // p229m7.InterfaceC10341s.InterfaceC10343b
            /* renamed from: a */
            public final void mo11722a(InterfaceC10341s interfaceC10341s2, Timeline timeline) {
                AbstractC10292f.this.m11928H(t, interfaceC10341s2, timeline);
            }
        };
        C10293a c10293a = new C10293a(t);
        this.f26816p.put(t, new C10294b(interfaceC10341s, interfaceC10343b, c10293a));
        interfaceC10341s.mo11735b((Handler) C9149a.m16448e(this.f26817q), c10293a);
        interfaceC10341s.mo11729l((Handler) C9149a.m16448e(this.f26817q), c10293a);
        interfaceC10341s.mo11730i(interfaceC10343b, this.f26818r);
        if (!m11952z()) {
            interfaceC10341s.mo11724r(interfaceC10343b);
        }
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: m */
    public void mo11728m() {
        for (C10294b c10294b : this.f26816p.values()) {
            c10294b.f26823a.mo11728m();
        }
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: x */
    protected void mo11926x() {
        for (C10294b c10294b : this.f26816p.values()) {
            c10294b.f26823a.mo11724r(c10294b.f26824b);
        }
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: y */
    protected void mo11925y() {
        for (C10294b c10294b : this.f26816p.values()) {
            c10294b.f26823a.mo11734c(c10294b.f26824b);
        }
    }
}
