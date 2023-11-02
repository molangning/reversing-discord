package p161ii;

import kotlin.jvm.internal.C9612q;
import p142hi.C7244f1;
import p161ii.AbstractC7589f;
import p161ii.AbstractC7592g;

/* renamed from: ii.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7581a {
    /* renamed from: a */
    public static final C7244f1 m20362a(boolean z, boolean z2, InterfaceC7582b typeSystemContext, AbstractC7589f kotlinTypePreparator, AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(typeSystemContext, "typeSystemContext");
        C9612q.m13917h(kotlinTypePreparator, "kotlinTypePreparator");
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C7244f1(z, z2, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    /* renamed from: b */
    public static /* synthetic */ C7244f1 m20361b(boolean z, boolean z2, InterfaceC7582b interfaceC7582b, AbstractC7589f abstractC7589f, AbstractC7592g abstractC7592g, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            interfaceC7582b = C7608q.f20908a;
        }
        if ((i & 8) != 0) {
            abstractC7589f = AbstractC7589f.C7590a.f20881a;
        }
        if ((i & 16) != 0) {
            abstractC7592g = AbstractC7592g.C7593a.f20882a;
        }
        return m20362a(z, z2, interfaceC7582b, abstractC7589f, abstractC7592g);
    }
}