package p164j$.time;

import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8348p;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.EnumC8334b;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;

/* renamed from: j$.time.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public enum EnumC8296e implements InterfaceC8343k {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a */
    private static final EnumC8296e[] f22293a = values();

    /* renamed from: f */
    public static EnumC8296e m17897f(int i) {
        if (i < 1 || i > 7) {
            throw new C8295d("Invalid value for DayOfWeek: " + i);
        }
        return f22293a[i - 1];
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l == EnumC8333a.DAY_OF_WEEK ? interfaceC8344l.mo17798c() : AbstractC8342j.m17813c(this, interfaceC8344l);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: b */
    public final boolean mo17804b(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? interfaceC8344l == EnumC8333a.DAY_OF_WEEK : interfaceC8344l != null && interfaceC8344l.mo17800a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: c */
    public final long mo17803c(InterfaceC8344l interfaceC8344l) {
        if (interfaceC8344l == EnumC8333a.DAY_OF_WEEK) {
            return ordinal() + 1;
        }
        if (interfaceC8344l instanceof EnumC8333a) {
            throw new C8348p("Unsupported field: " + interfaceC8344l);
        }
        return interfaceC8344l.mo17797d(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: d */
    public final Object mo17802d(InterfaceC8346n interfaceC8346n) {
        return interfaceC8346n == AbstractC8342j.m17808h() ? EnumC8334b.DAYS : AbstractC8342j.m17814b(this, interfaceC8346n);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final int mo17801e(EnumC8333a enumC8333a) {
        return enumC8333a == EnumC8333a.DAY_OF_WEEK ? ordinal() + 1 : AbstractC8342j.m17815a(this, enumC8333a);
    }
}