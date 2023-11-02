package p206l1;

import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6536p;
import p111g1.InterfaceC6521c;
import p188k1.C9038b;
import p188k1.C9048l;
import p223m1.AbstractC10231b;

/* renamed from: l1.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10019l implements InterfaceC10007c {

    /* renamed from: a */
    private final String f26024a;

    /* renamed from: b */
    private final C9038b f26025b;

    /* renamed from: c */
    private final C9038b f26026c;

    /* renamed from: d */
    private final C9048l f26027d;

    /* renamed from: e */
    private final boolean f26028e;

    public C10019l(String str, C9038b c9038b, C9038b c9038b2, C9048l c9048l, boolean z) {
        this.f26024a = str;
        this.f26025b = c9038b;
        this.f26026c = c9038b2;
        this.f26027d = c9048l;
        this.f26028e = z;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6536p(c6059j0, abstractC10231b, this);
    }

    /* renamed from: b */
    public C9038b m12561b() {
        return this.f26025b;
    }

    /* renamed from: c */
    public String m12560c() {
        return this.f26024a;
    }

    /* renamed from: d */
    public C9038b m12559d() {
        return this.f26026c;
    }

    /* renamed from: e */
    public C9048l m12558e() {
        return this.f26027d;
    }

    /* renamed from: f */
    public boolean m12557f() {
        return this.f26028e;
    }
}