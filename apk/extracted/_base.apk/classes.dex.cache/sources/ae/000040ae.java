package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.collections.C9536e;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lkotlinx/coroutines/internal/a;", "", "T", "", "b", "element", "a", "(Ljava/lang/Object;)V", "d", "()Ljava/lang/Object;", "", "[Ljava/lang/Object;", "elements", "", "I", "head", "c", "tail", "", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9761a<T> {

    /* renamed from: a */
    private Object[] f25563a = new Object[16];

    /* renamed from: b */
    private int f25564b;

    /* renamed from: c */
    private int f25565c;

    /* renamed from: b */
    private final void m13342b() {
        Object[] objArr = this.f25563a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        C9536e.m14270h(objArr, objArr2, 0, this.f25564b, 0, 10, null);
        Object[] objArr3 = this.f25563a;
        int length2 = objArr3.length;
        int i = this.f25564b;
        C9536e.m14270h(objArr3, objArr2, length2 - i, 0, i, 4, null);
        this.f25563a = objArr2;
        this.f25564b = 0;
        this.f25565c = length;
    }

    /* renamed from: a */
    public final void m13343a(T t) {
        Object[] objArr = this.f25563a;
        int i = this.f25565c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f25565c = length;
        if (length == this.f25564b) {
            m13342b();
        }
    }

    /* renamed from: c */
    public final boolean m13341c() {
        return this.f25564b == this.f25565c;
    }

    /* renamed from: d */
    public final T m13340d() {
        int i = this.f25564b;
        if (i == this.f25565c) {
            return null;
        }
        Object[] objArr = this.f25563a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.f25564b = (i + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}