package com.facebook.imageutils;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3882f {
    /* renamed from: a */
    private static boolean m30538a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m30537b(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: c */
    private static byte m30536c(InputStream inputStream) {
        return (byte) (inputStream.read() & 255);
    }

    /* renamed from: d */
    private static String m30535d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            sb2.append((char) b);
        }
        return sb2.toString();
    }

    /* renamed from: e */
    private static int m30534e(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 24) & (-16777216)) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: f */
    private static short m30533f(InputStream inputStream) {
        return (short) (inputStream.read() & 255);
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m30532g(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    inputStream.read(bArr);
                } catch (IOException e) {
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            if (!m30538a(bArr, "RIFF")) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return null;
            }
            m30534e(inputStream);
            inputStream.read(bArr);
            if (!m30538a(bArr, "WEBP")) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return null;
            }
            inputStream.read(bArr);
            String m30535d = m30535d(bArr);
            if ("VP8 ".equals(m30535d)) {
                Pair<Integer, Integer> m30531h = m30531h(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return m30531h;
            } else if ("VP8L".equals(m30535d)) {
                Pair<Integer, Integer> m30530i = m30530i(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                return m30530i;
            } else if ("VP8X".equals(m30535d)) {
                Pair<Integer, Integer> m30529j = m30529j(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                return m30529j;
            } else {
                inputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th2;
        }
    }

    /* renamed from: h */
    private static Pair<Integer, Integer> m30531h(InputStream inputStream) {
        inputStream.skip(7L);
        short m30533f = m30533f(inputStream);
        short m30533f2 = m30533f(inputStream);
        short m30533f3 = m30533f(inputStream);
        if (m30533f == 157 && m30533f2 == 1 && m30533f3 == 42) {
            return new Pair<>(Integer.valueOf(m30537b(inputStream)), Integer.valueOf(m30537b(inputStream)));
        }
        return null;
    }

    /* renamed from: i */
    private static Pair<Integer, Integer> m30530i(InputStream inputStream) {
        m30534e(inputStream);
        if (m30536c(inputStream) != 47) {
            return null;
        }
        int read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    /* renamed from: j */
    private static Pair<Integer, Integer> m30529j(InputStream inputStream) {
        inputStream.skip(8L);
        return new Pair<>(Integer.valueOf(m30528k(inputStream) + 1), Integer.valueOf(m30528k(inputStream) + 1));
    }

    /* renamed from: k */
    private static int m30528k(InputStream inputStream) {
        byte m30536c = m30536c(inputStream);
        return ((m30536c(inputStream) << 16) & 16711680) | ((m30536c(inputStream) << 8) & 65280) | (m30536c & 255);
    }
}
