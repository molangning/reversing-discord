package net.time4j.calendar.service;

import java.io.InvalidObjectException;
import java.lang.Comparable;
import net.time4j.calendar.InterfaceC10669q;
import p162ij.AbstractC7635e;
import p162ij.AbstractC7665q;
import p162ij.C7672x;
import p162ij.InterfaceC7664p;
import p184jj.AbstractC8978d;

/* renamed from: net.time4j.calendar.service.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC10678d<V extends Comparable<V>, T extends AbstractC7665q<T>> extends AbstractC8978d<V> implements InterfaceC10669q<V, T> {
    private final Class<T> chrono;

    /* renamed from: k */
    private final transient char f27858k;

    /* renamed from: l */
    private final transient boolean f27859l;

    public AbstractC10678d(String str, Class<T> cls, char c, boolean z) {
        super(str);
        this.chrono = cls;
        this.f27858k = c;
        this.f27859l = z;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return this.f27858k;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: q */
    public boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
        if (this.chrono == ((AbstractC10678d) abstractC7635e).chrono) {
            return true;
        }
        return false;
    }

    protected Object readResolve() {
        String name = name();
        for (InterfaceC7664p<?> interfaceC7664p : C7672x.m20105y(this.chrono).m20109u()) {
            if (interfaceC7664p.name().equals(name)) {
                return interfaceC7664p;
            }
        }
        throw new InvalidObjectException(name);
    }

    /* renamed from: w */
    public Class<T> m10758w() {
        return this.chrono;
    }
}