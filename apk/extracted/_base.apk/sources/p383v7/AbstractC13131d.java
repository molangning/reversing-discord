package p383v7;

import java.nio.ByteBuffer;
import p195k8.C9149a;
import p228m6.AbstractC10273h;
import p228m6.AbstractC10275i;

/* renamed from: v7.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13131d extends AbstractC10275i<C13138j, AbstractC13139k, C13135h> implements InterfaceC13134g {

    /* renamed from: n */
    private final String f34135n;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC13131d(String str) {
        super(new C13138j[2], new AbstractC13139k[2]);
        this.f34135n = str;
        m11959u(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p228m6.AbstractC10275i
    /* renamed from: A */
    public final C13135h mo3133j(C13138j c13138j, AbstractC13139k abstractC13139k, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C9149a.m16448e(c13138j.f26743l);
            abstractC13139k.m3125p(c13138j.f26745n, mo1161z(byteBuffer.array(), byteBuffer.limit(), z), c13138j.f34138r);
            abstractC13139k.m11992g(Integer.MIN_VALUE);
            return null;
        } catch (C13135h e) {
            return e;
        }
    }

    @Override // p383v7.InterfaceC13134g
    /* renamed from: a */
    public void mo2514a(long j) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p228m6.AbstractC10275i
    /* renamed from: w */
    public final C13138j mo3136g() {
        return new C13138j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p228m6.AbstractC10275i
    /* renamed from: x */
    public final AbstractC13139k mo3135h() {
        return new C13132e(new AbstractC10273h.InterfaceC10274a() { // from class: v7.c
            @Override // p228m6.AbstractC10273h.InterfaceC10274a
            /* renamed from: a */
            public final void mo2515a(AbstractC10273h abstractC10273h) {
                AbstractC13131d.this.m11962r((AbstractC13139k) abstractC10273h);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p228m6.AbstractC10275i
    /* renamed from: y */
    public final C13135h mo3134i(Throwable th2) {
        return new C13135h("Unexpected decode error", th2);
    }

    /* renamed from: z */
    protected abstract InterfaceC13133f mo1161z(byte[] bArr, int i, boolean z);
}
