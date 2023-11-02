package p465zd;

import com.mrousavy.camera.C5335s;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0004\u001a\u00020\u0003R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m14357d2 = {"Lzd/k;", "", "", "", "b", "j", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14171k {
    MOV("mov"),
    MP4("mp4");
    

    /* renamed from: k */
    public static final C14172a f36465k = new C14172a(null);

    /* renamed from: j */
    private final String f36469j;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\b"}, m14357d2 = {"Lzd/k$a;", "", "Lzd/k;", "", "unionValue", "a", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14172a {
        private C14172a() {
        }

        public /* synthetic */ C14172a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public EnumC14171k m530a(String str) {
            if (C9612q.m13922c(str, "mov")) {
                return EnumC14171k.MOV;
            }
            if (C9612q.m13922c(str, "mp4")) {
                return EnumC14171k.MP4;
            }
            if (str == null) {
                str = "(null)";
            }
            throw new C5335s("fileType", str);
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: zd.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C14173b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36470a;

        static {
            int[] iArr = new int[EnumC14171k.values().length];
            try {
                iArr[EnumC14171k.MOV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14171k.MP4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36470a = iArr;
        }
    }

    EnumC14171k(String str) {
        this.f36469j = str;
    }

    /* renamed from: b */
    public final String m531b() {
        int i = C14173b.f36470a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ".mp4";
            }
            throw new C11581q();
        }
        return ".mov";
    }
}
