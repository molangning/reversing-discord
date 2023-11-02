package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import p140hg.InterfaceC7133e;
import p140hg.InterfaceC7139h;

/* renamed from: kotlin.jvm.internal.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9617v extends AbstractC9619x implements InterfaceC7133e {
    public AbstractC9617v(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.AbstractC9587e
    protected KCallable computeReflected() {
        return C9591f0.m13966e(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: f */
    public InterfaceC7139h.InterfaceC7140a mo13882f() {
        return ((InterfaceC7133e) getReflected()).mo13882f();
    }

    @Override // p140hg.InterfaceC7131d
    /* renamed from: h */
    public InterfaceC7133e.InterfaceC7134a mo13897h() {
        return ((InterfaceC7133e) getReflected()).mo13897h();
    }
}
