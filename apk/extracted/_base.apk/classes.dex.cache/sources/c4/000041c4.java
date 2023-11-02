package p206l1;

import android.graphics.PointF;
import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6535o;
import p111g1.InterfaceC6521c;
import p188k1.C9038b;
import p188k1.InterfaceC9049m;
import p223m1.AbstractC10231b;

/* renamed from: l1.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10018k implements InterfaceC10007c {

    /* renamed from: a */
    private final String f26019a;

    /* renamed from: b */
    private final InterfaceC9049m<PointF, PointF> f26020b;

    /* renamed from: c */
    private final InterfaceC9049m<PointF, PointF> f26021c;

    /* renamed from: d */
    private final C9038b f26022d;

    /* renamed from: e */
    private final boolean f26023e;

    public C10018k(String str, InterfaceC9049m<PointF, PointF> interfaceC9049m, InterfaceC9049m<PointF, PointF> interfaceC9049m2, C9038b c9038b, boolean z) {
        this.f26019a = str;
        this.f26020b = interfaceC9049m;
        this.f26021c = interfaceC9049m2;
        this.f26022d = c9038b;
        this.f26023e = z;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6535o(c6059j0, abstractC10231b, this);
    }

    /* renamed from: b */
    public C9038b m12566b() {
        return this.f26022d;
    }

    /* renamed from: c */
    public String m12565c() {
        return this.f26019a;
    }

    /* renamed from: d */
    public InterfaceC9049m<PointF, PointF> m12564d() {
        return this.f26020b;
    }

    /* renamed from: e */
    public InterfaceC9049m<PointF, PointF> m12563e() {
        return this.f26021c;
    }

    /* renamed from: f */
    public boolean m12562f() {
        return this.f26023e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f26020b + ", size=" + this.f26021c + '}';
    }
}