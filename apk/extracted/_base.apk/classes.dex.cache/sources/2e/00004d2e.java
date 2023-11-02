package si;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p388vf.C13272c;

@Metadata(m14358d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f*\f\b\u0002\u0010\u000e\"\u00020\r2\u00020\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m14357d2 = {"T", "Lkotlin/Function2;", "Lsi/i;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lkotlin/sequences/Sequence;", "b", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/sequences/SequencesKt")
/* renamed from: si.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12542k {

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m14357d2 = {"si/k$a", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: si.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12543a<T> implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Function2 f32589a;

        public C12543a(Function2 function2) {
            this.f32589a = function2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            Iterator<T> m4883a;
            m4883a = C12542k.m4883a(this.f32589a);
            return m4883a;
        }
    }

    /* renamed from: a */
    public static <T> Iterator<T> m4883a(Function2<? super AbstractC12540i<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Continuation<? super Unit> m2871b;
        C9612q.m13917h(block, "block");
        C12539h c12539h = new C12539h();
        m2871b = C13272c.m2871b(block, c12539h, c12539h);
        c12539h.m4911h(m2871b);
        return c12539h;
    }

    /* renamed from: b */
    public static <T> Sequence<T> m4882b(Function2<? super AbstractC12540i<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        C9612q.m13917h(block, "block");
        return new C12543a(block);
    }
}