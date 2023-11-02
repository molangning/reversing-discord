package com.discord.notifications.renderer;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/notifications/renderer/NotificationBehaviors;", "", "soundsEnabled", "", "vibrationsEnabled", "lightsEnabled", "(ZZZ)V", "getLightsEnabled", "()Z", "getSoundsEnabled", "getVibrationsEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "notification_renderer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationBehaviors {
    private final boolean lightsEnabled;
    private final boolean soundsEnabled;
    private final boolean vibrationsEnabled;

    public NotificationBehaviors(boolean z, boolean z2, boolean z3) {
        this.soundsEnabled = z;
        this.vibrationsEnabled = z2;
        this.lightsEnabled = z3;
    }

    public static /* synthetic */ NotificationBehaviors copy$default(NotificationBehaviors notificationBehaviors, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = notificationBehaviors.soundsEnabled;
        }
        if ((i & 2) != 0) {
            z2 = notificationBehaviors.vibrationsEnabled;
        }
        if ((i & 4) != 0) {
            z3 = notificationBehaviors.lightsEnabled;
        }
        return notificationBehaviors.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.soundsEnabled;
    }

    public final boolean component2() {
        return this.vibrationsEnabled;
    }

    public final boolean component3() {
        return this.lightsEnabled;
    }

    public final NotificationBehaviors copy(boolean z, boolean z2, boolean z3) {
        return new NotificationBehaviors(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationBehaviors) {
            NotificationBehaviors notificationBehaviors = (NotificationBehaviors) obj;
            return this.soundsEnabled == notificationBehaviors.soundsEnabled && this.vibrationsEnabled == notificationBehaviors.vibrationsEnabled && this.lightsEnabled == notificationBehaviors.lightsEnabled;
        }
        return false;
    }

    public final boolean getLightsEnabled() {
        return this.lightsEnabled;
    }

    public final boolean getSoundsEnabled() {
        return this.soundsEnabled;
    }

    public final boolean getVibrationsEnabled() {
        return this.vibrationsEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.soundsEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.vibrationsEnabled;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.lightsEnabled;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.soundsEnabled;
        boolean z2 = this.vibrationsEnabled;
        boolean z3 = this.lightsEnabled;
        return "NotificationBehaviors(soundsEnabled=" + z + ", vibrationsEnabled=" + z2 + ", lightsEnabled=" + z3 + ")";
    }
}
