package p039c6;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p059d6.InterfaceC5773x;
import p078e6.InterfaceC6117d;
import p097f6.InterfaceC6312b;
import p347t5.InterfaceC12594h;
import p381v5.AbstractC13093i;
import p381v5.AbstractC13103o;
import p381v5.C13109t;
import p397w5.InterfaceC13395e;
import p397w5.InterfaceC13406m;

/* renamed from: c6.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2400c implements InterfaceC2402e {

    /* renamed from: f */
    private static final Logger f6560f = Logger.getLogger(C13109t.class.getName());

    /* renamed from: a */
    private final InterfaceC5773x f6561a;

    /* renamed from: b */
    private final Executor f6562b;

    /* renamed from: c */
    private final InterfaceC13395e f6563c;

    /* renamed from: d */
    private final InterfaceC6117d f6564d;

    /* renamed from: e */
    private final InterfaceC6312b f6565e;

    public C2400c(Executor executor, InterfaceC13395e interfaceC13395e, InterfaceC5773x interfaceC5773x, InterfaceC6117d interfaceC6117d, InterfaceC6312b interfaceC6312b) {
        this.f6562b = executor;
        this.f6563c = interfaceC13395e;
        this.f6561a = interfaceC5773x;
        this.f6564d = interfaceC6117d;
        this.f6565e = interfaceC6312b;
    }

    /* renamed from: d */
    public /* synthetic */ Object m33516d(AbstractC13103o abstractC13103o, AbstractC13093i abstractC13093i) {
        this.f6564d.mo23497P(abstractC13103o, abstractC13093i);
        this.f6561a.mo24524a(abstractC13103o, 1);
        return null;
    }

    /* renamed from: e */
    public /* synthetic */ void m33515e(final AbstractC13103o abstractC13103o, InterfaceC12594h interfaceC12594h, AbstractC13093i abstractC13093i) {
        try {
            InterfaceC13406m mo2636a = this.f6563c.mo2636a(abstractC13103o.mo3261b());
            if (mo2636a == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC13103o.mo3261b());
                f6560f.warning(format);
                interfaceC12594h.mo3251a(new IllegalArgumentException(format));
                return;
            }
            final AbstractC13093i mo2627b = mo2636a.mo2627b(abstractC13093i);
            this.f6565e.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: c6.b
                @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                public final Object execute() {
                    Object m33516d;
                    m33516d = C2400c.this.m33516d(abstractC13103o, mo2627b);
                    return m33516d;
                }
            });
            interfaceC12594h.mo3251a(null);
        } catch (Exception e) {
            Logger logger = f6560f;
            logger.warning("Error scheduling event " + e.getMessage());
            interfaceC12594h.mo3251a(e);
        }
    }

    @Override // p039c6.InterfaceC2402e
    /* renamed from: a */
    public void mo33511a(final AbstractC13103o abstractC13103o, final AbstractC13093i abstractC13093i, final InterfaceC12594h interfaceC12594h) {
        this.f6562b.execute(new Runnable() { // from class: c6.a
            @Override // java.lang.Runnable
            public final void run() {
                C2400c.this.m33515e(abstractC13103o, interfaceC12594h, abstractC13093i);
            }
        });
    }
}