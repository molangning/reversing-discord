package p245n8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p335s5.BinderC12399b;
import p335s5.C12398a;
import p335s5.C12400c;

/* renamed from: n8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC10513a extends IInterface {

    /* renamed from: n8.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractBinderC10514a extends BinderC12399b implements InterfaceC10513a {

        /* renamed from: n8.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static class C10515a extends C12398a implements InterfaceC10513a {
            C10515a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // p245n8.InterfaceC10513a
            /* renamed from: o */
            public final Bundle mo11329o(Bundle bundle) {
                Parcel m5410b = m5410b();
                C12400c.m5407b(m5410b, bundle);
                Parcel m5409c = m5409c(m5410b);
                Bundle bundle2 = (Bundle) C12400c.m5408a(m5409c, Bundle.CREATOR);
                m5409c.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static InterfaceC10513a m11330b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof InterfaceC10513a) {
                return (InterfaceC10513a) queryLocalInterface;
            }
            return new C10515a(iBinder);
        }
    }

    /* renamed from: o */
    Bundle mo11329o(Bundle bundle);
}