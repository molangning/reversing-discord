package net.time4j.history;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: net.time4j.history.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10761o {

    /* renamed from: d */
    static final C10761o f28078d = new C10761o(EnumC10751n.f28068j, ViewDefaults.NUMBER_OF_LINES);

    /* renamed from: e */
    private static final Comparator<C10761o> f28079e = new C10763b();

    /* renamed from: a */
    private final List<C10761o> f28080a;

    /* renamed from: b */
    private final EnumC10751n f28081b;

    /* renamed from: c */
    private final int f28082c;

    /* renamed from: net.time4j.history.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C10763b implements Comparator<C10761o> {
        private C10763b() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C10761o c10761o, C10761o c10761o2) {
            if (c10761o.f28082c < c10761o2.f28082c) {
                return -1;
            }
            if (c10761o.f28082c > c10761o2.f28082c) {
                return 1;
            }
            return 0;
        }
    }

    public C10761o(EnumC10751n enumC10751n, int i) {
        this.f28080a = Collections.emptyList();
        this.f28081b = enumC10751n;
        this.f28082c = i;
    }

    /* renamed from: e */
    public static C10761o m10318e(DataInput dataInput) {
        int readInt = dataInput.readInt();
        if (readInt == 0) {
            EnumC10751n valueOf = EnumC10751n.valueOf(dataInput.readUTF());
            int readInt2 = dataInput.readInt();
            if (readInt2 == Integer.MAX_VALUE && valueOf == EnumC10751n.f28068j) {
                return f28078d;
            }
            return new C10761o(valueOf, readInt2);
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C10761o(EnumC10751n.valueOf(dataInput.readUTF()), dataInput.readInt()));
        }
        return new C10761o(arrayList);
    }

    /* renamed from: b */
    public C10761o m10321b(C10761o c10761o) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f28080a);
        if (arrayList.isEmpty()) {
            arrayList.add(this);
        }
        if (c10761o.f28080a.isEmpty()) {
            arrayList.add(c10761o);
        } else {
            arrayList.addAll(c10761o.f28080a);
        }
        return new C10761o(arrayList);
    }

    /* renamed from: c */
    public int m10320c(C10741h c10741h) {
        int m10367a = c10741h.m10383c().m10367a(c10741h.m10381e());
        int size = this.f28080a.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            C10761o c10761o = this.f28080a.get(i2);
            if (m10367a >= i && m10367a < c10761o.f28082c) {
                return c10761o.f28081b.mo10325a(this, c10741h);
            }
            i = c10761o.f28082c;
        }
        return this.f28081b.mo10325a(this, c10741h);
    }

    /* renamed from: d */
    public C10741h m10319d(EnumC10744j enumC10744j, int i) {
        return m10317f(enumC10744j, i).mo10323b(enumC10744j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10761o)) {
            return false;
        }
        C10761o c10761o = (C10761o) obj;
        if (this.f28080a.equals(c10761o.f28080a) && this.f28081b == c10761o.f28081b && this.f28082c == c10761o.f28082c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public EnumC10751n m10317f(EnumC10744j enumC10744j, int i) {
        int m10367a = enumC10744j.m10367a(i);
        int size = this.f28080a.size();
        int i2 = Integer.MIN_VALUE;
        EnumC10751n enumC10751n = null;
        for (int i3 = 0; i3 < size; i3++) {
            C10761o c10761o = this.f28080a.get(i3);
            if (m10367a >= i2 && m10367a < c10761o.f28082c) {
                return c10761o.f28081b;
            }
            i2 = c10761o.f28082c;
            enumC10751n = c10761o.f28081b;
        }
        if (m10367a == i2 && enumC10744j == EnumC10744j.BYZANTINE && enumC10751n == EnumC10751n.f28070l) {
            return enumC10751n;
        }
        return this.f28081b;
    }

    /* renamed from: g */
    public void m10316g(DataOutput dataOutput) {
        int size = this.f28080a.size();
        dataOutput.writeInt(size);
        if (size == 0) {
            dataOutput.writeUTF(this.f28081b.name());
            dataOutput.writeInt(this.f28082c);
            return;
        }
        for (int i = 0; i < size; i++) {
            C10761o c10761o = this.f28080a.get(i);
            dataOutput.writeUTF(c10761o.f28081b.name());
            dataOutput.writeInt(c10761o.f28082c);
        }
    }

    public int hashCode() {
        return (this.f28080a.hashCode() * 17) + (this.f28081b.hashCode() * 37) + this.f28082c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f28080a.isEmpty()) {
            sb2.append('[');
            sb2.append(this.f28081b);
            if (this.f28082c != Integer.MAX_VALUE) {
                sb2.append("->");
                sb2.append(this.f28082c);
            }
        } else {
            boolean z = true;
            for (C10761o c10761o : this.f28080a) {
                if (z) {
                    sb2.append('[');
                    z = false;
                } else {
                    sb2.append(',');
                }
                sb2.append(c10761o.f28081b);
                sb2.append("->");
                sb2.append(c10761o.f28082c);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    C10761o(List<C10761o> list) {
        Collections.sort(list, f28079e);
        Iterator<C10761o> it = list.iterator();
        C10761o c10761o = null;
        while (it.hasNext()) {
            C10761o next = it.next();
            if (c10761o == null || next.f28082c != c10761o.f28082c) {
                c10761o = next;
            } else if (next.f28081b == c10761o.f28081b) {
                it.remove();
            } else {
                throw new IllegalArgumentException("Multiple strategies with overlapping validity range: " + list);
            }
        }
        this.f28080a = Collections.unmodifiableList(list);
        this.f28081b = EnumC10751n.f28068j;
        this.f28082c = ViewDefaults.NUMBER_OF_LINES;
    }
}