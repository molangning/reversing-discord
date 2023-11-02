package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import p470zi.C14278g;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001\u001a \u0010\u0007\u001a\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¨\u0006\b"}, m14357d2 = {"", "subClassName", "Lkotlin/reflect/KClass;", "baseClass", "", "a", "subClass", "b", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: cj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2568c {
    /* renamed from: a */
    public static final Void m32961a(String str, KClass<?> baseClass) {
        String str2;
        C9612q.m13917h(baseClass, "baseClass");
        String str3 = "in the scope of '" + baseClass.mo13883l() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.mo13883l() + "' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '" + str + "' explicitly in a corresponding SerializersModule.";
        }
        throw new C14278g(str2);
    }

    /* renamed from: b */
    public static final Void m32960b(KClass<?> subClass, KClass<?> baseClass) {
        C9612q.m13917h(subClass, "subClass");
        C9612q.m13917h(baseClass, "baseClass");
        String mo13883l = subClass.mo13883l();
        if (mo13883l == null) {
            mo13883l = String.valueOf(subClass);
        }
        m32961a(mo13883l, baseClass);
        throw new C11568i();
    }
}
