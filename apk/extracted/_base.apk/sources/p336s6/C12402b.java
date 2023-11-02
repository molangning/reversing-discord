package p336s6;

import java.util.Objects;
import p296q6.AbstractC11723a;
import p296q6.C11731b;
import p296q6.C11754p;
import p296q6.C11759s;
import p296q6.InterfaceC11747j;

/* renamed from: s6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12402b extends AbstractC11723a {

    /* renamed from: s6.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C12404b implements AbstractC11723a.InterfaceC11729f {

        /* renamed from: a */
        private final C11759s f32201a;

        /* renamed from: b */
        private final int f32202b;

        /* renamed from: c */
        private final C11754p.C11755a f32203c;

        /* renamed from: c */
        private long m5403c(InterfaceC11747j interfaceC11747j) {
            while (interfaceC11747j.mo3742h() < interfaceC11747j.getLength() - 6 && !C11754p.m6997h(interfaceC11747j, this.f32201a, this.f32202b, this.f32203c)) {
                interfaceC11747j.mo6967i(1);
            }
            if (interfaceC11747j.mo3742h() >= interfaceC11747j.getLength() - 6) {
                interfaceC11747j.mo6967i((int) (interfaceC11747j.getLength() - interfaceC11747j.mo3742h()));
                return this.f32201a.f30654j;
            }
            return this.f32203c.f30641a;
        }

        @Override // p296q6.AbstractC11723a.InterfaceC11729f
        /* renamed from: a */
        public AbstractC11723a.C11728e mo5405a(InterfaceC11747j interfaceC11747j, long j) {
            long position = interfaceC11747j.getPosition();
            long m5403c = m5403c(interfaceC11747j);
            long mo3742h = interfaceC11747j.mo3742h();
            interfaceC11747j.mo6967i(Math.max(6, this.f32201a.f30647c));
            long m5403c2 = m5403c(interfaceC11747j);
            long mo3742h2 = interfaceC11747j.mo3742h();
            if (m5403c <= j && m5403c2 > j) {
                return AbstractC11723a.C11728e.m7044e(mo3742h);
            }
            if (m5403c2 <= j) {
                return AbstractC11723a.C11728e.m7043f(m5403c2, mo3742h2);
            }
            return AbstractC11723a.C11728e.m7045d(m5403c, position);
        }

        @Override // p296q6.AbstractC11723a.InterfaceC11729f
        /* renamed from: b */
        public /* synthetic */ void mo5404b() {
            C11731b.m7040a(this);
        }

        private C12404b(C11759s c11759s, int i) {
            this.f32201a = c11759s;
            this.f32202b = i;
            this.f32203c = new C11754p.C11755a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12402b(final C11759s c11759s, int i, long j, long j2) {
        super(new AbstractC11723a.InterfaceC11727d() { // from class: s6.a
            @Override // p296q6.AbstractC11723a.InterfaceC11727d
            /* renamed from: a */
            public final long mo5406a(long j3) {
                return C11759s.this.m6973j(j3);
            }
        }, new C12404b(c11759s, i), c11759s.m6976g(), 0L, c11759s.f30654j, j, j2, c11759s.m6978e(), Math.max(6, c11759s.f30647c));
        Objects.requireNonNull(c11759s);
    }
}
