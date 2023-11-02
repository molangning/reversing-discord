package p467zf;

import cg.InterfaceC2533a;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"Lzf/o;", "Lkotlin/sequences/Sequence;", "", "", "iterator", "Ljava/io/BufferedReader;", "a", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zf.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14199o implements Sequence<String> {

    /* renamed from: a */
    private final BufferedReader f36510a;

    @Metadata(m14358d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m14357d2 = {"zf/o$a", "", "", "", "hasNext", "a", "j", "Ljava/lang/String;", "nextValue", "k", "Z", "done", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zf.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14200a implements Iterator<String>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private String f36511j;

        /* renamed from: k */
        private boolean f36512k;

        C14200a() {
            C14199o.this = r1;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f36511j;
                this.f36511j = null;
                C9612q.m13920e(str);
                return str;
            }
            throw new NoSuchElementException();
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
            if (this.f36511j == null && !this.f36512k) {
                String readLine = C14199o.this.f36510a.readLine();
                this.f36511j = readLine;
                if (readLine == null) {
                    this.f36512k = true;
                }
            }
            if (this.f36511j != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14199o(BufferedReader reader) {
        C9612q.m13917h(reader, "reader");
        this.f36510a = reader;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<String> iterator() {
        return new C14200a();
    }
}