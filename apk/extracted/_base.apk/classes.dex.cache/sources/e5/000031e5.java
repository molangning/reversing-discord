package p076e4;

import p415x3.InterfaceC13685d;

/* renamed from: e4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6105a implements InterfaceC6106b {

    /* renamed from: a */
    private final InterfaceC13685d f17365a;

    /* renamed from: b */
    private long f17366b = -1;

    public C6105a(InterfaceC13685d interfaceC13685d) {
        this.f17365a = interfaceC13685d;
    }

    @Override // p076e4.InterfaceC6106b
    /* renamed from: a */
    public long mo23553a(long j) {
        long m23555d = m23555d();
        long j2 = 0;
        if (m23555d == 0) {
            return -1L;
        }
        if (!m23554e() && j / m23555d() >= this.f17365a.mo1346b()) {
            return -1L;
        }
        long j3 = j % m23555d;
        int mo1347a = this.f17365a.mo1347a();
        for (int i = 0; i < mo1347a && j2 <= j3; i++) {
            j2 += this.f17365a.mo1339i(i);
        }
        return j + (j2 - j3);
    }

    @Override // p076e4.InterfaceC6106b
    /* renamed from: b */
    public int mo23552b(long j, long j2) {
        long m23555d = m23555d();
        if (m23555d == 0) {
            return m23556c(0L);
        }
        if (!m23554e() && j / m23555d >= this.f17365a.mo1346b()) {
            return -1;
        }
        return m23556c(j % m23555d);
    }

    /* renamed from: c */
    int m23556c(long j) {
        int i = 0;
        long j2 = 0;
        do {
            j2 += this.f17365a.mo1339i(i);
            i++;
        } while (j >= j2);
        return i - 1;
    }

    /* renamed from: d */
    public long m23555d() {
        long j = this.f17366b;
        if (j != -1) {
            return j;
        }
        this.f17366b = 0L;
        int mo1347a = this.f17365a.mo1347a();
        for (int i = 0; i < mo1347a; i++) {
            this.f17366b += this.f17365a.mo1339i(i);
        }
        return this.f17366b;
    }

    /* renamed from: e */
    public boolean m23554e() {
        return this.f17365a.mo1346b() == 0;
    }
}