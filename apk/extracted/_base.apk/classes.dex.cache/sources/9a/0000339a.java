package p111g1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p073e1.C6059j0;
import p125h1.AbstractC6861a;
import p125h1.C6880m;
import p206l1.C10024q;
import p206l1.C10029s;
import p223m1.AbstractC10231b;

/* renamed from: g1.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6538r implements InterfaceC6532m, AbstractC6861a.InterfaceC6863b {

    /* renamed from: b */
    private final String f18555b;

    /* renamed from: c */
    private final boolean f18556c;

    /* renamed from: d */
    private final C6059j0 f18557d;

    /* renamed from: e */
    private final C6880m f18558e;

    /* renamed from: f */
    private boolean f18559f;

    /* renamed from: a */
    private final Path f18554a = new Path();

    /* renamed from: g */
    private final C6520b f18560g = new C6520b();

    public C6538r(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10024q c10024q) {
        this.f18555b = c10024q.m12540b();
        this.f18556c = c10024q.m12538d();
        this.f18557d = c6059j0;
        C6880m mo16817a = c10024q.m12539c().mo16817a();
        this.f18558e = mo16817a;
        abstractC10231b.m12102j(mo16817a);
        mo16817a.m21774a(this);
    }

    /* renamed from: d */
    private void m22428d() {
        this.f18559f = false;
        this.f18557d.invalidateSelf();
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        m22428d();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6521c interfaceC6521c = list.get(i);
            if (interfaceC6521c instanceof C6541u) {
                C6541u c6541u = (C6541u) interfaceC6521c;
                if (c6541u.m22422k() == C10029s.EnumC10030a.SIMULTANEOUSLY) {
                    this.f18560g.m22457a(c6541u);
                    c6541u.m22426d(this);
                }
            }
            if (interfaceC6521c instanceof InterfaceC6539s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((InterfaceC6539s) interfaceC6521c);
            }
        }
        this.f18558e.m21731q(arrayList);
    }

    @Override // p111g1.InterfaceC6532m
    /* renamed from: c */
    public Path mo22429c() {
        if (this.f18559f) {
            return this.f18554a;
        }
        this.f18554a.reset();
        if (this.f18556c) {
            this.f18559f = true;
            return this.f18554a;
        }
        Path mo21712h = this.f18558e.mo21712h();
        if (mo21712h == null) {
            return this.f18554a;
        }
        this.f18554a.set(mo21712h);
        this.f18554a.setFillType(Path.FillType.EVEN_ODD);
        this.f18560g.m22456b(this.f18554a);
        this.f18559f = true;
        return this.f18554a;
    }
}