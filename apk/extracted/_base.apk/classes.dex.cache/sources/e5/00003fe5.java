package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9584c0 extends AbstractC9582b0 {
    public C9584c0(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(AbstractC9587e.NO_RECEIVER, ((InterfaceC9592g) kDeclarationContainer).mo13896e(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // p140hg.InterfaceC7139h
    public Object get(Object obj) {
        return mo13882f().call(obj);
    }
}