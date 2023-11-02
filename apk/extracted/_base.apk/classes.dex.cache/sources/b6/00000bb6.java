package co.discord.media_engine.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import org.webrtc.Logging;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, m14357d2 = {"logi", "", "tag", "", "msg", "android_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ExtensionFunctionsKt {
    public static final void logi(String tag, String msg) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(msg, "msg");
        Logging.log(Logging.Severity.LS_INFO, tag, msg);
    }
}