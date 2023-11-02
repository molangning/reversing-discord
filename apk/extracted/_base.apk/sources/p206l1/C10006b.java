package p206l1;

import android.graphics.PointF;
import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6524f;
import p111g1.InterfaceC6521c;
import p188k1.C9042f;
import p188k1.InterfaceC9049m;
import p223m1.AbstractC10231b;

/* renamed from: l1.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10006b implements InterfaceC10007c {

    /* renamed from: a */
    private final String f25953a;

    /* renamed from: b */
    private final InterfaceC9049m<PointF, PointF> f25954b;

    /* renamed from: c */
    private final C9042f f25955c;

    /* renamed from: d */
    private final boolean f25956d;

    /* renamed from: e */
    private final boolean f25957e;

    public C10006b(String str, InterfaceC9049m<PointF, PointF> interfaceC9049m, C9042f c9042f, boolean z, boolean z2) {
        this.f25953a = str;
        this.f25954b = interfaceC9049m;
        this.f25955c = c9042f;
        this.f25956d = z;
        this.f25957e = z2;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6524f(c6059j0, abstractC10231b, this);
    }

    /* renamed from: b */
    public String m12622b() {
        return this.f25953a;
    }

    /* renamed from: c */
    public InterfaceC9049m<PointF, PointF> m12621c() {
        return this.f25954b;
    }

    /* renamed from: d */
    public C9042f m12620d() {
        return this.f25955c;
    }

    /* renamed from: e */
    public boolean m12619e() {
        return this.f25957e;
    }

    /* renamed from: f */
    public boolean m12618f() {
        return this.f25956d;
    }
}
