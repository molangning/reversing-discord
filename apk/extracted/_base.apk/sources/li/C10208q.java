package li;

import kotlin.jvm.internal.C9612q;
import p142hi.EnumC7336w1;
import pf.C11581q;

/* renamed from: li.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10208q {

    /* renamed from: li.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C10209a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26514a;

        static {
            int[] iArr = new int[EnumC7336w1.values().length];
            try {
                iArr[EnumC7336w1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7336w1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7336w1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26514a = iArr;
        }
    }

    /* renamed from: a */
    public static final EnumC10213u m12126a(EnumC7336w1 enumC7336w1) {
        C9612q.m13917h(enumC7336w1, "<this>");
        int i = C10209a.f26514a[enumC7336w1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC10213u.OUT;
                }
                throw new C11581q();
            }
            return EnumC10213u.IN;
        }
        return EnumC10213u.INV;
    }
}
