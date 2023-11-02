package p346t4;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.platform.InterfaceC3751g;
import java.io.InputStream;
import java.util.Map;
import p038c5.C2397b;
import p170j4.C8792b;
import p170j4.C8793c;
import p170j4.C8795d;
import p380v4.AbstractC13063c;
import p380v4.C13064d;
import p380v4.C13065e;
import p380v4.C13068h;
import p380v4.InterfaceC13069i;

/* renamed from: t4.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12577b implements InterfaceC12579c {

    /* renamed from: a */
    private final InterfaceC12579c f32642a;

    /* renamed from: b */
    private final InterfaceC12579c f32643b;

    /* renamed from: c */
    private final InterfaceC3751g f32644c;

    /* renamed from: d */
    private final InterfaceC12579c f32645d;

    /* renamed from: e */
    private final Map<C8793c, InterfaceC12579c> f32646e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t4.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C12578a implements InterfaceC12579c {
        C12578a() {
            C12577b.this = r1;
        }

        @Override // p346t4.InterfaceC12579c
        /* renamed from: a */
        public AbstractC13063c mo4767a(C13065e c13065e, int i, InterfaceC13069i interfaceC13069i, ImageDecodeOptions imageDecodeOptions) {
            C8793c m3358A = c13065e.m3358A();
            if (m3358A == C8792b.f23081a) {
                return C12577b.this.m4769d(c13065e, i, interfaceC13069i, imageDecodeOptions);
            }
            if (m3358A == C8792b.f23083c) {
                return C12577b.this.m4770c(c13065e, i, interfaceC13069i, imageDecodeOptions);
            }
            if (m3358A == C8792b.f23090j) {
                return C12577b.this.m4771b(c13065e, i, interfaceC13069i, imageDecodeOptions);
            }
            if (m3358A != C8793c.f23093c) {
                return C12577b.this.m4768e(c13065e, imageDecodeOptions);
            }
            throw new C12576a("unknown image format", c13065e);
        }
    }

    public C12577b(InterfaceC12579c interfaceC12579c, InterfaceC12579c interfaceC12579c2, InterfaceC3751g interfaceC3751g) {
        this(interfaceC12579c, interfaceC12579c2, interfaceC3751g, null);
    }

    @Override // p346t4.InterfaceC12579c
    /* renamed from: a */
    public AbstractC13063c mo4767a(C13065e c13065e, int i, InterfaceC13069i interfaceC13069i, ImageDecodeOptions imageDecodeOptions) {
        InputStream m3354D;
        InterfaceC12579c interfaceC12579c;
        InterfaceC12579c interfaceC12579c2 = imageDecodeOptions.f10293i;
        if (interfaceC12579c2 != null) {
            return interfaceC12579c2.mo4767a(c13065e, i, interfaceC13069i, imageDecodeOptions);
        }
        C8793c m3358A = c13065e.m3358A();
        if ((m3358A == null || m3358A == C8793c.f23093c) && (m3354D = c13065e.m3354D()) != null) {
            m3358A = C8795d.m17228c(m3354D);
            c13065e.m3351F0(m3358A);
        }
        Map<C8793c, InterfaceC12579c> map = this.f32646e;
        if (map != null && (interfaceC12579c = map.get(m3358A)) != null) {
            return interfaceC12579c.mo4767a(c13065e, i, interfaceC13069i, imageDecodeOptions);
        }
        return this.f32645d.mo4767a(c13065e, i, interfaceC13069i, imageDecodeOptions);
    }

    /* renamed from: b */
    public AbstractC13063c m4771b(C13065e c13065e, int i, InterfaceC13069i interfaceC13069i, ImageDecodeOptions imageDecodeOptions) {
        InterfaceC12579c interfaceC12579c = this.f32643b;
        if (interfaceC12579c != null) {
            return interfaceC12579c.mo4767a(c13065e, i, interfaceC13069i, imageDecodeOptions);
        }
        throw new C12576a("Animated WebP support not set up!", c13065e);
    }

    /* renamed from: c */
    public AbstractC13063c m4770c(C13065e c13065e, int i, InterfaceC13069i interfaceC13069i, ImageDecodeOptions imageDecodeOptions) {
        InterfaceC12579c interfaceC12579c;
        if (c13065e.m3343S() != -1 && c13065e.m3326v() != -1) {
            if (!imageDecodeOptions.f10290f && (interfaceC12579c = this.f32642a) != null) {
                return interfaceC12579c.mo4767a(c13065e, i, interfaceC13069i, imageDecodeOptions);
            }
            return m4768e(c13065e, imageDecodeOptions);
        }
        throw new C12576a("image width or height is incorrect", c13065e);
    }

    /* renamed from: d */
    public C13064d m4769d(C13065e c13065e, int i, InterfaceC13069i interfaceC13069i, ImageDecodeOptions imageDecodeOptions) {
        CloseableReference<Bitmap> mo30921a = this.f32644c.mo30921a(c13065e, imageDecodeOptions.f10291g, null, i, imageDecodeOptions.f10294j);
        try {
            C2397b.m33519a(null, mo30921a);
            C13064d c13064d = new C13064d(mo30921a, interfaceC13069i, c13065e.m3347I(), c13065e.m3329s());
            c13064d.m3369j("is_rounded", false);
            return c13064d;
        } finally {
            mo30921a.close();
        }
    }

    /* renamed from: e */
    public C13064d m4768e(C13065e c13065e, ImageDecodeOptions imageDecodeOptions) {
        CloseableReference<Bitmap> mo30920b = this.f32644c.mo30920b(c13065e, imageDecodeOptions.f10291g, null, imageDecodeOptions.f10294j);
        try {
            C2397b.m33519a(null, mo30920b);
            C13064d c13064d = new C13064d(mo30920b, C13068h.f33869d, c13065e.m3347I(), c13065e.m3329s());
            c13064d.m3369j("is_rounded", false);
            return c13064d;
        } finally {
            mo30920b.close();
        }
    }

    public C12577b(InterfaceC12579c interfaceC12579c, InterfaceC12579c interfaceC12579c2, InterfaceC3751g interfaceC3751g, Map<C8793c, InterfaceC12579c> map) {
        this.f32645d = new C12578a();
        this.f32642a = interfaceC12579c;
        this.f32643b = interfaceC12579c2;
        this.f32644c = interfaceC3751g;
        this.f32646e = map;
    }
}