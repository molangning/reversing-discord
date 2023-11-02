package net.time4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import net.time4j.C10768k;
import p162ij.InterfaceC7656l0;
import p288pj.EnumC11651f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: j */
    private transient Object f27627j;

    /* renamed from: k */
    private transient int f27628k;

    public SPX() {
    }

    /* renamed from: a */
    private C10697f0 m11191a(DataInput dataInput, byte b) {
        int readByte;
        int i = b & 15;
        byte readByte2 = dataInput.readByte();
        int i2 = (readByte2 >> 5) & 3;
        int i3 = readByte2 & 31;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    readByte = dataInput.readInt();
                } else {
                    throw new StreamCorruptedException("Unknown year range.");
                }
            } else {
                readByte = dataInput.readShort();
            }
        } else {
            readByte = dataInput.readByte() + 1850 + 128;
        }
        return C10697f0.m10708Q0(readByte, EnumC10612b0.m11058d(i), i3);
    }

    /* renamed from: b */
    private Object m11190b(ObjectInput objectInput, byte b) {
        boolean z;
        boolean z2;
        Locale locale;
        if ((b & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((b & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return new C10768k.C10770b(z, C10768k.m10285s((Map) objectInput.readObject()));
        }
        String readUTF = objectInput.readUTF();
        String readUTF2 = objectInput.readUTF();
        int indexOf = readUTF.indexOf("-");
        if (indexOf == -1) {
            locale = new Locale(readUTF);
        } else {
            locale = new Locale(readUTF.substring(0, indexOf), readUTF.substring(indexOf + 1));
        }
        return new C10768k.C10770b(z, locale, readUTF2);
    }

    /* renamed from: c */
    private Object m11189c(ObjectInput objectInput, byte b) {
        long readInt;
        boolean z = true;
        if ((b & 15) != 1) {
            z = false;
        }
        int readInt2 = objectInput.readInt();
        if (readInt2 == 0) {
            return C10778n.m10249j();
        }
        ArrayList arrayList = new ArrayList(readInt2);
        for (int i = 0; i < readInt2; i++) {
            if (z) {
                readInt = objectInput.readLong();
            } else {
                readInt = objectInput.readInt();
            }
            arrayList.add(InterfaceC7656l0.C7657a.m20135c(readInt, (InterfaceC10843w) objectInput.readObject()));
        }
        return new C10778n(arrayList, objectInput.readBoolean());
    }

    /* renamed from: d */
    private Object m11188d(ObjectInput objectInput, byte b) {
        EnumC11651f enumC11651f;
        int i;
        if ((b & 1) == 1) {
            enumC11651f = EnumC11651f.UTC;
        } else {
            enumC11651f = EnumC11651f.POSIX;
        }
        long readLong = objectInput.readLong();
        if ((b & 2) == 2) {
            i = objectInput.readInt();
        } else {
            i = 0;
        }
        if (enumC11651f == EnumC11651f.UTC) {
            return C10847y.m9985i(readLong, i);
        }
        return C10847y.m9986h(readLong, i);
    }

    /* renamed from: e */
    private Object m11187e(DataInput dataInput, byte b) {
        return C10582a0.m11143s0(dataInput, (b & 1) != 0, ((b & 2) >>> 1) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* renamed from: f */
    private C10711g0 m11186f(DataInput dataInput) {
        int readInt;
        byte readByte = dataInput.readByte();
        if (readByte < 0) {
            return C10711g0.m10613K0(~readByte);
        }
        int readByte2 = dataInput.readByte();
        byte b = 0;
        if (readByte2 < 0) {
            readByte2 = ~readByte2;
            readInt = 0;
        } else {
            byte readByte3 = dataInput.readByte();
            if (readByte3 < 0) {
                b = ~readByte3;
                readInt = 0;
            } else {
                readInt = dataInput.readInt();
                b = readByte3;
            }
        }
        return C10711g0.m10609N0(readByte, readByte2, b, readInt);
    }

    /* renamed from: g */
    private Object m11185g(DataInput dataInput, byte b) {
        return C10722h0.m10489f0(m11191a(dataInput, b), m11186f(dataInput));
    }

    /* renamed from: h */
    private Object m11184h(DataInput dataInput, byte b) {
        byte readByte = dataInput.readByte();
        EnumC10846x0 m9993f = EnumC10846x0.m9993f(readByte >> 4);
        int i = readByte & 15;
        EnumC10846x0 enumC10846x0 = EnumC10846x0.SATURDAY;
        EnumC10846x0 enumC10846x02 = EnumC10846x0.SUNDAY;
        if ((b & 15) == 1) {
            byte readByte2 = dataInput.readByte();
            enumC10846x0 = EnumC10846x0.m9993f(readByte2 >> 4);
            enumC10846x02 = EnumC10846x0.m9993f(readByte2 & 15);
        }
        return C10852z0.m9967l(m9993f, i, enumC10846x0, enumC10846x02);
    }

    /* renamed from: i */
    private void m11183i(DataOutput dataOutput) {
        m11182j((C10697f0) this.f27627j, 1, dataOutput);
    }

    /* renamed from: j */
    private static void m11182j(C10697f0 c10697f0, int i, DataOutput dataOutput) {
        int i2;
        int mo10482o = c10697f0.mo10482o();
        if (mo10482o >= 1850 && mo10482o <= 2100) {
            i2 = 1;
        } else if (Math.abs(mo10482o) < 10000) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        dataOutput.writeByte((i << 4) | c10697f0.mo10481p());
        dataOutput.writeByte(c10697f0.mo10480r() | (i2 << 5));
        if (i2 == 1) {
            dataOutput.writeByte((mo10482o - 1850) - 128);
        } else if (i2 == 2) {
            dataOutput.writeShort(mo10482o);
        } else {
            dataOutput.writeInt(mo10482o);
        }
    }

    /* renamed from: k */
    private void m11181k(ObjectOutput objectOutput) {
        int i;
        C10768k.C10770b c10770b = (C10768k.C10770b) C10768k.C10770b.class.cast(this.f27627j);
        Locale m10279F = c10770b.m10279F();
        if (c10770b.m10275N()) {
            i = 113;
        } else {
            i = 112;
        }
        if (m10279F == null) {
            i |= 2;
        }
        objectOutput.writeByte(i);
        if (m10279F == null) {
            objectOutput.writeObject(c10770b.m10282C());
            return;
        }
        String language = m10279F.getLanguage();
        if (!m10279F.getCountry().isEmpty()) {
            language = language + "-" + m10279F.getCountry();
        }
        objectOutput.writeUTF(language);
        objectOutput.writeUTF(c10770b.m10269x());
    }

    /* renamed from: l */
    private void m11180l(ObjectOutput objectOutput) {
        boolean z;
        int i;
        C10778n c10778n = (C10778n) C10778n.class.cast(this.f27627j);
        int size = c10778n.mo10257a().size();
        int min = Math.min(size, 6);
        int i2 = 0;
        while (true) {
            if (i2 < min) {
                if (((InterfaceC7656l0.C7657a) c10778n.mo10257a().get(i2)).m20137a() >= 1000) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            i = 97;
        } else {
            i = 96;
        }
        objectOutput.writeByte(i);
        objectOutput.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC7656l0.C7657a c7657a = (InterfaceC7656l0.C7657a) c10778n.mo10257a().get(i3);
            if (z) {
                objectOutput.writeLong(c7657a.m20137a());
            } else {
                objectOutput.writeInt((int) c7657a.m20137a());
            }
            objectOutput.writeObject(c7657a.m20136b());
        }
        if (size > 0) {
            objectOutput.writeBoolean(c10778n.m10250i());
        }
    }

    /* renamed from: m */
    private void m11179m(ObjectOutput objectOutput) {
        int i;
        C10847y c10847y = (C10847y) C10847y.class.cast(this.f27627j);
        if (c10847y.m9989e() == EnumC11651f.UTC) {
            i = 81;
        } else {
            i = 80;
        }
        if (c10847y.m9990d() == 0) {
            objectOutput.writeByte(i);
            objectOutput.writeLong(c10847y.m9988f());
            return;
        }
        objectOutput.writeByte(i | 2);
        objectOutput.writeLong(c10847y.m9988f());
        objectOutput.writeInt(c10847y.m9990d());
    }

    /* renamed from: n */
    private void m11178n(DataOutput dataOutput) {
        ((C10582a0) this.f27627j).m11172A0(dataOutput);
    }

    /* renamed from: o */
    private void m11177o(DataOutput dataOutput) {
        dataOutput.writeByte(32);
        m11176p((C10711g0) this.f27627j, dataOutput);
    }

    /* renamed from: p */
    private static void m11176p(C10711g0 c10711g0, DataOutput dataOutput) {
        if (c10711g0.mo10495a() == 0) {
            if (c10711g0.mo10487h() == 0) {
                if (c10711g0.mo10483m() == 0) {
                    dataOutput.writeByte(~c10711g0.mo10479s());
                    return;
                }
                dataOutput.writeByte(c10711g0.mo10479s());
                dataOutput.writeByte(~c10711g0.mo10483m());
                return;
            }
            dataOutput.writeByte(c10711g0.mo10479s());
            dataOutput.writeByte(c10711g0.mo10483m());
            dataOutput.writeByte(~c10711g0.mo10487h());
            return;
        }
        dataOutput.writeByte(c10711g0.mo10479s());
        dataOutput.writeByte(c10711g0.mo10483m());
        dataOutput.writeByte(c10711g0.mo10487h());
        dataOutput.writeInt(c10711g0.mo10495a());
    }

    /* renamed from: q */
    private void m11175q(DataOutput dataOutput) {
        C10722h0 c10722h0 = (C10722h0) this.f27627j;
        m11182j(c10722h0.m10496Z(), 8, dataOutput);
        m11176p(c10722h0.m10493b0(), dataOutput);
    }

    /* renamed from: r */
    private void m11174r(DataOutput dataOutput) {
        boolean z;
        int i;
        C10852z0 c10852z0 = (C10852z0) this.f27627j;
        if (c10852z0.m9971h() == EnumC10846x0.SATURDAY && c10852z0.m9974e() == EnumC10846x0.SUNDAY) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 49;
        } else {
            i = 48;
        }
        dataOutput.writeByte(i);
        dataOutput.writeByte((c10852z0.m9973f().m9997b() << 4) | c10852z0.m9972g());
        if (!z) {
            dataOutput.writeByte(c10852z0.m9974e().m9997b() | (c10852z0.m9971h().m9997b() << 4));
        }
    }

    private Object readResolve() {
        return this.f27627j;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        switch ((readByte & 255) >> 4) {
            case 1:
                this.f27627j = m11191a(objectInput, readByte);
                return;
            case 2:
                this.f27627j = m11186f(objectInput);
                return;
            case 3:
                this.f27627j = m11184h(objectInput, readByte);
                return;
            case 4:
                this.f27627j = m11187e(objectInput, readByte);
                return;
            case 5:
                this.f27627j = m11188d(objectInput, readByte);
                return;
            case 6:
                this.f27627j = m11189c(objectInput, readByte);
                return;
            case 7:
                this.f27627j = m11190b(objectInput, readByte);
                return;
            case 8:
                this.f27627j = m11185g(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        switch (this.f27628k) {
            case 1:
                m11183i(objectOutput);
                return;
            case 2:
                m11177o(objectOutput);
                return;
            case 3:
                m11174r(objectOutput);
                return;
            case 4:
                m11178n(objectOutput);
                return;
            case 5:
                m11179m(objectOutput);
                return;
            case 6:
                m11180l(objectOutput);
                return;
            case 7:
                m11181k(objectOutput);
                return;
            case 8:
                m11175q(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    public SPX(Object obj, int i) {
        this.f27627j = obj;
        this.f27628k = i;
    }
}