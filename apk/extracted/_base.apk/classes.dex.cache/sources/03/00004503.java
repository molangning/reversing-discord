package net.time4j;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7667s;

/* renamed from: net.time4j.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C10842v0 implements InterfaceC7667s {
    @Override // p162ij.InterfaceC7667s
    /* renamed from: a */
    public boolean mo9075a(InterfaceC7664p<?> interfaceC7664p) {
        return false;
    }

    @Override // p162ij.InterfaceC7667s
    /* renamed from: b */
    public Set<InterfaceC7664p<?>> mo9074b(Locale locale, InterfaceC7633d interfaceC7633d) {
        if (locale.getCountry().isEmpty()) {
            return Collections.emptySet();
        }
        return C10852z0.m9969j(locale).m9975d();
    }

    @Override // p162ij.InterfaceC7667s
    /* renamed from: c */
    public AbstractC7665q<?> mo9073c(AbstractC7665q<?> abstractC7665q, Locale locale, InterfaceC7633d interfaceC7633d) {
        return abstractC7665q;
    }

    @Override // p162ij.InterfaceC7667s
    /* renamed from: d */
    public boolean mo9072d(Class<?> cls) {
        return false;
    }
}