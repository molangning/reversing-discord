package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\f"}, m14357d2 = {"Lkotlin/coroutines/jvm/internal/a;", "Ljava/lang/StackTraceElement;", "d", "(Lkotlin/coroutines/jvm/internal/a;)Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/e;", "b", "", "c", "expected", "actual", "", "a", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9572f {
    /* renamed from: a */
    private static final void m13982a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final InterfaceC9571e m13981b(AbstractC9567a abstractC9567a) {
        return (InterfaceC9571e) abstractC9567a.getClass().getAnnotation(InterfaceC9571e.class);
    }

    /* renamed from: c */
    private static final int m13980c(AbstractC9567a abstractC9567a) {
        Integer num;
        int i;
        try {
            Field declaredField = abstractC9567a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC9567a);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m13979d(AbstractC9567a abstractC9567a) {
        int i;
        String str;
        C9612q.m13917h(abstractC9567a, "<this>");
        InterfaceC9571e m13981b = m13981b(abstractC9567a);
        if (m13981b == null) {
            return null;
        }
        m13982a(1, m13981b.m13983v());
        int m13980c = m13980c(abstractC9567a);
        if (m13980c < 0) {
            i = -1;
        } else {
            i = m13981b.m13985l()[m13980c];
        }
        String m13974b = C9574h.f25320a.m13974b(abstractC9567a);
        if (m13974b == null) {
            str = m13981b.m13987c();
        } else {
            str = m13974b + '/' + m13981b.m13987c();
        }
        return new StackTraceElement(str, m13981b.m13984m(), m13981b.m13986f(), i);
    }
}
