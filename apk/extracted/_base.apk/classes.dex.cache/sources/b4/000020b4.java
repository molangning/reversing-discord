package com.discord.theme;

import android.app.Activity;
import com.discord.codegen.NativeThemeManagerSpec;
import com.discord.theme.utils.ActivityThemeUtils;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/theme/ThemeModule;", "Lcom/discord/codegen/NativeThemeManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "updateTheme", "", "theme", "Companion", "theme_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ThemeModule extends NativeThemeManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNThemeManager";

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/theme/ThemeModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "theme_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return new ThemeModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        ThemeManager.INSTANCE.init(reactContext);
    }

    public static final void updateTheme$lambda$0(ThemeModule this$0) {
        C9612q.m13917h(this$0, "this$0");
        Activity currentActivity = this$0.getCurrentActivity();
        if (currentActivity != null) {
            ActivityThemeUtils.INSTANCE.updateActivityTheming$theme_release(currentActivity);
        }
    }

    @Override // com.discord.codegen.NativeThemeManagerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNThemeManager";
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x001e, code lost:
        if (r4.equals("dark") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0027, code lost:
        if (r4.equals("darker") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0030, code lost:
        if (r4.equals("amoled") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0032, code lost:
        com.discord.theme.ThemeManager.INSTANCE.setDarkTheme();
     */
    @Override // com.discord.codegen.NativeThemeManagerSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateTheme(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L46
            int r0 = r4.hashCode()
            switch(r0) {
                case -1413862040: goto L2a;
                case -1338968413: goto L21;
                case 3075958: goto L18;
                case 102970646: goto La;
                default: goto L9;
            }
        L9:
            goto L46
        La:
            java.lang.String r0 = "light"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L46
            com.discord.theme.ThemeManager r4 = com.discord.theme.ThemeManager.INSTANCE
            r4.setLightTheme()
            goto L37
        L18:
            java.lang.String r0 = "dark"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L46
            goto L32
        L21:
            java.lang.String r0 = "darker"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L46
            goto L32
        L2a:
            java.lang.String r0 = "amoled"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L46
        L32:
            com.discord.theme.ThemeManager r4 = com.discord.theme.ThemeManager.INSTANCE
            r4.setDarkTheme()
        L37:
            android.app.Activity r4 = r3.getCurrentActivity()
            if (r4 == 0) goto L45
            n2.a r0 = new n2.a
            r0.<init>()
            r4.runOnUiThread(r0)
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid theme: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.theme.ThemeModule.updateTheme(java.lang.String):void");
    }
}