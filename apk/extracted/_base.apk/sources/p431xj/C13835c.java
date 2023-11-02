package p431xj;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000#\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0004\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b\"\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m14357d2 = {"", "Ljava/util/Date;", "a", "b", "xj/c$a", "Lxj/c$a;", "STANDARD_DATE_FORMAT", "", "[Ljava/lang/String;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "Ljava/text/DateFormat;", "c", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMATS", "okhttp"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: xj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13835c {

    /* renamed from: a */
    private static final C13836a f35625a = new C13836a();

    /* renamed from: b */
    private static final String[] f35626b;

    /* renamed from: c */
    private static final DateFormat[] f35627c;

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, m14357d2 = {"xj/c$a", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: xj.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13836a extends ThreadLocal<DateFormat> {
        C13836a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C12562c.f32613f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f35626b = strArr;
        f35627c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m1439a(String toHttpDateOrNull) {
        boolean z;
        C9612q.m13917h(toHttpDateOrNull, "$this$toHttpDateOrNull");
        if (toHttpDateOrNull.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f35625a.get().parse(toHttpDateOrNull, parsePosition);
        if (parsePosition.getIndex() == toHttpDateOrNull.length()) {
            return parse;
        }
        String[] strArr = f35626b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = f35627c;
                DateFormat dateFormat = dateFormatArr[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f35626b[i], Locale.US);
                    dateFormat.setTimeZone(C12562c.f32613f);
                    dateFormatArr[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(toHttpDateOrNull, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            Unit unit = Unit.f25302a;
            return null;
        }
    }

    /* renamed from: b */
    public static final String m1438b(Date toHttpDateString) {
        C9612q.m13917h(toHttpDateString, "$this$toHttpDateString");
        String format = f35625a.get().format(toHttpDateString);
        C9612q.m13918g(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
