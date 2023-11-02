package p170j4;

/* renamed from: j4.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8792b {

    /* renamed from: a */
    public static final C8793c f23081a = new C8793c("JPEG", "jpeg");

    /* renamed from: b */
    public static final C8793c f23082b = new C8793c("PNG", "png");

    /* renamed from: c */
    public static final C8793c f23083c = new C8793c("GIF", "gif");

    /* renamed from: d */
    public static final C8793c f23084d = new C8793c("BMP", "bmp");

    /* renamed from: e */
    public static final C8793c f23085e = new C8793c("ICO", "ico");

    /* renamed from: f */
    public static final C8793c f23086f = new C8793c("WEBP_SIMPLE", "webp");

    /* renamed from: g */
    public static final C8793c f23087g = new C8793c("WEBP_LOSSLESS", "webp");

    /* renamed from: h */
    public static final C8793c f23088h = new C8793c("WEBP_EXTENDED", "webp");

    /* renamed from: i */
    public static final C8793c f23089i = new C8793c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j */
    public static final C8793c f23090j = new C8793c("WEBP_ANIMATED", "webp");

    /* renamed from: k */
    public static final C8793c f23091k = new C8793c("HEIF", "heif");

    /* renamed from: l */
    public static final C8793c f23092l = new C8793c("DNG", "dng");

    /* renamed from: a */
    public static boolean m17235a(C8793c c8793c) {
        return c8793c == f23086f || c8793c == f23087g || c8793c == f23088h || c8793c == f23089i;
    }

    /* renamed from: b */
    public static boolean m17234b(C8793c c8793c) {
        return m17235a(c8793c) || c8793c == f23090j;
    }
}
