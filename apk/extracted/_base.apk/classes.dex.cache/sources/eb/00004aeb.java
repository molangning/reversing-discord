package p305qg;

import kotlin.jvm.internal.C9612q;

/* renamed from: qg.n1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC11963n1 {

    /* renamed from: a */
    private final String f30960a;

    /* renamed from: b */
    private final boolean f30961b;

    public AbstractC11963n1(String name, boolean z) {
        C9612q.m13917h(name, "name");
        this.f30960a = name;
        this.f30961b = z;
    }

    /* renamed from: a */
    public Integer mo3569a(AbstractC11963n1 visibility) {
        C9612q.m13917h(visibility, "visibility");
        return C11949m1.f30945a.m6692a(this, visibility);
    }

    /* renamed from: b */
    public String mo3568b() {
        return this.f30960a;
    }

    /* renamed from: c */
    public final boolean m6688c() {
        return this.f30961b;
    }

    /* renamed from: d */
    public AbstractC11963n1 mo3567d() {
        return this;
    }

    public final String toString() {
        return mo3568b();
    }
}