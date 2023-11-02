package p202kj;

import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.EnumC10803f;
import net.time4j.p249tz.InterfaceC10808k;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC9478b0 implements InterfaceC7664p<InterfaceC10808k> {
    TIMEZONE_ID,
    TIMEZONE_OFFSET;

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        return interfaceC7662o.mo10209t().mo10035a().compareTo(interfaceC7662o2.mo10209t().mo10035a());
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: c */
    public InterfaceC10808k mo9551e() {
        return C10835p.m10022o(EnumC10803f.AHEAD_OF_UTC, 14);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: f */
    public InterfaceC10808k mo9554U() {
        return C10835p.m10022o(EnumC10803f.BEHIND_UTC, 14);
    }

    @Override // p162ij.InterfaceC7664p
    public Class<InterfaceC10808k> getType() {
        return InterfaceC10808k.class;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }
}