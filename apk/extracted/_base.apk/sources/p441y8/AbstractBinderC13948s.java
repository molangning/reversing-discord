package p441y8;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p029b9.AbstractBinderC2206r1;
import p029b9.C2198p;
import p029b9.InterfaceC2209s1;
import p175j9.BinderC8877b;
import p175j9.InterfaceC8875a;

/* renamed from: y8.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractBinderC13948s extends AbstractBinderC2206r1 {

    /* renamed from: c */
    private final int f35901c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC13948s(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        C2198p.m33994a(z);
        this.f35901c = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public static byte[] m1102c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p029b9.InterfaceC2209s1
    /* renamed from: a */
    public final InterfaceC8875a mo1103a() {
        return BinderC8877b.m17113e(mo1100e());
    }

    /* renamed from: e */
    abstract byte[] mo1100e();

    public final boolean equals(Object obj) {
        InterfaceC8875a mo1103a;
        if (obj != null && (obj instanceof InterfaceC2209s1)) {
            try {
                InterfaceC2209s1 interfaceC2209s1 = (InterfaceC2209s1) obj;
                if (interfaceC2209s1.mo1101f0() != this.f35901c || (mo1103a = interfaceC2209s1.mo1103a()) == null) {
                    return false;
                }
                return Arrays.equals(mo1100e(), (byte[]) BinderC8877b.m17114c(mo1103a));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // p029b9.InterfaceC2209s1
    /* renamed from: f0 */
    public final int mo1101f0() {
        return this.f35901c;
    }

    public final int hashCode() {
        return this.f35901c;
    }
}
