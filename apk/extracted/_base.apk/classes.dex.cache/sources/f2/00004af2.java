package p305qg;

import kotlin.jvm.internal.C9612q;

/* renamed from: qg.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC11970r extends AbstractC11988u {

    /* renamed from: a */
    private final AbstractC11963n1 f30962a;

    public AbstractC11970r(AbstractC11963n1 delegate) {
        C9612q.m13917h(delegate, "delegate");
        this.f30962a = delegate;
    }

    @Override // p305qg.AbstractC11988u
    /* renamed from: b */
    public AbstractC11963n1 mo6656b() {
        return this.f30962a;
    }

    @Override // p305qg.AbstractC11988u
    /* renamed from: c */
    public String mo6655c() {
        return mo6656b().mo3568b();
    }

    @Override // p305qg.AbstractC11988u
    /* renamed from: f */
    public AbstractC11988u mo6653f() {
        AbstractC11988u m6669j = C11974t.m6669j(mo6656b().mo3567d());
        C9612q.m13918g(m6669j, "toDescriptorVisibility(delegate.normalize())");
        return m6669j;
    }
}