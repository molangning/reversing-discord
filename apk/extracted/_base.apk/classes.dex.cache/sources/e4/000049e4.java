package p294q4;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.react.uimanager.ViewDefaults;
import p038c5.InterfaceC2396a;
import p294q4.C11700b;
import p346t4.InterfaceC12579c;

/* renamed from: q4.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11700b<T extends C11700b> {

    /* renamed from: a */
    private int f30497a = 100;

    /* renamed from: b */
    private int f30498b = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: c */
    private boolean f30499c;

    /* renamed from: d */
    private boolean f30500d;

    /* renamed from: e */
    private boolean f30501e;

    /* renamed from: f */
    private boolean f30502f;

    /* renamed from: g */
    private Bitmap.Config f30503g;

    /* renamed from: h */
    private Bitmap.Config f30504h;

    /* renamed from: i */
    private InterfaceC12579c f30505i;

    /* renamed from: j */
    private ColorSpace f30506j;

    /* renamed from: k */
    private boolean f30507k;

    public C11700b() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f30503g = config;
        this.f30504h = config;
    }

    /* renamed from: a */
    public ImageDecodeOptions m7153a() {
        return new ImageDecodeOptions(this);
    }

    /* renamed from: b */
    public Bitmap.Config m7152b() {
        return this.f30504h;
    }

    /* renamed from: c */
    public Bitmap.Config m7151c() {
        return this.f30503g;
    }

    /* renamed from: d */
    public InterfaceC2396a m7150d() {
        return null;
    }

    /* renamed from: e */
    public ColorSpace m7149e() {
        return this.f30506j;
    }

    /* renamed from: f */
    public InterfaceC12579c m7148f() {
        return this.f30505i;
    }

    /* renamed from: g */
    public boolean m7147g() {
        return this.f30501e;
    }

    /* renamed from: h */
    public boolean m7146h() {
        return this.f30499c;
    }

    /* renamed from: i */
    public boolean m7145i() {
        return this.f30507k;
    }

    /* renamed from: j */
    public boolean m7144j() {
        return this.f30502f;
    }

    /* renamed from: k */
    public int m7143k() {
        return this.f30498b;
    }

    /* renamed from: l */
    public int m7142l() {
        return this.f30497a;
    }

    /* renamed from: m */
    public boolean m7141m() {
        return this.f30500d;
    }
}