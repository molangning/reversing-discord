package timber.log;

import android.os.Build;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9654p;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m14357d2 = {"Ltimber/log/a;", "", "<init>", "()V", "a", "b", "c", "timber_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: timber.log.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12799a {

    /* renamed from: a */
    public static final C12802b f33169a = new C12802b(null);

    /* renamed from: b */
    private static final ArrayList<AbstractC12803c> f33170b = new ArrayList<>();

    /* renamed from: c */
    private static volatile AbstractC12803c[] f33171c = new AbstractC12803c[0];

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J,\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00040\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Ltimber/log/a$a;", "Ltimber/log/a$c;", "Ljava/lang/StackTraceElement;", "element", "", "a", "", "priority", "tag", "message", "", "t", "", "log", "", "kotlin.jvm.PlatformType", "Ljava/util/List;", "fqcnIgnore", "getTag$timber_release", "()Ljava/lang/String;", "<init>", "()V", "b", "timber_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: timber.log.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C12800a extends AbstractC12803c {

        /* renamed from: b */
        public static final C12801a f33172b = new C12801a(null);

        /* renamed from: c */
        private static final Pattern f33173c = Pattern.compile("(\\$\\d+)+$");

        /* renamed from: a */
        private final List<String> f33174a;

        @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, m14357d2 = {"Ltimber/log/a$a$a;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "ANONYMOUS_CLASS", "Ljava/util/regex/Pattern;", "", "MAX_LOG_LENGTH", "I", "MAX_TAG_LENGTH", "<init>", "()V", "timber_release"}, m14356k = 1, m14355mv = {1, 5, 1})
        /* renamed from: timber.log.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C12801a {
            private C12801a() {
            }

            public /* synthetic */ C12801a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C12800a() {
            List<String> m14101l;
            m14101l = C9545j.m14101l(C12799a.class.getName(), C12802b.class.getName(), AbstractC12803c.class.getName(), C12800a.class.getName());
            this.f33174a = m14101l;
        }

        /* renamed from: a */
        protected String m3895a(StackTraceElement element) {
            String m13730M0;
            C9612q.m13917h(element, "element");
            String className = element.getClassName();
            C9612q.m13918g(className, "element.className");
            m13730M0 = C9654p.m13730M0(className, '.', null, 2, null);
            Matcher matcher = f33173c.matcher(m13730M0);
            if (matcher.find()) {
                m13730M0 = matcher.replaceAll("");
                C9612q.m13918g(m13730M0, "m.replaceAll(\"\")");
            }
            if (m13730M0.length() > 23 && Build.VERSION.SDK_INT < 26) {
                String substring = m13730M0.substring(0, 23);
                C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            return m13730M0;
        }

        @Override // timber.log.C12799a.AbstractC12803c
        public String getTag$timber_release() {
            String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release == null) {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                C9612q.m13918g(stackTrace, "Throwable().stackTrace");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (!this.f33174a.contains(stackTraceElement.getClassName())) {
                        return m3895a(stackTraceElement);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return tag$timber_release;
        }

        @Override // timber.log.C12799a.AbstractC12803c
        protected void log(int i, String str, String message, Throwable th2) {
            int m13709Y;
            int min;
            C9612q.m13917h(message, "message");
            if (message.length() < 4000) {
                if (i == 7) {
                    Log.wtf(str, message);
                    return;
                } else {
                    Log.println(i, str, message);
                    return;
                }
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                m13709Y = C9654p.m13709Y(message, '\n', i2, false, 4, null);
                if (m13709Y == -1) {
                    m13709Y = length;
                }
                while (true) {
                    min = Math.min(m13709Y, i2 + 4000);
                    String substring = message.substring(i2, min);
                    C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i, str, substring);
                    }
                    if (min >= m13709Y) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%JC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J1\u0010\u000e\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u000e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ;\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0012\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ;\u0010\u0012\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0013\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ;\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0014\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ;\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0015\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ;\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J9\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H$R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8@X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, m14357d2 = {"Ltimber/log/a$c;", "", "", "priority", "", "t", "", "message", "", "args", "", "prepareLog", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "getStackTraceString", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "d", "i", "w", "e", "wtf", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "", "isLoggable", "tag", "formatMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "explicitTag", "Ljava/lang/ThreadLocal;", "getExplicitTag$timber_release", "()Ljava/lang/ThreadLocal;", "getTag$timber_release", "()Ljava/lang/String;", "<init>", "()V", "timber_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: timber.log.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static abstract class AbstractC12803c {
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        private final String getStackTraceString(Throwable th2) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            C9612q.m13918g(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        private final void prepareLog(int i, Throwable th2, String str, Object... objArr) {
            boolean z;
            String tag$timber_release = getTag$timber_release();
            if (!isLoggable(tag$timber_release, i)) {
                return;
            }
            boolean z2 = false;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (th2 == null) {
                    return;
                }
                str = getStackTraceString(th2);
            } else {
                if (objArr.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    str = formatMessage(str, objArr);
                }
                if (th2 != null) {
                    str = ((Object) str) + '\n' + getStackTraceString(th2);
                }
            }
            log(i, tag$timber_release, str, th2);
        }

        /* renamed from: d */
        public void mo3892d(String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(3, null, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: e */
        public void mo3889e(String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(6, null, str, Arrays.copyOf(args, args.length));
        }

        protected String formatMessage(String message, Object[] args) {
            C9612q.m13917h(message, "message");
            C9612q.m13917h(args, "args");
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format = String.format(message, Arrays.copyOf(copyOf, copyOf.length));
            C9612q.m13918g(format, "java.lang.String.format(this, *args)");
            return format;
        }

        public final /* synthetic */ ThreadLocal getExplicitTag$timber_release() {
            return this.explicitTag;
        }

        public /* synthetic */ String getTag$timber_release() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        /* renamed from: i */
        public void mo3886i(String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(4, null, str, Arrays.copyOf(args, args.length));
        }

        protected boolean isLoggable(int i) {
            return true;
        }

        protected boolean isLoggable(String str, int i) {
            return isLoggable(i);
        }

        protected abstract void log(int i, String str, String str2, Throwable th2);

        public void log(int i, String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(i, null, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: v */
        public void mo3883v(String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(2, null, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: w */
        public void mo3880w(String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(7, null, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: d */
        public void mo3890d(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(3, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: e */
        public void mo3887e(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(6, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: i */
        public void mo3884i(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(4, th2, str, Arrays.copyOf(args, args.length));
        }

        public void log(int i, Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(i, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: v */
        public void mo3881v(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(2, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: w */
        public void mo3878w(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(5, th2, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            prepareLog(7, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: d */
        public void mo3891d(Throwable th2) {
            prepareLog(3, th2, null, new Object[0]);
        }

        /* renamed from: e */
        public void mo3888e(Throwable th2) {
            prepareLog(6, th2, null, new Object[0]);
        }

        /* renamed from: i */
        public void mo3885i(Throwable th2) {
            prepareLog(4, th2, null, new Object[0]);
        }

        public void log(int i, Throwable th2) {
            prepareLog(i, th2, null, new Object[0]);
        }

        /* renamed from: v */
        public void mo3882v(Throwable th2) {
            prepareLog(2, th2, null, new Object[0]);
        }

        /* renamed from: w */
        public void mo3879w(Throwable th2) {
            prepareLog(5, th2, null, new Object[0]);
        }

        public void wtf(Throwable th2) {
            prepareLog(7, th2, null, new Object[0]);
        }
    }

    private C12799a() {
        throw new AssertionError();
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J3\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ=\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\r\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\r\u0010\tJ=\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u000e\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\tJ=\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u000f\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\tJ=\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u0010\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\tJ=\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u0011\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\tJ=\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\fJ\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J;\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0016J\u001a\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J,\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0002H\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0001H\u0007R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m14357d2 = {"Ltimber/log/a$b;", "Ltimber/log/a$c;", "", "message", "", "", "args", "", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "t", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "d", "i", "w", "e", "wtf", "", "priority", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "tag", "b", "tree", "a", "treeArray", "[Ltimber/log/a$c;", "Ljava/util/ArrayList;", "trees", "Ljava/util/ArrayList;", "<init>", "()V", "timber_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: timber.log.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12802b extends AbstractC12803c {
        private C12802b() {
        }

        public /* synthetic */ C12802b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m3894a(AbstractC12803c tree) {
            boolean z;
            C9612q.m13917h(tree, "tree");
            if (tree != this) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                synchronized (C12799a.f33170b) {
                    C12799a.f33170b.add(tree);
                    Object[] array = C12799a.f33170b.toArray(new AbstractC12803c[0]);
                    if (array != null) {
                        C12799a.f33171c = (AbstractC12803c[]) array;
                        Unit unit = Unit.f25302a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
        }

        /* renamed from: b */
        public final AbstractC12803c m3893b(String tag) {
            C9612q.m13917h(tag, "tag");
            AbstractC12803c[] abstractC12803cArr = C12799a.f33171c;
            int length = abstractC12803cArr.length;
            int i = 0;
            while (i < length) {
                AbstractC12803c abstractC12803c = abstractC12803cArr[i];
                i++;
                abstractC12803c.getExplicitTag$timber_release().set(tag);
            }
            return this;
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: d */
        public void mo3892d(String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3892d(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: e */
        public void mo3889e(String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3889e(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: i */
        public void mo3886i(String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3886i(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        public void log(int i, String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.log(i, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: v */
        public void mo3883v(String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3883v(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: w */
        public void mo3880w(String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3880w(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        public void wtf(String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.wtf(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: d */
        public void mo3890d(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3890d(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: e */
        public void mo3887e(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3887e(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: i */
        public void mo3884i(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3884i(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        public void log(int i, Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.log(i, th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: v */
        public void mo3881v(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3881v(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: w */
        public void mo3878w(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3878w(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        public void wtf(Throwable th2, String str, Object... args) {
            C9612q.m13917h(args, "args");
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.wtf(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: d */
        public void mo3891d(Throwable th2) {
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3891d(th2);
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: e */
        public void mo3888e(Throwable th2) {
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3888e(th2);
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: i */
        public void mo3885i(Throwable th2) {
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3885i(th2);
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        public void log(int i, Throwable th2) {
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.log(i, th2);
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: v */
        public void mo3882v(Throwable th2) {
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3882v(th2);
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        /* renamed from: w */
        public void mo3879w(Throwable th2) {
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.mo3879w(th2);
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        public void wtf(Throwable th2) {
            for (AbstractC12803c abstractC12803c : C12799a.f33171c) {
                abstractC12803c.wtf(th2);
            }
        }

        @Override // timber.log.C12799a.AbstractC12803c
        protected void log(int i, String str, String message, Throwable th2) {
            C9612q.m13917h(message, "message");
            throw new AssertionError();
        }
    }
}