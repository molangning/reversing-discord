package p390vj;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, m14357d2 = {"Lvj/a;", "task", "Lvj/d;", "queue", "", "message", "", "c", "", "ns", "b", "okhttp"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: vj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13343b {
    /* renamed from: a */
    public static final /* synthetic */ void m2751a(AbstractC13342a abstractC13342a, C13345d c13345d, String str) {
        m2749c(abstractC13342a, c13345d, str);
    }

    /* renamed from: b */
    public static final String m2750b(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        C9602k0 c9602k0 = C9602k0.f25351a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C9612q.m13918g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m2749c(AbstractC13342a abstractC13342a, C13345d c13345d, String str) {
        Logger m2724a = C13346e.f34430j.m2724a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c13345d.m2743f());
        sb2.append(' ');
        C9602k0 c9602k0 = C9602k0.f25351a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C9612q.m13918g(format, "java.lang.String.format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(abstractC13342a.m2756b());
        m2724a.fine(sb2.toString());
    }
}
