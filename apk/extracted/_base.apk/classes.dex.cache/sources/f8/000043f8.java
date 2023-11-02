package net.time4j;

import java.lang.Comparable;
import p184jj.AbstractC8978d;

/* renamed from: net.time4j.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
abstract class AbstractC10581a<V extends Comparable<V>> extends AbstractC8978d<V> implements InterfaceC10622c<V, C10697f0> {

    /* renamed from: k */
    private final transient AbstractC10782o<C10697f0> f27629k;

    /* renamed from: l */
    private final transient AbstractC10782o<C10697f0> f27630l;

    public AbstractC10581a(String str) {
        super(str);
        this.f27629k = new C10764i(this, 0);
        this.f27630l = new C10764i(this, 1);
    }

    /* renamed from: w */
    public AbstractC10782o<C10697f0> m11173w(V v) {
        return new C10764i(this, 6, v);
    }
}