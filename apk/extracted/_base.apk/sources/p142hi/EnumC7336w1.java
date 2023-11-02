package p142hi;

/* renamed from: hi.w1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC7336w1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    

    /* renamed from: j */
    private final String f19776j;

    /* renamed from: k */
    private final boolean f19777k;

    /* renamed from: l */
    private final boolean f19778l;

    /* renamed from: m */
    private final int f19779m;

    EnumC7336w1(String str, boolean z, boolean z2, int i) {
        this.f19776j = str;
        this.f19777k = z;
        this.f19778l = z2;
        this.f19779m = i;
    }

    /* renamed from: b */
    public final boolean m20935b() {
        return this.f19778l;
    }

    /* renamed from: c */
    public final String m20934c() {
        return this.f19776j;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f19776j;
    }
}
