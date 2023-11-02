package com.discord.device;

import android.os.Build;
import android.os.LocaleList;
import com.discord.codegen.NativeDeviceLocaleManagerSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import gg.C6759j;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0014¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/device/DeviceLocaleManagerModule;", "Lcom/discord/codegen/NativeDeviceLocaleManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getTypedExportedConstants", "", "", "Companion", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DeviceLocaleManagerModule extends NativeDeviceLocaleManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNDeviceLocaleManager";

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/device/DeviceLocaleManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return new DeviceLocaleManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLocaleManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeDeviceLocaleManagerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNDeviceLocaleManager";
    }

    @Override // com.discord.codegen.NativeDeviceLocaleManagerSpec
    protected Map<String, Object> getTypedExportedConstants() {
        Object m14056T;
        Map<String, Object> m6750l;
        LocaleList adjustedDefault;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            adjustedDefault = LocaleList.getAdjustedDefault();
            C9612q.m13918g(adjustedDefault, "getAdjustedDefault()");
            size = adjustedDefault.size();
            int i = 10;
            for (int i2 = 0; i2 < size; i2++) {
                locale = adjustedDefault.get(i2);
                String lang = locale.toLanguageTag();
                if (i2 == 0) {
                    C9612q.m13918g(lang, "lang");
                    arrayList.add(lang);
                } else {
                    arrayList.add(lang + ";q=0." + i);
                }
                i = C6759j.m21930c(1, i - 1);
            }
        } else {
            String languageTag = Locale.getDefault().toLanguageTag();
            C9612q.m13918g(languageTag, "getDefault().toLanguageTag()");
            arrayList.add(languageTag);
        }
        C9553r.m14046d0(arrayList, ",", null, null, 0, null, null, 62, null);
        m14056T = C9553r.m14056T(arrayList);
        m6750l = C11889v.m6750l(C11591x.m7577a("Language", m14056T), C11591x.m7577a("Languages", arrayList));
        return m6750l;
    }
}
