package p164j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import p164j$.util.Spliterator;
import p164j$.util.stream.IntStream;
import p164j$.util.stream.Stream;

/* renamed from: j$.util.stream.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8668h implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8673i f22864a;

    private /* synthetic */ C8668h(InterfaceC8673i interfaceC8673i) {
        this.f22864a = interfaceC8673i;
    }

    /* renamed from: y */
    public static /* synthetic */ BaseStream m17465y(InterfaceC8673i interfaceC8673i) {
        if (interfaceC8673i == null) {
            return null;
        }
        return interfaceC8673i instanceof C8663g ? ((C8663g) interfaceC8673i).f22861a : interfaceC8673i instanceof InterfaceC8552G ? C8547F.m17587y((InterfaceC8552G) interfaceC8673i) : interfaceC8673i instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC8673i) : interfaceC8673i instanceof InterfaceC8699n0 ? C8694m0.m17431y((InterfaceC8699n0) interfaceC8673i) : interfaceC8673i instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC8673i) : new C8668h(interfaceC8673i);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f22864a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8673i interfaceC8673i = this.f22864a;
        if (obj instanceof C8668h) {
            obj = ((C8668h) obj).f22864a;
        }
        return interfaceC8673i.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22864a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f22864a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f22864a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return m17465y(this.f22864a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return m17465y(this.f22864a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return m17465y(this.f22864a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f22864a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return m17465y(this.f22864a.unordered());
    }
}