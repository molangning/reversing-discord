package net.time4j.calendar;

import java.util.Locale;
import net.time4j.calendar.AbstractC10644f;
import net.time4j.calendar.service.C10675a;
import p162ij.AbstractC7638f0;
import p162ij.C7672x;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7669u;
import p162ij.InterfaceC7675y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.calendar.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC10631a<C extends AbstractC10644f<?, C>> implements InterfaceC7669u<C> {

    /* renamed from: j */
    private final Class<C> f27730j;

    public AbstractC10631a(Class<C> cls) {
        this.f27730j = cls;
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: a */
    public InterfaceC7662o mo10459b(C c, InterfaceC7633d interfaceC7633d) {
        return c;
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: c */
    public AbstractC7638f0 mo10458c() {
        return AbstractC7638f0.f20937a;
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: f */
    public C7672x<?> mo10456f() {
        return null;
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: g */
    public int mo10455g() {
        return 100;
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: i */
    public String mo10454i(InterfaceC7675y interfaceC7675y, Locale locale) {
        return C10675a.m10765a("chinese", interfaceC7675y, locale);
    }
}