package p125h1;

import java.util.List;
import p167j1.C8780b;
import p311r1.C12020a;
import p311r1.C12021b;
import p311r1.C12022c;

/* renamed from: h1.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6882o extends AbstractC6874g<C8780b> {

    /* renamed from: h1.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C6883a extends C12022c<C8780b> {

        /* renamed from: d */
        final /* synthetic */ C12021b f19157d;

        /* renamed from: e */
        final /* synthetic */ C12022c f19158e;

        /* renamed from: f */
        final /* synthetic */ C8780b f19159f;

        C6883a(C12021b c12021b, C12022c c12022c, C8780b c8780b) {
            this.f19157d = c12021b;
            this.f19158e = c12022c;
            this.f19159f = c8780b;
        }

        @Override // p311r1.C12022c
        /* renamed from: d */
        public C8780b mo6568a(C12021b<C8780b> c12021b) {
            C8780b m6570g;
            this.f19157d.m6569h(c12021b.m6571f(), c12021b.m6576a(), c12021b.m6570g().f23025a, c12021b.m6575b().f23025a, c12021b.m6573d(), c12021b.m6574c(), c12021b.m6572e());
            String str = (String) this.f19158e.mo6568a(this.f19157d);
            if (c12021b.m6574c() == 1.0f) {
                m6570g = c12021b.m6575b();
            } else {
                m6570g = c12021b.m6570g();
            }
            C8780b c8780b = m6570g;
            this.f19159f.m17269a(str, c8780b.f23026b, c8780b.f23027c, c8780b.f23028d, c8780b.f23029e, c8780b.f23030f, c8780b.f23031g, c8780b.f23032h, c8780b.f23033i, c8780b.f23034j, c8780b.f23035k, c8780b.f23036l, c8780b.f23037m);
            return this.f19159f;
        }
    }

    public C6882o(List<C12020a<C8780b>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p125h1.AbstractC6861a
    /* renamed from: p */
    public C8780b mo21711i(C12020a<C8780b> c12020a, float f) {
        C8780b c8780b;
        float floatValue;
        C8780b c8780b2;
        C12022c<A> c12022c = this.f19117e;
        if (c12022c != 0) {
            float f2 = c12020a.f31021g;
            Float f3 = c12020a.f31022h;
            if (f3 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f3.floatValue();
            }
            C8780b c8780b3 = c12020a.f31016b;
            C8780b c8780b4 = c8780b3;
            C8780b c8780b5 = c12020a.f31017c;
            if (c8780b5 == null) {
                c8780b2 = c8780b3;
            } else {
                c8780b2 = c8780b5;
            }
            return (C8780b) c12022c.m6567b(f2, floatValue, c8780b4, c8780b2, f, m21772d(), m21770f());
        } else if (f == 1.0f && (c8780b = c12020a.f31017c) != null) {
            return c8780b;
        } else {
            return c12020a.f31016b;
        }
    }

    /* renamed from: q */
    public void m21725q(C12022c<String> c12022c) {
        super.m21767n(new C6883a(new C12021b(), c12022c, new C8780b()));
    }
}
