package p304qf;

import cg.InterfaceC2533a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH$J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\bH\u0004R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lqf/b;", "T", "", "", "g", "hasNext", "next", "()Ljava/lang/Object;", "", "a", "value", "f", "(Ljava/lang/Object;)V", "e", "Lqf/a0;", "j", "Lqf/a0;", "state", "k", "Ljava/lang/Object;", "nextValue", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11864b<T> implements Iterator<T>, InterfaceC2533a, p164j$.util.Iterator {

    /* renamed from: j */
    private EnumC11863a0 f30860j = EnumC11863a0.NotReady;

    /* renamed from: k */
    private T f30861k;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: qf.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C11865a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30862a;

        static {
            int[] iArr = new int[EnumC11863a0.values().length];
            try {
                iArr[EnumC11863a0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11863a0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30862a = iArr;
        }
    }

    /* renamed from: g */
    private final boolean m6809g() {
        this.f30860j = EnumC11863a0.Failed;
        mo502a();
        if (this.f30860j == EnumC11863a0.Ready) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract void mo502a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m6811e() {
        this.f30860j = EnumC11863a0.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final void m6810f(T t) {
        this.f30861k = t;
        this.f30860j = EnumC11863a0.Ready;
    }

    @Override // p164j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public boolean hasNext() {
        boolean z;
        EnumC11863a0 enumC11863a0 = this.f30860j;
        if (enumC11863a0 != EnumC11863a0.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C11865a.f30862a[enumC11863a0.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            return m6809g();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f30860j = EnumC11863a0.NotReady;
            return this.f30861k;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
