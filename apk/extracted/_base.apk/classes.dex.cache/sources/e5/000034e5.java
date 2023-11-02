package p125h1;

import android.graphics.Color;
import android.graphics.Paint;
import p125h1.AbstractC6861a;
import p223m1.AbstractC10231b;
import p254o1.C10953j;
import p311r1.C12021b;
import p311r1.C12022c;

/* renamed from: h1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6869c implements AbstractC6861a.InterfaceC6863b {

    /* renamed from: a */
    private final AbstractC6861a.InterfaceC6863b f19127a;

    /* renamed from: b */
    private final AbstractC6861a<Integer, Integer> f19128b;

    /* renamed from: c */
    private final AbstractC6861a<Float, Float> f19129c;

    /* renamed from: d */
    private final AbstractC6861a<Float, Float> f19130d;

    /* renamed from: e */
    private final AbstractC6861a<Float, Float> f19131e;

    /* renamed from: f */
    private final AbstractC6861a<Float, Float> f19132f;

    /* renamed from: g */
    private boolean f19133g = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C6870a extends C12022c<Float> {

        /* renamed from: d */
        final /* synthetic */ C12022c f19134d;

        C6870a(C12022c c12022c) {
            C6869c.this = r1;
            this.f19134d = c12022c;
        }

        @Override // p311r1.C12022c
        /* renamed from: d */
        public Float mo6568a(C12021b<Float> c12021b) {
            Float f = (Float) this.f19134d.mo6568a(c12021b);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public C6869c(AbstractC6861a.InterfaceC6863b interfaceC6863b, AbstractC10231b abstractC10231b, C10953j c10953j) {
        this.f19127a = interfaceC6863b;
        AbstractC6861a<Integer, Integer> mo16817a = c10953j.m9480a().mo16817a();
        this.f19128b = mo16817a;
        mo16817a.m21774a(this);
        abstractC10231b.m12102j(mo16817a);
        AbstractC6861a<Float, Float> mo16817a2 = c10953j.m9477d().mo16817a();
        this.f19129c = mo16817a2;
        mo16817a2.m21774a(this);
        abstractC10231b.m12102j(mo16817a2);
        AbstractC6861a<Float, Float> mo16817a3 = c10953j.m9479b().mo16817a();
        this.f19130d = mo16817a3;
        mo16817a3.m21774a(this);
        abstractC10231b.m12102j(mo16817a3);
        AbstractC6861a<Float, Float> mo16817a4 = c10953j.m9478c().mo16817a();
        this.f19131e = mo16817a4;
        mo16817a4.m21774a(this);
        abstractC10231b.m12102j(mo16817a4);
        AbstractC6861a<Float, Float> mo16817a5 = c10953j.m9476e().mo16817a();
        this.f19132f = mo16817a5;
        mo16817a5.m21774a(this);
        abstractC10231b.m12102j(mo16817a5);
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        this.f19133g = true;
        this.f19127a.mo12107a();
    }

    /* renamed from: b */
    public void m21756b(Paint paint) {
        if (!this.f19133g) {
            return;
        }
        this.f19133g = false;
        double floatValue = this.f19130d.mo21712h().floatValue() * 0.017453292519943295d;
        float floatValue2 = this.f19131e.mo21712h().floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = this.f19128b.mo21712h().intValue();
        paint.setShadowLayer(this.f19132f.mo21712h().floatValue(), sin, cos, Color.argb(Math.round(this.f19129c.mo21712h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    /* renamed from: c */
    public void m21755c(C12022c<Integer> c12022c) {
        this.f19128b.m21767n(c12022c);
    }

    /* renamed from: d */
    public void m21754d(C12022c<Float> c12022c) {
        this.f19130d.m21767n(c12022c);
    }

    /* renamed from: e */
    public void m21753e(C12022c<Float> c12022c) {
        this.f19131e.m21767n(c12022c);
    }

    /* renamed from: f */
    public void m21752f(C12022c<Float> c12022c) {
        if (c12022c == null) {
            this.f19129c.m21767n(null);
        } else {
            this.f19129c.m21767n(new C6870a(c12022c));
        }
    }

    /* renamed from: g */
    public void m21751g(C12022c<Float> c12022c) {
        this.f19132f.m21767n(c12022c);
    }
}