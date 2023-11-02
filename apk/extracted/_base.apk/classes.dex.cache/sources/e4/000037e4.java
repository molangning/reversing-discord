package p162ij;

import java.io.Serializable;
import java.lang.Comparable;
import net.time4j.base.InterfaceC10620f;

/* renamed from: ij.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7635e<V extends Comparable<V>> implements InterfaceC7664p<V>, Serializable {
    private final int hash;
    private final int identity;
    private final String name;

    public AbstractC7635e(String str) {
        if (!str.trim().isEmpty()) {
            this.name = str;
            int hashCode = str.hashCode();
            this.hash = hashCode;
            if (mo9550v()) {
                if (hashCode == -1) {
                    hashCode = ~hashCode;
                }
            } else {
                hashCode = -1;
            }
            this.identity = hashCode;
            return;
        }
        throw new IllegalArgumentException("Element name is empty or contains only white space.");
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC7635e<?> abstractC7635e = (AbstractC7635e) obj;
        int i = this.identity;
        if (i == abstractC7635e.identity) {
            if (i != -1) {
                return true;
            }
            if (name().equals(abstractC7635e.name()) && mo9900q(abstractC7635e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.hash;
    }

    @Override // java.util.Comparator
    /* renamed from: j */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        return ((Comparable) interfaceC7662o.mo10212i(this)).compareTo(interfaceC7662o2.mo10212i(this));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    public final String name() {
        return this.name;
    }

    /* renamed from: p */
    public <T extends AbstractC7665q<T>> InterfaceC7676z<T, V> mo9901p(C7672x<T> c7672x) {
        return null;
    }

    /* renamed from: q */
    protected boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
        return true;
    }

    /* renamed from: s */
    public InterfaceC7664p<?> mo9899s() {
        return null;
    }

    /* renamed from: t */
    public String mo20151t(C7672x<?> c7672x) {
        if (m20204u() && InterfaceC10620f.class.isAssignableFrom(c7672x.m20113p())) {
            return "Accessing the local element [" + this.name + "] from a global type requires a timezone.\n- Try to apply a zonal query like \"" + this.name + ".atUTC()\".\n- Or try to first convert the global type to a zonal timestamp: \"moment.toZonalTimestamp(...)\".\n- If used in formatting then consider \"ChronoFormatter.withTimezone(TZID)\".";
        }
        return null;
    }

    public String toString() {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 32);
        sb2.append(name);
        sb2.append('@');
        sb2.append(this.name);
        return sb2.toString();
    }

    /* renamed from: u */
    public boolean m20204u() {
        return true;
    }

    /* renamed from: v */
    protected boolean mo9550v() {
        return false;
    }
}