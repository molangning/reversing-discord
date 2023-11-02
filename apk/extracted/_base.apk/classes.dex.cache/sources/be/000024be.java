package com.facebook.react.common.mapbuffer;

import cg.InterfaceC2533a;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.util.Iterator;
import kotlin.Metadata;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\t\u0010\r\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, m14357d2 = {"com/facebook/react/common/mapbuffer/ReadableMapBuffer$iterator$1", "", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "last", "getLast", "hasNext", "", "next", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ReadableMapBuffer$iterator$1 implements Iterator<MapBuffer.Entry>, InterfaceC2533a, p164j$.util.Iterator {
    private int current;
    private final int last;
    final /* synthetic */ ReadableMapBuffer this$0;

    public ReadableMapBuffer$iterator$1(ReadableMapBuffer readableMapBuffer) {
        this.this$0 = readableMapBuffer;
        this.last = readableMapBuffer.getCount() - 1;
    }

    @Override // p164j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super MapBuffer.Entry> consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getLast() {
        return this.last;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public boolean hasNext() {
        return this.current <= this.last;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public MapBuffer.Entry next() {
        int keyOffsetForBucketIndex;
        ReadableMapBuffer readableMapBuffer = this.this$0;
        int i = this.current;
        this.current = i + 1;
        keyOffsetForBucketIndex = readableMapBuffer.getKeyOffsetForBucketIndex(i);
        return new ReadableMapBuffer.MapBufferEntry(keyOffsetForBucketIndex);
    }
}