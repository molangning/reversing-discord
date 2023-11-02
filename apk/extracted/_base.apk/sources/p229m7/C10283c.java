package p229m7;

import p195k8.C9149a;
import p296q6.C11765x;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11753o;
import p398w6.C13412f;

/* renamed from: m7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C10283c implements InterfaceC10289d0 {

    /* renamed from: a */
    private final InterfaceC11753o f26786a;

    /* renamed from: b */
    private InterfaceC11746i f26787b;

    /* renamed from: c */
    private InterfaceC11747j f26788c;

    public C10283c(InterfaceC11753o interfaceC11753o) {
        this.f26786a = interfaceC11753o;
    }

    @Override // p229m7.InterfaceC10289d0
    /* renamed from: a */
    public void mo11936a(long j, long j2) {
        ((InterfaceC11746i) C9149a.m16448e(this.f26787b)).mo663a(j, j2);
    }

    @Override // p229m7.InterfaceC10289d0
    /* renamed from: b */
    public int mo11935b(C11765x c11765x) {
        return ((InterfaceC11746i) C9149a.m16448e(this.f26787b)).mo660d((InterfaceC11747j) C9149a.m16448e(this.f26788c), c11765x);
    }

    @Override // p229m7.InterfaceC10289d0
    /* renamed from: c */
    public void mo11934c() {
        InterfaceC11746i interfaceC11746i = this.f26787b;
        if (interfaceC11746i instanceof C13412f) {
            ((C13412f) interfaceC11746i).m2615j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r6.getPosition() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6.getPosition() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = false;
     */
    @Override // p229m7.InterfaceC10289d0
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11933d(p153i8.InterfaceC7451h r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p296q6.InterfaceC11748k r15) {
        /*
            r7 = this;
            q6.f r6 = new q6.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f26788c = r6
            q6.i r8 = r7.f26787b
            if (r8 == 0) goto L10
            return
        L10:
            q6.o r8 = r7.f26786a
            q6.i[] r8 = r8.mo1203a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f26787b = r8
            goto L74
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.mo659e(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f26787b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            p195k8.C9149a.m16447f(r14)
            r6.mo6969e()
            goto L70
        L35:
            q6.i r1 = r7.f26787b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            q6.i r9 = r7.f26787b
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            p195k8.C9149a.m16447f(r13)
            r6.mo6969e()
            throw r8
        L57:
            q6.i r1 = r7.f26787b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            p195k8.C9149a.m16447f(r1)
            r6.mo6969e()
            int r0 = r0 + 1
            goto L22
        L70:
            q6.i r10 = r7.f26787b
            if (r10 == 0) goto L7a
        L74:
            q6.i r8 = r7.f26787b
            r8.mo662b(r15)
            return
        L7a:
            m7.t0 r10 = new m7.t0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p195k8.C9191p0.m16291L(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p195k8.C9149a.m16448e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m7.C10283c.mo11933d(i8.h, android.net.Uri, java.util.Map, long, long, q6.k):void");
    }

    @Override // p229m7.InterfaceC10289d0
    /* renamed from: e */
    public long mo11932e() {
        InterfaceC11747j interfaceC11747j = this.f26788c;
        if (interfaceC11747j != null) {
            return interfaceC11747j.getPosition();
        }
        return -1L;
    }

    @Override // p229m7.InterfaceC10289d0
    public void release() {
        InterfaceC11746i interfaceC11746i = this.f26787b;
        if (interfaceC11746i != null) {
            interfaceC11746i.release();
            this.f26787b = null;
        }
        this.f26788c = null;
    }
}
