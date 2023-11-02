package p269og;

import ai.AbstractC0188e;
import gi.InterfaceC6821n;
import java.util.List;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11998y;

/* renamed from: og.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11105d extends AbstractC0188e {

    /* renamed from: og.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C11106a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29072a;

        static {
            int[] iArr = new int[EnumC11102c.values().length];
            try {
                iArr[EnumC11102c.f29061o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11102c.f29062p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29072a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11105d(InterfaceC6821n storageManager, C11098b containingClass) {
        super(storageManager, containingClass);
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(containingClass, "containingClass");
    }

    @Override // ai.AbstractC0188e
    /* renamed from: i */
    protected List<InterfaceC11998y> mo7570i() {
        List<InterfaceC11998y> m14109d;
        List<InterfaceC11998y> m14109d2;
        List<InterfaceC11998y> m14104i;
        InterfaceC11914e m40976l = m40976l();
        C9612q.m13919f(m40976l, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i = C11106a.f29072a[((C11098b) m40976l).m9172U0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            m14109d2 = C9544i.m14109d(C11107e.f29073N.m9153a((C11098b) m40976l(), true));
            return m14109d2;
        }
        m14109d = C9544i.m14109d(C11107e.f29073N.m9153a((C11098b) m40976l(), false));
        return m14109d;
    }
}
