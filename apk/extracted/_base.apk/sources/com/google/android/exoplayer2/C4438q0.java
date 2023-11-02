package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.analytics.C4382a;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p229m7.C10321n;
import p229m7.C10324o;
import p229m7.InterfaceC10327o0;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10341s;
import p229m7.InterfaceC10353z;
import p259o6.InterfaceC11045v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4438q0 {

    /* renamed from: d */
    private final InterfaceC4442d f11692d;

    /* renamed from: e */
    private final InterfaceC10353z.C10354a f11693e;

    /* renamed from: f */
    private final InterfaceC11045v.C11046a f11694f;

    /* renamed from: g */
    private final HashMap<C4441c, C4440b> f11695g;

    /* renamed from: h */
    private final Set<C4441c> f11696h;

    /* renamed from: j */
    private boolean f11698j;

    /* renamed from: k */
    private InterfaceC7472x f11699k;

    /* renamed from: i */
    private InterfaceC10327o0 f11697i = new InterfaceC10327o0.C10328a(0);

    /* renamed from: b */
    private final IdentityHashMap<InterfaceC10329p, C4441c> f11690b = new IdentityHashMap<>();

    /* renamed from: c */
    private final Map<Object, C4441c> f11691c = new HashMap();

    /* renamed from: a */
    private final List<C4441c> f11689a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.q0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C4439a implements InterfaceC10353z, InterfaceC11045v {

        /* renamed from: j */
        private final C4441c f11700j;

        /* renamed from: k */
        private InterfaceC10353z.C10354a f11701k;

        /* renamed from: l */
        private InterfaceC11045v.C11046a f11702l;

        public C4439a(C4441c c4441c) {
            this.f11701k = C4438q0.this.f11693e;
            this.f11702l = C4438q0.this.f11694f;
            this.f11700j = c4441c;
        }

        /* renamed from: a */
        private boolean m29177a(int i, InterfaceC10341s.C10342a c10342a) {
            InterfaceC10341s.C10342a c10342a2;
            if (c10342a != null) {
                c10342a2 = C4438q0.m29190n(this.f11700j, c10342a);
                if (c10342a2 == null) {
                    return false;
                }
            } else {
                c10342a2 = null;
            }
            int m29186r = C4438q0.m29186r(this.f11700j, i);
            InterfaceC10353z.C10354a c10354a = this.f11701k;
            if (c10354a.f27085a != m29186r || !C9191p0.m16257c(c10354a.f27086b, c10342a2)) {
                this.f11701k = C4438q0.this.f11693e.m11706F(m29186r, c10342a2, 0L);
            }
            InterfaceC11045v.C11046a c11046a = this.f11702l;
            if (c11046a.f28909a != m29186r || !C9191p0.m16257c(c11046a.f28910b, c10342a2)) {
                this.f11702l = C4438q0.this.f11694f.m9270t(m29186r, c10342a2);
                return true;
            }
            return true;
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: A */
        public void mo11717A(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m29177a(i, c10342a)) {
                this.f11701k.m11684v(loadEventInfo, mediaLoadData);
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: B */
        public void mo11716B(int i, InterfaceC10341s.C10342a c10342a, MediaLoadData mediaLoadData) {
            if (m29177a(i, c10342a)) {
                this.f11701k.m11696j(mediaLoadData);
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: D */
        public void mo9295D(int i, InterfaceC10341s.C10342a c10342a, Exception exc) {
            if (m29177a(i, c10342a)) {
                this.f11702l.m9278l(exc);
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: b */
        public void mo11715b(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m29177a(i, c10342a)) {
                this.f11701k.m11710B(loadEventInfo, mediaLoadData);
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: e */
        public void mo9294e(int i, InterfaceC10341s.C10342a c10342a) {
            if (m29177a(i, c10342a)) {
                this.f11702l.m9277m();
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: i */
        public void mo11714i(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (m29177a(i, c10342a)) {
                this.f11701k.m11681y(loadEventInfo, mediaLoadData, iOException, z);
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: n */
        public void mo11713n(int i, InterfaceC10341s.C10342a c10342a, MediaLoadData mediaLoadData) {
            if (m29177a(i, c10342a)) {
                this.f11701k.m11707E(mediaLoadData);
            }
        }

        @Override // p229m7.InterfaceC10353z
        /* renamed from: o */
        public void mo11712o(int i, InterfaceC10341s.C10342a c10342a, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m29177a(i, c10342a)) {
                this.f11701k.m11687s(loadEventInfo, mediaLoadData);
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: t */
        public void mo9293t(int i, InterfaceC10341s.C10342a c10342a) {
            if (m29177a(i, c10342a)) {
                this.f11702l.m9280j();
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: u */
        public void mo9292u(int i, InterfaceC10341s.C10342a c10342a) {
            if (m29177a(i, c10342a)) {
                this.f11702l.m9279k();
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: v */
        public void mo9291v(int i, InterfaceC10341s.C10342a c10342a) {
            if (m29177a(i, c10342a)) {
                this.f11702l.m9281i();
            }
        }

        @Override // p259o6.InterfaceC11045v
        /* renamed from: z */
        public void mo9290z(int i, InterfaceC10341s.C10342a c10342a) {
            if (m29177a(i, c10342a)) {
                this.f11702l.m9282h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.q0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4440b {

        /* renamed from: a */
        public final InterfaceC10341s f11704a;

        /* renamed from: b */
        public final InterfaceC10341s.InterfaceC10343b f11705b;

        /* renamed from: c */
        public final InterfaceC10353z f11706c;

        public C4440b(InterfaceC10341s interfaceC10341s, InterfaceC10341s.InterfaceC10343b interfaceC10343b, InterfaceC10353z interfaceC10353z) {
            this.f11704a = interfaceC10341s;
            this.f11705b = interfaceC10343b;
            this.f11706c = interfaceC10353z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.q0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4441c implements InterfaceC4434o0 {

        /* renamed from: a */
        public final C10324o f11707a;

        /* renamed from: d */
        public int f11710d;

        /* renamed from: e */
        public boolean f11711e;

        /* renamed from: c */
        public final List<InterfaceC10341s.C10342a> f11709c = new ArrayList();

        /* renamed from: b */
        public final Object f11708b = new Object();

        public C4441c(InterfaceC10341s interfaceC10341s, boolean z) {
            this.f11707a = new C10324o(interfaceC10341s, z);
        }

        @Override // com.google.android.exoplayer2.InterfaceC4434o0
        /* renamed from: a */
        public Object mo29176a() {
            return this.f11708b;
        }

        @Override // com.google.android.exoplayer2.InterfaceC4434o0
        /* renamed from: b */
        public Timeline mo29175b() {
            return this.f11707a.m11774O();
        }

        /* renamed from: c */
        public void m29174c(int i) {
            this.f11710d = i;
            this.f11711e = false;
            this.f11709c.clear();
        }
    }

    /* renamed from: com.google.android.exoplayer2.q0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4442d {
        /* renamed from: c */
        void mo29173c();
    }

    public C4438q0(InterfaceC4442d interfaceC4442d, C4382a c4382a, Handler handler) {
        this.f11692d = interfaceC4442d;
        InterfaceC10353z.C10354a c10354a = new InterfaceC10353z.C10354a();
        this.f11693e = c10354a;
        InterfaceC11045v.C11046a c11046a = new InterfaceC11045v.C11046a();
        this.f11694f = c11046a;
        this.f11695g = new HashMap<>();
        this.f11696h = new HashSet();
        if (c4382a != null) {
            c10354a.m11699g(handler, c4382a);
            c11046a.m9283g(handler, c4382a);
        }
    }

    /* renamed from: B */
    private void m29206B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C4441c remove = this.f11689a.remove(i3);
            this.f11691c.remove(remove.f11708b);
            m29197g(i3, -remove.f11707a.m11774O().mo11753p());
            remove.f11711e = true;
            if (this.f11698j) {
                m29183u(remove);
            }
        }
    }

    /* renamed from: g */
    private void m29197g(int i, int i2) {
        while (i < this.f11689a.size()) {
            this.f11689a.get(i).f11710d += i2;
            i++;
        }
    }

    /* renamed from: j */
    private void m29194j(C4441c c4441c) {
        C4440b c4440b = this.f11695g.get(c4441c);
        if (c4440b != null) {
            c4440b.f11704a.mo11724r(c4440b.f11705b);
        }
    }

    /* renamed from: k */
    private void m29193k() {
        Iterator<C4441c> it = this.f11696h.iterator();
        while (it.hasNext()) {
            C4441c next = it.next();
            if (next.f11709c.isEmpty()) {
                m29194j(next);
                it.remove();
            }
        }
    }

    /* renamed from: l */
    private void m29192l(C4441c c4441c) {
        this.f11696h.add(c4441c);
        C4440b c4440b = this.f11695g.get(c4441c);
        if (c4440b != null) {
            c4440b.f11704a.mo11734c(c4440b.f11705b);
        }
    }

    /* renamed from: m */
    private static Object m29191m(Object obj) {
        return AbstractC4380a.m29710v(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static InterfaceC10341s.C10342a m29190n(C4441c c4441c, InterfaceC10341s.C10342a c10342a) {
        for (int i = 0; i < c4441c.f11709c.size(); i++) {
            if (c4441c.f11709c.get(i).f27019d == c10342a.f27019d) {
                return c10342a.m11723c(m29188p(c4441c, c10342a.f27016a));
            }
        }
        return null;
    }

    /* renamed from: o */
    private static Object m29189o(Object obj) {
        return AbstractC4380a.m29709w(obj);
    }

    /* renamed from: p */
    private static Object m29188p(C4441c c4441c, Object obj) {
        return AbstractC4380a.m29708y(c4441c.f11708b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static int m29186r(C4441c c4441c, int i) {
        return i + c4441c.f11710d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m29184t(InterfaceC10341s interfaceC10341s, Timeline timeline) {
        this.f11692d.mo29173c();
    }

    /* renamed from: u */
    private void m29183u(C4441c c4441c) {
        if (c4441c.f11711e && c4441c.f11709c.isEmpty()) {
            C4440b c4440b = (C4440b) C9149a.m16448e(this.f11695g.remove(c4441c));
            c4440b.f11704a.mo11736a(c4440b.f11705b);
            c4440b.f11704a.mo11733d(c4440b.f11706c);
            this.f11696h.remove(c4441c);
        }
    }

    /* renamed from: x */
    private void m29180x(C4441c c4441c) {
        C10324o c10324o = c4441c.f11707a;
        InterfaceC10341s.InterfaceC10343b interfaceC10343b = new InterfaceC10341s.InterfaceC10343b() { // from class: com.google.android.exoplayer2.p0
            @Override // p229m7.InterfaceC10341s.InterfaceC10343b
            /* renamed from: a */
            public final void mo11722a(InterfaceC10341s interfaceC10341s, Timeline timeline) {
                C4438q0.this.m29184t(interfaceC10341s, timeline);
            }
        };
        C4439a c4439a = new C4439a(c4441c);
        this.f11695g.put(c4441c, new C4440b(c10324o, interfaceC10343b, c4439a));
        c10324o.mo11735b(C9191p0.m16211z(), c4439a);
        c10324o.mo11729l(C9191p0.m16211z(), c4439a);
        c10324o.mo11730i(interfaceC10343b, this.f11699k);
    }

    /* renamed from: A */
    public Timeline m29207A(int i, int i2, InterfaceC10327o0 interfaceC10327o0) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= m29187q()) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f11697i = interfaceC10327o0;
        m29206B(i, i2);
        return m29195i();
    }

    /* renamed from: C */
    public Timeline m29205C(List<C4441c> list, InterfaceC10327o0 interfaceC10327o0) {
        m29206B(0, this.f11689a.size());
        return m29198f(this.f11689a.size(), list, interfaceC10327o0);
    }

    /* renamed from: D */
    public Timeline m29204D(InterfaceC10327o0 interfaceC10327o0) {
        int m29187q = m29187q();
        if (interfaceC10327o0.getLength() != m29187q) {
            interfaceC10327o0 = interfaceC10327o0.mo11763e().mo11761g(0, m29187q);
        }
        this.f11697i = interfaceC10327o0;
        return m29195i();
    }

    /* renamed from: f */
    public Timeline m29198f(int i, List<C4441c> list, InterfaceC10327o0 interfaceC10327o0) {
        if (!list.isEmpty()) {
            this.f11697i = interfaceC10327o0;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C4441c c4441c = list.get(i2 - i);
                if (i2 > 0) {
                    C4441c c4441c2 = this.f11689a.get(i2 - 1);
                    c4441c.m29174c(c4441c2.f11710d + c4441c2.f11707a.m11774O().mo11753p());
                } else {
                    c4441c.m29174c(0);
                }
                m29197g(i2, c4441c.f11707a.m11774O().mo11753p());
                this.f11689a.add(i2, c4441c);
                this.f11691c.put(c4441c.f11708b, c4441c);
                if (this.f11698j) {
                    m29180x(c4441c);
                    if (this.f11690b.isEmpty()) {
                        this.f11696h.add(c4441c);
                    } else {
                        m29194j(c4441c);
                    }
                }
            }
        }
        return m29195i();
    }

    /* renamed from: h */
    public InterfaceC10329p m29196h(InterfaceC10341s.C10342a c10342a, InterfaceC7440b interfaceC7440b, long j) {
        Object m29189o = m29189o(c10342a.f27016a);
        InterfaceC10341s.C10342a m11723c = c10342a.m11723c(m29191m(c10342a.f27016a));
        C4441c c4441c = (C4441c) C9149a.m16448e(this.f11691c.get(m29189o));
        m29192l(c4441c);
        c4441c.f11709c.add(m11723c);
        C10321n mo11731g = c4441c.f11707a.mo11731g(m11723c, interfaceC7440b, j);
        this.f11690b.put(mo11731g, c4441c);
        m29193k();
        return mo11731g;
    }

    /* renamed from: i */
    public Timeline m29195i() {
        if (this.f11689a.isEmpty()) {
            return Timeline.f11370a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f11689a.size(); i2++) {
            C4441c c4441c = this.f11689a.get(i2);
            c4441c.f11710d = i;
            i += c4441c.f11707a.m11774O().mo11753p();
        }
        return new C4481t0(this.f11689a, this.f11697i);
    }

    /* renamed from: q */
    public int m29187q() {
        return this.f11689a.size();
    }

    /* renamed from: s */
    public boolean m29185s() {
        return this.f11698j;
    }

    /* renamed from: v */
    public Timeline m29182v(int i, int i2, int i3, InterfaceC10327o0 interfaceC10327o0) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= m29187q() && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f11697i = interfaceC10327o0;
        if (i != i2 && i != i3) {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = this.f11689a.get(min).f11710d;
            C9191p0.m16216w0(this.f11689a, i, i2, i3);
            while (min <= max) {
                C4441c c4441c = this.f11689a.get(min);
                c4441c.f11710d = i4;
                i4 += c4441c.f11707a.m11774O().mo11753p();
                min++;
            }
            return m29195i();
        }
        return m29195i();
    }

    /* renamed from: w */
    public void m29181w(InterfaceC7472x interfaceC7472x) {
        C9149a.m16447f(!this.f11698j);
        this.f11699k = interfaceC7472x;
        for (int i = 0; i < this.f11689a.size(); i++) {
            C4441c c4441c = this.f11689a.get(i);
            m29180x(c4441c);
            this.f11696h.add(c4441c);
        }
        this.f11698j = true;
    }

    /* renamed from: y */
    public void m29179y() {
        for (C4440b c4440b : this.f11695g.values()) {
            try {
                c4440b.f11704a.mo11736a(c4440b.f11705b);
            } catch (RuntimeException e) {
                C9197r.m16182d("MediaSourceList", "Failed to release child source.", e);
            }
            c4440b.f11704a.mo11733d(c4440b.f11706c);
        }
        this.f11695g.clear();
        this.f11696h.clear();
        this.f11698j = false;
    }

    /* renamed from: z */
    public void m29178z(InterfaceC10329p interfaceC10329p) {
        C4441c c4441c = (C4441c) C9149a.m16448e(this.f11690b.remove(interfaceC10329p));
        c4441c.f11707a.mo11725q(interfaceC10329p);
        c4441c.f11709c.remove(((C10321n) interfaceC10329p).f26979j);
        if (!this.f11690b.isEmpty()) {
            m29193k();
        }
        m29183u(c4441c);
    }
}
