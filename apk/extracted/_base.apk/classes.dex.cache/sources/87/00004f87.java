package p384v8;

/* renamed from: v8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13143b {

    /* renamed from: b */
    static int f34159b = 31;

    /* renamed from: a */
    private int f34160a = 1;

    /* renamed from: a */
    public C13143b m3105a(Object obj) {
        this.f34160a = (f34159b * this.f34160a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int m3104b() {
        return this.f34160a;
    }

    /* renamed from: c */
    public final C13143b m3103c(boolean z) {
        this.f34160a = (f34159b * this.f34160a) + (z ? 1 : 0);
        return this;
    }
}