package p278p4;

import com.facebook.common.references.CloseableReference;
import p394w2.C13379j;
import p455z2.InterfaceC14073b;

/* renamed from: p4.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC11396i<K, V> extends InterfaceC11413s<K, V>, InterfaceC14073b {

    /* renamed from: p4.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11397a<K, V> {

        /* renamed from: a */
        public final K f29691a;

        /* renamed from: b */
        public final CloseableReference<V> f29692b;

        /* renamed from: e */
        public final InterfaceC11398b<K> f29695e;

        /* renamed from: c */
        public int f29693c = 0;

        /* renamed from: d */
        public boolean f29694d = false;

        /* renamed from: f */
        public int f29696f = 0;

        private C11397a(K k, CloseableReference<V> closeableReference, InterfaceC11398b<K> interfaceC11398b) {
            this.f29691a = (K) C13379j.m2677g(k);
            this.f29692b = (CloseableReference) C13379j.m2677g(CloseableReference.m31717s(closeableReference));
            this.f29695e = interfaceC11398b;
        }

        /* renamed from: a */
        public static <K, V> C11397a<K, V> m8154a(K k, CloseableReference<V> closeableReference, InterfaceC11398b<K> interfaceC11398b) {
            return new C11397a<>(k, closeableReference, interfaceC11398b);
        }
    }

    /* renamed from: p4.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11398b<K> {
        /* renamed from: a */
        void mo8153a(K k, boolean z);
    }

    /* renamed from: e */
    CloseableReference<V> mo8134e(K k, CloseableReference<V> closeableReference, InterfaceC11398b<K> interfaceC11398b);

    /* renamed from: f */
    CloseableReference<V> mo8133f(K k);
}