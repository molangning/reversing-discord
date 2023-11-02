package p441y8;

import java.lang.ref.WeakReference;

/* renamed from: y8.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractBinderC13950u extends AbstractBinderC13948s {

    /* renamed from: e */
    private static final WeakReference<byte[]> f35903e = new WeakReference<>(null);

    /* renamed from: d */
    private WeakReference<byte[]> f35904d;

    public AbstractBinderC13950u(byte[] bArr) {
        super(bArr);
        this.f35904d = f35903e;
    }

    @Override // p441y8.AbstractBinderC13948s
    /* renamed from: e */
    final byte[] mo1100e() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f35904d.get();
            if (bArr == null) {
                bArr = mo1099g0();
                this.f35904d = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: g0 */
    protected abstract byte[] mo1099g0();
}