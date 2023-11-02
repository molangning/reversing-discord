package p275p1;

import java.io.EOFException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p275p1.AbstractC11368c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C11372e extends AbstractC11368c {

    /* renamed from: q */
    private final BufferedSource f29608q;

    /* renamed from: r */
    private final Buffer f29609r;

    /* renamed from: s */
    private int f29610s = 0;

    /* renamed from: t */
    private long f29611t;

    /* renamed from: u */
    private int f29612u;

    /* renamed from: v */
    private String f29613v;

    /* renamed from: w */
    private static final ByteString f29604w = ByteString.m8568e("'\\");

    /* renamed from: x */
    private static final ByteString f29605x = ByteString.m8568e("\"\\");

    /* renamed from: y */
    private static final ByteString f29606y = ByteString.m8568e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: z */
    private static final ByteString f29607z = ByteString.m8568e("\n\r");

    /* renamed from: A */
    private static final ByteString f29603A = ByteString.m8568e("*/");

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11372e(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f29608q = bufferedSource;
            this.f29609r = bufferedSource.mo8585p();
            m8246Q(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: A0 */
    private String m8237A0(ByteString byteString) {
        StringBuilder sb2 = null;
        while (true) {
            long mo8599B = this.f29608q.mo8599B(byteString);
            if (mo8599B != -1) {
                if (this.f29609r.m8645D(mo8599B) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(this.f29609r.m8620j0(mo8599B));
                    this.f29609r.readByte();
                    sb2.append(m8232E0());
                } else if (sb2 == null) {
                    String m8620j0 = this.f29609r.m8620j0(mo8599B);
                    this.f29609r.readByte();
                    return m8620j0;
                } else {
                    sb2.append(this.f29609r.m8620j0(mo8599B));
                    this.f29609r.readByte();
                    return sb2.toString();
                }
            } else {
                throw m8244Y("Unterminated string");
            }
        }
    }

    /* renamed from: B0 */
    private String m8236B0() {
        long mo8599B = this.f29608q.mo8599B(f29606y);
        if (mo8599B != -1) {
            return this.f29609r.m8620j0(mo8599B);
        }
        return this.f29609r.mo8584p0();
    }

    /* renamed from: C0 */
    private int m8235C0() {
        String str;
        String str2;
        int i;
        byte m8645D = this.f29609r.m8645D(0L);
        if (m8645D != 116 && m8645D != 84) {
            if (m8645D != 102 && m8645D != 70) {
                if (m8645D != 110 && m8645D != 78) {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i = 5;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f29608q.mo8590g(i3)) {
                return 0;
            }
            byte m8645D2 = this.f29609r.m8645D(i2);
            if (m8645D2 != str.charAt(i2) && m8645D2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f29608q.mo8590g(length + 1) && m8213t0(this.f29609r.m8645D(length))) {
            return 0;
        }
        this.f29609r.skip(length);
        this.f29610s = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
        if (m8213t0(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
        if (r6 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r8 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
        if (r8 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
        r16.f29611t = r8;
        r16.f29609r.skip(r5);
        r16.f29610s = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
        if (r6 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
        if (r6 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
        r16.f29612u = r5;
        r16.f29610s = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
        return 0;
     */
    /* renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m8233D0() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p275p1.C11372e.m8233D0():int");
    }

    /* renamed from: E0 */
    private char m8232E0() {
        int i;
        int i2;
        if (this.f29608q.mo8590g(1L)) {
            byte readByte = this.f29609r.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f29588n) {
                                        return (char) readByte;
                                    }
                                    throw m8244Y("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f29608q.mo8590g(4L)) {
                                    char c = 0;
                                    for (int i3 = 0; i3 < 4; i3++) {
                                        byte m8645D = this.f29609r.m8645D(i3);
                                        char c2 = (char) (c << 4);
                                        if (m8645D >= 48 && m8645D <= 57) {
                                            i2 = m8645D - 48;
                                        } else {
                                            if (m8645D >= 97 && m8645D <= 102) {
                                                i = m8645D - 97;
                                            } else if (m8645D < 65 || m8645D > 70) {
                                                throw m8244Y("\\u" + this.f29609r.m8620j0(4L));
                                            } else {
                                                i = m8645D - 65;
                                            }
                                            i2 = i + 10;
                                        }
                                        c = (char) (c2 + i2);
                                    }
                                    this.f29609r.skip(4L);
                                    return c;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + m8242o());
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        throw m8244Y("Unterminated escape sequence");
    }

    /* renamed from: F0 */
    private void m8231F0(ByteString byteString) {
        while (true) {
            long mo8599B = this.f29608q.mo8599B(byteString);
            if (mo8599B != -1) {
                if (this.f29609r.m8645D(mo8599B) == 92) {
                    this.f29609r.skip(mo8599B + 1);
                    m8232E0();
                } else {
                    this.f29609r.skip(mo8599B + 1);
                    return;
                }
            } else {
                throw m8244Y("Unterminated string");
            }
        }
    }

    /* renamed from: G0 */
    private boolean m8230G0() {
        boolean z;
        long size;
        BufferedSource bufferedSource = this.f29608q;
        ByteString byteString = f29603A;
        long mo8582w = bufferedSource.mo8582w(byteString);
        if (mo8582w != -1) {
            z = true;
        } else {
            z = false;
        }
        Buffer buffer = this.f29609r;
        if (z) {
            size = mo8582w + byteString.m8551z();
        } else {
            size = buffer.size();
        }
        buffer.skip(size);
        return z;
    }

    /* renamed from: H0 */
    private void m8229H0() {
        long size;
        long mo8599B = this.f29608q.mo8599B(f29607z);
        Buffer buffer = this.f29609r;
        if (mo8599B != -1) {
            size = mo8599B + 1;
        } else {
            size = buffer.size();
        }
        buffer.skip(size);
    }

    /* renamed from: I0 */
    private void m8227I0() {
        long mo8599B = this.f29608q.mo8599B(f29606y);
        Buffer buffer = this.f29609r;
        if (mo8599B == -1) {
            mo8599B = buffer.size();
        }
        buffer.skip(mo8599B);
    }

    /* renamed from: b0 */
    private void m8223b0() {
        if (this.f29588n) {
            return;
        }
        throw m8244Y("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* renamed from: e0 */
    private int m8222e0() {
        int[] iArr = this.f29585k;
        int i = this.f29584j;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m8211w0 = m8211w0(true);
            this.f29609r.readByte();
            if (m8211w0 != 44) {
                if (m8211w0 != 59) {
                    if (m8211w0 == 93) {
                        this.f29610s = 4;
                        return 4;
                    }
                    throw m8244Y("Unterminated array");
                }
                m8223b0();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int m8211w02 = m8211w0(true);
                this.f29609r.readByte();
                if (m8211w02 != 58) {
                    if (m8211w02 == 61) {
                        m8223b0();
                        if (this.f29608q.mo8590g(1L) && this.f29609r.m8645D(0L) == 62) {
                            this.f29609r.readByte();
                        }
                    } else {
                        throw m8244Y("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (m8211w0(false) == -1) {
                    this.f29610s = 18;
                    return 18;
                }
                m8223b0();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int m8211w03 = m8211w0(true);
                this.f29609r.readByte();
                if (m8211w03 != 44) {
                    if (m8211w03 != 59) {
                        if (m8211w03 == 125) {
                            this.f29610s = 2;
                            return 2;
                        }
                        throw m8244Y("Unterminated object");
                    }
                    m8223b0();
                }
            }
            int m8211w04 = m8211w0(true);
            if (m8211w04 != 34) {
                if (m8211w04 != 39) {
                    if (m8211w04 != 125) {
                        m8223b0();
                        if (m8213t0((char) m8211w04)) {
                            this.f29610s = 14;
                            return 14;
                        }
                        throw m8244Y("Expected name");
                    } else if (i2 != 5) {
                        this.f29609r.readByte();
                        this.f29610s = 2;
                        return 2;
                    } else {
                        throw m8244Y("Expected name");
                    }
                }
                this.f29609r.readByte();
                m8223b0();
                this.f29610s = 12;
                return 12;
            }
            this.f29609r.readByte();
            this.f29610s = 13;
            return 13;
        }
        int m8211w05 = m8211w0(true);
        if (m8211w05 != 34) {
            if (m8211w05 != 39) {
                if (m8211w05 != 44 && m8211w05 != 59) {
                    if (m8211w05 != 91) {
                        if (m8211w05 != 93) {
                            if (m8211w05 != 123) {
                                int m8235C0 = m8235C0();
                                if (m8235C0 != 0) {
                                    return m8235C0;
                                }
                                int m8233D0 = m8233D0();
                                if (m8233D0 != 0) {
                                    return m8233D0;
                                }
                                if (m8213t0(this.f29609r.m8645D(0L))) {
                                    m8223b0();
                                    this.f29610s = 10;
                                    return 10;
                                }
                                throw m8244Y("Expected value");
                            }
                            this.f29609r.readByte();
                            this.f29610s = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.f29609r.readByte();
                            this.f29610s = 4;
                            return 4;
                        }
                    } else {
                        this.f29609r.readByte();
                        this.f29610s = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw m8244Y("Unexpected value");
                }
                m8223b0();
                this.f29610s = 7;
                return 7;
            }
            m8223b0();
            this.f29609r.readByte();
            this.f29610s = 8;
            return 8;
        }
        this.f29609r.readByte();
        this.f29610s = 9;
        return 9;
    }

    /* renamed from: j0 */
    private int m8218j0(String str, AbstractC11368c.C11369a c11369a) {
        int length = c11369a.f29590a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c11369a.f29590a[i])) {
                this.f29610s = 0;
                this.f29586l[this.f29584j - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: t0 */
    private boolean m8213t0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m8223b0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f29609r.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.f29608q.mo8590g(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        m8223b0();
        r3 = r6.f29609r.m8645D(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.f29609r.readByte();
        r6.f29609r.readByte();
        m8229H0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.f29609r.readByte();
        r6.f29609r.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (m8230G0() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw m8244Y("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        m8223b0();
        m8229H0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m8211w0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            okio.BufferedSource r2 = r6.f29608q
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo8590g(r4)
            if (r2 == 0) goto L82
            okio.Buffer r2 = r6.f29609r
            long r4 = (long) r1
            byte r1 = r2.m8645D(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            okio.Buffer r2 = r6.f29609r
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            okio.BufferedSource r3 = r6.f29608q
            r4 = 2
            boolean r3 = r3.mo8590g(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.m8223b0()
            okio.Buffer r3 = r6.f29609r
            r4 = 1
            byte r3 = r3.m8645D(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            okio.Buffer r1 = r6.f29609r
            r1.readByte()
            okio.Buffer r1 = r6.f29609r
            r1.readByte()
            r6.m8229H0()
            goto L1
        L5c:
            okio.Buffer r1 = r6.f29609r
            r1.readByte()
            okio.Buffer r1 = r6.f29609r
            r1.readByte()
            boolean r1 = r6.m8230G0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            p1.b r7 = r6.m8244Y(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.m8223b0()
            r6.m8229H0()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p275p1.C11372e.m8211w0(boolean):int");
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: A */
    public String mo8238A() {
        String str;
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i == 14) {
            str = m8236B0();
        } else if (i == 13) {
            str = m8237A0(f29605x);
        } else if (i == 12) {
            str = m8237A0(f29604w);
        } else if (i == 15) {
            str = this.f29613v;
        } else {
            throw new C11366a("Expected a name but was " + mo8228I() + " at path " + m8242o());
        }
        this.f29610s = 0;
        this.f29586l[this.f29584j - 1] = str;
        return str;
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: D */
    public String mo8234D() {
        String m8620j0;
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i == 10) {
            m8620j0 = m8236B0();
        } else if (i == 9) {
            m8620j0 = m8237A0(f29605x);
        } else if (i == 8) {
            m8620j0 = m8237A0(f29604w);
        } else if (i == 11) {
            m8620j0 = this.f29613v;
            this.f29613v = null;
        } else if (i == 16) {
            m8620j0 = Long.toString(this.f29611t);
        } else if (i == 17) {
            m8620j0 = this.f29609r.m8620j0(this.f29612u);
        } else {
            throw new C11366a("Expected a string but was " + mo8228I() + " at path " + m8242o());
        }
        this.f29610s = 0;
        int[] iArr = this.f29587m;
        int i2 = this.f29584j - 1;
        iArr[i2] = iArr[i2] + 1;
        return m8620j0;
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: I */
    public AbstractC11368c.EnumC11370b mo8228I() {
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        switch (i) {
            case 1:
                return AbstractC11368c.EnumC11370b.BEGIN_OBJECT;
            case 2:
                return AbstractC11368c.EnumC11370b.END_OBJECT;
            case 3:
                return AbstractC11368c.EnumC11370b.BEGIN_ARRAY;
            case 4:
                return AbstractC11368c.EnumC11370b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC11368c.EnumC11370b.BOOLEAN;
            case 7:
                return AbstractC11368c.EnumC11370b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC11368c.EnumC11370b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC11368c.EnumC11370b.NAME;
            case 16:
            case 17:
                return AbstractC11368c.EnumC11370b.NUMBER;
            case 18:
                return AbstractC11368c.EnumC11370b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: R */
    public int mo8226R(AbstractC11368c.C11369a c11369a) {
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m8218j0(this.f29613v, c11369a);
        }
        int mo8598E = this.f29608q.mo8598E(c11369a.f29591b);
        if (mo8598E != -1) {
            this.f29610s = 0;
            this.f29586l[this.f29584j - 1] = c11369a.f29590a[mo8598E];
            return mo8598E;
        }
        String str = this.f29586l[this.f29584j - 1];
        String mo8238A = mo8238A();
        int m8218j0 = m8218j0(mo8238A, c11369a);
        if (m8218j0 == -1) {
            this.f29610s = 15;
            this.f29613v = mo8238A;
            this.f29586l[this.f29584j - 1] = str;
        }
        return m8218j0;
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: S */
    public void mo8225S() {
        if (!this.f29589o) {
            int i = this.f29610s;
            if (i == 0) {
                i = m8222e0();
            }
            if (i == 14) {
                m8227I0();
            } else if (i == 13) {
                m8231F0(f29605x);
            } else if (i == 12) {
                m8231F0(f29604w);
            } else if (i != 15) {
                throw new C11366a("Expected a name but was " + mo8228I() + " at path " + m8242o());
            }
            this.f29610s = 0;
            this.f29586l[this.f29584j - 1] = "null";
            return;
        }
        throw new C11366a("Cannot skip unexpected " + mo8228I() + " at " + m8242o());
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: U */
    public void mo8224U() {
        if (!this.f29589o) {
            int i = 0;
            do {
                int i2 = this.f29610s;
                if (i2 == 0) {
                    i2 = m8222e0();
                }
                if (i2 == 3) {
                    m8246Q(1);
                } else if (i2 == 1) {
                    m8246Q(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f29584j--;
                        } else {
                            throw new C11366a("Expected a value but was " + mo8228I() + " at path " + m8242o());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f29584j--;
                        } else {
                            throw new C11366a("Expected a value but was " + mo8228I() + " at path " + m8242o());
                        }
                    } else if (i2 != 14 && i2 != 10) {
                        if (i2 != 9 && i2 != 13) {
                            if (i2 != 8 && i2 != 12) {
                                if (i2 == 17) {
                                    this.f29609r.skip(this.f29612u);
                                } else if (i2 == 18) {
                                    throw new C11366a("Expected a value but was " + mo8228I() + " at path " + m8242o());
                                }
                            } else {
                                m8231F0(f29604w);
                            }
                        } else {
                            m8231F0(f29605x);
                        }
                    } else {
                        m8227I0();
                    }
                    this.f29610s = 0;
                }
                i++;
                this.f29610s = 0;
            } while (i != 0);
            int[] iArr = this.f29587m;
            int i3 = this.f29584j;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f29586l[i3 - 1] = "null";
            return;
        }
        throw new C11366a("Cannot skip unexpected " + mo8228I() + " at " + m8242o());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29610s = 0;
        this.f29585k[0] = 8;
        this.f29584j = 1;
        this.f29609r.m8621j();
        this.f29608q.close();
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: h */
    public void mo8221h() {
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i == 3) {
            m8246Q(1);
            this.f29587m[this.f29584j - 1] = 0;
            this.f29610s = 0;
            return;
        }
        throw new C11366a("Expected BEGIN_ARRAY but was " + mo8228I() + " at path " + m8242o());
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: i */
    public void mo8220i() {
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i == 1) {
            m8246Q(3);
            this.f29610s = 0;
            return;
        }
        throw new C11366a("Expected BEGIN_OBJECT but was " + mo8228I() + " at path " + m8242o());
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: j */
    public void mo8219j() {
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i == 4) {
            int i2 = this.f29584j - 1;
            this.f29584j = i2;
            int[] iArr = this.f29587m;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f29610s = 0;
            return;
        }
        throw new C11366a("Expected END_ARRAY but was " + mo8228I() + " at path " + m8242o());
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: m */
    public void mo8217m() {
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i == 2) {
            int i2 = this.f29584j - 1;
            this.f29584j = i2;
            this.f29586l[i2] = null;
            int[] iArr = this.f29587m;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f29610s = 0;
            return;
        }
        throw new C11366a("Expected END_OBJECT but was " + mo8228I() + " at path " + m8242o());
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: q */
    public boolean mo8216q() {
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i != 2 && i != 4 && i != 18) {
            return true;
        }
        return false;
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: s */
    public boolean mo8215s() {
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i == 5) {
            this.f29610s = 0;
            int[] iArr = this.f29587m;
            int i2 = this.f29584j - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f29610s = 0;
            int[] iArr2 = this.f29587m;
            int i3 = this.f29584j - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C11366a("Expected a boolean but was " + mo8228I() + " at path " + m8242o());
        }
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: t */
    public double mo8214t() {
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i == 16) {
            this.f29610s = 0;
            int[] iArr = this.f29587m;
            int i2 = this.f29584j - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f29611t;
        }
        if (i == 17) {
            this.f29613v = this.f29609r.m8620j0(this.f29612u);
        } else if (i == 9) {
            this.f29613v = m8237A0(f29605x);
        } else if (i == 8) {
            this.f29613v = m8237A0(f29604w);
        } else if (i == 10) {
            this.f29613v = m8236B0();
        } else if (i != 11) {
            throw new C11366a("Expected a double but was " + mo8228I() + " at path " + m8242o());
        }
        this.f29610s = 11;
        try {
            double parseDouble = Double.parseDouble(this.f29613v);
            if (!this.f29588n && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new C11367b("JSON forbids NaN and infinities: " + parseDouble + " at path " + m8242o());
            }
            this.f29613v = null;
            this.f29610s = 0;
            int[] iArr2 = this.f29587m;
            int i3 = this.f29584j - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new C11366a("Expected a double but was " + this.f29613v + " at path " + m8242o());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f29608q + ")";
    }

    @Override // p275p1.AbstractC11368c
    /* renamed from: v */
    public int mo8212v() {
        String m8237A0;
        int i = this.f29610s;
        if (i == 0) {
            i = m8222e0();
        }
        if (i == 16) {
            long j = this.f29611t;
            int i2 = (int) j;
            if (j == i2) {
                this.f29610s = 0;
                int[] iArr = this.f29587m;
                int i3 = this.f29584j - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C11366a("Expected an int but was " + this.f29611t + " at path " + m8242o());
        }
        if (i == 17) {
            this.f29613v = this.f29609r.m8620j0(this.f29612u);
        } else if (i != 9 && i != 8) {
            if (i != 11) {
                throw new C11366a("Expected an int but was " + mo8228I() + " at path " + m8242o());
            }
        } else {
            if (i == 9) {
                m8237A0 = m8237A0(f29605x);
            } else {
                m8237A0 = m8237A0(f29604w);
            }
            this.f29613v = m8237A0;
            try {
                int parseInt = Integer.parseInt(m8237A0);
                this.f29610s = 0;
                int[] iArr2 = this.f29587m;
                int i4 = this.f29584j - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f29610s = 11;
        try {
            double parseDouble = Double.parseDouble(this.f29613v);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.f29613v = null;
                this.f29610s = 0;
                int[] iArr3 = this.f29587m;
                int i6 = this.f29584j - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C11366a("Expected an int but was " + this.f29613v + " at path " + m8242o());
        } catch (NumberFormatException unused2) {
            throw new C11366a("Expected an int but was " + this.f29613v + " at path " + m8242o());
        }
    }
}
