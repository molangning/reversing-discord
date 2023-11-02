package p206l1;

import android.graphics.Paint;
import java.util.List;
import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6540t;
import p111g1.InterfaceC6521c;
import p188k1.C9037a;
import p188k1.C9038b;
import p188k1.C9040d;
import p223m1.AbstractC10231b;

/* renamed from: l1.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10025r implements InterfaceC10007c {

    /* renamed from: a */
    private final String f26047a;

    /* renamed from: b */
    private final C9038b f26048b;

    /* renamed from: c */
    private final List<C9038b> f26049c;

    /* renamed from: d */
    private final C9037a f26050d;

    /* renamed from: e */
    private final C9040d f26051e;

    /* renamed from: f */
    private final C9038b f26052f;

    /* renamed from: g */
    private final EnumC10027b f26053g;

    /* renamed from: h */
    private final EnumC10028c f26054h;

    /* renamed from: i */
    private final float f26055i;

    /* renamed from: j */
    private final boolean f26056j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C10026a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26057a;

        /* renamed from: b */
        static final /* synthetic */ int[] f26058b;

        static {
            int[] iArr = new int[EnumC10028c.values().length];
            f26058b = iArr;
            try {
                iArr[EnumC10028c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26058b[EnumC10028c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26058b[EnumC10028c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC10027b.values().length];
            f26057a = iArr2;
            try {
                iArr2[EnumC10027b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26057a[EnumC10027b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26057a[EnumC10027b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: l1.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC10027b {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: b */
        public Paint.Cap m12526b() {
            int i = C10026a.f26057a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* renamed from: l1.r$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC10028c {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: b */
        public Paint.Join m12524b() {
            int i = C10026a.f26058b[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public C10025r(String str, C9038b c9038b, List<C9038b> list, C9037a c9037a, C9040d c9040d, C9038b c9038b2, EnumC10027b enumC10027b, EnumC10028c enumC10028c, float f, boolean z) {
        this.f26047a = str;
        this.f26048b = c9038b;
        this.f26049c = list;
        this.f26050d = c9037a;
        this.f26051e = c9040d;
        this.f26052f = c9038b2;
        this.f26053g = enumC10027b;
        this.f26054h = enumC10028c;
        this.f26055i = f;
        this.f26056j = z;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6540t(c6059j0, abstractC10231b, this);
    }

    /* renamed from: b */
    public EnumC10027b m12537b() {
        return this.f26053g;
    }

    /* renamed from: c */
    public C9037a m12536c() {
        return this.f26050d;
    }

    /* renamed from: d */
    public C9038b m12535d() {
        return this.f26048b;
    }

    /* renamed from: e */
    public EnumC10028c m12534e() {
        return this.f26054h;
    }

    /* renamed from: f */
    public List<C9038b> m12533f() {
        return this.f26049c;
    }

    /* renamed from: g */
    public float m12532g() {
        return this.f26055i;
    }

    /* renamed from: h */
    public String m12531h() {
        return this.f26047a;
    }

    /* renamed from: i */
    public C9040d m12530i() {
        return this.f26051e;
    }

    /* renamed from: j */
    public C9038b m12529j() {
        return this.f26052f;
    }

    /* renamed from: k */
    public boolean m12528k() {
        return this.f26056j;
    }
}