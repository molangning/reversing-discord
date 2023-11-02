package p164j$.util.stream;

/* renamed from: j$.util.stream.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8653e {

    /* renamed from: a */
    protected final int f22841a;

    /* renamed from: b */
    protected int f22842b;

    /* renamed from: c */
    protected int f22843c;

    /* renamed from: d */
    protected long[] f22844d;

    public AbstractC8653e() {
        this.f22841a = 4;
    }

    public AbstractC8653e(int i) {
        if (i >= 0) {
            this.f22841a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i);
    }

    public abstract void clear();

    public final long count() {
        int i = this.f22843c;
        return i == 0 ? this.f22842b : this.f22844d[i] + this.f22842b;
    }
}