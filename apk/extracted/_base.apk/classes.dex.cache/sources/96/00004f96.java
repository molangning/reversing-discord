package p384v8;

import android.os.Parcel;
import p283p9.BinderC11467b;

/* renamed from: v8.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC13158q extends BinderC11467b implements InterfaceC13159r {
    public AbstractBinderC13158q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p283p9.BinderC11467b
    /* renamed from: b */
    protected final boolean mo3080b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            mo3073g();
        } else {
            mo3072k();
        }
        return true;
    }
}