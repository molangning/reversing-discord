package com.discord.notifications.renderer;

import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.C0895t0;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationManagerCompat;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.crash_reporting.CrashReporting;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import gg.C6759j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9544i;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import p304qf.C11888u;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003)*+B\t\b\u0002¢\u0006\u0004\b'\u0010(J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fH\u0002JT\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0002J5\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J6\u0010 \u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fJ\u0016\u0010\"\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0003J\u0012\u0010$\u001a\u00020\u0003*\u00020#2\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006,"}, m14357d2 = {"Lcom/discord/notifications/renderer/NotificationChannels;", "", "Lcom/discord/notifications/renderer/NotificationChannels$CallRingtone;", "", "getChannelId", "Landroid/content/Context;", "context", "Landroidx/core/app/NotificationChannelCompat;", "getCallChannel", "getCallChannelId", "Lcom/discord/notifications/renderer/NotificationChannels$Category;", "getAndDeleteLegacyNotificationChannel", "", "localizedGroupNames", "", "Landroidx/core/app/t0;", "createNotificationChannelGroups", "category", "", "brandColor", "localizedCategoryNames", "Lkotlin/Function2;", "Landroidx/core/app/NotificationChannelCompat$Builder;", "", "onConfigure", "migrateOrCreateNotificationChannel", "legacyChannel", "builder", "ringtoneName", "configureCallChannel", "(Landroid/content/Context;Landroidx/core/app/NotificationChannelCompat;Landroidx/core/app/NotificationChannelCompat$Builder;Ljava/lang/Integer;)V", "configureMediaChannel", "init", ZeroconfModule.KEY_SERVICE_NAME, "setIncomingRingtone", "Lcom/discord/notifications/api/NotificationData;", "getNotificationChannelId", "BASE_CALL_CHANNEL_ID", "Ljava/lang/String;", "<init>", "()V", "CallRingtone", "Category", "ChannelGroup", "notification_renderer_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationChannels {
    private static final String BASE_CALL_CHANNEL_ID = "calls";
    public static final NotificationChannels INSTANCE = new NotificationChannels();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$CallRingtone;", "", "id", "", "resource", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getResource", "()I", "Halloween", "Default", "Companion", "notification_renderer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public enum CallRingtone {
        Halloween("halloween", C3351R.raw.call_ringing_halloween),
        Default("default", C3351R.raw.call_ringing);
        
        public static final Companion Companion = new Companion(null);

        /* renamed from: id */
        private final String f9065id;
        private final int resource;

        @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$CallRingtone$Companion;", "", "()V", "fromName", "Lcom/discord/notifications/renderer/NotificationChannels$CallRingtone;", ZeroconfModule.KEY_SERVICE_NAME, "", "notification_renderer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CallRingtone fromName(String name) {
                C9612q.m13917h(name, "name");
                if (C9612q.m13922c(name, "call_ringing_halloween")) {
                    return CallRingtone.Halloween;
                }
                return CallRingtone.Default;
            }
        }

        CallRingtone(String str, int i) {
            this.f9065id = str;
            this.resource = i;
        }

        public final String getId() {
            return this.f9065id;
        }

        public final int getResource() {
            return this.resource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Calls uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0082\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006!"}, m14357d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$Category;", "", "id", "", "importance", "", "group", "Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;", "legacyId", "(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V", "getGroup", "()Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;", "getId", "()Ljava/lang/String;", "getImportance", "()I", "getLegacyId", "Calls", "MediaConnections", "Messages", "MessagesDirect", "FriendRequests", "Social", "GameDetection", "StageStart", "SystemMessages", "ForumThreadCreated", "GuildEventStart", "GuildHighlights", "OtherServerNotifications", "OtherHighPriority", "Other", "Companion", "notification_renderer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Category {
        private static final /* synthetic */ Category[] $VALUES;
        public static final Category Calls;
        public static final Companion Companion;
        public static final Category ForumThreadCreated;
        public static final Category FriendRequests;
        public static final Category GameDetection;
        public static final Category GuildEventStart;
        public static final Category GuildHighlights;
        public static final Category MediaConnections;
        public static final Category Messages;
        public static final Category MessagesDirect;
        public static final Category Other;
        public static final Category OtherHighPriority;
        public static final Category OtherServerNotifications;
        public static final Category Social;
        public static final Category StageStart;
        public static final Category SystemMessages;
        private final ChannelGroup group;

        /* renamed from: id */
        private final String f9066id;
        private final int importance;
        private final String legacyId;

        @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004¨\u0006\t"}, m14357d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;", "", "()V", "defaultLabel", "", "category", "Lcom/discord/notifications/renderer/NotificationChannels$Category;", "fromTrackingType", "trackingType", "notification_renderer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class Companion {

            @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Category.values().length];
                    try {
                        iArr[Category.Calls.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Category.MediaConnections.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Category.Messages.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Category.MessagesDirect.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Category.FriendRequests.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Category.Social.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[Category.GameDetection.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[Category.StageStart.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[Category.SystemMessages.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[Category.ForumThreadCreated.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[Category.GuildEventStart.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[Category.GuildHighlights.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[Category.OtherServerNotifications.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String defaultLabel(Category category) {
                C9612q.m13917h(category, "category");
                switch (WhenMappings.$EnumSwitchMapping$0[category.ordinal()]) {
                    case 1:
                        return "Incoming calls";
                    case 2:
                        return "Voice connected";
                    case 3:
                        return "Messages";
                    case 4:
                        return "Direct messages";
                    case 5:
                        return "Friend requests";
                    case 6:
                        return "Social";
                    case 7:
                        return "Game detection";
                    case 8:
                        return "Stage notifications";
                    case 9:
                        return "Discord system messages";
                    case 10:
                        return "Forum notifications";
                    case 11:
                        return "Event notifications";
                    case 12:
                        return "Server highlights";
                    case 13:
                        return "Other server notifications";
                    default:
                        return "Other";
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_TOP_MESSAGES_PUSH) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_MODERATOR_FEATURED_MESSAGE) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_GUILD_STREAM_START) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_HOME_LIFECYCLE_PUSH) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_FRIEND_REQUEST_REMINDER) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
                return com.discord.notifications.renderer.NotificationChannels.Category.OtherServerNotifications;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
                return com.discord.notifications.renderer.NotificationChannels.Category.Social;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
                if (r2.equals(com.discord.notifications.api.NotificationData.TRACKING_TYPE_MISSED_MESSAGE) == false) goto L31;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.discord.notifications.renderer.NotificationChannels.Category fromTrackingType(java.lang.String r2) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L68
                    int r0 = r2.hashCode()
                    switch(r0) {
                        case -1760014021: goto L5c;
                        case -1433897036: goto L50;
                        case -1372753926: goto L44;
                        case -198753646: goto L3b;
                        case 533975599: goto L2f;
                        case 1308493743: goto L26;
                        case 1323738094: goto L1d;
                        case 1428648131: goto L14;
                        case 1581734347: goto Lb;
                        default: goto L9;
                    }
                L9:
                    goto L68
                Lb:
                    java.lang.String r0 = "generic_missed_message"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L38
                    goto L68
                L14:
                    java.lang.String r0 = "top_messages_push"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L38
                    goto L68
                L1d:
                    java.lang.String r0 = "generic_home_featured_message"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L38
                    goto L68
                L26:
                    java.lang.String r0 = "GUILD_STREAM_START"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L65
                    goto L68
                L2f:
                    java.lang.String r0 = "home_lifecycle_push"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L38
                    goto L68
                L38:
                    com.discord.notifications.renderer.NotificationChannels$Category r2 = com.discord.notifications.renderer.NotificationChannels.Category.OtherServerNotifications
                    goto L6a
                L3b:
                    java.lang.String r0 = "nudge_new_friend_dm_push"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L65
                    goto L68
                L44:
                    java.lang.String r0 = "trending_content_push"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L4d
                    goto L68
                L4d:
                    com.discord.notifications.renderer.NotificationChannels$Category r2 = com.discord.notifications.renderer.NotificationChannels.Category.GuildHighlights
                    goto L6a
                L50:
                    java.lang.String r0 = "suspicious_session"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L59
                    goto L68
                L59:
                    com.discord.notifications.renderer.NotificationChannels$Category r2 = com.discord.notifications.renderer.NotificationChannels.Category.SystemMessages
                    goto L6a
                L5c:
                    java.lang.String r0 = "generic_friend_request_reminder"
                    boolean r2 = r2.equals(r0)
                    if (r2 != 0) goto L65
                    goto L68
                L65:
                    com.discord.notifications.renderer.NotificationChannels$Category r2 = com.discord.notifications.renderer.NotificationChannels.Category.Social
                    goto L6a
                L68:
                    com.discord.notifications.renderer.NotificationChannels$Category r2 = com.discord.notifications.renderer.NotificationChannels.Category.Other
                L6a:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.NotificationChannels.Category.Companion.fromTrackingType(java.lang.String):com.discord.notifications.renderer.NotificationChannels$Category");
            }
        }

        private static final /* synthetic */ Category[] $values() {
            return new Category[]{Calls, MediaConnections, Messages, MessagesDirect, FriendRequests, Social, GameDetection, StageStart, SystemMessages, ForumThreadCreated, GuildEventStart, GuildHighlights, OtherServerNotifications, OtherHighPriority, Other};
        }

        static {
            ChannelGroup channelGroup = ChannelGroup.Realtime;
            Calls = new Category("Calls", 0, NotificationChannels.BASE_CALL_CHANNEL_ID, 4, channelGroup, "Calls");
            MediaConnections = new Category("MediaConnections", 1, "mediaConnections", 3, channelGroup, "Media Connections");
            ChannelGroup channelGroup2 = ChannelGroup.Server;
            Messages = new Category("Messages", 2, "messages", 4, channelGroup2, "Messages");
            ChannelGroup channelGroup3 = ChannelGroup.Social;
            MessagesDirect = new Category("MessagesDirect", 3, "directMessages", 4, channelGroup3, "DirectMessages");
            FriendRequests = new Category("FriendRequests", 4, "friendRequests", 4, channelGroup3, null);
            Social = new Category("Social", 5, "social", 2, channelGroup3, "Social");
            GameDetection = new Category("GameDetection", 6, "gameDetection", 1, channelGroup, "Game Detection");
            StageStart = new Category("StageStart", 7, "stageLive", 4, channelGroup2, "Stage Live");
            ChannelGroup channelGroup4 = ChannelGroup.Other;
            SystemMessages = new Category("SystemMessages", 8, "systemMessages", 4, channelGroup4, null);
            ForumThreadCreated = new Category("ForumThreadCreated", 9, "forumThreadCreated", 4, channelGroup2, "Forum Post Create");
            GuildEventStart = new Category("GuildEventStart", 10, "guildEventLive", 4, channelGroup2, "Guild Event Live");
            GuildHighlights = new Category("GuildHighlights", 11, "guildHighlights", 4, channelGroup2, null);
            OtherServerNotifications = new Category("OtherServerNotifications", 12, "other", 2, channelGroup2, "General");
            OtherHighPriority = new Category("OtherHighPriority", 13, "otherHighPriority", 4, channelGroup4, "GeneralHigh");
            Other = new Category("Other", 14, "default", 1, channelGroup4, null);
            $VALUES = $values();
            Companion = new Companion(null);
        }

        private Category(String str, int i, String str2, int i2, ChannelGroup channelGroup, String str3) {
            this.f9066id = str2;
            this.importance = i2;
            this.group = channelGroup;
            this.legacyId = str3;
        }

        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        public static Category[] values() {
            return (Category[]) $VALUES.clone();
        }

        public final ChannelGroup getGroup() {
            return this.group;
        }

        public final String getId() {
            return this.f9066id;
        }

        public final int getImportance() {
            return this.importance;
        }

        public final String getLegacyId() {
            return this.legacyId;
        }

        /* synthetic */ Category(String str, int i, String str2, int i2, ChannelGroup channelGroup, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, i2, channelGroup, (i3 & 8) != 0 ? null : str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;", "", "id", "", "groupId", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getId", "Realtime", "Social", "Server", "Other", "Companion", "notification_renderer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public enum ChannelGroup {
        Realtime("realtime", "111_realtime"),
        Social("social", "222_social"),
        Server("server", "333_server"),
        Other("other", "444_other");
        
        public static final Companion Companion = new Companion(null);
        private final String groupId;

        /* renamed from: id */
        private final String f9067id;

        @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup$Companion;", "", "()V", "defaultLabel", "", "id", "notification_renderer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String defaultLabel(String id2) {
                C9612q.m13917h(id2, "id");
                int hashCode = id2.hashCode();
                if (hashCode != -905826493) {
                    if (hashCode != -897050771) {
                        if (hashCode == -859198101 && id2.equals("realtime")) {
                            return "Real-time";
                        }
                    } else if (id2.equals("social")) {
                        return "Social";
                    }
                } else if (id2.equals("server")) {
                    return "Server";
                }
                return "Other";
            }
        }

        ChannelGroup(String str, String str2) {
            this.f9067id = str;
            this.groupId = str2;
        }

        public final String getGroupId() {
            return this.groupId;
        }

        public final String getId() {
            return this.f9067id;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallRingtone.values().length];
            try {
                iArr[CallRingtone.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Category.values().length];
            try {
                iArr2[Category.Calls.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private NotificationChannels() {
    }

    private final void configureCallChannel(Context context, NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder, Integer num) {
        boolean z;
        NotificationChannelCompat.Builder m39104j = builder.m39104j(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
        if (notificationChannelCompat != null) {
            z = notificationChannelCompat.m39120a();
        } else {
            z = false;
        }
        NotificationChannelCompat.Builder m39107g = m39104j.m39107g(z);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android.resource://");
        String packageName = context.getPackageName();
        sb2.append(packageName + "/" + num);
        m39107g.m39106h(Uri.parse(sb2.toString()), new AudioAttributes.Builder().setUsage(5).setContentType(2).build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void configureCallChannel$default(NotificationChannels notificationChannels, Context context, NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            num = Integer.valueOf(C3351R.raw.call_ringing);
        }
        notificationChannels.configureCallChannel(context, notificationChannelCompat, builder, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureMediaChannel(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (notificationChannelCompat != null) {
            z = notificationChannelCompat.m39120a();
        } else {
            z = false;
        }
        NotificationChannelCompat.Builder m39107g = builder.m39107g(z);
        if (notificationChannelCompat != null) {
            z2 = notificationChannelCompat.m39114g();
        } else {
            z2 = false;
        }
        NotificationChannelCompat.Builder m39105i = m39107g.m39105i(z2);
        if (notificationChannelCompat != null) {
            z3 = notificationChannelCompat.m39115f();
        }
        m39105i.m39109e(z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<androidx.core.app.C0895t0> createNotificationChannelGroups(android.content.Context r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r9 = this;
            com.discord.notifications.renderer.NotificationChannels$ChannelGroup[] r0 = com.discord.notifications.renderer.NotificationChannels.ChannelGroup.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
            r4 = r3
        Ld:
            if (r4 >= r2) goto L8b
            r5 = r0[r4]
            java.lang.String r6 = r5.getId()
            boolean r6 = r11.containsKey(r6)
            if (r6 == 0) goto L5e
            java.lang.String r6 = r5.getId()
            java.lang.Object r6 = r11.get(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L30
            boolean r6 = kotlin.text.C9642f.m13789w(r6)
            if (r6 == 0) goto L2e
            goto L30
        L2e:
            r6 = r3
            goto L31
        L30:
            r6 = 1
        L31:
            if (r6 == 0) goto L34
            goto L5e
        L34:
            androidx.core.app.t0$c r6 = new androidx.core.app.t0$c
            java.lang.String r7 = r5.getGroupId()
            r6.<init>(r7)
            java.lang.String r7 = r5.getId()
            java.lang.Object r7 = r11.get(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            androidx.core.app.t0$c r6 = r6.m38493c(r7)
            java.lang.String r5 = r5.getId()
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            androidx.core.app.t0$c r5 = r6.m38494b(r5)
            androidx.core.app.t0 r5 = r5.m38495a()
            goto L85
        L5e:
            androidx.core.app.t0$c r6 = new androidx.core.app.t0$c
            java.lang.String r7 = r5.getGroupId()
            r6.<init>(r7)
            com.discord.notifications.renderer.NotificationChannels$ChannelGroup$Companion r7 = com.discord.notifications.renderer.NotificationChannels.ChannelGroup.Companion
            java.lang.String r8 = r5.getId()
            java.lang.String r8 = r7.defaultLabel(r8)
            androidx.core.app.t0$c r6 = r6.m38493c(r8)
            java.lang.String r5 = r5.getId()
            java.lang.String r5 = r7.defaultLabel(r5)
            androidx.core.app.t0$c r5 = r6.m38494b(r5)
            androidx.core.app.t0 r5 = r5.m38495a()
        L85:
            r1.add(r5)
            int r4 = r4 + 1
            goto Ld
        L8b:
            androidx.core.app.NotificationManagerCompat r10 = com.discord.notifications.renderer.utils.NotificationManagerUtilsKt.getNotificationManagerCompat(r10)
            r10.m38788d(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.NotificationChannels.createNotificationChannelGroups(android.content.Context, java.util.Map):java.util.List");
    }

    private final NotificationChannelCompat getAndDeleteLegacyNotificationChannel(Category category, Context context) {
        NotificationChannelCompat m38782j;
        try {
            if (category.getLegacyId() == null || (m38782j = NotificationManagerUtilsKt.getNotificationManagerCompat(context).m38782j(category.getLegacyId())) == null) {
                return null;
            }
            NotificationManagerUtilsKt.getNotificationManagerCompat(context).m38786f(category.getLegacyId());
            return m38782j;
        } catch (Exception unused) {
            return null;
        }
    }

    private final NotificationChannelCompat getCallChannel(Context context) {
        boolean m13758H;
        for (NotificationChannelCompat notificationChannelCompat : NotificationManagerUtilsKt.getNotificationManagerCompat(context).m38778n()) {
            String m39119b = notificationChannelCompat.m39119b();
            C9612q.m13918g(m39119b, "channel.id");
            m13758H = C9653o.m13758H(m39119b, BASE_CALL_CHANNEL_ID, false, 2, null);
            if (m13758H) {
                return notificationChannelCompat;
            }
        }
        return null;
    }

    private final String getCallChannelId(Context context) {
        NotificationChannelCompat callChannel = getCallChannel(context);
        String m39119b = callChannel != null ? callChannel.m39119b() : null;
        return m39119b == null ? BASE_CALL_CHANNEL_ID : m39119b;
    }

    private final String getChannelId(CallRingtone callRingtone) {
        if (WhenMappings.$EnumSwitchMapping$0[callRingtone.ordinal()] == 1) {
            return BASE_CALL_CHANNEL_ID;
        }
        String id2 = callRingtone.getId();
        return "calls_" + id2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.core.app.NotificationChannelCompat migrateOrCreateNotificationChannel(android.content.Context r5, com.discord.notifications.renderer.NotificationChannels.Category r6, int r7, java.util.Map<java.lang.String, java.lang.String> r8, kotlin.jvm.functions.Function2<? super androidx.core.app.NotificationChannelCompat, ? super androidx.core.app.NotificationChannelCompat.Builder, kotlin.Unit> r9) {
        /*
            r4 = this;
            androidx.core.app.NotificationChannelCompat r0 = r4.getAndDeleteLegacyNotificationChannel(r6, r5)
            java.lang.String r1 = r6.getId()
            boolean r1 = r8.containsKey(r1)
            if (r1 != 0) goto L1b
            androidx.core.app.NotificationManagerCompat r5 = com.discord.notifications.renderer.utils.NotificationManagerUtilsKt.getNotificationManagerCompat(r5)
            java.lang.String r6 = r6.getId()
            r5.m38786f(r6)
            r5 = 0
            return r5
        L1b:
            java.lang.String r1 = r6.getId()
            java.lang.Object r1 = r8.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 1
            if (r1 == 0) goto L31
            boolean r1 = kotlin.text.C9642f.m13789w(r1)
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r1 = 0
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L3b
            com.discord.notifications.renderer.NotificationChannels$Category$Companion r8 = com.discord.notifications.renderer.NotificationChannels.Category.Companion
            java.lang.String r8 = r8.defaultLabel(r6)
            goto L45
        L3b:
            java.lang.String r1 = r6.getId()
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = (java.lang.String) r8
        L45:
            int[] r1 = com.discord.notifications.renderer.NotificationChannels.WhenMappings.$EnumSwitchMapping$1
            int r3 = r6.ordinal()
            r1 = r1[r3]
            if (r1 != r2) goto L54
            java.lang.String r5 = r4.getCallChannelId(r5)
            goto L58
        L54:
            java.lang.String r5 = r6.getId()
        L58:
            androidx.core.app.NotificationChannelCompat$Builder r1 = new androidx.core.app.NotificationChannelCompat$Builder
            int r3 = r6.getImportance()
            r1.<init>(r5, r3)
            androidx.core.app.NotificationChannelCompat$Builder r5 = r1.m39108f(r8)
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.m39112b(r8)
            com.discord.notifications.renderer.NotificationChannels$ChannelGroup r6 = r6.getGroup()
            java.lang.String r6 = r6.getGroupId()
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.m39111c(r6)
            if (r0 == 0) goto L7c
            boolean r6 = r0.m39120a()
            goto L7d
        L7c:
            r6 = r2
        L7d:
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.m39107g(r6)
            if (r0 == 0) goto L88
            boolean r6 = r0.m39114g()
            goto L89
        L88:
            r6 = r2
        L89:
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.m39105i(r6)
            if (r0 == 0) goto L93
            boolean r2 = r0.m39115f()
        L93:
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.m39109e(r2)
            androidx.core.app.NotificationChannelCompat$Builder r5 = r5.m39110d(r7)
            java.lang.String r6 = "builder"
            kotlin.jvm.internal.C9612q.m13918g(r5, r6)
            r9.invoke(r0, r5)
            androidx.core.app.NotificationChannelCompat r5 = r5.m39113a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.NotificationChannels.migrateOrCreateNotificationChannel(android.content.Context, com.discord.notifications.renderer.NotificationChannels$Category, int, java.util.Map, kotlin.jvm.functions.Function2):androidx.core.app.NotificationChannelCompat");
    }

    static /* synthetic */ NotificationChannelCompat migrateOrCreateNotificationChannel$default(NotificationChannels notificationChannels, Context context, Category category, int i, Map map, Function2 function2, int i2, Object obj) {
        NotificationChannels$migrateOrCreateNotificationChannel$1 notificationChannels$migrateOrCreateNotificationChannel$1 = function2;
        if ((i2 & 16) != 0) {
            notificationChannels$migrateOrCreateNotificationChannel$1 = NotificationChannels$migrateOrCreateNotificationChannel$1.INSTANCE;
        }
        return notificationChannels.migrateOrCreateNotificationChannel(context, category, i, map, notificationChannels$migrateOrCreateNotificationChannel$1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String getNotificationChannelId(NotificationData notificationData, Context context) {
        Category category;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        if (C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_CALL_RING)) {
            return getCallChannelId(context);
        }
        String type = notificationData.getType();
        switch (type.hashCode()) {
            case -1502317553:
                if (type.equals(NotificationData.TYPE_GENERIC_PUSH_NOTIFICATION_SENT)) {
                    category = Category.Companion.fromTrackingType(notificationData.getTrackingType());
                    break;
                }
                category = Category.Other;
                break;
            case -1489275252:
                if (type.equals(NotificationData.TYPE_GUILD_SCHEDULED_EVENT_UPDATE)) {
                    category = Category.GuildEventStart;
                    break;
                }
                category = Category.Other;
                break;
            case -1327124998:
                if (type.equals(NotificationData.TYPE_RELATIONSHIP_ADD)) {
                    category = Category.FriendRequests;
                    break;
                }
                category = Category.Other;
                break;
            case -1263316859:
                if (type.equals(NotificationData.TYPE_STAGE_INSTANCE_CREATE)) {
                    category = Category.StageStart;
                    break;
                }
                category = Category.Other;
                break;
            case -437641071:
                if (type.equals(NotificationData.TYPE_FORUM_THREAD_CREATED)) {
                    category = Category.ForumThreadCreated;
                    break;
                }
                category = Category.Other;
                break;
            case -45642698:
                if (type.equals(NotificationData.TYPE_FRIEND_SUGGESTION_CREATE)) {
                    category = Category.Social;
                    break;
                }
                category = Category.Other;
                break;
            case 998188116:
                if (type.equals(NotificationData.TYPE_MESSAGE_CREATE)) {
                    Integer channelType = notificationData.getChannelType();
                    boolean z = true;
                    if ((channelType == null || channelType.intValue() != 3) && (channelType == null || channelType.intValue() != 1)) {
                        z = false;
                    }
                    if (z) {
                        category = Category.MessagesDirect;
                        break;
                    } else {
                        category = Category.Messages;
                        break;
                    }
                }
                category = Category.Other;
                break;
            default:
                category = Category.Other;
                break;
        }
        return category.getId();
    }

    public final void init(Context context, Map<String, String> localizedCategoryNames, Map<String, String> localizedGroupNames) {
        int m14093t;
        int m6758d;
        int m21930c;
        boolean z;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(localizedCategoryNames, "localizedCategoryNames");
        C9612q.m13917h(localizedGroupNames, "localizedGroupNames");
        int colorCompat = ColorUtilsKt.getColorCompat(context, C3351R.color.brand);
        List<C0895t0> createNotificationChannelGroups = createNotificationChannelGroups(context, localizedGroupNames);
        Category[] values = Category.values();
        ArrayList arrayList = new ArrayList();
        for (Category category : values) {
            NotificationChannelCompat migrateOrCreateNotificationChannel = INSTANCE.migrateOrCreateNotificationChannel(context, category, colorCompat, localizedCategoryNames, new NotificationChannels$init$notificationChannels$1$1(category, context));
            if (migrateOrCreateNotificationChannel != null) {
                arrayList.add(migrateOrCreateNotificationChannel);
            }
        }
        try {
            NotificationManagerUtilsKt.getNotificationManagerCompat(context).m38787e(arrayList);
        } catch (Exception e) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            m14093t = C9546k.m14093t(createNotificationChannelGroups, 10);
            m6758d = C11888u.m6758d(m14093t);
            m21930c = C6759j.m21930c(m6758d, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
            for (C0895t0 c0895t0 : createNotificationChannelGroups) {
                String valueOf = String.valueOf(c0895t0.m38505b());
                if (NotificationManagerUtilsKt.getNotificationManagerCompat(context).m38781k(c0895t0.m38506a()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                Pair m7577a = C11591x.m7577a(valueOf, String.valueOf(z));
                linkedHashMap.put(m7577a.m14349c(), m7577a.m14348d());
            }
            CrashReporting.addBreadcrumb$default(crashReporting, "Failed to create notification group or channel", linkedHashMap, null, 4, null);
            CrashReporting.INSTANCE.captureException(e);
        }
    }

    public final void setIncomingRingtone(Context context, String name) {
        List<NotificationChannelCompat> m14109d;
        boolean m13758H;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(name, "name");
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        ArrayList<NotificationChannelCompat> arrayList = new ArrayList();
        CallRingtone fromName = CallRingtone.Companion.fromName(name);
        for (NotificationChannelCompat channel : NotificationManagerUtilsKt.getNotificationManagerCompat(context).m38778n()) {
            String m39119b = channel.m39119b();
            C9612q.m13918g(m39119b, "channel.id");
            m13758H = C9653o.m13758H(m39119b, BASE_CALL_CHANNEL_ID, false, 2, null);
            if (m13758H) {
                C9612q.m13918g(channel, "channel");
                arrayList.add(channel);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        NotificationChannelCompat notificationChannelCompat = (NotificationChannelCompat) arrayList.get(0);
        NotificationChannelCompat.Builder builder = new NotificationChannelCompat.Builder(getChannelId(fromName), notificationChannelCompat.m39118c()).m39108f(String.valueOf(notificationChannelCompat.m39117d())).m39112b(String.valueOf(notificationChannelCompat.m39117d())).m39111c(Category.Calls.getGroup().getGroupId()).m39105i(notificationChannelCompat.m39114g()).m39109e(notificationChannelCompat.m39115f()).m39110d(ColorUtilsKt.getColorCompat(context, C3351R.color.brand));
        NotificationChannels notificationChannels = INSTANCE;
        C9612q.m13918g(builder, "builder");
        notificationChannels.configureCallChannel(context, notificationChannelCompat, builder, Integer.valueOf(fromName.getResource()));
        NotificationChannelCompat m39113a = builder.m39113a();
        C9612q.m13918g(m39113a, "Builder(ringtone.getChan…e) }\n            .build()");
        for (NotificationChannelCompat notificationChannelCompat2 : arrayList) {
            NotificationManagerUtilsKt.getNotificationManagerCompat(context).m38786f(notificationChannelCompat2.m39119b());
        }
        NotificationManagerCompat notificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(context);
        m14109d = C9544i.m14109d(m39113a);
        notificationManagerCompat.m38787e(m14109d);
    }
}
