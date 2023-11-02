package p029b9;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p010a9.InterfaceC0097d;
import p010a9.InterfaceC0105h;
import p441y8.C13934e;
import p461z8.AbstractC14124f;
import p461z8.C14107a;

/* renamed from: b9.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC2168g<T extends IInterface> extends AbstractC2150c<T> implements C14107a.InterfaceC14116f {

    /* renamed from: O */
    private final C2158d f6133O;

    /* renamed from: P */
    private final Set<Scope> f6134P;

    /* renamed from: Q */
    private final Account f6135Q;

    @Deprecated
    public AbstractC2168g(Context context, Looper looper, int i, C2158d c2158d, AbstractC14124f.InterfaceC14125a interfaceC14125a, AbstractC14124f.InterfaceC14126b interfaceC14126b) {
        this(context, looper, i, c2158d, (InterfaceC0097d) interfaceC14125a, (InterfaceC0105h) interfaceC14126b);
    }

    /* renamed from: j0 */
    private final Set<Scope> m34042j0(Set<Scope> set) {
        Set<Scope> m34043i0 = m34043i0(set);
        for (Scope scope : m34043i0) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return m34043i0;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: B */
    protected final Set<Scope> mo34045B() {
        return this.f6134P;
    }

    /* renamed from: h0 */
    public final C2158d m34044h0() {
        return this.f6133O;
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: i */
    public Set<Scope> mo641i() {
        return mo642g() ? this.f6134P : Collections.emptySet();
    }

    /* renamed from: i0 */
    protected Set<Scope> m34043i0(Set<Scope> set) {
        return set;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: t */
    public final Account mo34041t() {
        return this.f6135Q;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: v */
    protected final Executor mo34040v() {
        return null;
    }

    public AbstractC2168g(Context context, Looper looper, int i, C2158d c2158d, InterfaceC0097d interfaceC0097d, InterfaceC0105h interfaceC0105h) {
        this(context, looper, AbstractC2171h.m34037b(context), C13934e.m1136k(), i, c2158d, (InterfaceC0097d) C2198p.m33985j(interfaceC0097d), (InterfaceC0105h) C2198p.m33985j(interfaceC0105h));
    }

    protected AbstractC2168g(Context context, Looper looper, AbstractC2171h abstractC2171h, C13934e c13934e, int i, C2158d c2158d, InterfaceC0097d interfaceC0097d, InterfaceC0105h interfaceC0105h) {
        super(context, looper, abstractC2171h, c13934e, i, interfaceC0097d == null ? null : new C2166f0(interfaceC0097d), interfaceC0105h == null ? null : new C2169g0(interfaceC0105h), c2158d.m34064j());
        this.f6133O = c2158d;
        this.f6135Q = c2158d.m34073a();
        this.f6134P = m34042j0(c2158d.m34070d());
    }
}