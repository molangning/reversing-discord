package p059d6;

import java.util.Map;
import p059d6.AbstractC5751f;
import p116g6.InterfaceC6553a;
import p347t5.EnumC12590d;

/* renamed from: d6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C5745b extends AbstractC5751f {

    /* renamed from: a */
    private final InterfaceC6553a f16527a;

    /* renamed from: b */
    private final Map<EnumC12590d, AbstractC5751f.AbstractC5753b> f16528b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5745b(InterfaceC6553a interfaceC6553a, Map<EnumC12590d, AbstractC5751f.AbstractC5753b> map) {
        if (interfaceC6553a != null) {
            this.f16527a = interfaceC6553a;
            if (map != null) {
                this.f16528b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // p059d6.AbstractC5751f
    /* renamed from: e */
    InterfaceC6553a mo24574e() {
        return this.f16527a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5751f)) {
            return false;
        }
        AbstractC5751f abstractC5751f = (AbstractC5751f) obj;
        if (this.f16527a.equals(abstractC5751f.mo24574e()) && this.f16528b.equals(abstractC5751f.mo24571h())) {
            return true;
        }
        return false;
    }

    @Override // p059d6.AbstractC5751f
    /* renamed from: h */
    Map<EnumC12590d, AbstractC5751f.AbstractC5753b> mo24571h() {
        return this.f16528b;
    }

    public int hashCode() {
        return ((this.f16527a.hashCode() ^ 1000003) * 1000003) ^ this.f16528b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f16527a + ", values=" + this.f16528b + "}";
    }
}
