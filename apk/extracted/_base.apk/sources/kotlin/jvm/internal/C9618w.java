package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9618w extends AbstractC9617v {
    public C9618w(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(AbstractC9587e.NO_RECEIVER, ((InterfaceC9592g) kDeclarationContainer).mo13896e(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // p140hg.InterfaceC7139h
    public Object get(Object obj) {
        return mo13882f().call(obj);
    }

    public C9618w(Class cls, String str, String str2, int i) {
        super(AbstractC9587e.NO_RECEIVER, cls, str, str2, i);
    }
}
