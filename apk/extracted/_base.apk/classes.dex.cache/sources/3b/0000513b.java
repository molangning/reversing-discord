package p407wg;

import gh.InterfaceC6760a;
import gh.InterfaceC6785v;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import ng.EnumC10876i;
import p449yh.EnumC14028e;

/* renamed from: wg.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13579x extends AbstractC13581z implements InterfaceC6785v {

    /* renamed from: b */
    private final Class<?> f34962b;

    /* renamed from: c */
    private final Collection<InterfaceC6760a> f34963c;

    /* renamed from: d */
    private final boolean f34964d;

    public C13579x(Class<?> reflectType) {
        List m14104i;
        C9612q.m13917h(reflectType, "reflectType");
        this.f34962b = reflectType;
        m14104i = C9545j.m14104i();
        this.f34963c = m14104i;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: D */
    public boolean mo2164D() {
        return this.f34964d;
    }

    @Override // p407wg.AbstractC13581z
    /* renamed from: Q */
    public Class<?> mo2160P() {
        return this.f34962b;
    }

    @Override // gh.InterfaceC6766d
    public Collection<InterfaceC6760a> getAnnotations() {
        return this.f34963c;
    }

    @Override // gh.InterfaceC6785v
    public EnumC10876i getType() {
        if (C9612q.m13922c(mo2160P(), Void.TYPE)) {
            return null;
        }
        return EnumC14028e.m879b(mo2160P().getName()).m875f();
    }
}