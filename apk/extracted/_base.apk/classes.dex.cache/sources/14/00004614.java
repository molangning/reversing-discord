package p270oh;

import java.util.Arrays;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.AbstractC10456a;

/* renamed from: oh.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11115e extends AbstractC10456a {

    /* renamed from: h */
    public static final C11116a f29086h = new C11116a(null);

    /* renamed from: i */
    public static final C11115e f29087i = new C11115e(1, 8, 0);

    /* renamed from: j */
    public static final C11115e f29088j = new C11115e(new int[0]);

    /* renamed from: g */
    private final boolean f29089g;

    /* renamed from: oh.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11116a {
        private C11116a() {
        }

        public /* synthetic */ C11116a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11115e(int[] versionArray, boolean z) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        C9612q.m13917h(versionArray, "versionArray");
        this.f29089g = z;
    }

    /* renamed from: h */
    public boolean m9137h() {
        boolean z;
        if (m11507a() == 1 && m11506b() == 0) {
            return false;
        }
        if (this.f29089g) {
            z = m11502f(f29087i);
        } else {
            int m11507a = m11507a();
            C11115e c11115e = f29087i;
            if (m11507a == c11115e.m11507a() && m11506b() <= c11115e.m11506b() + 1) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11115e(int... numbers) {
        this(numbers, false);
        C9612q.m13917h(numbers, "numbers");
    }
}