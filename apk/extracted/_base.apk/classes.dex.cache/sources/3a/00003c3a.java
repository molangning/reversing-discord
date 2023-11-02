package p164j$.util.stream;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p164j$.util.C8366N;
import p164j$.util.Spliterator;
import p164j$.util.stream.IntStream;

/* renamed from: j$.util.stream.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8663g implements InterfaceC8673i {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f22861a;

    private /* synthetic */ C8663g(BaseStream baseStream) {
        this.f22861a = baseStream;
    }

    /* renamed from: y */
    public static /* synthetic */ InterfaceC8673i m17468y(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C8668h ? ((C8668h) baseStream).f22864a : baseStream instanceof DoubleStream ? C8542E.m17588y((DoubleStream) baseStream) : baseStream instanceof IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C8689l0.m17433y((LongStream) baseStream) : baseStream instanceof Stream ? C8604S2.m17545y((Stream) baseStream) : new C8663g(baseStream);
    }

    @Override // p164j$.util.stream.InterfaceC8673i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f22861a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8663g) {
            obj = ((C8663g) obj).f22861a;
        }
        return this.f22861a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22861a.hashCode();
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ boolean isParallel() {
        return this.f22861a.isParallel();
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ Iterator iterator() {
        return this.f22861a.iterator();
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ InterfaceC8673i onClose(Runnable runnable) {
        return m17468y(this.f22861a.onClose(runnable));
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8673i parallel() {
        return m17468y(this.f22861a.parallel());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ InterfaceC8673i sequential() {
        return m17468y(this.f22861a.sequential());
    }

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* synthetic */ Spliterator spliterator() {
        return C8366N.m17764e(this.f22861a.spliterator());
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final /* synthetic */ InterfaceC8673i unordered() {
        return m17468y(this.f22861a.unordered());
    }
}