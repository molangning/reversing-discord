package p164j$.util.concurrent;

/* renamed from: j$.util.concurrent.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8387b extends C8402q {

    /* renamed from: i */
    final ConcurrentHashMap f22485i;

    /* renamed from: j */
    C8398m f22486j;

    public AbstractC8387b(C8398m[] c8398mArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(c8398mArr, i, 0, i2);
        this.f22485i = concurrentHashMap;
        m17738e();
    }

    public final boolean hasMoreElements() {
        return this.f22506b != null;
    }

    public final boolean hasNext() {
        return this.f22506b != null;
    }

    public final void remove() {
        C8398m c8398m = this.f22486j;
        if (c8398m == null) {
            throw new IllegalStateException();
        }
        this.f22486j = null;
        this.f22485i.replaceNode(c8398m.f22498b, null, null);
    }
}