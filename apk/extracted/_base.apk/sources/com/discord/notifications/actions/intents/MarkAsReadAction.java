package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u0005HÂ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u0007HÂ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ4\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m14357d2 = {"Lcom/discord/notifications/actions/intents/MarkAsReadAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "component1", "component2", "component2-o4g7jtM", "()J", "component3", "component3-3Eiw7ao", "copy", "copy-SHRpUJI", "(Ljava/lang/String;JLjava/lang/String;)Lcom/discord/notifications/actions/intents/MarkAsReadAction;", "describeContents", "", "equals", "", "other", "", "hashCode", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MarkAsReadAction implements NotificationAction {
    public static final Parcelable.Creator<MarkAsReadAction> CREATOR = new Creator();
    private final long channelId;
    private final String messageId;
    private final String tag;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Creator implements Parcelable.Creator<MarkAsReadAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarkAsReadAction createFromParcel(Parcel parcel) {
            C9612q.m13917h(parcel, "parcel");
            return new MarkAsReadAction(parcel.readString(), ((ChannelId) parcel.readParcelable(MarkAsReadAction.class.getClassLoader())).m42056unboximpl(), ((MessageId) parcel.readParcelable(MarkAsReadAction.class.getClassLoader())).m42081unboximpl(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarkAsReadAction[] newArray(int i) {
            return new MarkAsReadAction[i];
        }
    }

    private MarkAsReadAction(String str, long j, String str2) {
        this.tag = str;
        this.channelId = j;
        this.messageId = str2;
    }

    public /* synthetic */ MarkAsReadAction(String str, long j, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2);
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    private final long m41973component2o4g7jtM() {
        return this.channelId;
    }

    /* renamed from: component3-3Eiw7ao  reason: not valid java name */
    private final String m41974component33Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: copy-SHRpUJI$default  reason: not valid java name */
    public static /* synthetic */ MarkAsReadAction m41975copySHRpUJI$default(MarkAsReadAction markAsReadAction, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = markAsReadAction.getTag();
        }
        if ((i & 2) != 0) {
            j = markAsReadAction.channelId;
        }
        if ((i & 4) != 0) {
            str2 = markAsReadAction.messageId;
        }
        return markAsReadAction.m41976copySHRpUJI(str, j, str2);
    }

    public final String component1() {
        return getTag();
    }

    /* renamed from: copy-SHRpUJI  reason: not valid java name */
    public final MarkAsReadAction m41976copySHRpUJI(String tag, long j, String messageId) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(messageId, "messageId");
        return new MarkAsReadAction(tag, j, messageId, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MarkAsReadAction) {
            MarkAsReadAction markAsReadAction = (MarkAsReadAction) obj;
            return C9612q.m13922c(getTag(), markAsReadAction.getTag()) && ChannelId.m42051equalsimpl0(this.channelId, markAsReadAction.channelId) && MessageId.m42077equalsimpl0(this.messageId, markAsReadAction.messageId);
        }
        return false;
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public int getPendingIntentRequestCode() {
        return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (((getTag().hashCode() * 31) + ChannelId.m42052hashCodeimpl(this.channelId)) * 31) + MessageId.m42078hashCodeimpl(this.messageId);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationAction(Context context, Intent intent) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(intent, "intent");
        HeadlessTasks.Companion companion = HeadlessTasks.Companion;
        Bundle bundle = new Bundle();
        bundle.putString("channelId", ChannelId.m42054toStringimpl(this.channelId));
        bundle.putString("messageId", MessageId.m42079toStringimpl(this.messageId));
        companion.startHeadlessTask(context, "MarkAsRead", (r18 & 4) != 0 ? 5000L : 0L, (r18 & 8) != 0, (r18 & 16) != 0 ? new Bundle() : bundle, (r18 & 32) != 0 ? false : true);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationActionComplete(Context context) {
        NotificationAction.DefaultImpls.onNotificationActionComplete(this, context);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public PendingIntent toPendingIntent(Context context, int i, boolean z) {
        return NotificationAction.DefaultImpls.toPendingIntent(this, context, i, z);
    }

    public String toString() {
        String tag = getTag();
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        return "MarkAsReadAction(tag=" + tag + ", channelId=" + m42054toStringimpl + ", messageId=" + m42079toStringimpl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        C9612q.m13917h(out, "out");
        out.writeString(this.tag);
        out.writeParcelable(ChannelId.m42047boximpl(this.channelId), i);
        out.writeParcelable(MessageId.m42073boximpl(this.messageId), i);
    }
}
