package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import p140hg.InterfaceC7137g;

/* renamed from: kotlin.jvm.internal.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9621z extends AbstractC9586d0 implements InterfaceC7137g {
    public AbstractC9621z(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.AbstractC9587e
    protected KCallable computeReflected() {
        return C9591f0.m13965f(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: f */
    public InterfaceC7137g.InterfaceC7138a mo13882f() {
        return ((InterfaceC7137g) getReflected()).mo13882f();
    }
}
