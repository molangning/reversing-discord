package p387vd;

import android.media.MediaFormat;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m14357d2 = {"Lvd/f;", "", "a", "litr_release"}, m14356k = 1, m14355mv = {1, 4, 2})
/* renamed from: vd.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13252f {

    /* renamed from: a */
    public static final C13253a f34320a = new C13253a(null);

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000e"}, m14357d2 = {"Lvd/f$a;", "", "Landroid/media/MediaFormat;", "format", "", "defaultValue", "b", "a", "d", "", "key", "c", "<init>", "()V", "litr_release"}, m14356k = 1, m14355mv = {1, 4, 2})
    /* renamed from: vd.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13253a {
        private C13253a() {
        }

        public /* synthetic */ C13253a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Number m2927a(MediaFormat format, Number defaultValue) {
            C9612q.m13917h(format, "format");
            C9612q.m13917h(defaultValue, "defaultValue");
            Number m2925c = m2925c(format, "channel-count");
            if (m2925c != null) {
                return m2925c;
            }
            return defaultValue;
        }

        /* renamed from: b */
        public final Number m2926b(MediaFormat format, Number defaultValue) {
            C9612q.m13917h(format, "format");
            C9612q.m13917h(defaultValue, "defaultValue");
            Number m2925c = m2925c(format, "frame-rate");
            if (m2925c != null) {
                return m2925c;
            }
            return defaultValue;
        }

        /* renamed from: c */
        public final Number m2925c(MediaFormat format, String key) {
            Object m7596b;
            Object m7596b2;
            Number number;
            C9612q.m13917h(format, "format");
            C9612q.m13917h(key, "key");
            Number number2 = null;
            if (!format.containsKey(key)) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                number = format.getNumber(key);
                return number;
            }
            try {
                C11583s.C11584a c11584a = C11583s.f30090k;
                m7596b = C11583s.m7596b(Integer.valueOf(format.getInteger(key)));
            } catch (Throwable th2) {
                C11583s.C11584a c11584a2 = C11583s.f30090k;
                m7596b = C11583s.m7596b(C11586t.m7587a(th2));
            }
            if (C11583s.m7593e(m7596b) != null) {
                try {
                    m7596b2 = C11583s.m7596b(Float.valueOf(format.getFloat(key)));
                } catch (Throwable th3) {
                    C11583s.C11584a c11584a3 = C11583s.f30090k;
                    m7596b2 = C11583s.m7596b(C11586t.m7587a(th3));
                }
                m7596b = m7596b2;
            }
            if (!C11583s.m7591g(m7596b)) {
                number2 = m7596b;
            }
            return number2;
        }

        /* renamed from: d */
        public final Number m2924d(MediaFormat format, Number defaultValue) {
            C9612q.m13917h(format, "format");
            C9612q.m13917h(defaultValue, "defaultValue");
            Number m2925c = m2925c(format, "sample-rate");
            if (m2925c != null) {
                return m2925c;
            }
            return defaultValue;
        }
    }

    /* renamed from: a */
    public static final Number m2929a(MediaFormat mediaFormat, Number number) {
        return f34320a.m2926b(mediaFormat, number);
    }

    /* renamed from: b */
    public static final Number m2928b(MediaFormat mediaFormat, String str) {
        return f34320a.m2925c(mediaFormat, str);
    }
}