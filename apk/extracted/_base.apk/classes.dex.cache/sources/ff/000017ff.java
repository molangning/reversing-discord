package com.discord.icons.media;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.media.utils.DiscordVideoMediaSource;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/icons/media/MediaProxy;", "", "()V", "IMAGE_SIZE_ASSET_DEFAULT_PX", "", "MEDIA_PROXY_SIZES", "", "[Ljava/lang/Integer;", "getMediaProxySize", "size", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "withSize", "", "url", "params", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "icons_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class MediaProxy {
    public static final int IMAGE_SIZE_ASSET_DEFAULT_PX = 160;
    public static final MediaProxy INSTANCE = new MediaProxy();
    private static final Integer[] MEDIA_PROXY_SIZES = {16, 20, 32, 40, 64, 80, 128, 160, 256, 320, 512, Integer.valueOf((int) DiscordVideoMediaSource.DEFAULT_WIDTH), 1024, 1280, 1536, Integer.valueOf((int) RecyclerView.ItemAnimator.FLAG_MOVED), 3072, Integer.valueOf((int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT)};

    private MediaProxy() {
    }

    private final Integer getMediaProxySize(Integer num) {
        Object m14216d0;
        int intValue;
        boolean z;
        Integer num2 = null;
        if (num == null) {
            return null;
        }
        num.intValue();
        Integer[] numArr = MEDIA_PROXY_SIZES;
        int length = numArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Integer num3 = numArr[i];
            if (num3.intValue() >= num.intValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                num2 = num3;
                break;
            }
            i++;
        }
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            m14216d0 = C9538f.m14216d0(MEDIA_PROXY_SIZES);
            intValue = ((Number) m14216d0).intValue();
        }
        return Integer.valueOf(intValue);
    }

    public static /* synthetic */ String withSize$default(MediaProxy mediaProxy, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return mediaProxy.withSize(str, num, str2);
    }

    public final String withSize(String url, Integer num, String str) {
        C9612q.m13917h(url, "url");
        String str2 = "";
        String str3 = null;
        if (num != null && num.intValue() > 0) {
            Integer mediaProxySize = getMediaProxySize(num);
            if (str != null) {
                str3 = "&" + str;
            }
            if (str3 != null) {
                str2 = str3;
            }
            return url + "?size=" + mediaProxySize + str2;
        }
        if (str != null) {
            str3 = "?" + str;
        }
        if (str3 != null) {
            str2 = str3;
        }
        return url + str2;
    }
}