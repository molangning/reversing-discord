package p209l4;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import java.util.ArrayList;
import java.util.List;
import p191k4.C9059e;
import p191k4.InterfaceC9053a;
import p191k4.InterfaceC9057c;
import p226m4.C10256d;
import p226m4.InterfaceC10252b;
import p380v4.AbstractC13063c;
import p380v4.C13061a;
import p380v4.C13064d;
import p380v4.C13065e;
import p380v4.C13068h;
import p394w2.C13379j;
import p455z2.InterfaceC14078g;

/* renamed from: l4.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10042e implements InterfaceC10041d {

    /* renamed from: c */
    static InterfaceC10040c f26097c = m12489g("com.facebook.animated.gif.GifImage");

    /* renamed from: d */
    static InterfaceC10040c f26098d = m12489g("com.facebook.animated.webp.WebPImage");

    /* renamed from: a */
    private final InterfaceC10252b f26099a;

    /* renamed from: b */
    private final PlatformBitmapFactory f26100b;

    /* renamed from: l4.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C10043a implements C10256d.InterfaceC10258b {
        C10043a() {
            C10042e.this = r1;
        }

        @Override // p226m4.C10256d.InterfaceC10258b
        /* renamed from: a */
        public void mo11998a(int i, Bitmap bitmap) {
        }

        @Override // p226m4.C10256d.InterfaceC10258b
        /* renamed from: b */
        public CloseableReference<Bitmap> mo11997b(int i) {
            return null;
        }
    }

    /* renamed from: l4.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C10044b implements C10256d.InterfaceC10258b {

        /* renamed from: a */
        final /* synthetic */ List f26102a;

        C10044b(List list) {
            C10042e.this = r1;
            this.f26102a = list;
        }

        @Override // p226m4.C10256d.InterfaceC10258b
        /* renamed from: a */
        public void mo11998a(int i, Bitmap bitmap) {
        }

        @Override // p226m4.C10256d.InterfaceC10258b
        /* renamed from: b */
        public CloseableReference<Bitmap> mo11997b(int i) {
            return CloseableReference.m31717s((CloseableReference) this.f26102a.get(i));
        }
    }

    public C10042e(InterfaceC10252b interfaceC10252b, PlatformBitmapFactory platformBitmapFactory) {
        this.f26099a = interfaceC10252b;
        this.f26100b = platformBitmapFactory;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private CloseableReference<Bitmap> m12493c(int i, int i2, Bitmap.Config config) {
        CloseableReference<Bitmap> mo9413d = this.f26100b.mo9413d(i, i2, config);
        mo9413d.m31730D().eraseColor(0);
        mo9413d.m31730D().setHasAlpha(true);
        return mo9413d;
    }

    /* renamed from: d */
    private CloseableReference<Bitmap> m12492d(InterfaceC9057c interfaceC9057c, Bitmap.Config config, int i) {
        CloseableReference<Bitmap> m12493c = m12493c(interfaceC9057c.getWidth(), interfaceC9057c.getHeight(), config);
        new C10256d(this.f26099a.mo12014a(C9059e.m16802b(interfaceC9057c), null), new C10043a()).m11999g(i, m12493c.m31730D());
        return m12493c;
    }

    /* renamed from: e */
    private List<CloseableReference<Bitmap>> m12491e(InterfaceC9057c interfaceC9057c, Bitmap.Config config) {
        InterfaceC9053a mo12014a = this.f26099a.mo12014a(C9059e.m16802b(interfaceC9057c), null);
        ArrayList arrayList = new ArrayList(mo12014a.mo12028a());
        C10256d c10256d = new C10256d(mo12014a, new C10044b(arrayList));
        for (int i = 0; i < mo12014a.mo12028a(); i++) {
            CloseableReference<Bitmap> m12493c = m12493c(mo12014a.getWidth(), mo12014a.getHeight(), config);
            c10256d.m11999g(i, m12493c.m31730D());
            arrayList.add(m12493c);
        }
        return arrayList;
    }

    /* renamed from: f */
    private AbstractC13063c m12490f(ImageDecodeOptions imageDecodeOptions, InterfaceC9057c interfaceC9057c, Bitmap.Config config) {
        List<CloseableReference<Bitmap>> list;
        int i;
        CloseableReference<Bitmap> closeableReference;
        CloseableReference<Bitmap> closeableReference2 = null;
        try {
            if (imageDecodeOptions.f10288d) {
                i = interfaceC9057c.mo16814a() - 1;
            } else {
                i = 0;
            }
            if (imageDecodeOptions.f10290f) {
                C13064d c13064d = new C13064d(m12492d(interfaceC9057c, config, i), C13068h.f33869d, 0);
                CloseableReference.m31715v(null);
                CloseableReference.m31731A(null);
                return c13064d;
            }
            if (imageDecodeOptions.f10289e) {
                list = m12491e(interfaceC9057c, config);
                try {
                    closeableReference = CloseableReference.m31717s(list.get(i));
                } catch (Throwable th2) {
                    th = th2;
                    CloseableReference.m31715v(closeableReference2);
                    CloseableReference.m31731A(list);
                    throw th;
                }
            } else {
                list = null;
                closeableReference = null;
            }
            try {
                if (imageDecodeOptions.f10287c && closeableReference == null) {
                    closeableReference = m12492d(interfaceC9057c, config, i);
                }
                C13061a c13061a = new C13061a(C9059e.m16799e(interfaceC9057c).m16789j(closeableReference).m16790i(i).m16791h(list).m16792g(null).m16798a());
                CloseableReference.m31715v(closeableReference);
                CloseableReference.m31731A(list);
                return c13061a;
            } catch (Throwable th3) {
                th = th3;
                closeableReference2 = closeableReference;
                CloseableReference.m31715v(closeableReference2);
                CloseableReference.m31731A(list);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            list = null;
        }
    }

    /* renamed from: g */
    private static InterfaceC10040c m12489g(String str) {
        try {
            return (InterfaceC10040c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // p209l4.InterfaceC10041d
    /* renamed from: a */
    public AbstractC13063c mo12495a(C13065e c13065e, ImageDecodeOptions imageDecodeOptions, Bitmap.Config config) {
        InterfaceC9057c mo12496f;
        if (f26098d != null) {
            CloseableReference<InterfaceC14078g> m3332m = c13065e.m3332m();
            C13379j.m2677g(m3332m);
            try {
                InterfaceC14078g m31730D = m3332m.m31730D();
                if (m31730D.mo724f() != null) {
                    mo12496f = f26098d.mo12497d(m31730D.mo724f(), imageDecodeOptions);
                } else {
                    mo12496f = f26098d.mo12496f(m31730D.mo722l(), m31730D.size(), imageDecodeOptions);
                }
                return m12490f(imageDecodeOptions, mo12496f, config);
            } finally {
                CloseableReference.m31715v(m3332m);
            }
        }
        throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
    }

    @Override // p209l4.InterfaceC10041d
    /* renamed from: b */
    public AbstractC13063c mo12494b(C13065e c13065e, ImageDecodeOptions imageDecodeOptions, Bitmap.Config config) {
        InterfaceC9057c mo12496f;
        if (f26097c != null) {
            CloseableReference<InterfaceC14078g> m3332m = c13065e.m3332m();
            C13379j.m2677g(m3332m);
            try {
                InterfaceC14078g m31730D = m3332m.m31730D();
                if (m31730D.mo724f() != null) {
                    mo12496f = f26097c.mo12497d(m31730D.mo724f(), imageDecodeOptions);
                } else {
                    mo12496f = f26097c.mo12496f(m31730D.mo722l(), m31730D.size(), imageDecodeOptions);
                }
                return m12490f(imageDecodeOptions, mo12496f, config);
            } finally {
                CloseableReference.m31715v(m3332m);
            }
        }
        throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
    }
}