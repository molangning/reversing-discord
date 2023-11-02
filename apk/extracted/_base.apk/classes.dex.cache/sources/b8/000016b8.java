package com.discord.device.utils;

import android.content.Context;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\tJ\n\u0010\n\u001a\u00020\u000b*\u00020\fJ\f\u0010\r\u001a\u00020\u000b*\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/device/utils/DeviceReducedMotion;", "", "()V", "motionPreference", "Lcom/discord/device/utils/DeviceReducedMotion$MotionPreference;", "createMotionPreference", "", "setMotionPreference", "", "setMotionPreference$device_release", "isReducedMotionEnabled", "", "Landroid/content/Context;", "isSystemReducedMotionEnabled", "MotionPreference", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DeviceReducedMotion {
    public static final DeviceReducedMotion INSTANCE = new DeviceReducedMotion();
    private static MotionPreference motionPreference = MotionPreference.AUTO;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/device/utils/DeviceReducedMotion$MotionPreference;", "", "(Ljava/lang/String;I)V", "REDUCE", "NO_PREFERENCE", "AUTO", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum MotionPreference {
        REDUCE,
        NO_PREFERENCE,
        AUTO
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MotionPreference.values().length];
            try {
                iArr[MotionPreference.REDUCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MotionPreference.NO_PREFERENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MotionPreference.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DeviceReducedMotion() {
    }

    private final MotionPreference createMotionPreference(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1484543897) {
            if (hashCode != -934873754) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    return MotionPreference.AUTO;
                }
            } else if (str.equals("reduce")) {
                return MotionPreference.REDUCE;
            }
        } else if (str.equals("no-preference")) {
            return MotionPreference.NO_PREFERENCE;
        }
        throw new IllegalArgumentException("Unknown motion preference: " + str);
    }

    private final boolean isSystemReducedMotionEnabled(Context context) {
        try {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale") == 0.0f;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    public final boolean isReducedMotionEnabled(Context context) {
        C9612q.m13917h(context, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[motionPreference.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                return isSystemReducedMotionEnabled(context);
            }
            throw new C11581q();
        }
        return false;
    }

    public final void setMotionPreference$device_release(String motionPreference2) {
        C9612q.m13917h(motionPreference2, "motionPreference");
        motionPreference = createMotionPreference(motionPreference2);
    }
}