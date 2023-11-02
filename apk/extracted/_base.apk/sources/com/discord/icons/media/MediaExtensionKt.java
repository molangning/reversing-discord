package com.discord.icons.media;

import android.os.Build;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.text.C9653o;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m14357d2 = {"ANIMATED_IMAGE_EXTENSION", "", "STATIC_IMAGE_EXTENSION", "getMediaExtension", "allowAnimation", "", "imageHash", "isImageHashAnimated", "icons_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class MediaExtensionKt {
    private static final String ANIMATED_IMAGE_EXTENSION = "gif";
    private static final String STATIC_IMAGE_EXTENSION;

    static {
        List m14101l;
        String str;
        m14101l = C9545j.m14101l(28, 29);
        if (m14101l.contains(Integer.valueOf(Build.VERSION.SDK_INT))) {
            str = "png";
        } else {
            str = "webp";
        }
        STATIC_IMAGE_EXTENSION = str;
    }

    public static final String getMediaExtension(boolean z, String str) {
        if (z && isImageHashAnimated(str)) {
            return ANIMATED_IMAGE_EXTENSION;
        }
        return STATIC_IMAGE_EXTENSION;
    }

    public static /* synthetic */ String getMediaExtension$default(boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return getMediaExtension(z, str);
    }

    private static final boolean isImageHashAnimated(String str) {
        boolean m13758H;
        if (str == null) {
            return true;
        }
        m13758H = C9653o.m13758H(str, "a_", false, 2, null);
        return m13758H;
    }
}
