package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import net.time4j.C10697f0;
import p162ij.EnumC7627a0;
import p251nj.EnumC10916b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class SPX implements Externalizable {

    /* renamed from: l */
    private static final int[] f27996l = new int[0];
    private static final long serialVersionUID = 1;

    /* renamed from: j */
    private transient Object f27997j;

    /* renamed from: k */
    private transient int f27998k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.history.SPX$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C10728a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27999a;

        static {
            int[] iArr = new int[EnumC10916b.values().length];
            f27999a = iArr;
            try {
                iArr[EnumC10916b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27999a[EnumC10916b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27999a[EnumC10916b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27999a[EnumC10916b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27999a[EnumC10916b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SPX() {
    }

    /* renamed from: a */
    private static EnumC10916b m10452a(int i) {
        EnumC10916b[] values;
        for (EnumC10916b enumC10916b : EnumC10916b.values()) {
            if (enumC10916b.m9556a() == i) {
                return enumC10916b;
            }
        }
        throw new StreamCorruptedException("Unknown variant of chronological history.");
    }

    /* renamed from: b */
    private C10736d m10451b(DataInput dataInput, byte b) {
        int i = C10728a.f27999a[m10452a(b & 15).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return C10736d.m10427G(C10697f0.m10707R0(dataInput.readLong(), EnumC7627a0.MODIFIED_JULIAN_DATE));
                        }
                        return C10736d.m10429E();
                    }
                    return C10736d.m10426H();
                }
                return C10736d.f28012B;
            }
            return C10736d.f28011A;
        }
        return C10736d.f28018z;
    }

    /* renamed from: c */
    private static C10729a m10450c(DataInput dataInput) {
        int readInt = dataInput.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            for (int i = 0; i < readInt; i++) {
                iArr[i] = 1 - dataInput.readInt();
            }
            return C10729a.m10443f(iArr);
        }
        return null;
    }

    /* renamed from: d */
    private void m10449d(DataOutput dataOutput) {
        int[] iArr;
        C10736d c10736d = (C10736d) this.f27997j;
        dataOutput.writeByte(c10736d.m10401t().m9556a() | (this.f27998k << 4));
        if (c10736d.m10401t() == EnumC10916b.SINGLE_CUTOVER_DATE) {
            dataOutput.writeLong(c10736d.m10404q().get(0).f28040a);
        }
        if (c10736d.m10397x()) {
            iArr = c10736d.m10409l().m10444e();
        } else {
            iArr = f27996l;
        }
        dataOutput.writeInt(iArr.length);
        for (int i : iArr) {
            dataOutput.writeInt(i);
        }
        c10736d.m10398w().m10316g(dataOutput);
        c10736d.m10405p().m10386h(dataOutput);
    }

    private Object readResolve() {
        return this.f27997j;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        C10736d m10451b;
        byte readByte = objectInput.readByte();
        int i = (readByte & 255) >> 4;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C10736d m10451b2 = m10451b(objectInput, readByte);
                    C10729a m10450c = m10450c(objectInput);
                    if (m10450c != null) {
                        m10451b2 = m10451b2.m10425I(m10450c);
                    }
                    m10451b = m10451b2.m10423K(C10761o.m10318e(objectInput)).m10424J(C10740g.m10387g(objectInput));
                } else {
                    throw new StreamCorruptedException("Unknown serialized type.");
                }
            } else {
                C10736d m10451b3 = m10451b(objectInput, readByte);
                C10729a m10450c2 = m10450c(objectInput);
                if (m10450c2 != null) {
                    m10451b = m10451b3.m10425I(m10450c2);
                } else {
                    m10451b = m10451b3;
                }
            }
        } else {
            m10451b = m10451b(objectInput, readByte);
        }
        this.f27997j = m10451b;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        int i = this.f27998k;
        if (i != 1 && i != 2 && i != 3) {
            throw new InvalidClassException("Unknown serialized type.");
        }
        m10449d(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i) {
        this.f27997j = obj;
        this.f27998k = i;
    }
}
