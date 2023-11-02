package p278p4;

import com.facebook.common.references.CloseableReference;
import p394w2.InterfaceC13380k;

/* renamed from: p4.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11407p<K, V> implements InterfaceC11413s<K, V> {

    /* renamed from: a */
    private final InterfaceC11413s<K, V> f29700a;

    /* renamed from: b */
    private final InterfaceC11415t f29701b;

    public C11407p(InterfaceC11413s<K, V> interfaceC11413s, InterfaceC11415t interfaceC11415t) {
        this.f29700a = interfaceC11413s;
        this.f29701b = interfaceC11415t;
    }

    @Override // p278p4.InterfaceC11413s
    /* renamed from: a */
    public boolean mo8111a(InterfaceC13380k<K> interfaceC13380k) {
        return this.f29700a.mo8111a(interfaceC13380k);
    }

    @Override // p278p4.InterfaceC11413s
    /* renamed from: b */
    public void mo8110b(K k) {
        this.f29700a.mo8110b(k);
    }

    @Override // p278p4.InterfaceC11413s
    /* renamed from: c */
    public CloseableReference<V> mo8109c(K k, CloseableReference<V> closeableReference) {
        this.f29701b.mo8105c(k);
        return this.f29700a.mo8109c(k, closeableReference);
    }

    @Override // p278p4.InterfaceC11413s
    /* renamed from: d */
    public int mo8108d(InterfaceC13380k<K> interfaceC13380k) {
        return this.f29700a.mo8108d(interfaceC13380k);
    }

    @Override // p278p4.InterfaceC11413s
    public CloseableReference<V> get(K k) {
        CloseableReference<V> closeableReference = this.f29700a.get(k);
        if (closeableReference == null) {
            this.f29701b.mo8106b(k);
        } else {
            this.f29701b.mo8107a(k);
        }
        return closeableReference;
    }
}