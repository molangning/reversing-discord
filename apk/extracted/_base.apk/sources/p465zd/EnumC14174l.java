package p465zd;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m14357d2 = {"Lzd/l;", "", "", "", "c", "d", "", "j", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "n", "o", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14174l {
    OFF("off"),
    STANDARD("standard"),
    CINEMATIC("cinematic"),
    CINEMATIC_EXTENDED("cinematic-extended");
    

    /* renamed from: k */
    public static final C14175a f36471k = new C14175a(null);

    /* renamed from: j */
    private final String f36477j;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, m14357d2 = {"Lzd/l$a;", "", "Lzd/l;", "", "unionValue", "c", "", "stabiliazionMode", "a", "b", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14175a {
        private C14175a() {
        }

        public /* synthetic */ C14175a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC14174l m525a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return EnumC14174l.OFF;
                    }
                    return EnumC14174l.CINEMATIC;
                }
                return EnumC14174l.STANDARD;
            }
            return EnumC14174l.OFF;
        }

        /* renamed from: b */
        public final EnumC14174l m524b(int i) {
            if (i != 0) {
                if (i != 1) {
                    return EnumC14174l.OFF;
                }
                return EnumC14174l.CINEMATIC_EXTENDED;
            }
            return EnumC14174l.OFF;
        }

        /* renamed from: c */
        public EnumC14174l m523c(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1348796151:
                        if (str.equals("cinematic-extended")) {
                            return EnumC14174l.CINEMATIC_EXTENDED;
                        }
                        break;
                    case 109935:
                        if (str.equals("off")) {
                            return EnumC14174l.OFF;
                        }
                        break;
                    case 1312628413:
                        if (str.equals("standard")) {
                            return EnumC14174l.STANDARD;
                        }
                        break;
                    case 1598495741:
                        if (str.equals("cinematic")) {
                            return EnumC14174l.CINEMATIC;
                        }
                        break;
                }
            }
            return null;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: zd.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C14176b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36478a;

        static {
            int[] iArr = new int[EnumC14174l.values().length];
            try {
                iArr[EnumC14174l.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14174l.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14174l.CINEMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14174l.CINEMATIC_EXTENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f36478a = iArr;
        }
    }

    EnumC14174l(String str) {
        this.f36477j = str;
    }

    /* renamed from: b */
    public String m528b() {
        return this.f36477j;
    }

    /* renamed from: c */
    public final int m527c() {
        int i = C14176b.f36478a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0 : 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    public final int m526d() {
        int i = C14176b.f36478a[ordinal()];
        return (i == 1 || i != 4) ? 0 : 1;
    }
}
