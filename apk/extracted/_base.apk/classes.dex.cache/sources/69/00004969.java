package pf;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\b"}, m14357d2 = {"T", "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "a", "Lpf/p;", "mode", "b", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/LazyKt")
/* renamed from: pf.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11577n {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: pf.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C11578a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30085a;

        static {
            int[] iArr = new int[EnumC11580p.values().length];
            try {
                iArr[EnumC11580p.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11580p.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11580p.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30085a = iArr;
        }
    }

    /* renamed from: a */
    public static <T> Lazy<T> m7601a(Function0<? extends T> initializer) {
        C9612q.m13917h(initializer, "initializer");
        return new C11589v(initializer, null, 2, null);
    }

    /* renamed from: b */
    public static <T> Lazy<T> m7600b(EnumC11580p mode, Function0<? extends T> initializer) {
        C9612q.m13917h(mode, "mode");
        C9612q.m13917h(initializer, "initializer");
        int i = C11578a.f30085a[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C11571j0(initializer);
                }
                throw new C11581q();
            }
            return new C11587u(initializer);
        }
        return new C11589v(initializer, null, 2, null);
    }
}