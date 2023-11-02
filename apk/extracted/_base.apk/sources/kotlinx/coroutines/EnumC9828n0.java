package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import p371uf.C12966e;
import p450yi.C14031a;
import p450yi.C14032b;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JY\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\b\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m14357d2 = {"Lkotlinx/coroutines/n0;", "", "R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "receiver", "completion", "", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "", "c", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "m", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC9828n0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: kotlinx.coroutines.n0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C9829a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25649a;

        static {
            int[] iArr = new int[EnumC9828n0.values().length];
            iArr[EnumC9828n0.DEFAULT.ordinal()] = 1;
            iArr[EnumC9828n0.ATOMIC.ordinal()] = 2;
            iArr[EnumC9828n0.UNDISPATCHED.ordinal()] = 3;
            iArr[EnumC9828n0.LAZY.ordinal()] = 4;
            f25649a = iArr;
        }
    }

    /* renamed from: b */
    public final <R, T> void m13162b(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        int i = C9829a.f25649a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C11581q();
                    }
                    return;
                }
                C14032b.m860a(function2, r, continuation);
                return;
            }
            C12966e.m3571a(function2, r, continuation);
            return;
        }
        C14031a.m861e(function2, r, continuation, null, 4, null);
    }

    /* renamed from: c */
    public final boolean m13161c() {
        return this == LAZY;
    }
}
