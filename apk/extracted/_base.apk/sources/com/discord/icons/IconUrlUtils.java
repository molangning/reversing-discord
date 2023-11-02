package com.discord.icons;

import android.content.Context;
import com.discord.hosts.Hosts;
import com.discord.icons.media.MediaExtensionKt;
import com.discord.icons.media.MediaProxy;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.snowflake.SnowflakeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\nJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010JC\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001a\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u001b2\b\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'JQ\u0010(\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J&\u0010-\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, m14357d2 = {"Lcom/discord/icons/IconUrlUtils;", "", "()V", "getApplicationIcon", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "imageId", "size", "", "getApplicationIcon-weIltyw", "getCustomEmojiUrl", "emojiId", "", "animate", "", "(JZLjava/lang/Integer;)Ljava/lang/String;", "getForChannel", "context", "Landroid/content/Context;", "id", "Lcom/discord/primitives/ChannelId;", "icon", "isGroupDM", "getForChannel-JYSGpIY", "(Landroid/content/Context;Lcom/discord/primitives/ChannelId;Ljava/lang/String;ZLjava/lang/Integer;)Ljava/lang/String;", "getForGuild", "Lcom/discord/primitives/GuildId;", "defaultIcon", "animated", "getForGuild-14CJxO4", "(Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Ljava/lang/String;", "getForGuildMember", "guildMemberAvatar", "guildId", "userId", "Lcom/discord/primitives/UserId;", "sizePx", "getForGuildMember-2tNb6hE", "(Ljava/lang/String;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Ljava/lang/Integer;Z)Ljava/lang/String;", "getForUser", "userAvatar", "discriminator", "getForUser-_fRzTXg", "(Landroid/content/Context;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;)Ljava/lang/String;", "init", "", "cdnHost", "apiHost", "icons_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class IconUrlUtils {
    public static final IconUrlUtils INSTANCE = new IconUrlUtils();

    private IconUrlUtils() {
    }

    /* renamed from: getApplicationIcon-weIltyw$default  reason: not valid java name */
    public static /* synthetic */ String m41936getApplicationIconweIltyw$default(IconUrlUtils iconUrlUtils, ApplicationId applicationId, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 160;
        }
        return iconUrlUtils.m41941getApplicationIconweIltyw(applicationId, str, i);
    }

    public static /* synthetic */ String getCustomEmojiUrl$default(IconUrlUtils iconUrlUtils, long j, boolean z, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return iconUrlUtils.getCustomEmojiUrl(j, z, num);
    }

    /* renamed from: getForChannel-JYSGpIY$default  reason: not valid java name */
    public static /* synthetic */ String m41937getForChannelJYSGpIY$default(IconUrlUtils iconUrlUtils, Context context, ChannelId channelId, String str, boolean z, Integer num, int i, Object obj) {
        if ((i & 16) != 0) {
            num = null;
        }
        return iconUrlUtils.m41942getForChannelJYSGpIY(context, channelId, str, z, num);
    }

    /* renamed from: getForGuild-14CJxO4$default  reason: not valid java name */
    public static /* synthetic */ String m41938getForGuild14CJxO4$default(IconUrlUtils iconUrlUtils, GuildId guildId, String str, String str2, boolean z, Integer num, int i, Object obj) {
        String str3 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            z = false;
        }
        return iconUrlUtils.m41943getForGuild14CJxO4(guildId, str, str3, z, (i & 16) != 0 ? null : num);
    }

    /* renamed from: getForGuildMember-2tNb6hE$default  reason: not valid java name */
    public static /* synthetic */ String m41939getForGuildMember2tNb6hE$default(IconUrlUtils iconUrlUtils, String str, GuildId guildId, UserId userId, Integer num, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            z = false;
        }
        return iconUrlUtils.m41944getForGuildMember2tNb6hE(str, guildId, userId, num2, z);
    }

    public static /* synthetic */ void init$default(IconUrlUtils iconUrlUtils, Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        iconUrlUtils.init(context, str, str2);
    }

    /* renamed from: getApplicationIcon-weIltyw  reason: not valid java name */
    public final String m41941getApplicationIconweIltyw(ApplicationId applicationId, String str, int i) {
        MediaProxy mediaProxy = MediaProxy.INSTANCE;
        String cdn = Hosts.INSTANCE.getCDN();
        String mediaExtension$default = MediaExtensionKt.getMediaExtension$default(false, null, 2, null);
        return MediaProxy.withSize$default(mediaProxy, cdn + "/app-icons/" + applicationId + "/" + str + "." + mediaExtension$default, Integer.valueOf(i), null, 4, null);
    }

    public final String getCustomEmojiUrl(long j, boolean z, Integer num) {
        MediaProxy mediaProxy = MediaProxy.INSTANCE;
        String cdn = Hosts.INSTANCE.getCDN();
        String mediaExtension$default = MediaExtensionKt.getMediaExtension$default(z, null, 2, null);
        return MediaProxy.withSize$default(mediaProxy, cdn + "/emojis/" + j + "." + mediaExtension$default, num, null, 4, null);
    }

    /* renamed from: getForChannel-JYSGpIY  reason: not valid java name */
    public final String m41942getForChannelJYSGpIY(Context context, ChannelId channelId, String str, boolean z, Integer num) {
        boolean z2;
        String m7596b;
        C9612q.m13917h(context, "context");
        if (channelId == null) {
            return "";
        }
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (!z) {
                return "";
            }
            switch ((int) (SnowflakeUtils.INSTANCE.toTimestamp(channelId) % 8)) {
                case 1:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup1.getUri(context));
                case 2:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup2.getUri(context));
                case 3:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup3.getUri(context));
                case 4:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup4.getUri(context));
                case 5:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup5.getUri(context));
                case 6:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup6.getUri(context));
                case 7:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup7.getUri(context));
                default:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup0.getUri(context));
            }
        }
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(MediaProxy.withSize$default(MediaProxy.INSTANCE, Hosts.INSTANCE.getCDN() + "/channel-icons/" + channelId + "/" + str + "." + MediaExtensionKt.getMediaExtension$default(false, null, 2, null), num, null, 4, null));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7593e(m7596b) != null) {
            m7596b = Hosts.INSTANCE.getAPI() + "/channels/" + channelId + "/icons/" + str + ".jpg";
        }
        return (String) m7596b;
    }

    /* renamed from: getForGuild-14CJxO4  reason: not valid java name */
    public final String m41943getForGuild14CJxO4(GuildId guildId, String str, String str2, boolean z, Integer num) {
        boolean z2;
        String m7596b;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && guildId != null) {
            MediaProxy mediaProxy = MediaProxy.INSTANCE;
            try {
                C11583s.C11584a c11584a = C11583s.f30090k;
                m7596b = C11583s.m7596b(Hosts.INSTANCE.getCDN() + "/icons/" + guildId + "/" + str + "." + MediaExtensionKt.getMediaExtension(z, str));
            } catch (Throwable th2) {
                C11583s.C11584a c11584a2 = C11583s.f30090k;
                m7596b = C11583s.m7596b(C11586t.m7587a(th2));
            }
            if (C11583s.m7593e(m7596b) != null) {
                m7596b = Hosts.INSTANCE.getAPI() + "/guilds/" + guildId + "/icons/" + str + ".jpg";
            }
            return MediaProxy.withSize$default(mediaProxy, (String) m7596b, num, null, 4, null);
        } else if (str2 == null) {
            return "";
        } else {
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[ORIG_RETURN, RETURN] */
    /* renamed from: getForGuildMember-2tNb6hE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m41944getForGuildMember2tNb6hE(java.lang.String r9, com.discord.primitives.GuildId r10, com.discord.primitives.UserId r11, java.lang.Integer r12, boolean r13) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == 0) goto Ld
            boolean r2 = kotlin.text.C9642f.m13789w(r9)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 != 0) goto L72
            if (r10 == 0) goto L1e
            long r2 = r10.m42069unboximpl()
            boolean r2 = com.discord.primitives.GuildId.m42066isValidimpl(r2)
            if (r2 != r1) goto L1e
            r2 = r1
            goto L1f
        L1e:
            r2 = r0
        L1f:
            if (r2 == 0) goto L72
            if (r11 == 0) goto L2e
            long r2 = r11.m42120unboximpl()
            boolean r2 = com.discord.primitives.UserId.m42117isValidimpl(r2)
            if (r2 != r1) goto L2e
            r0 = r1
        L2e:
            if (r0 != 0) goto L31
            goto L72
        L31:
            java.lang.String r13 = com.discord.icons.media.MediaExtensionKt.getMediaExtension(r13, r9)
            com.discord.hosts.Hosts r0 = com.discord.hosts.Hosts.INSTANCE
            java.lang.String r0 = r0.getCDN()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/guilds/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = "/users/"
            r1.append(r10)
            r1.append(r11)
            java.lang.String r10 = "/avatars/"
            r1.append(r10)
            r1.append(r9)
            java.lang.String r9 = "."
            r1.append(r9)
            r1.append(r13)
            java.lang.String r3 = r1.toString()
            com.discord.icons.media.MediaProxy r2 = com.discord.icons.media.MediaProxy.INSTANCE
            r5 = 0
            r6 = 4
            r7 = 0
            r4 = r12
            java.lang.String r9 = com.discord.icons.media.MediaProxy.withSize$default(r2, r3, r4, r5, r6, r7)
            return r9
        L72:
            java.lang.String r9 = ""
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.icons.IconUrlUtils.m41944getForGuildMember2tNb6hE(java.lang.String, com.discord.primitives.GuildId, com.discord.primitives.UserId, java.lang.Integer, boolean):java.lang.String");
    }

    /* renamed from: getForUser-_fRzTXg  reason: not valid java name */
    public final String m41945getForUser_fRzTXg(Context context, UserId userId, String str, Integer num, boolean z, Integer num2) {
        String m7596b;
        C9612q.m13917h(context, "context");
        if (userId != null) {
            if (UserId.m42114equalsimpl(UserId.m42112constructorimpl(-1L), userId)) {
                if (str == null) {
                    return "";
                }
                return str;
            } else if (str != null) {
                try {
                    C11583s.C11584a c11584a = C11583s.f30090k;
                    String mediaExtension = MediaExtensionKt.getMediaExtension(z, str);
                    m7596b = C11583s.m7596b(MediaProxy.withSize$default(MediaProxy.INSTANCE, Hosts.INSTANCE.getCDN() + "/avatars/" + userId + "/" + str + "." + mediaExtension, num2, null, 4, null));
                } catch (Throwable th2) {
                    C11583s.C11584a c11584a2 = C11583s.f30090k;
                    m7596b = C11583s.m7596b(C11586t.m7587a(th2));
                }
                if (C11583s.m7593e(m7596b) != null) {
                    m7596b = Hosts.INSTANCE.getAPI() + "/users/" + userId + "/avatars/" + str + ".jpg";
                }
                return (String) m7596b;
            } else if (num != null) {
                int intValue = num.intValue() % 5;
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar0.getUri(context));
                            }
                            return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar4.getUri(context));
                        }
                        return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar3.getUri(context));
                    }
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar2.getUri(context));
                }
                return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar1.getUri(context));
            }
        }
        return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar0.getUri(context));
    }

    public final void init(Context context, String str, String str2) {
        C9612q.m13917h(context, "context");
        Hosts.INSTANCE.init(context, str2, str);
    }
}
