package p371uf;

import com.facebook.react.uimanager.ViewProps;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0002J*\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\f*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00028\u00002\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0016J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, m14357d2 = {"Luf/c;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "d", "Lkotlin/coroutines/CoroutineContext$b;", "element", "", "b", "context", "c", "E", "Lkotlin/coroutines/CoroutineContext$c;", "key", "j", "(Lkotlin/coroutines/CoroutineContext$c;)Lkotlin/coroutines/CoroutineContext$b;", "R", "initial", "Lkotlin/Function2;", "operation", "t0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "j0", "", "other", "equals", "hashCode", "", "toString", "Lkotlin/coroutines/CoroutineContext;", ViewProps.LEFT, "k", "Lkotlin/coroutines/CoroutineContext$b;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$b;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: uf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12961c implements CoroutineContext, Serializable {

    /* renamed from: j */
    private final CoroutineContext f33716j;

    /* renamed from: k */
    private final CoroutineContext.InterfaceC9564b f33717k;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "acc", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext$b;)Ljava/lang/String;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: uf.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C12962a extends AbstractC9614s implements Function2<String, CoroutineContext.InterfaceC9564b, String> {

        /* renamed from: j */
        public static final C12962a f33718j = new C12962a();

        C12962a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final String invoke(String acc, CoroutineContext.InterfaceC9564b element) {
            boolean z;
            C9612q.m13917h(acc, "acc");
            C9612q.m13917h(element, "element");
            if (acc.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public C12961c(CoroutineContext left, CoroutineContext.InterfaceC9564b element) {
        C9612q.m13917h(left, "left");
        C9612q.m13917h(element, "element");
        this.f33716j = left;
        this.f33717k = element;
    }

    /* renamed from: b */
    private final boolean m3579b(CoroutineContext.InterfaceC9564b interfaceC9564b) {
        return C9612q.m13922c(mo1458j(interfaceC9564b.getKey()), interfaceC9564b);
    }

    /* renamed from: c */
    private final boolean m3578c(C12961c c12961c) {
        while (m3579b(c12961c.f33717k)) {
            CoroutineContext coroutineContext = c12961c.f33716j;
            if (coroutineContext instanceof C12961c) {
                c12961c = (C12961c) coroutineContext;
            } else {
                C9612q.m13919f(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m3579b((CoroutineContext.InterfaceC9564b) coroutineContext);
            }
        }
        return false;
    }

    /* renamed from: d */
    private final int m3577d() {
        int i = 2;
        C12961c c12961c = this;
        while (true) {
            CoroutineContext coroutineContext = c12961c.f33716j;
            c12961c = coroutineContext instanceof C12961c ? (C12961c) coroutineContext : null;
            if (c12961c == null) {
                return i;
            }
            i++;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: e0 */
    public CoroutineContext mo1459e0(CoroutineContext coroutineContext) {
        return CoroutineContext.C9562a.m13997a(this, coroutineContext);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12961c) {
                C12961c c12961c = (C12961c) obj;
                if (c12961c.m3577d() != m3577d() || !c12961c.m3578c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f33716j.hashCode() + this.f33717k.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j */
    public <E extends CoroutineContext.InterfaceC9564b> E mo1458j(CoroutineContext.InterfaceC9566c<E> key) {
        C9612q.m13917h(key, "key");
        C12961c c12961c = this;
        while (true) {
            E e = (E) c12961c.f33717k.mo1458j(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = c12961c.f33716j;
            if (coroutineContext instanceof C12961c) {
                c12961c = (C12961c) coroutineContext;
            } else {
                return (E) coroutineContext.mo1458j(key);
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo1457j0(CoroutineContext.InterfaceC9566c<?> key) {
        C9612q.m13917h(key, "key");
        if (this.f33717k.mo1458j(key) != null) {
            return this.f33716j;
        }
        CoroutineContext mo1457j0 = this.f33716j.mo1457j0(key);
        if (mo1457j0 == this.f33716j) {
            return this;
        }
        if (mo1457j0 == C12967f.f33721j) {
            return this.f33717k;
        }
        return new C12961c(mo1457j0, this.f33717k);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: t0 */
    public <R> R mo1456t0(R r, Function2<? super R, ? super CoroutineContext.InterfaceC9564b, ? extends R> operation) {
        C9612q.m13917h(operation, "operation");
        return operation.invoke((Object) this.f33716j.mo1456t0(r, operation), this.f33717k);
    }

    public String toString() {
        return '[' + ((String) mo1456t0("", C12962a.f33718j)) + ']';
    }
}