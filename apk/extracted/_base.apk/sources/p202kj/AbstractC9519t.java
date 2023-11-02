package p202kj;

import net.time4j.p249tz.InterfaceC10808k;
import p162ij.AbstractC7665q;
import p162ij.C7672x;
import p162ij.InterfaceC7664p;
import p202kj.AbstractC9519t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC9519t<T extends AbstractC9519t<T>> extends AbstractC7665q<T> {
    @Override // p162ij.AbstractC7665q
    /* renamed from: C */
    public <V> boolean mo14421C(InterfaceC7664p<V> interfaceC7664p, V v) {
        if (interfaceC7664p != null) {
            return true;
        }
        throw new NullPointerException("Missing chronological element.");
    }

    /* renamed from: H */
    abstract <E> E mo14416H();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public abstract void mo14415I(InterfaceC7664p<?> interfaceC7664p, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract void mo14414J(InterfaceC7664p<?> interfaceC7664p, Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public abstract void mo14413K(Object obj);

    @Override // p162ij.AbstractC7665q
    /* renamed from: L */
    public T mo14420D(InterfaceC7664p<Integer> interfaceC7664p, int i) {
        mo14415I(interfaceC7664p, i);
        return this;
    }

    @Override // p162ij.AbstractC7665q
    /* renamed from: M */
    public <V> T mo14419F(InterfaceC7664p<V> interfaceC7664p, V v) {
        mo14414J(interfaceC7664p, v);
        return this;
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: d */
    public final boolean mo10217d() {
        if (!mo10210q(EnumC9478b0.TIMEZONE_ID) && !mo10210q(EnumC9478b0.TIMEZONE_OFFSET)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p202kj.AbstractC9519t
            r2 = 0
            if (r1 == 0) goto L57
            kj.t r7 = (p202kj.AbstractC9519t) r7
            java.util.Set r1 = r6.mo14394z()
            java.util.Set r3 = r7.mo14394z()
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L1e
            return r2
        L1e:
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r1.next()
            ij.p r4 = (p162ij.InterfaceC7664p) r4
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L42
            java.lang.Object r5 = r6.mo10212i(r4)
            java.lang.Object r4 = r7.mo10212i(r4)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L22
        L42:
            return r2
        L43:
            java.lang.Object r1 = r6.mo14416H()
            java.lang.Object r7 = r7.mo14416H()
            if (r1 != 0) goto L52
            if (r7 != 0) goto L50
            goto L51
        L50:
            r0 = r2
        L51:
            return r0
        L52:
            boolean r7 = r1.equals(r7)
            return r7
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.AbstractC9519t.equals(java.lang.Object):boolean");
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: f */
    public <V> V mo10215f(InterfaceC7664p<V> interfaceC7664p) {
        return interfaceC7664p.mo9554U();
    }

    public final int hashCode() {
        int hashCode = mo14394z().hashCode();
        Object mo14416H = mo14416H();
        if (mo14416H != null) {
            return hashCode + (mo14416H.hashCode() * 31);
        }
        return hashCode;
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: l */
    public <V> V mo10211l(InterfaceC7664p<V> interfaceC7664p) {
        return interfaceC7664p.mo9551e();
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: t */
    public final InterfaceC10808k mo10209t() {
        Object obj;
        EnumC9478b0 enumC9478b0 = EnumC9478b0.TIMEZONE_ID;
        if (mo10210q(enumC9478b0)) {
            obj = mo10212i(enumC9478b0);
        } else {
            EnumC9478b0 enumC9478b02 = EnumC9478b0.TIMEZONE_OFFSET;
            if (mo10210q(enumC9478b02)) {
                obj = mo10212i(enumC9478b02);
            } else {
                obj = null;
            }
        }
        if (obj instanceof InterfaceC10808k) {
            return (InterfaceC10808k) InterfaceC10808k.class.cast(obj);
        }
        return super.mo10209t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append('{');
        boolean z = true;
        for (InterfaceC7664p<?> interfaceC7664p : mo14394z()) {
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(interfaceC7664p.name());
            sb2.append('=');
            sb2.append(mo10212i(interfaceC7664p));
        }
        sb2.append('}');
        Object mo14416H = mo14416H();
        if (mo14416H != null) {
            sb2.append(">>>result=");
            sb2.append(mo14416H);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p162ij.AbstractC7665q
    /* renamed from: v */
    public final C7672x<T> mo10478v() {
        throw new UnsupportedOperationException("Parsed values do not have any chronology.");
    }
}
