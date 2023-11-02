package dj;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, m14357d2 = {"Ldj/g;", "", "", "f", "e", "", "c", "", "esc", "b", "a", "", "cl", "d", "", "[C", "ESCAPE_2_CHAR", "", "[B", "CHAR_TO_TOKEN", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5986g {

    /* renamed from: a */
    public static final C5986g f17026a;

    /* renamed from: b */
    public static final char[] f17027b;

    /* renamed from: c */
    public static final byte[] f17028c;

    static {
        C5986g c5986g = new C5986g();
        f17026a = c5986g;
        f17027b = new char[117];
        f17028c = new byte[126];
        c5986g.m23950f();
        c5986g.m23951e();
    }

    private C5986g() {
    }

    /* renamed from: a */
    private final void m23955a(char c, char c2) {
        m23954b(c, c2);
    }

    /* renamed from: b */
    private final void m23954b(int i, char c) {
        if (c != 'u') {
            f17027b[c] = (char) i;
        }
    }

    /* renamed from: c */
    private final void m23953c(char c, byte b) {
        m23952d(c, b);
    }

    /* renamed from: d */
    private final void m23952d(int i, byte b) {
        f17028c[i] = b;
    }

    /* renamed from: e */
    private final void m23951e() {
        for (int i = 0; i < 33; i++) {
            m23952d(i, Byte.MAX_VALUE);
        }
        m23952d(9, (byte) 3);
        m23952d(10, (byte) 3);
        m23952d(13, (byte) 3);
        m23952d(32, (byte) 3);
        m23953c(',', (byte) 4);
        m23953c(':', (byte) 5);
        m23953c('{', (byte) 6);
        m23953c('}', (byte) 7);
        m23953c('[', (byte) 8);
        m23953c(']', (byte) 9);
        m23953c('\"', (byte) 1);
        m23953c('\\', (byte) 2);
    }

    /* renamed from: f */
    private final void m23950f() {
        for (int i = 0; i < 32; i++) {
            m23954b(i, 'u');
        }
        m23954b(8, 'b');
        m23954b(9, 't');
        m23954b(10, 'n');
        m23954b(12, 'f');
        m23954b(13, 'r');
        m23955a('/', '/');
        m23955a('\"', '\"');
        m23955a('\\', '\\');
    }
}