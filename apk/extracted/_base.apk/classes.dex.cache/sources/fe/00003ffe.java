package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9609n extends C9605m {
    public C9609n(int i, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i, AbstractC9587e.NO_RECEIVER, ((InterfaceC9592g) kDeclarationContainer).mo13896e(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public C9609n(int i, Class cls, String str, String str2, int i2) {
        super(i, AbstractC9587e.NO_RECEIVER, cls, str, str2, i2);
    }

    public C9609n(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}