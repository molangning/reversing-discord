package net.time4j.calendar.service;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.C10697f0;
import net.time4j.calendar.KoreanCalendar;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7667s;

/* renamed from: net.time4j.calendar.service.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C10677c implements InterfaceC7667s {
    @Override // p162ij.InterfaceC7667s
    /* renamed from: a */
    public boolean mo9075a(InterfaceC7664p<?> interfaceC7664p) {
        return interfaceC7664p == KoreanCalendar.f27709s;
    }

    @Override // p162ij.InterfaceC7667s
    /* renamed from: b */
    public Set<InterfaceC7664p<?>> mo9074b(Locale locale, InterfaceC7633d interfaceC7633d) {
        return Collections.emptySet();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ij.q, ij.q<?>] */
    @Override // p162ij.InterfaceC7667s
    /* renamed from: c */
    public AbstractC7665q<?> mo9073c(AbstractC7665q<?> abstractC7665q, Locale locale, InterfaceC7633d interfaceC7633d) {
        InterfaceC7664p<Integer> interfaceC7664p = KoreanCalendar.f27709s;
        if (abstractC7665q.mo10210q(interfaceC7664p)) {
            return abstractC7665q.mo14420D(C10697f0.f27908y, abstractC7665q.mo10218c(interfaceC7664p) - 2333);
        }
        return abstractC7665q;
    }

    @Override // p162ij.InterfaceC7667s
    /* renamed from: d */
    public boolean mo9072d(Class<?> cls) {
        return cls == C10697f0.class;
    }
}
