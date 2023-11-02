package sh;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C9538f;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sh.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC12511e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    

    /* renamed from: k */
    public static final C12512a f32473k = new C12512a(null);

    /* renamed from: l */
    public static final Set<EnumC12511e> f32474l;

    /* renamed from: m */
    public static final Set<EnumC12511e> f32475m;

    /* renamed from: j */
    private final boolean f32489j;

    /* renamed from: sh.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12512a {
        private C12512a() {
        }

        public /* synthetic */ C12512a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Set<EnumC12511e> m14071G0;
        Set<EnumC12511e> m14240H0;
        EnumC12511e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC12511e enumC12511e : values) {
            if (enumC12511e.f32489j) {
                arrayList.add(enumC12511e);
            }
        }
        m14071G0 = C9553r.m14071G0(arrayList);
        f32474l = m14071G0;
        m14240H0 = C9538f.m14240H0(values());
        f32475m = m14240H0;
    }

    EnumC12511e(boolean z) {
        this.f32489j = z;
    }
}
