package com.discord.device.utils;

import android.os.Build;
import java.util.HashMap;
import kotlin.Metadata;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/device/utils/DefaultDevicePerformance;", "Lcom/discord/device/utils/DevicePerformance;", "()V", "PERFCLASS_11", "", "PERFCLASS_12", "PERFCLASS_13", "PERFCLASS_NONE", "fingerprints", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "mediaPerformanceClass", "getMediaPerformanceClass", "()I", "getCalculatedMediaPerformanceClass", "getMediaPerformanceClassFromFingerprint", "getMediaPerformanceClassFromProperty", "isPerformanceClassValid", "", "pc", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DefaultDevicePerformance implements DevicePerformance {
    private final int PERFCLASS_11 = 30;
    private final int PERFCLASS_12 = 31;
    private final int PERFCLASS_13 = 33;
    private final int PERFCLASS_NONE;
    private final HashMap<String, Integer> fingerprints;
    private final int mediaPerformanceClass;

    public DefaultDevicePerformance() {
        HashMap<String, Integer> m6752j;
        m6752j = C11889v.m6752j(C11591x.m7577a("robolectric-BrandX/ProductX/Device30:11", 30), C11591x.m7577a("robolectric-BrandX/ProductX/Device31:12", 31), C11591x.m7577a("OPPO/CPH2025EEA/OP4BA2L1:12", 30), C11591x.m7577a("OPPO/CPH2207EEA/OP4F0BL1:12", 30), C11591x.m7577a("OPPO/PENM00/OP4EC1:11", 30), C11591x.m7577a("OnePlus/OnePlus7TTMO/OnePlus7TTMO:11", 30), C11591x.m7577a("OnePlus/OnePlus8_BETA/OnePlus8:11", 30), C11591x.m7577a("Xiaomi/umi_global/umi:11", 30), C11591x.m7577a("realme/RMX2085/RMX2085L1:11", 30), C11591x.m7577a("samsung/c1qsqw/c1q:12", 30), C11591x.m7577a("samsung/o1quew/o1q:12", 30), C11591x.m7577a("samsung/r0quew/r0q:12", 30), C11591x.m7577a("samsung/r0sxxx/r0s:12", 30));
        this.fingerprints = m6752j;
        this.mediaPerformanceClass = getCalculatedMediaPerformanceClass();
    }

    private final int getCalculatedMediaPerformanceClass() {
        int mediaPerformanceClassFromProperty = getMediaPerformanceClassFromProperty();
        if (isPerformanceClassValid(mediaPerformanceClassFromProperty)) {
            return mediaPerformanceClassFromProperty;
        }
        int mediaPerformanceClassFromFingerprint = getMediaPerformanceClassFromFingerprint();
        if (isPerformanceClassValid(mediaPerformanceClassFromFingerprint)) {
            return mediaPerformanceClassFromFingerprint;
        }
        return this.PERFCLASS_NONE;
    }

    private final int getMediaPerformanceClassFromFingerprint() {
        String str = Build.BRAND;
        String str2 = Build.PRODUCT;
        String str3 = Build.DEVICE;
        String str4 = Build.VERSION.RELEASE;
        Integer num = this.fingerprints.get(str + "/" + str2 + "/" + str3 + ":" + str4);
        if (num == null) {
            num = Integer.valueOf(this.PERFCLASS_NONE);
        }
        return num.intValue();
    }

    private final int getMediaPerformanceClassFromProperty() {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = Build.VERSION.MEDIA_PERFORMANCE_CLASS;
            return i;
        }
        return this.PERFCLASS_NONE;
    }

    private final boolean isPerformanceClassValid(int i) {
        return i >= this.PERFCLASS_11;
    }

    @Override // com.discord.device.utils.DevicePerformance
    public int getMediaPerformanceClass() {
        return this.mediaPerformanceClass;
    }
}
