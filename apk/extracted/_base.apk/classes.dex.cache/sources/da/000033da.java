package gb;

import java.util.NoSuchElementException;
import p102fb.C6378h;

/* renamed from: gb.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6602b<T> extends AbstractC6703u0<T> {

    /* renamed from: j */
    private EnumC6604b f18765j = EnumC6604b.NOT_READY;

    /* renamed from: k */
    private T f18766k;

    /* renamed from: gb.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C6603a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18767a;

        static {
            int[] iArr = new int[EnumC6604b.values().length];
            f18767a = iArr;
            try {
                iArr[EnumC6604b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18767a[EnumC6604b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: gb.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC6604b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: d */
    private boolean m22330d() {
        this.f18765j = EnumC6604b.FAILED;
        this.f18766k = mo22142a();
        if (this.f18765j != EnumC6604b.DONE) {
            this.f18765j = EnumC6604b.READY;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract T mo22142a();

    /* renamed from: b */
    public final T m22331b() {
        this.f18765j = EnumC6604b.DONE;
        return null;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f18765j != EnumC6604b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C6378h.m22829o(z);
        int i = C6603a.f18767a[this.f18765j.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        return m22330d();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f18765j = EnumC6604b.NOT_READY;
            T t = this.f18766k;
            this.f18766k = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}