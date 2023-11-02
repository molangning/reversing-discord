package kotlin.jvm.internal;

import kotlin.Metadata;
import p140hg.EnumC7145k;
import p140hg.InterfaceC7141i;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m14357d2 = {"Lkotlin/jvm/internal/m0;", "Lhg/i;", "j", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.jvm.internal.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9606m0 implements InterfaceC7141i {

    /* renamed from: j */
    public static final C9607a f25352j = new C9607a(null);

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m14357d2 = {"Lkotlin/jvm/internal/m0$a;", "", "Lhg/i;", "typeParameter", "", "a", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.jvm.internal.m0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9607a {

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: kotlin.jvm.internal.m0$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public /* synthetic */ class C9608a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f25353a;

            static {
                int[] iArr = new int[EnumC7145k.values().length];
                try {
                    iArr[EnumC7145k.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7145k.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7145k.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f25353a = iArr;
            }
        }

        private C9607a() {
        }

        public /* synthetic */ C9607a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m13927a(InterfaceC7141i typeParameter) {
            C9612q.m13917h(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i = C9608a.f25353a[typeParameter.mo15990m().ordinal()];
            if (i != 2) {
                if (i == 3) {
                    sb2.append("out ");
                }
            } else {
                sb2.append("in ");
            }
            sb2.append(typeParameter.getName());
            String sb3 = sb2.toString();
            C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }
}