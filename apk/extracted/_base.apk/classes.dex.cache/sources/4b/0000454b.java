package ni;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p161ii.InterfaceC7587e;
import p305qg.InterfaceC11920f1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ni.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10914c {

    /* renamed from: a */
    private final InterfaceC11920f1 f28640a;

    /* renamed from: b */
    private final AbstractC7264g0 f28641b;

    /* renamed from: c */
    private final AbstractC7264g0 f28642c;

    public C10914c(InterfaceC11920f1 typeParameter, AbstractC7264g0 inProjection, AbstractC7264g0 outProjection) {
        C9612q.m13917h(typeParameter, "typeParameter");
        C9612q.m13917h(inProjection, "inProjection");
        C9612q.m13917h(outProjection, "outProjection");
        this.f28640a = typeParameter;
        this.f28641b = inProjection;
        this.f28642c = outProjection;
    }

    /* renamed from: a */
    public final AbstractC7264g0 m9560a() {
        return this.f28641b;
    }

    /* renamed from: b */
    public final AbstractC7264g0 m9559b() {
        return this.f28642c;
    }

    /* renamed from: c */
    public final InterfaceC11920f1 m9558c() {
        return this.f28640a;
    }

    /* renamed from: d */
    public final boolean m9557d() {
        return InterfaceC7587e.f20880a.mo20256b(this.f28641b, this.f28642c);
    }
}