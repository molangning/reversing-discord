package p082ea;

import com.google.android.gms.common.api.Scope;
import p101fa.C6352a;
import p461z8.C14107a;

/* renamed from: ea.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6191e {

    /* renamed from: a */
    public static final C14107a.C14117g<C6352a> f17517a;

    /* renamed from: b */
    public static final C14107a.C14117g<C6352a> f17518b;

    /* renamed from: c */
    public static final C14107a.AbstractC14108a<C6352a, C6187a> f17519c;

    /* renamed from: d */
    static final C14107a.AbstractC14108a<C6352a, C6190d> f17520d;

    /* renamed from: e */
    public static final Scope f17521e;

    /* renamed from: f */
    public static final Scope f17522f;

    /* renamed from: g */
    public static final C14107a<C6187a> f17523g;

    /* renamed from: h */
    public static final C14107a<C6190d> f17524h;

    static {
        C14107a.C14117g<C6352a> c14117g = new C14107a.C14117g<>();
        f17517a = c14117g;
        C14107a.C14117g<C6352a> c14117g2 = new C14107a.C14117g<>();
        f17518b = c14117g2;
        C6188b c6188b = new C6188b();
        f17519c = c6188b;
        C6189c c6189c = new C6189c();
        f17520d = c6189c;
        f17521e = new Scope("profile");
        f17522f = new Scope("email");
        f17523g = new C14107a<>("SignIn.API", c6188b, c14117g);
        f17524h = new C14107a<>("SignIn.INTERNAL_API", c6189c, c14117g2);
    }
}