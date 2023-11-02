package net.time4j.p249tz.model;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.C10711g0;
import net.time4j.EnumC10612b0;
import net.time4j.EnumC10846x0;
import net.time4j.base.C10616c;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.C10836q;

/* renamed from: net.time4j.tz.model.SPX */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 6526945678752534989L;

    /* renamed from: j */
    private transient Object f28248j;

    /* renamed from: k */
    private transient int f28249k;

    public SPX() {
    }

    /* renamed from: a */
    private static Object m10119a(ObjectInput objectInput) {
        return new C10816a(m10110j(objectInput), false, false);
    }

    /* renamed from: b */
    private static Object m10118b(ObjectInput objectInput) {
        List<C10836q> m10110j = m10110j(objectInput);
        return AbstractC10831l.m10045g(C10835p.m10020q(m10110j.get(0).m10011f()), m10110j, m10112h(objectInput), false, false);
    }

    /* renamed from: c */
    private static AbstractC10819d m10117c(DataInput dataInput) {
        boolean z;
        int i;
        int readByte = dataInput.readByte() & 255;
        EnumC10612b0 m11058d = EnumC10612b0.m11058d(readByte >>> 4);
        int i2 = readByte & 15;
        EnumC10824i enumC10824i = EnumC10824i.f28272m[i2 % 3];
        int m10111i = m10111i(i2);
        int readByte2 = dataInput.readByte() & 255;
        int i3 = readByte2 >>> 3;
        EnumC10846x0 m9993f = EnumC10846x0.m9993f(readByte2 & 7);
        int readByte3 = dataInput.readByte() & 255;
        if ((readByte3 >>> 7) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i4 = readByte3 & 63;
        if (m10111i == -1) {
            m10111i = m10114f(dataInput);
        }
        int i5 = m10111i;
        if (i4 == 63) {
            i = dataInput.readInt();
        } else {
            i = i4 * 1800;
        }
        return new C10818c(m11058d, i3, m9993f, i, enumC10824i, i5, z);
    }

    /* renamed from: d */
    private static AbstractC10819d m10116d(DataInput dataInput) {
        int i;
        int readByte = dataInput.readByte() & 255;
        int i2 = readByte >>> 4;
        int i3 = readByte & 15;
        EnumC10824i enumC10824i = EnumC10824i.f28272m[i3 % 3];
        int m10111i = m10111i(i3);
        int readByte2 = dataInput.readByte() & 255;
        int i4 = readByte2 >>> 3;
        int m10106n = m10106n(readByte2 & 7);
        if (m10111i == -1) {
            m10111i = m10114f(dataInput);
        }
        int i5 = m10111i;
        if (m10106n == -1) {
            i = dataInput.readInt();
        } else {
            i = m10106n;
        }
        return new C10821f(EnumC10612b0.m11058d(i2), i4, i, enumC10824i, i5);
    }

    /* renamed from: e */
    private static AbstractC10819d m10115e(DataInput dataInput) {
        int i;
        int readByte = dataInput.readByte() & 255;
        EnumC10612b0 m11058d = EnumC10612b0.m11058d(readByte >>> 4);
        int i2 = readByte & 15;
        EnumC10824i enumC10824i = EnumC10824i.f28272m[i2 % 3];
        int m10111i = m10111i(i2);
        int readByte2 = dataInput.readByte() & 255;
        EnumC10846x0 m9993f = EnumC10846x0.m9993f(readByte2 >>> 5);
        int i3 = readByte2 & 31;
        if (m10111i == -1) {
            m10111i = m10114f(dataInput);
        }
        int i4 = m10111i;
        if (i3 == 31) {
            i = dataInput.readInt();
        } else {
            i = i3 * 3600;
        }
        return new C10823h(m11058d, m9993f, i, enumC10824i, i4);
    }

    /* renamed from: f */
    private static int m10114f(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return dataInput.readInt();
        }
        return readByte * 900;
    }

    /* renamed from: g */
    private static Object m10113g(ObjectInput objectInput) {
        int readByte;
        long readByte2;
        if ((objectInput.readByte() & 255) == 255) {
            readByte2 = objectInput.readLong();
        } else {
            readByte2 = ((((readByte << 16) + ((objectInput.readByte() & 255) << 8)) + (255 & objectInput.readByte())) * 900) - 4575744000L;
        }
        return new C10828j(new C10836q(readByte2, m10114f(objectInput), m10114f(objectInput), m10114f(objectInput)), m10112h(objectInput), false);
    }

    /* renamed from: h */
    private static List<AbstractC10819d> m10112h(ObjectInput objectInput) {
        AbstractC10819d m10116d;
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(readByte);
        AbstractC10819d abstractC10819d = null;
        int i = 0;
        while (i < readByte) {
            switch (objectInput.readByte()) {
                case 120:
                    m10116d = m10116d(objectInput);
                    break;
                case 121:
                    m10116d = m10117c(objectInput);
                    break;
                case 122:
                    m10116d = m10115e(objectInput);
                    break;
                default:
                    m10116d = (AbstractC10819d) objectInput.readObject();
                    break;
            }
            if (abstractC10819d != null && EnumC10830k.INSTANCE.compare(abstractC10819d, m10116d) >= 0) {
                throw new InvalidObjectException("Order of daylight saving rules is not ascending.");
            }
            arrayList.add(m10116d);
            i++;
            abstractC10819d = m10116d;
        }
        return arrayList;
    }

    /* renamed from: i */
    private static int m10111i(int i) {
        int i2 = i / 3;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return i2 != 3 ? -1 : 7200;
                }
                return 3600;
            }
            return 1800;
        }
        return 0;
    }

    /* renamed from: j */
    private static List<C10836q> m10110j(ObjectInput objectInput) {
        boolean z;
        long readByte;
        int i;
        int i2;
        int i3;
        int readInt = objectInput.readInt();
        if (readInt == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(readInt);
        int m10114f = m10114f(objectInput);
        long j = Long.MIN_VALUE;
        int i4 = m10114f;
        int i5 = 0;
        while (i5 < readInt) {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                z = true;
            } else {
                z = false;
            }
            int i6 = (readByte2 >>> 5) & 3;
            int m10105o = m10105o((readByte2 >>> 2) & 7);
            if (m10105o == -1) {
                readByte = objectInput.readLong();
            } else {
                readByte = ((((((((readByte2 & 3) << 16) | ((objectInput.readByte() & 255) << 8)) | (objectInput.readByte() & 255)) * 86400) - 4575744000L) + m10105o) - 7200) - m10114f;
            }
            if (readByte > j) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            i3 = m10114f(objectInput);
                        } else {
                            i3 = 7200;
                        }
                    } else {
                        i3 = 3600;
                    }
                    i = i3;
                } else {
                    i = 0;
                }
                if (z) {
                    m10114f = m10114f(objectInput);
                }
                if (i == Integer.MAX_VALUE) {
                    i2 = 0;
                } else {
                    i2 = i;
                }
                int i7 = m10114f + i2;
                arrayList.add(new C10836q(readByte, i4, i7, i));
                i5++;
                i4 = i7;
                j = readByte;
            } else {
                throw new StreamCorruptedException("Wrong order of transitions.");
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private static int m10109k(int i) {
        if (i != 0) {
            if (i != 3600) {
                if (i != 7200) {
                    if (i != 10800) {
                        if (i != 79200) {
                            if (i != 82800) {
                                return i != 86400 ? 0 : 7;
                            }
                            return 6;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: l */
    private static int m10108l(int i) {
        if (i != 0) {
            if (i != 60) {
                if (i != 3600) {
                    if (i != 7200) {
                        if (i != 10800) {
                            if (i != 14400) {
                                return i != 18000 ? 0 : 7;
                            }
                            return 6;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: m */
    private static int m10107m(C10822g c10822g) {
        return c10822g.m10074f().mo10218c(C10711g0.f27940I) + C10616c.m11035g(c10822g.m10077c() * 86400);
    }

    /* renamed from: n */
    private static int m10106n(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 3600;
            case 3:
                return 7200;
            case 4:
                return 10800;
            case 5:
                return 79200;
            case 6:
                return 82800;
            case 7:
                return 86400;
            default:
                return -1;
        }
    }

    /* renamed from: o */
    private static int m10105o(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 60;
            case 3:
                return 3600;
            case 4:
                return 7200;
            case 5:
                return 10800;
            case 6:
                return 14400;
            case 7:
                return 18000;
            default:
                return -1;
        }
    }

    /* renamed from: p */
    private static void m10104p(Object obj, ObjectOutput objectOutput) {
        ((C10816a) obj).m10083u(objectOutput);
    }

    /* renamed from: q */
    private static void m10103q(Object obj, ObjectOutput objectOutput) {
        C10817b c10817b = (C10817b) obj;
        c10817b.m10081l(objectOutput);
        m10096x(c10817b.m10082k(), objectOutput);
    }

    /* renamed from: r */
    private static void m10102r(Object obj, DataOutput dataOutput) {
        int i;
        int i2;
        C10818c c10818c = (C10818c) obj;
        boolean m10099u = m10099u(c10818c, dataOutput);
        dataOutput.writeByte(((c10818c.m10080m() << 3) | c10818c.m10079n()) & 255);
        boolean z = false;
        if (c10818c.m10078o()) {
            i = 128;
        } else {
            i = 0;
        }
        int m10107m = m10107m(c10818c);
        if (m10107m % 1800 == 0) {
            i2 = i | (m10107m / 1800);
            z = true;
        } else {
            i2 = i | 63;
        }
        dataOutput.writeByte(i2 & 255);
        if (!m10099u) {
            m10098v(dataOutput, c10818c.m10075e());
        }
        if (!z) {
            dataOutput.writeInt(m10107m);
        }
    }

    private Object readResolve() {
        return this.f28248j;
    }

    /* renamed from: s */
    private static void m10101s(Object obj, DataOutput dataOutput) {
        C10821f c10821f = (C10821f) obj;
        boolean m10099u = m10099u(c10821f, dataOutput);
        int m10107m = m10107m(c10821f);
        int m10109k = m10109k(m10107m);
        dataOutput.writeByte(((c10821f.m10073m() << 3) | m10109k) & 255);
        if (!m10099u) {
            m10098v(dataOutput, c10821f.m10075e());
        }
        if (m10109k == 0) {
            dataOutput.writeInt(m10107m);
        }
    }

    /* renamed from: t */
    private static void m10100t(Object obj, DataOutput dataOutput) {
        int i;
        boolean z;
        C10823h c10823h = (C10823h) obj;
        boolean m10099u = m10099u(c10823h, dataOutput);
        int m10064m = c10823h.m10064m() << 5;
        int m10107m = m10107m(c10823h);
        if (m10107m % 3600 == 0) {
            i = m10064m | (m10107m / 3600);
            z = true;
        } else {
            i = m10064m | 31;
            z = false;
        }
        dataOutput.writeByte(i & 255);
        if (!m10099u) {
            m10098v(dataOutput, c10823h.m10075e());
        }
        if (!z) {
            dataOutput.writeInt(m10107m);
        }
    }

    /* renamed from: u */
    private static boolean m10099u(C10822g c10822g, DataOutput dataOutput) {
        int i;
        int m10068k = c10822g.m10068k() << 4;
        int ordinal = c10822g.m10076d().ordinal();
        int m10075e = c10822g.m10075e();
        boolean z = true;
        if (m10075e != 0) {
            if (m10075e != 1800) {
                if (m10075e != 3600) {
                    if (m10075e != 7200) {
                        i = m10068k | (ordinal + 12);
                        z = false;
                        dataOutput.writeByte(i & 255);
                        return z;
                    }
                    ordinal += 9;
                } else {
                    ordinal += 6;
                }
            } else {
                ordinal += 3;
            }
        }
        i = m10068k | ordinal;
        dataOutput.writeByte(i & 255);
        return z;
    }

    /* renamed from: v */
    private static void m10098v(DataOutput dataOutput, int i) {
        if (i % 900 == 0) {
            dataOutput.writeByte(i / 900);
            return;
        }
        dataOutput.writeByte(127);
        dataOutput.writeInt(i);
    }

    /* renamed from: w */
    private static void m10097w(Object obj, ObjectOutput objectOutput) {
        C10828j c10828j = (C10828j) obj;
        C10836q m10057l = c10828j.m10057l();
        long m10012e = m10057l.m10012e();
        if (m10012e >= -4575744000L && m10012e < 10464767099L && m10012e % 900 == 0) {
            int i = (int) ((m10012e - (-4575744000L)) / 900);
            objectOutput.writeByte((i >>> 16) & 255);
            objectOutput.writeByte((i >>> 8) & 255);
            objectOutput.writeByte(i & 255);
        } else {
            objectOutput.writeByte(255);
            objectOutput.writeLong(m10057l.m10012e());
        }
        m10098v(objectOutput, m10057l.m10011f());
        m10098v(objectOutput, m10057l.m10008i());
        m10098v(objectOutput, m10057l.m10013d());
        m10096x(c10828j.m10055n(), objectOutput);
    }

    /* renamed from: x */
    private static void m10096x(List<AbstractC10819d> list, ObjectOutput objectOutput) {
        objectOutput.writeByte(list.size());
        for (AbstractC10819d abstractC10819d : list) {
            objectOutput.writeByte(abstractC10819d.mo10066g());
            switch (abstractC10819d.mo10066g()) {
                case 120:
                    m10101s(abstractC10819d, objectOutput);
                    break;
                case 121:
                    m10102r(abstractC10819d, objectOutput);
                    break;
                case 122:
                    m10100t(abstractC10819d, objectOutput);
                    break;
                default:
                    objectOutput.writeObject(abstractC10819d);
                    break;
            }
        }
    }

    /* renamed from: y */
    private static int m10095y(C10836q c10836q, int i, DataOutput dataOutput) {
        boolean z;
        byte b;
        int m10009h = c10836q.m10009h();
        int i2 = 1;
        int i3 = 0;
        if (m10009h != i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b = (byte) 128;
        } else {
            b = 0;
        }
        int m10013d = c10836q.m10013d();
        if (m10013d != 0) {
            if (m10013d != 3600) {
                if (m10013d != 7200) {
                    i2 = 0;
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
        }
        byte b2 = (byte) (b | (i2 << 5));
        long m10012e = c10836q.m10012e() + i + 7200;
        if (m10012e >= -4575744000L && m10012e < 18067104000L) {
            i3 = m10108l(C10616c.m11038d(m10012e, 86400));
        }
        byte b3 = (byte) ((i3 << 2) | b2);
        if (i3 == 0) {
            dataOutput.writeByte(b3);
            dataOutput.writeLong(c10836q.m10012e());
        } else {
            int i4 = (int) ((m10012e - (-4575744000L)) / 86400);
            dataOutput.writeByte((byte) (b3 | ((byte) ((i4 >>> 16) & 3))));
            dataOutput.writeByte((i4 >>> 8) & 255);
            dataOutput.writeByte(i4 & 255);
        }
        if (i2 == 0) {
            m10098v(dataOutput, m10013d);
        }
        if (z) {
            m10098v(dataOutput, m10009h);
        }
        return m10009h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static void m10094z(C10836q[] c10836qArr, int i, DataOutput dataOutput) {
        int min = Math.min(i, c10836qArr.length);
        dataOutput.writeInt(min);
        if (min > 0) {
            int m10011f = c10836qArr[0].m10011f();
            m10098v(dataOutput, m10011f);
            for (int i2 = 0; i2 < min; i2++) {
                m10011f = m10095y(c10836qArr[i2], m10011f, dataOutput);
            }
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        switch (objectInput.readByte()) {
            case 120:
                this.f28248j = m10116d(objectInput);
                return;
            case 121:
                this.f28248j = m10117c(objectInput);
                return;
            case 122:
                this.f28248j = m10115e(objectInput);
                return;
            case 123:
            case 124:
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
            case 125:
                this.f28248j = m10113g(objectInput);
                return;
            case 126:
                this.f28248j = m10119a(objectInput);
                return;
            case Byte.MAX_VALUE:
                this.f28248j = m10118b(objectInput);
                return;
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(this.f28249k);
        switch (this.f28249k) {
            case 120:
                m10101s(this.f28248j, objectOutput);
                return;
            case 121:
                m10102r(this.f28248j, objectOutput);
                return;
            case 122:
                m10100t(this.f28248j, objectOutput);
                return;
            case 123:
            case 124:
            default:
                throw new InvalidClassException("Unknown serialized type.");
            case 125:
                m10097w(this.f28248j, objectOutput);
                return;
            case 126:
                m10104p(this.f28248j, objectOutput);
                return;
            case 127:
                m10103q(this.f28248j, objectOutput);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i) {
        this.f28248j = obj;
        this.f28249k = i;
    }
}
