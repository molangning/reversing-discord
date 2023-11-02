package p465zd;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0004\u001a\u00020\u0003R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m14357d2 = {"Lzd/j;", "", "", "", "b", "", "j", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14168j {
    H264("h264"),
    H265("h265");
    

    /* renamed from: k */
    public static final C14169a f36459k = new C14169a(null);

    /* renamed from: j */
    private final String f36463j;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\b"}, m14357d2 = {"Lzd/j$a;", "", "Lzd/j;", "", "unionValue", "a", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14169a {
        private C14169a() {
        }

        public /* synthetic */ C14169a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public EnumC14168j m533a(String str) {
            if (C9612q.m13922c(str, "h264")) {
                return EnumC14168j.H264;
            }
            if (C9612q.m13922c(str, "h265")) {
                return EnumC14168j.H265;
            }
            return EnumC14168j.H264;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: zd.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C14170b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36464a;

        static {
            int[] iArr = new int[EnumC14168j.values().length];
            try {
                iArr[EnumC14168j.H264.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14168j.H265.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36464a = iArr;
        }
    }

    EnumC14168j(String str) {
        this.f36463j = str;
    }

    /* renamed from: b */
    public final int m534b() {
        int i = C14170b.f36464a[ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 5;
        }
        throw new C11581q();
    }
}