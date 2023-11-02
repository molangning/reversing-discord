package ai;

import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* renamed from: ai.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C0192g extends AbstractC0179a {

    /* renamed from: b */
    private final InterfaceC6815i<InterfaceC0194h> f643b;

    /* renamed from: ai.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C0193a extends AbstractC9614s implements Function0<InterfaceC0194h> {

        /* renamed from: j */
        final /* synthetic */ Function0<InterfaceC0194h> f644j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0193a(Function0<? extends InterfaceC0194h> function0) {
            super(0);
            this.f644j = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC0194h invoke() {
            InterfaceC0194h invoke = this.f644j.invoke();
            if (invoke instanceof AbstractC0179a) {
                return ((AbstractC0179a) invoke).m41010h();
            }
            return invoke;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C0192g(gi.InterfaceC6821n r1, kotlin.jvm.functions.Function0 r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto Lb
            gi.n r1 = gi.C6795f.f19003e
            java.lang.String r3 = "NO_LOCKS"
            kotlin.jvm.internal.C9612q.m13918g(r1, r3)
        Lb:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.C0192g.<init>(gi.n, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0192g(Function0<? extends InterfaceC0194h> getScope) {
        this(null, getScope, 1, null);
        C9612q.m13917h(getScope, "getScope");
    }

    @Override // ai.AbstractC0179a
    /* renamed from: i */
    protected InterfaceC0194h mo40956i() {
        return this.f643b.invoke();
    }

    public C0192g(InterfaceC6821n storageManager, Function0<? extends InterfaceC0194h> getScope) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(getScope, "getScope");
        this.f643b = storageManager.mo21867c(new C0193a(getScope));
    }
}
