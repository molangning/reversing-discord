package net.time4j;

import java.lang.Comparable;
import p184jj.AbstractC8978d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC10611b<V extends Comparable<V>> extends AbstractC8978d<V> implements InterfaceC10622c<V, C10711g0> {

    /* renamed from: k */
    private final transient AbstractC10782o<C10711g0> f27680k;

    /* renamed from: l */
    private final transient AbstractC10782o<C10711g0> f27681l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10611b(String str) {
        super(str);
        this.f27680k = new C10791r0(this, 0);
        this.f27681l = new C10791r0(this, 1);
    }

    /* renamed from: w */
    public AbstractC10782o<C10711g0> m11062w(V v) {
        return new C10791r0(this, 6, v);
    }
}
