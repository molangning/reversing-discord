package p329s;

import java.util.ArrayList;
import java.util.List;

/* renamed from: s.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12325f implements InterfaceC12323d {

    /* renamed from: d */
    AbstractC12335m f32133d;

    /* renamed from: f */
    int f32135f;

    /* renamed from: g */
    public int f32136g;

    /* renamed from: a */
    public InterfaceC12323d f32130a = null;

    /* renamed from: b */
    public boolean f32131b = false;

    /* renamed from: c */
    public boolean f32132c = false;

    /* renamed from: e */
    EnumC12326a f32134e = EnumC12326a.UNKNOWN;

    /* renamed from: h */
    int f32137h = 1;

    /* renamed from: i */
    C12327g f32138i = null;

    /* renamed from: j */
    public boolean f32139j = false;

    /* renamed from: k */
    List<InterfaceC12323d> f32140k = new ArrayList();

    /* renamed from: l */
    List<C12325f> f32141l = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC12326a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C12325f(AbstractC12335m abstractC12335m) {
        this.f32133d = abstractC12335m;
    }

    @Override // p329s.InterfaceC12323d
    /* renamed from: a */
    public void mo5465a(InterfaceC12323d interfaceC12323d) {
        for (C12325f c12325f : this.f32141l) {
            if (!c12325f.f32139j) {
                return;
            }
        }
        this.f32132c = true;
        InterfaceC12323d interfaceC12323d2 = this.f32130a;
        if (interfaceC12323d2 != null) {
            interfaceC12323d2.mo5465a(this);
        }
        if (this.f32131b) {
            this.f32133d.mo5465a(this);
            return;
        }
        C12325f c12325f2 = null;
        int i = 0;
        for (C12325f c12325f3 : this.f32141l) {
            if (!(c12325f3 instanceof C12327g)) {
                i++;
                c12325f2 = c12325f3;
            }
        }
        if (c12325f2 != null && i == 1 && c12325f2.f32139j) {
            C12327g c12327g = this.f32138i;
            if (c12327g != null) {
                if (c12327g.f32139j) {
                    this.f32135f = this.f32137h * c12327g.f32136g;
                } else {
                    return;
                }
            }
            mo5475d(c12325f2.f32136g + this.f32135f);
        }
        InterfaceC12323d interfaceC12323d3 = this.f32130a;
        if (interfaceC12323d3 != null) {
            interfaceC12323d3.mo5465a(this);
        }
    }

    /* renamed from: b */
    public void m5477b(InterfaceC12323d interfaceC12323d) {
        this.f32140k.add(interfaceC12323d);
        if (this.f32139j) {
            interfaceC12323d.mo5465a(interfaceC12323d);
        }
    }

    /* renamed from: c */
    public void m5476c() {
        this.f32141l.clear();
        this.f32140k.clear();
        this.f32139j = false;
        this.f32136g = 0;
        this.f32132c = false;
        this.f32131b = false;
    }

    /* renamed from: d */
    public void mo5475d(int i) {
        if (this.f32139j) {
            return;
        }
        this.f32139j = true;
        this.f32136g = i;
        for (InterfaceC12323d interfaceC12323d : this.f32140k) {
            interfaceC12323d.mo5465a(interfaceC12323d);
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32133d.f32166b.m39380p());
        sb2.append(":");
        sb2.append(this.f32134e);
        sb2.append("(");
        if (this.f32139j) {
            obj = Integer.valueOf(this.f32136g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f32141l.size());
        sb2.append(":d=");
        sb2.append(this.f32140k.size());
        sb2.append(">");
        return sb2.toString();
    }
}