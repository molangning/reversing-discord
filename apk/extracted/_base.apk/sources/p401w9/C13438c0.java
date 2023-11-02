package p401w9;

/* renamed from: w9.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13438c0 {

    /* renamed from: a */
    private final Object f34673a;

    /* renamed from: b */
    private final Object f34674b;

    /* renamed from: c */
    private final Object f34675c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13438c0(Object obj, Object obj2, Object obj3) {
        this.f34673a = obj;
        this.f34674b = obj2;
        this.f34675c = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException m2490a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f34673a + "=" + this.f34674b + " and " + this.f34673a + "=" + this.f34675c);
    }
}
