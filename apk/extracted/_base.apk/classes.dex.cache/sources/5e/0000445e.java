package net.time4j.calendar.service;

import p162ij.AbstractC7665q;
import p162ij.InterfaceC7670v;

/* renamed from: net.time4j.calendar.service.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C10680f<T extends AbstractC7665q<T>> extends AbstractC10678d<Integer, T> {
    private static final long serialVersionUID = -4975173343610190782L;

    /* renamed from: m */
    private final transient int f27864m;

    /* renamed from: n */
    private final transient int f27865n;

    /* renamed from: o */
    private final transient InterfaceC7670v<T> f27866o;

    /* renamed from: p */
    private final transient InterfaceC7670v<T> f27867p;

    public C10680f(String str, Class<T> cls, int i, int i2, char c) {
        super(str, cls, c, str.startsWith("DAY_OF_"));
        this.f27864m = i;
        this.f27865n = i2;
        this.f27866o = null;
        this.f27867p = null;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: x */
    public Integer mo9551e() {
        return Integer.valueOf(this.f27865n);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: y */
    public Integer mo9554U() {
        return Integer.valueOf(this.f27864m);
    }

    public C10680f(String str, Class<T> cls, int i, int i2, char c, InterfaceC7670v<T> interfaceC7670v, InterfaceC7670v<T> interfaceC7670v2) {
        super(str, cls, c, false);
        this.f27864m = i;
        this.f27865n = i2;
        this.f27866o = interfaceC7670v;
        this.f27867p = interfaceC7670v2;
    }
}