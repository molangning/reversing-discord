package com.discord.device;

import android.content.Context;
import android.os.Build;
import com.discord.codegen.NativeDeviceManagerSpec;
import com.discord.device.utils.IsGestureNavigationEnabledKt;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00010\t0\t0\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/device/DeviceManagerModule;", "Lcom/discord/codegen/NativeDeviceManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getTypedExportedConstants", "", "", "kotlin.jvm.PlatformType", "Companion", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DeviceManagerModule extends NativeDeviceManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNDeviceManager";
    private final ReactApplicationContext reactContext;

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0002J\f\u0010\u0011\u001a\u00020\u0004*\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/device/DeviceManagerModule$Companion;", "", "()V", "NAME", "", "smallestScreenWidthDp", "", "Landroid/content/Context;", "getSmallestScreenWidthDp", "(Landroid/content/Context;)I", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getSocFromProcCpuInfo", "isTablet", "", "socName", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getSmallestScreenWidthDp(Context context) {
            return context.getResources().getConfiguration().smallestScreenWidthDp;
        }

        private final boolean isTablet(Context context, int i) {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= i;
        }

        static /* synthetic */ boolean isTablet$default(Companion companion, Context context, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 600;
            }
            return companion.isTablet(context, i);
        }

        public final String socName(Context context) {
            String str;
            boolean z;
            String str2;
            String str3;
            String str4;
            if (Build.VERSION.SDK_INT >= 31) {
                str = Build.SOC_MANUFACTURER;
                boolean z2 = false;
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    str4 = Build.SOC_MODEL;
                    if (str4 == null || str4.length() == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        return getSocFromProcCpuInfo();
                    }
                }
                str2 = Build.SOC_MANUFACTURER;
                str3 = Build.SOC_MODEL;
                return str2 + "_" + str3;
            }
            return getSocFromProcCpuInfo();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return new DeviceManagerModule(reactContext);
        }

        public final String getSocFromProcCpuInfo() {
            String str;
            boolean m13758H;
            List m13682z0;
            CharSequence m13712V0;
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            while (true) {
                if (!scanner.hasNextLine()) {
                    str = "";
                    break;
                }
                String line = scanner.nextLine();
                C9612q.m13918g(line, "line");
                m13758H = C9653o.m13758H(line, "Hardware", false, 2, null);
                if (m13758H) {
                    m13682z0 = C9654p.m13682z0(line, new String[]{":"}, false, 0, 6, null);
                    m13712V0 = C9654p.m13712V0((String) m13682z0.get(1));
                    str = m13712V0.toString();
                    break;
                }
            }
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.discord.codegen.NativeDeviceManagerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNDeviceManager";
    }

    @Override // com.discord.codegen.NativeDeviceManagerSpec
    protected Map<String, ? extends Object> getTypedExportedConstants() {
        Map<String, ? extends Object> m6750l;
        Companion companion = Companion;
        m6750l = C11889v.m6750l(C11591x.m7577a("systemVersion", String.valueOf(Build.VERSION.SDK_INT)), C11591x.m7577a("device", Build.DEVICE), C11591x.m7577a("deviceModel", Build.MODEL), C11591x.m7577a("deviceBrand", Build.BRAND), C11591x.m7577a("deviceProduct", Build.PRODUCT), C11591x.m7577a("deviceManufacturer", Build.MANUFACTURER), C11591x.m7577a("isTablet", Boolean.valueOf(Companion.isTablet$default(companion, this.reactContext, 0, 1, null))), C11591x.m7577a("isGestureNavigationEnabled", Boolean.valueOf(IsGestureNavigationEnabledKt.isGestureNavigationEnabled(this.reactContext))), C11591x.m7577a("smallestScreenWidth", Integer.valueOf(this.reactContext.getResources().getConfiguration().smallestScreenWidthDp)), C11591x.m7577a("socName", companion.socName(this.reactContext)));
        return m6750l;
    }
}