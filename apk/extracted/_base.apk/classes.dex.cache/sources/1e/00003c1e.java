package p164j$.util.stream;

import java.util.Arrays;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8635a1 extends C8563I0 implements InterfaceC8523A0 {
    public C8635a1(long j, IntFunction intFunction) {
        super(j, intFunction);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(int i) {
        AbstractC8744w0.m17322w0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f22695b;
        Object[] objArr = this.f22694a;
        if (i >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
        }
        this.f22695b = i + 1;
        objArr[i] = obj;
    }

    @Override // p164j$.util.stream.InterfaceC8523A0
    public final InterfaceC8548F0 build() {
        int i = this.f22695b;
        Object[] objArr = this.f22694a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f22695b), Integer.valueOf(objArr.length)));
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        int i = this.f22695b;
        Object[] objArr = this.f22694a;
        if (i < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f22695b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        Object[] objArr = this.f22694a;
        if (j != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
        }
        this.f22695b = 0;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.C8563I0
    public final String toString() {
        Object[] objArr = this.f22694a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f22695b), Arrays.toString(objArr));
    }
}