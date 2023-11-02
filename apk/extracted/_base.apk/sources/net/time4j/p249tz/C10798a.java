package net.time4j.p249tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10798a extends AbstractC10809l {
    private static final long serialVersionUID = -2894726563499525332L;
    private final AbstractC10809l fallback;
    private final InterfaceC10808k tzid;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10798a(InterfaceC10808k interfaceC10808k, AbstractC10809l abstractC10809l) {
        if (interfaceC10808k != null && abstractC10809l != null) {
            this.tzid = interfaceC10808k;
            this.fallback = abstractC10809l;
            return;
        }
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 12);
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: A */
    public C10835p mo10162A(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return this.fallback.mo10162A(interfaceC10614a, interfaceC10621g);
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: B */
    public C10835p mo10161B(InterfaceC10620f interfaceC10620f) {
        return this.fallback.mo10161B(interfaceC10620f);
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: E */
    public InterfaceC10834o mo10158E() {
        return this.fallback.mo10158E();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: I */
    public boolean mo10154I(InterfaceC10620f interfaceC10620f) {
        return this.fallback.mo10154I(interfaceC10620f);
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: J */
    public boolean mo10153J() {
        return this.fallback.mo10153J();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: K */
    public boolean mo10152K(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return this.fallback.mo10152K(interfaceC10614a, interfaceC10621g);
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: Q */
    public AbstractC10809l mo10146Q(InterfaceC10834o interfaceC10834o) {
        return new C10798a(this.tzid, this.fallback.mo10146Q(interfaceC10834o));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public AbstractC10809l m10173R() {
        return this.fallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10798a)) {
            return false;
        }
        C10798a c10798a = (C10798a) obj;
        if (this.tzid.mo10035a().equals(c10798a.tzid.mo10035a()) && this.fallback.equals(c10798a.fallback)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.tzid.mo10035a().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(C10798a.class.getName());
        sb2.append(':');
        sb2.append(this.tzid.mo10035a());
        sb2.append(",fallback=");
        sb2.append(this.fallback);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: y */
    public InterfaceC10815m mo10126y() {
        return this.fallback.mo10126y();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: z */
    public InterfaceC10808k mo10125z() {
        return this.tzid;
    }
}
