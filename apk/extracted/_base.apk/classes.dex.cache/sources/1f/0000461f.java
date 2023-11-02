package p271oi;

import java.util.List;
import kotlin.jvm.internal.C9612q;
import p271oi.AbstractC11134g;
import p305qg.InterfaceC11998y;

/* renamed from: oi.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11126b {
    /* renamed from: a */
    public final AbstractC11134g m9117a(InterfaceC11998y functionDescriptor) {
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        for (C11138h c11138h : mo9096b()) {
            if (c11138h.m9109b(functionDescriptor)) {
                return c11138h.m9110a(functionDescriptor);
            }
        }
        return AbstractC11134g.C11135a.f29110b;
    }

    /* renamed from: b */
    public abstract List<C11138h> mo9096b();
}