package p125h1;

import java.util.Collections;
import p311r1.C12020a;
import p311r1.C12022c;

/* renamed from: h1.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6885q<K, A> extends AbstractC6861a<K, A> {

    /* renamed from: i */
    private final A f19175i;

    public C6885q(C12022c<A> c12022c) {
        this(c12022c, null);
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: c */
    float mo21713c() {
        return 1.0f;
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: h */
    public A mo21712h() {
        C12022c<A> c12022c = this.f19117e;
        A a = this.f19175i;
        return c12022c.m6567b(0.0f, 0.0f, a, a, m21770f(), m21770f(), m21770f());
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: i */
    A mo21711i(C12020a<K> c12020a, float f) {
        return mo21712h();
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: k */
    public void mo21710k() {
        if (this.f19117e != null) {
            super.mo21710k();
        }
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: m */
    public void mo21709m(float f) {
        this.f19116d = f;
    }

    public C6885q(C12022c<A> c12022c, A a) {
        super(Collections.emptyList());
        m21767n(c12022c);
        this.f19175i = a;
    }
}