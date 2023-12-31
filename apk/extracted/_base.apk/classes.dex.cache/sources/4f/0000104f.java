package com.discord.chat.bridge.embed;

import com.discord.media_player.MediaSource;
import com.discord.media_player.MediaType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\u001a\u0012\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u0002\u001a#\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m14357d2 = {"getMedia", "Lcom/discord/chat/bridge/embed/EmbedUrlProvider;", "Lcom/discord/chat/bridge/embed/Embed;", "getTag", "", "getTargetDimensions", "Lkotlin/Pair;", "", "isInlineMedia", "", "toImageMediaSources", "", "Lcom/discord/media_player/MediaSource;", "toMediaSource", "shouldAutoPlay", "portal", "", "(Lcom/discord/chat/bridge/embed/Embed;ZLjava/lang/Double;)Lcom/discord/media_player/MediaSource;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbedUtilsKt {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmbedType.values().length];
            try {
                iArr[EmbedType.GIFV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmbedType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmbedType.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmbedType.Link.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EmbedType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EmbedType.Tweet.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EmbedType.Article.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EmbedUrlProvider getMedia(Embed embed) {
        EmbedMedia video;
        C9612q.m13917h(embed, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()]) {
            case 1:
            case 2:
                video = embed.getVideo();
                if (video == null) {
                    return embed.getThumbnail();
                }
                break;
            case 3:
            case 6:
            case 7:
                video = embed.getImage();
                if (video == null) {
                    return embed.getThumbnail();
                }
                break;
            case 4:
            case 5:
                return null;
            default:
                return embed.getImage();
        }
        return video;
    }

    public static final String getTag(Embed embed) {
        C9612q.m13917h(embed, "<this>");
        String simpleName = embed.getClass().getSimpleName();
        String name = embed.getType().name();
        return simpleName + ": " + name;
    }

    public static final Pair<Integer, Integer> getTargetDimensions(Embed embed) {
        Integer num;
        Integer num2;
        Pair<Integer, Integer> m7577a;
        C9612q.m13917h(embed, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()];
        Integer num3 = null;
        if (i != 1) {
            if (i != 2) {
                EmbedMedia image = embed.getImage();
                if (image == null || (m7577a = C11591x.m7577a(Integer.valueOf(image.getWidth()), Integer.valueOf(image.getHeight()))) == null) {
                    return C11591x.m7577a(null, null);
                }
                return m7577a;
            }
            EmbedMedia video = embed.getVideo();
            if (video != null) {
                num2 = Integer.valueOf(video.getWidth());
            } else {
                num2 = null;
            }
            EmbedMedia video2 = embed.getVideo();
            if (video2 != null) {
                num3 = Integer.valueOf(video2.getHeight());
            }
            return C11591x.m7577a(num2, num3);
        }
        EmbedThumbnail thumbnail = embed.getThumbnail();
        if (thumbnail != null) {
            num = Integer.valueOf(thumbnail.getWidth());
        } else {
            num = null;
        }
        EmbedThumbnail thumbnail2 = embed.getThumbnail();
        if (thumbnail2 != null) {
            num3 = Integer.valueOf(thumbnail2.getHeight());
        }
        return C11591x.m7577a(num, num3);
    }

    public static final boolean isInlineMedia(Embed embed) {
        C9612q.m13917h(embed, "<this>");
        if (getMedia(embed) == null && embed.getVideo() == null) {
            return true;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()];
        if (i != 1 && ((i != 2 && i != 3) || embed.getAuthor() != null || embed.getTitle() != null)) {
            return true;
        }
        return false;
    }

    public static final List<MediaSource> toImageMediaSources(Embed embed) {
        int m14093t;
        C9612q.m13917h(embed, "<this>");
        List<EmbedMedia> images = embed.getImages();
        if (images != null) {
            m14093t = C9546k.m14093t(images, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (EmbedMedia embedMedia : images) {
                arrayList.add(new MediaSource(null, embedMedia.getEmbedUrl(), getTag(embed), MediaType.IMAGE, false, null, 33, null));
            }
            return arrayList;
        }
        return null;
    }

    public static final MediaSource toMediaSource(Embed embed, boolean z, Double d) {
        String str;
        String str2;
        String embedUrl;
        C9612q.m13917h(embed, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()];
        String str3 = null;
        if (i != 1) {
            if (i != 2) {
                EmbedMedia image = embed.getImage();
                if (image == null || (embedUrl = image.getEmbedUrl()) == null) {
                    return null;
                }
                return new MediaSource(null, embedUrl, getTag(embed), MediaType.IMAGE, false, null, 33, null);
            }
            EmbedMedia video = embed.getVideo();
            if (video != null) {
                str2 = video.getProxyURL();
            } else {
                str2 = null;
            }
            EmbedThumbnail thumbnail = embed.getThumbnail();
            if (thumbnail != null) {
                str3 = thumbnail.getEmbedUrl();
            }
            return new MediaSource(str2, str3, getTag(embed), MediaType.VIDEO, false, d);
        }
        EmbedMedia video2 = embed.getVideo();
        if (video2 != null) {
            str = video2.getEmbedUrl();
        } else {
            str = null;
        }
        EmbedThumbnail thumbnail2 = embed.getThumbnail();
        if (thumbnail2 != null) {
            str3 = thumbnail2.getEmbedUrl();
        }
        return new MediaSource(str, str3, getTag(embed), MediaType.GIFV, z, d);
    }
}