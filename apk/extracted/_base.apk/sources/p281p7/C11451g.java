package p281p7;

import p296q6.C11736d;
import p297q7.C11778h;

/* renamed from: p7.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11451g implements InterfaceC11449e {

    /* renamed from: a */
    private final C11736d f29772a;

    /* renamed from: b */
    private final long f29773b;

    public C11451g(C11736d c11736d, long j) {
        this.f29772a = c11736d;
        this.f29773b = j;
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: c */
    public long mo6859c(long j) {
        return this.f29772a.f30588e[(int) j] - this.f29773b;
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: d */
    public long mo6858d(long j, long j2) {
        return this.f29772a.f30587d[(int) j];
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: e */
    public long mo6857e(long j, long j2) {
        return 0L;
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: f */
    public long mo6856f(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: g */
    public C11778h mo6855g(long j) {
        C11736d c11736d = this.f29772a;
        int i = (int) j;
        return new C11778h(null, c11736d.f30586c[i], c11736d.f30585b[i]);
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: h */
    public long mo6854h(long j, long j2) {
        return this.f29772a.m7031a(j + this.f29773b);
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: i */
    public int mo6853i(long j) {
        return this.f29772a.f30584a;
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: j */
    public boolean mo6852j() {
        return true;
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: k */
    public long mo6851k() {
        return 0L;
    }

    @Override // p281p7.InterfaceC11449e
    /* renamed from: l */
    public int mo6850l(long j, long j2) {
        return this.f29772a.f30584a;
    }
}
