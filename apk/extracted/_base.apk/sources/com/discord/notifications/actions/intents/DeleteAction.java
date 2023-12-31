package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.notifications.actions.intents.NotificationAction;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/notifications/actions/intents/DeleteAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "(Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class DeleteAction implements NotificationAction {
    public static final Parcelable.Creator<DeleteAction> CREATOR = new Creator();
    private final String tag;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Creator implements Parcelable.Creator<DeleteAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteAction createFromParcel(Parcel parcel) {
            C9612q.m13917h(parcel, "parcel");
            return new DeleteAction(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteAction[] newArray(int i) {
            return new DeleteAction[i];
        }
    }

    public DeleteAction(String tag) {
        C9612q.m13917h(tag, "tag");
        this.tag = tag;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public int getPendingIntentRequestCode() {
        return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public String getTag() {
        return this.tag;
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationAction(Context context, Intent intent) {
        NotificationAction.DefaultImpls.onNotificationAction(this, context, intent);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public void onNotificationActionComplete(Context context) {
        NotificationAction.DefaultImpls.onNotificationActionComplete(this, context);
    }

    @Override // com.discord.notifications.actions.intents.NotificationAction
    public PendingIntent toPendingIntent(Context context, int i, boolean z) {
        return NotificationAction.DefaultImpls.toPendingIntent(this, context, i, z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        C9612q.m13917h(out, "out");
        out.writeString(this.tag);
    }
}
