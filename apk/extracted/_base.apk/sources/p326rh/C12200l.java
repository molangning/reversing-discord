package p326rh;

import java.util.Iterator;
import java.util.Map;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: rh.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12200l extends C12204m {

    /* renamed from: e */
    private final InterfaceC12210q f31751e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12202b<K> implements Map.Entry<K, Object> {

        /* renamed from: j */
        private Map.Entry<K, C12200l> f31752j;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f31752j.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C12200l value = this.f31752j.getValue();
            if (value == null) {
                return null;
            }
            return value.m5785e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC12210q) {
                return this.f31752j.getValue().m5780d((InterfaceC12210q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C12202b(Map.Entry<K, C12200l> entry) {
            this.f31752j = entry;
        }
    }

    /* renamed from: rh.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C12203c<K> implements Iterator<Map.Entry<K, Object>>, p164j$.util.Iterator {

        /* renamed from: j */
        private Iterator<Map.Entry<K, Object>> f31753j;

        public C12203c(Iterator<Map.Entry<K, Object>> it) {
            this.f31753j = it;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f31753j.next();
            if (next.getValue() instanceof C12200l) {
                return new C12202b(next);
            }
            return next;
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
            return this.f31753j.hasNext();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            this.f31753j.remove();
        }
    }

    /* renamed from: e */
    public InterfaceC12210q m5785e() {
        return m5781c(this.f31751e);
    }

    public boolean equals(Object obj) {
        return m5785e().equals(obj);
    }

    public int hashCode() {
        return m5785e().hashCode();
    }

    public String toString() {
        return m5785e().toString();
    }
}
