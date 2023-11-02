package p407wg;

import gh.InterfaceC6777n;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C9612q;
import p407wg.AbstractC13581z;

/* renamed from: wg.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13573r extends AbstractC13575t implements InterfaceC6777n {

    /* renamed from: a */
    private final Field f34958a;

    public C13573r(Field member) {
        C9612q.m13917h(member, "member");
        this.f34958a = member;
    }

    @Override // gh.InterfaceC6777n
    /* renamed from: I */
    public boolean mo2181I() {
        return mo2162Q().isEnumConstant();
    }

    @Override // gh.InterfaceC6777n
    /* renamed from: N */
    public boolean mo2180N() {
        return false;
    }

    @Override // p407wg.AbstractC13575t
    /* renamed from: S */
    public Field mo2162Q() {
        return this.f34958a;
    }

    @Override // gh.InterfaceC6777n
    /* renamed from: T */
    public AbstractC13581z getType() {
        AbstractC13581z.C13582a c13582a = AbstractC13581z.f34966a;
        Type genericType = mo2162Q().getGenericType();
        C9612q.m13918g(genericType, "member.genericType");
        return c13582a.m2158a(genericType);
    }
}