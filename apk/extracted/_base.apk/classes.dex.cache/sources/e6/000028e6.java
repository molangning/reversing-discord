package com.facebook.soloader;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* renamed from: com.facebook.soloader.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4319m {

    /* renamed from: com.facebook.soloader.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4320a extends RuntimeException {
        C4320a(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.soloader.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC4321b {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        

        /* renamed from: j */
        private final String f10991j;

        EnumC4321b(String str) {
            this.f10991j = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f10991j;
        }
    }

    /* renamed from: a */
    public static String[] m30107a(InterfaceC4304f interfaceC4304f) {
        if (interfaceC4304f instanceof C4305g) {
            return m30105c((C4305g) interfaceC4304f);
        }
        return m30106b(interfaceC4304f);
    }

    /* renamed from: b */
    private static String[] m30106b(InterfaceC4304f interfaceC4304f) {
        long m30101g;
        long m30104d;
        long m30102f;
        long j;
        long j2;
        long m30104d2;
        long j3;
        long m30104d3;
        long j4;
        String str;
        long j5;
        long m30104d4;
        String str2;
        long j6;
        long m30104d5;
        long m30101g2;
        long m30104d6;
        long m30104d7;
        long m30104d8;
        long m30101g3;
        long m30104d9;
        long m30101g4;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m30101g(interfaceC4304f, allocate, 0L) == 1179403647) {
            boolean z = true;
            if (m30100h(interfaceC4304f, allocate, 4L) != 1) {
                z = false;
            }
            if (m30100h(interfaceC4304f, allocate, 5L) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                m30104d = m30101g(interfaceC4304f, allocate, 28L);
            } else {
                m30104d = m30104d(interfaceC4304f, allocate, 32L);
            }
            if (z) {
                m30102f = m30102f(interfaceC4304f, allocate, 44L);
            } else {
                m30102f = m30102f(interfaceC4304f, allocate, 56L);
            }
            if (z) {
                j = 42;
            } else {
                j = 54;
            }
            int m30102f2 = m30102f(interfaceC4304f, allocate, j);
            if (m30102f == 65535) {
                if (z) {
                    m30104d9 = m30101g(interfaceC4304f, allocate, 32L);
                } else {
                    m30104d9 = m30104d(interfaceC4304f, allocate, 40L);
                }
                if (z) {
                    m30101g4 = m30101g(interfaceC4304f, allocate, m30104d9 + 28);
                } else {
                    m30101g4 = m30101g(interfaceC4304f, allocate, m30104d9 + 44);
                }
                m30102f = m30101g4;
            }
            long j7 = m30104d;
            long j8 = 0;
            while (true) {
                if (j8 < m30102f) {
                    if (z) {
                        m30101g3 = m30101g(interfaceC4304f, allocate, j7 + 0);
                    } else {
                        m30101g3 = m30101g(interfaceC4304f, allocate, j7 + 0);
                    }
                    if (m30101g3 == 2) {
                        if (z) {
                            j2 = m30101g(interfaceC4304f, allocate, j7 + 4);
                        } else {
                            j2 = m30104d(interfaceC4304f, allocate, j7 + 8);
                        }
                    } else {
                        j7 += m30102f2;
                        j8++;
                    }
                } else {
                    j2 = 0;
                    break;
                }
            }
            long j9 = 0;
            if (j2 != 0) {
                long j10 = j2;
                long j11 = 0;
                int i = 0;
                while (true) {
                    boolean z2 = z;
                    if (z) {
                        m30104d2 = m30101g(interfaceC4304f, allocate, j10 + j9);
                    } else {
                        m30104d2 = m30104d(interfaceC4304f, allocate, j10 + j9);
                    }
                    long j12 = j2;
                    String str3 = "malformed DT_NEEDED section";
                    if (m30104d2 == 1) {
                        if (i != Integer.MAX_VALUE) {
                            i++;
                            j3 = m30104d2;
                        } else {
                            throw new C4320a("malformed DT_NEEDED section");
                        }
                    } else {
                        j3 = m30104d2;
                        if (m30104d2 == 5) {
                            if (z2) {
                                m30104d3 = m30101g(interfaceC4304f, allocate, j10 + 4);
                            } else {
                                m30104d3 = m30104d(interfaceC4304f, allocate, j10 + 8);
                            }
                            j11 = m30104d3;
                        }
                    }
                    long j13 = 16;
                    if (z2) {
                        j4 = 8;
                    } else {
                        j4 = 16;
                    }
                    j10 += j4;
                    j9 = 0;
                    if (j3 == 0) {
                        if (j11 != 0) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < m30102f) {
                                    if (z2) {
                                        m30101g2 = m30101g(interfaceC4304f, allocate, m30104d + j9);
                                    } else {
                                        m30101g2 = m30101g(interfaceC4304f, allocate, m30104d + j9);
                                    }
                                    if (m30101g2 == 1) {
                                        if (z2) {
                                            m30104d6 = m30101g(interfaceC4304f, allocate, m30104d + 8);
                                        } else {
                                            m30104d6 = m30104d(interfaceC4304f, allocate, m30104d + j13);
                                        }
                                        if (z2) {
                                            str = str3;
                                            m30104d7 = m30101g(interfaceC4304f, allocate, m30104d + 20);
                                        } else {
                                            str = str3;
                                            m30104d7 = m30104d(interfaceC4304f, allocate, m30104d + 40);
                                        }
                                        if (m30104d6 <= j11 && j11 < m30104d7 + m30104d6) {
                                            if (z2) {
                                                m30104d8 = m30101g(interfaceC4304f, allocate, m30104d + 4);
                                            } else {
                                                m30104d8 = m30104d(interfaceC4304f, allocate, m30104d + 8);
                                            }
                                            j5 = m30104d8 + (j11 - m30104d6);
                                        }
                                    } else {
                                        str = str3;
                                    }
                                    m30104d += m30102f2;
                                    i2++;
                                    str3 = str;
                                    j13 = 16;
                                    j9 = 0;
                                } else {
                                    str = str3;
                                    j5 = 0;
                                    break;
                                }
                            }
                            long j14 = 0;
                            if (j5 != 0) {
                                String[] strArr = new String[i];
                                long j15 = j12;
                                int i3 = 0;
                                while (true) {
                                    long j16 = j15 + j14;
                                    if (z2) {
                                        m30104d4 = m30101g(interfaceC4304f, allocate, j16);
                                    } else {
                                        m30104d4 = m30104d(interfaceC4304f, allocate, j16);
                                    }
                                    if (m30104d4 == 1) {
                                        if (z2) {
                                            m30104d5 = m30101g(interfaceC4304f, allocate, j15 + 4);
                                        } else {
                                            m30104d5 = m30104d(interfaceC4304f, allocate, j15 + 8);
                                        }
                                        strArr[i3] = m30103e(interfaceC4304f, allocate, m30104d5 + j5);
                                        if (i3 != Integer.MAX_VALUE) {
                                            i3++;
                                            str2 = str;
                                        } else {
                                            throw new C4320a(str);
                                        }
                                    } else {
                                        str2 = str;
                                    }
                                    if (z2) {
                                        j6 = 8;
                                    } else {
                                        j6 = 16;
                                    }
                                    j15 += j6;
                                    if (m30104d4 == 0) {
                                        if (i3 == i) {
                                            return strArr;
                                        }
                                        throw new C4320a(str2);
                                    }
                                    str = str2;
                                    j14 = 0;
                                }
                            } else {
                                throw new C4320a("did not find file offset of DT_STRTAB table");
                            }
                        } else {
                            throw new C4320a("Dynamic section string-table not found");
                        }
                    } else {
                        z = z2;
                        j2 = j12;
                    }
                }
            } else {
                throw new C4320a("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new C4320a("file is not ELF: 0x" + Long.toHexString(m30101g));
        }
    }

    /* renamed from: c */
    private static String[] m30105c(C4305g c4305g) {
        int i = 0;
        while (true) {
            try {
                return m30106b(c4305g);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i <= 4) {
                    Thread.interrupted();
                    Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                    c4305g.m30121a();
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: d */
    private static long m30104d(InterfaceC4304f interfaceC4304f, ByteBuffer byteBuffer, long j) {
        m30099i(interfaceC4304f, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    /* renamed from: e */
    private static String m30103e(InterfaceC4304f interfaceC4304f, ByteBuffer byteBuffer, long j) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short m30100h = m30100h(interfaceC4304f, byteBuffer, j);
            if (m30100h != 0) {
                sb2.append((char) m30100h);
                j = j2;
            } else {
                return sb2.toString();
            }
        }
    }

    /* renamed from: f */
    private static int m30102f(InterfaceC4304f interfaceC4304f, ByteBuffer byteBuffer, long j) {
        m30099i(interfaceC4304f, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: g */
    private static long m30101g(InterfaceC4304f interfaceC4304f, ByteBuffer byteBuffer, long j) {
        m30099i(interfaceC4304f, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    /* renamed from: h */
    private static short m30100h(InterfaceC4304f interfaceC4304f, ByteBuffer byteBuffer, long j) {
        m30099i(interfaceC4304f, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* renamed from: i */
    private static void m30099i(InterfaceC4304f interfaceC4304f, ByteBuffer byteBuffer, int i, long j) {
        int mo30120G;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (mo30120G = interfaceC4304f.mo30120G(byteBuffer, j)) != -1) {
            j += mo30120G;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C4320a("ELF file truncated");
    }
}