package kotlinx.coroutines.flow;

import com.facebook.react.uimanager.ViewDefaults;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C9768d0;
import p409wi.EnumC13603e;
import p430xi.C13814g;

@Metadata(m14358d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m14357d2 = {"T", "", "replay", "extraBufferCapacity", "Lwi/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "a", "", "", "", "index", "e", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "", "f", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lkotlinx/coroutines/flow/k;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/flow/Flow;", "d", "Lkotlinx/coroutines/internal/d0;", "Lkotlinx/coroutines/internal/d0;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9731m {

    /* renamed from: a */
    public static final C9768d0 f25517a = new C9768d0("NO_VALUE");

    /* renamed from: a */
    public static final <T> MutableSharedFlow<T> m13407a(int i, int i2, EnumC13603e enumC13603e) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i <= 0 && i2 <= 0 && enumC13603e != EnumC13603e.SUSPEND) {
                    z3 = false;
                }
                if (z3) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = ViewDefaults.NUMBER_OF_LINES;
                    }
                    return new C9727l(i, i3, enumC13603e);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC13603e).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
    }

    /* renamed from: d */
    public static final <T> Flow<T> m13404d(InterfaceC9726k<? extends T> interfaceC9726k, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        if ((i == 0 || i == -3) && enumC13603e == EnumC13603e.SUSPEND) {
            return interfaceC9726k;
        }
        return new C13814g(interfaceC9726k, coroutineContext, i, enumC13603e);
    }

    /* renamed from: e */
    public static final Object m13403e(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* renamed from: f */
    public static final void m13402f(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}