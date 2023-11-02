package p164j$.util.stream;

import java.util.Arrays;
import p164j$.util.AbstractC8383c0;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.I0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8563I0 implements InterfaceC8548F0 {

    /* renamed from: a */
    final Object[] f22694a;

    /* renamed from: b */
    int f22695b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8563I0(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22694a = (Object[]) intFunction.apply((int) j);
        this.f22695b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8563I0(Object[] objArr) {
        this.f22694a = objArr;
        this.f22695b = objArr.length;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: a */
    public final InterfaceC8548F0 mo17392a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final long count() {
        return this.f22695b;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: f */
    public final void mo17391f(Object[] objArr, int i) {
        System.arraycopy(this.f22694a, 0, objArr, i, this.f22695b);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.f22695b; i++) {
            consumer.accept(this.f22694a[i]);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: k */
    public final /* synthetic */ int mo17390k() {
        return 0;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: p */
    public final Object[] mo17389p(IntFunction intFunction) {
        Object[] objArr = this.f22694a;
        if (objArr.length == this.f22695b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17370I0(this, j, j2, intFunction);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        return AbstractC8383c0.m17751m(this.f22694a, 0, this.f22695b);
    }

    public String toString() {
        Object[] objArr = this.f22694a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f22695b), Arrays.toString(objArr));
    }
}
