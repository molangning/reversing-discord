package p278p4;

import com.facebook.common.references.CloseableReference;
import p394w2.InterfaceC13380k;
import p455z2.InterfaceC14073b;

/* renamed from: p4.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC11413s<K, V> extends InterfaceC14073b {

    /* renamed from: p4.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11414a {
    }

    /* renamed from: a */
    boolean mo8111a(InterfaceC13380k<K> interfaceC13380k);

    /* renamed from: b */
    void mo8110b(K k);

    /* renamed from: c */
    CloseableReference<V> mo8109c(K k, CloseableReference<V> closeableReference);

    boolean contains(K k);

    /* renamed from: d */
    int mo8108d(InterfaceC13380k<K> interfaceC13380k);

    CloseableReference<V> get(K k);
}
