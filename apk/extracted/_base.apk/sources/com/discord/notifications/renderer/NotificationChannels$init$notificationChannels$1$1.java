package com.discord.notifications.renderer;

import android.content.Context;
import androidx.core.app.NotificationChannelCompat;
import com.discord.notifications.renderer.NotificationChannels;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "", "legacyChannel", "Landroidx/core/app/NotificationChannelCompat;", "builder", "Landroidx/core/app/NotificationChannelCompat$Builder;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationChannels$init$notificationChannels$1$1 extends AbstractC9614s implements Function2<NotificationChannelCompat, NotificationChannelCompat.Builder, Unit> {
    final /* synthetic */ NotificationChannels.Category $category;
    final /* synthetic */ Context $context;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationChannels.Category.values().length];
            try {
                iArr[NotificationChannels.Category.Calls.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationChannels.Category.MediaConnections.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationChannels$init$notificationChannels$1$1(NotificationChannels.Category category, Context context) {
        super(2);
        this.$category = category;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        invoke2(notificationChannelCompat, builder);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationChannelCompat notificationChannelCompat, NotificationChannelCompat.Builder builder) {
        C9612q.m13917h(builder, "builder");
        int i = WhenMappings.$EnumSwitchMapping$0[this.$category.ordinal()];
        if (i == 1) {
            NotificationChannels.configureCallChannel$default(NotificationChannels.INSTANCE, this.$context, notificationChannelCompat, builder, null, 8, null);
        } else if (i != 2) {
        } else {
            NotificationChannels.INSTANCE.configureMediaChannel(notificationChannelCompat, builder);
        }
    }
}
