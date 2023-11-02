package bj;

import cg.InterfaceC2533a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\u000b"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Iterable;", "getElementDescriptors$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "elementDescriptors", "", "b", "getElementNames$annotations", "elementNames", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: bj.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2335f {

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m14357d2 = {"bj/f$a", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "hasNext", "a", "", "j", "I", "elementsLeft", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: bj.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2336a implements Iterator<SerialDescriptor>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private int f6446j;

        /* renamed from: k */
        final /* synthetic */ SerialDescriptor f6447k;

        C2336a(SerialDescriptor serialDescriptor) {
            this.f6447k = serialDescriptor;
            this.f6446j = serialDescriptor.mo12687d();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.f6447k;
            int mo12687d = serialDescriptor.mo12687d();
            int i = this.f6446j;
            this.f6446j = i - 1;
            return serialDescriptor.mo12683h(mo12687d - i);
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super SerialDescriptor> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f6446j > 0;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m14357d2 = {"bj/f$b", "", "", "", "hasNext", "a", "", "j", "I", "elementsLeft", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: bj.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2337b implements java.util.Iterator<String>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private int f6448j;

        /* renamed from: k */
        final /* synthetic */ SerialDescriptor f6449k;

        C2337b(SerialDescriptor serialDescriptor) {
            this.f6449k = serialDescriptor;
            this.f6448j = serialDescriptor.mo12687d();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public String next() {
            SerialDescriptor serialDescriptor = this.f6449k;
            int mo12687d = serialDescriptor.mo12687d();
            int i = this.f6448j;
            this.f6448j = i - 1;
            return serialDescriptor.mo12686e(mo12687d - i);
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f6448j > 0;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m14357d2 = {"bj/f$c", "", "", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: bj.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2338c implements Iterable<SerialDescriptor>, InterfaceC2533a {

        /* renamed from: j */
        final /* synthetic */ SerialDescriptor f6450j;

        public C2338c(SerialDescriptor serialDescriptor) {
            this.f6450j = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<SerialDescriptor> iterator() {
            return new C2336a(this.f6450j);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m14357d2 = {"bj/f$d", "", "", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: bj.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2339d implements Iterable<String>, InterfaceC2533a {

        /* renamed from: j */
        final /* synthetic */ SerialDescriptor f6451j;

        public C2339d(SerialDescriptor serialDescriptor) {
            this.f6451j = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<String> iterator() {
            return new C2337b(this.f6451j);
        }
    }

    /* renamed from: a */
    public static final Iterable<SerialDescriptor> m33644a(SerialDescriptor serialDescriptor) {
        C9612q.m13917h(serialDescriptor, "<this>");
        return new C2338c(serialDescriptor);
    }

    /* renamed from: b */
    public static final Iterable<String> m33643b(SerialDescriptor serialDescriptor) {
        C9612q.m13917h(serialDescriptor, "<this>");
        return new C2339d(serialDescriptor);
    }
}
