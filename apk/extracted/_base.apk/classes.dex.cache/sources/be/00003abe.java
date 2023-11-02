package p164j$.time;

import p164j$.time.chrono.C8294h;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8348p;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.EnumC8334b;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;

/* renamed from: j$.time.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public enum EnumC8327m implements InterfaceC8343k {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a */
    private static final EnumC8327m[] f22370a = values();

    /* renamed from: g */
    public static EnumC8327m m17833g(int i) {
        if (i < 1 || i > 12) {
            throw new C8295d("Invalid value for MonthOfYear: " + i);
        }
        return f22370a[i - 1];
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l == EnumC8333a.MONTH_OF_YEAR ? interfaceC8344l.mo17798c() : AbstractC8342j.m17813c(this, interfaceC8344l);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: b */
    public final boolean mo17804b(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? interfaceC8344l == EnumC8333a.MONTH_OF_YEAR : interfaceC8344l != null && interfaceC8344l.mo17800a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: c */
    public final long mo17803c(InterfaceC8344l interfaceC8344l) {
        if (interfaceC8344l == EnumC8333a.MONTH_OF_YEAR) {
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
        return interfaceC8346n == AbstractC8342j.m17812d() ? C8294h.f22292a : interfaceC8346n == AbstractC8342j.m17808h() ? EnumC8334b.MONTHS : AbstractC8342j.m17814b(this, interfaceC8346n);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final int mo17801e(EnumC8333a enumC8333a) {
        return enumC8333a == EnumC8333a.MONTH_OF_YEAR ? ordinal() + 1 : AbstractC8342j.m17815a(this, enumC8333a);
    }

    /* renamed from: f */
    public final int m17834f(boolean z) {
        switch (AbstractC8326l.f22369a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    /* renamed from: h */
    public final EnumC8327m m17832h() {
        int i = ((int) 1) + 12;
        return f22370a[(i + ordinal()) % 12];
    }
}