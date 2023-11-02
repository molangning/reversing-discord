package com.discord.notifications.renderer;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import com.discord.image.fresco.FrescoFetchDecodedImageKt;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt;
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.shortcuts.ShortcutUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C9702f;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.InterfaceC9851s0;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.notifications.renderer.NotificationRenderer$display$1", m13986f = "NotificationRenderer.kt", m13985l = {138}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationRenderer$display$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NotificationBehaviors $behaviors;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $currentUsername;
    final /* synthetic */ boolean $makeOrUpdateShortcut;
    final /* synthetic */ NotificationData $notification;
    final /* synthetic */ Map<String, String> $notificationDataMap;
    final /* synthetic */ boolean $notifyEveryTime;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.notifications.renderer.NotificationRenderer$display$1$1", m13986f = "NotificationRenderer.kt", m13985l = {139}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.notifications.renderer.NotificationRenderer$display$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C33491 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref$ObjectRef<String> $iconUrl;
        final /* synthetic */ Ref$ObjectRef<PostProcessor> $postProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33491(Ref$ObjectRef<String> ref$ObjectRef, Context context, Ref$ObjectRef<PostProcessor> ref$ObjectRef2, Continuation<? super C33491> continuation) {
            super(2, continuation);
            this.$iconUrl = ref$ObjectRef;
            this.$context = context;
            this.$postProcessor = ref$ObjectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33491(this.$iconUrl, this.$context, this.$postProcessor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C33491) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                this.label = 1;
                obj = NotificationRenderer$display$1.invokeSuspend$fetchImage(this.$context, this.$postProcessor, this.$iconUrl.f25329j, this);
                if (obj == m2869d) {
                    return m2869d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.notifications.renderer.NotificationRenderer$display$1$2", m13986f = "NotificationRenderer.kt", m13985l = {140}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.notifications.renderer.NotificationRenderer$display$1$2 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C33502 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ NotificationData $notification;
        final /* synthetic */ Ref$ObjectRef<PostProcessor> $postProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33502(NotificationData notificationData, Context context, Ref$ObjectRef<PostProcessor> ref$ObjectRef, Continuation<? super C33502> continuation) {
            super(2, continuation);
            this.$notification = notificationData;
            this.$context = context;
            this.$postProcessor = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33502(this.$notification, this.$context, this.$postProcessor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C33502) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                Context context = this.$context;
                Ref$ObjectRef<PostProcessor> ref$ObjectRef = this.$postProcessor;
                String iconUrlForAvatar = NotificationDataUtilsKt.getIconUrlForAvatar(this.$notification, context);
                this.label = 1;
                obj = NotificationRenderer$display$1.invokeSuspend$fetchImage(context, ref$ObjectRef, iconUrlForAvatar, this);
                if (obj == m2869d) {
                    return m2869d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRenderer$display$1(NotificationData notificationData, Context context, boolean z, Map<String, String> map, NotificationBehaviors notificationBehaviors, String str, boolean z2, Continuation<? super NotificationRenderer$display$1> continuation) {
        super(2, continuation);
        this.$notification = notificationData;
        this.$context = context;
        this.$notifyEveryTime = z;
        this.$notificationDataMap = map;
        this.$behaviors = notificationBehaviors;
        this.$currentUsername = str;
        this.$makeOrUpdateShortcut = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$fetchImage(Context context, Ref$ObjectRef<PostProcessor> ref$ObjectRef, String str, Continuation<? super Bitmap> continuation) {
        return FrescoFetchDecodedImageKt.fetchDecodedImage(context, str, ref$ObjectRef.f25329j, true, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationRenderer$display$1 notificationRenderer$display$1 = new NotificationRenderer$display$1(this.$notification, this.$context, this.$notifyEveryTime, this.$notificationDataMap, this.$behaviors, this.$currentUsername, this.$makeOrUpdateShortcut, continuation);
        notificationRenderer$display$1.L$0 = obj;
        return notificationRenderer$display$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationRenderer$display$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.discord.image.fresco.postprocessors.PostProcessor$Circle, T] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        InterfaceC9851s0 m13181b;
        InterfaceC9851s0 m13181b2;
        Object m13478a;
        List<NotificationCompat.Action> m14101l;
        NotificationCompat.MessagingStyle messagingStyle;
        List<NotificationCompat.MessagingStyle.C0712e> m38951B;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C11586t.m7586b(obj);
                m13478a = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f25329j = PostProcessor.Circle.INSTANCE;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f25329j = NotificationDataUtilsKt.getIconUrl(this.$notification, this.$context);
            if (this.$notification.getImageAttachmentUrl() != null) {
                String imageAttachmentUrl = this.$notification.getImageAttachmentUrl();
                T t = imageAttachmentUrl;
                if (imageAttachmentUrl == null) {
                    t = "";
                }
                ref$ObjectRef2.f25329j = t;
                ref$ObjectRef.f25329j = null;
            }
            m13181b = C9818l.m13181b(coroutineScope, null, null, new C33491(ref$ObjectRef2, this.$context, ref$ObjectRef, null), 3, null);
            m13181b2 = C9818l.m13181b(coroutineScope, null, null, new C33502(this.$notification, this.$context, ref$ObjectRef, null), 3, null);
            this.label = 1;
            m13478a = C9702f.m13478a(new InterfaceC9851s0[]{m13181b, m13181b2}, this);
            if (m13478a == m2869d) {
                return m2869d;
            }
        }
        List list = (List) m13478a;
        Bitmap bitmap = (Bitmap) list.get(0);
        Bitmap bitmap2 = (Bitmap) list.get(1);
        CharSequence content = NotificationDataUtilsKt.getContent(this.$notification, this.$context, false);
        int activeNotificationMessageCount = NotificationManagerUtilsKt.getActiveNotificationMessageCount(this.$context, NotificationDataUtilsKt.getTag(this.$notification)) + 1;
        Context context = this.$context;
        NotificationCompat.Builder m39020C = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(context, NotificationChannels.INSTANCE.getNotificationChannelId(this.$notification, context), NotificationManagerUtilsKt.getActiveNotification(this.$context, NotificationDataUtilsKt.getTag(this.$notification))).m38965t(true).m39005R(!this.$notifyEveryTime).m38997Z(NotificationDataUtilsKt.getSmallIcon(this.$notification)).m38959z(ColorUtilsKt.getColorCompat(this.$context, C3351R.color.brand_500)).m38962w(NotificationDataUtilsKt.getNotificationCategory(this.$notification)).m39018E(NotificationDataUtilsKt.getTitle(this.$notification, this.$context)).m39019D(content).m39013J(NotificationDataUtilsKt.getGroupKey(this.$notification)).m39007P(activeNotificationMessageCount).m39011L(bitmap).m39016G(NotificationDataUtilsKt.getDeletePendingIntent(this.$notification, this.$context)).m39020C(NotificationDataUtilsKt.getContentPendingIntent(this.$notification, this.$context, this.$notificationDataMap));
        C9612q.m13918g(m39020C, "context.getNotificationB…xt, notificationDataMap))");
        Context context2 = this.$context;
        NotificationCompat.Builder builder = NotificationManagerUtilsKt.setLegacyNotificationBehaviors(m39020C, context2, this.$behaviors, NotificationDataUtilsKt.getSound(this.$notification, context2)).m38982h();
        NotificationData notificationData = this.$notification;
        CharSequence charSequence = this.$currentUsername;
        Context context3 = this.$context;
        boolean z = this.$makeOrUpdateShortcut;
        Map<String, String> map = this.$notificationDataMap;
        if (NotificationDataUtilsKt.isConversation(notificationData)) {
            Person.C0756c c0756c = new Person.C0756c();
            if (charSequence == null) {
                charSequence = I18nUtilsKt.i18nFormat$default(context3, I18nMessage.ME, null, 2, null);
            }
            NotificationCompat.MessagingStyle m38945H = new NotificationCompat.MessagingStyle(c0756c.m38727f(charSequence).m38728e("me").m38732a()).m38946G(NotificationDataUtilsKt.getConversationTitle(notificationData)).m38945H(NotificationDataUtilsKt.isGroupConversation(notificationData));
            Notification activeNotification = NotificationManagerUtilsKt.getActiveNotification(context3, NotificationDataUtilsKt.getTag(notificationData));
            if (activeNotification != null && (messagingStyle = NotificationManagerUtilsKt.getMessagingStyle(activeNotification)) != null && (m38951B = messagingStyle.m38951B()) != null) {
                for (NotificationCompat.MessagingStyle.C0712e c0712e : m38951B) {
                    m38945H.m38944x(c0712e);
                }
            }
            m38945H.m38943y(content, NotificationDataUtilsKt.getSendTime(notificationData), NotificationDataUtilsKt.getSenderForMessageNotification(notificationData, bitmap2));
            builder.m38987e0(m38945H);
            if (z) {
                C9612q.m13918g(builder, "builder");
                ShortcutUtilsKt.addShortcut(builder, context3, NotificationDataUtilsKt.getShortcutInfo(notificationData, context3, map, bitmap, bitmap2));
            }
        } else if (NotificationDataUtilsKt.shouldUseBigText(notificationData)) {
            builder.m38987e0(new NotificationCompat.C0723f().m38883x(content));
        }
        m14101l = C9545j.m14101l(NotificationDataUtilsKt.getMarkAsReadAction(notificationData, context3), NotificationDataUtilsKt.getDirectReplyAction(notificationData, context3), NotificationDataUtilsKt.getCallAction(notificationData, context3, false, map), NotificationDataUtilsKt.getCallAction(notificationData, context3, true, map), NotificationDataUtilsKt.getTimedMuteAction(notificationData, context3, activeNotificationMessageCount));
        ArrayList arrayList = new ArrayList();
        for (NotificationCompat.Action action : m14101l) {
            NotificationCompat.Builder m38994b = builder.m38994b(action);
            if (m38994b != null) {
                arrayList.add(m38994b);
            }
        }
        C9612q.m13918g(builder, "context.getNotificationB…n(action) }\n            }");
        NotificationManagerUtilsKt.notify(NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(this.$notification), builder);
        return Unit.f25302a;
    }
}
