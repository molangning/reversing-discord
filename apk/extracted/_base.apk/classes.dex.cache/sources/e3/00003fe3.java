package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import p140hg.InterfaceC7139h;

/* renamed from: kotlin.jvm.internal.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9582b0 extends AbstractC9586d0 implements InterfaceC7139h {
    public AbstractC9582b0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.AbstractC9587e
    protected KCallable computeReflected() {
        return C9591f0.m13964g(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: f */
    public InterfaceC7139h.InterfaceC7140a mo13882f() {
        return ((InterfaceC7139h) getReflected()).mo13882f();
    }
}