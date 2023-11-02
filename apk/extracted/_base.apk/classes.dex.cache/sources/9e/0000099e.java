package p029b9;

import android.os.Parcel;
import p175j9.InterfaceC8875a;
import p351t9.BinderC12606b;
import p351t9.C12607c;

/* renamed from: b9.r1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC2206r1 extends BinderC12606b implements InterfaceC2209s1 {
    public AbstractBinderC2206r1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // p351t9.BinderC12606b
    /* renamed from: b */
    protected final boolean mo4722b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int mo1101f0 = mo1101f0();
            parcel2.writeNoException();
            parcel2.writeInt(mo1101f0);
        } else {
            InterfaceC8875a mo1103a = mo1103a();
            parcel2.writeNoException();
            C12607c.m4720b(parcel2, mo1103a);
        }
        return true;
    }
}