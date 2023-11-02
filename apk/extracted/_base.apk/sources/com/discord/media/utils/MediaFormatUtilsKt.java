package com.discord.media.utils;

import android.media.MediaFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"mimeType", "", "Landroid/media/MediaFormat;", "getMimeType", "(Landroid/media/MediaFormat;)Ljava/lang/String;", "isHevcVideo", "", "media_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaFormatUtilsKt {
    public static final String getMimeType(MediaFormat mediaFormat) {
        Object m7596b;
        C9612q.m13917h(mediaFormat, "<this>");
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(mediaFormat.getString("mime"));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7591g(m7596b)) {
            m7596b = null;
        }
        return (String) m7596b;
    }

    public static final boolean isHevcVideo(MediaFormat mediaFormat) {
        C9612q.m13917h(mediaFormat, "<this>");
        return C9612q.m13922c(getMimeType(mediaFormat), "video/hevc");
    }
}
