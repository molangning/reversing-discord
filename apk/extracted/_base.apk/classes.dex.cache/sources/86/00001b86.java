package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.notifications.actions.intents.NotificationAction;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J+\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/notifications/actions/intents/ContentAction;", "Lcom/discord/notifications/actions/intents/NotificationAction;", "tag", "", "data", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "notification_actions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ContentAction implements NotificationAction {
    public static final Parcelable.Creator<ContentAction> CREATOR = new Creator();
    private final Map<String, String> data;
    private final String tag;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Creator implements Parcelable.Creator<ContentAction> {
        @Override // android.os.Parcelable.Creator
        public final ContentAction createFromParcel(Parcel parcel) {
            C9612q.m13917h(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new ContentAction(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ContentAction[] newArray(int i) {
            return new ContentAction[i];
        }
    }

    public ContentAction(String tag, Map<String, String> data) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(data, "data");
        this.tag = tag;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentAction copy$default(ContentAction contentAction, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentAction.getTag();
        }
        if ((i & 2) != 0) {
            map = contentAction.data;
        }
        return contentAction.copy(str, map);
    }

    public final String component1() {
        return getTag();
    }

    public final Map<String, String> component2() {
        return this.data;
    }

    public final ContentAction copy(String tag, Map<String, String> data) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(data, "data");
        return new ContentAction(tag, data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContentAction) {
            ContentAction contentAction = (ContentAction) obj;
            return C9612q.m13922c(getTag(), contentAction.getTag()) && C9612q.m13922c(this.data, contentAction.data);
        }
        return false;
    }

    public final Map<String, String> getData() {
        return this.data;
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
        return (getTag().hashCode() * 31) + this.data.hashCode();
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

    public String toString() {
        String tag = getTag();
        Map<String, String> map = this.data;
        return "ContentAction(tag=" + tag + ", data=" + map + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        C9612q.m13917h(out, "out");
        out.writeString(this.tag);
        Map<String, String> map = this.data;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }
}