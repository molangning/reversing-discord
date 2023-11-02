package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NativeIntentAndroidSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class IntentModule extends NativeIntentAndroidSpec {
    private static final String EXTRA_MAP_KEY_FOR_VALUE = "value";
    private LifecycleEventListener mInitialURLListener;

    /* renamed from: com.facebook.react.modules.intent.IntentModule$2 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C41412 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mInitialURLListener = null;
    }

    private void sendOSIntent(Intent intent, Boolean bool) {
        String str;
        Activity currentActivity = getCurrentActivity();
        String packageName = getReactApplicationContext().getPackageName();
        ComponentName resolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
        if (resolveActivity != null) {
            str = resolveActivity.getPackageName();
        } else {
            str = "";
        }
        if (bool.booleanValue() || currentActivity == null || !packageName.equals(str)) {
            intent.addFlags(268435456);
        }
        if (currentActivity != null) {
            currentActivity.startActivity(intent);
        } else {
            getReactApplicationContext().startActivity(intent);
        }
    }

    private void waitForActivityAndGetInitialURL(final Promise promise) {
        if (this.mInitialURLListener != null) {
            promise.reject(new IllegalStateException("Cannot await activity from more than one call to getInitialURL"));
            return;
        }
        this.mInitialURLListener = new LifecycleEventListener() { // from class: com.facebook.react.modules.intent.IntentModule.1
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                IntentModule.this.getInitialURL(promise);
                IntentModule.this.getReactApplicationContext().removeLifecycleEventListener(this);
                IntentModule.this.mInitialURLListener = null;
            }
        };
        getReactApplicationContext().addLifecycleEventListener(this.mInitialURLListener);
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void canOpenURL(String str, Promise promise) {
        boolean z;
        if (str != null && !str.isEmpty()) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                promise.resolve(Boolean.valueOf(z));
                return;
            } catch (Exception e) {
                promise.reject(new JSApplicationIllegalArgumentException("Could not check if URL '" + str + "' can be opened: " + e.getMessage()));
                return;
            }
        }
        promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void getInitialURL(Promise promise) {
        String str;
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                waitForActivityAndGetInitialURL(promise);
                return;
            }
            Intent intent = currentActivity.getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data != null && ("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) {
                str = data.toString();
            } else {
                str = null;
            }
            promise.resolve(str);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not get the initial URL : " + e.getMessage()));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        if (this.mInitialURLListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mInitialURLListener);
            this.mInitialURLListener = null;
        }
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openSettings(Promise promise) {
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + packageName));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            currentActivity.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open the Settings: " + e.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openURL(String str, Promise promise) {
        if (str != null && !str.isEmpty()) {
            try {
                sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme()), Boolean.FALSE);
                promise.resolve(Boolean.TRUE);
                return;
            } catch (Exception e) {
                promise.reject(new JSApplicationIllegalArgumentException("Could not open URL '" + str + "': " + e.getMessage()));
                return;
            }
        }
        promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void sendIntent(String str, ReadableArray readableArray, Promise promise) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent(str);
            if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) == null) {
                promise.reject(new JSApplicationIllegalArgumentException("Could not launch Intent with action " + str + "."));
                return;
            }
            if (readableArray != null) {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    String string = map.getString("key");
                    int i2 = C41412.$SwitchMap$com$facebook$react$bridge$ReadableType[map.getType(EXTRA_MAP_KEY_FOR_VALUE).ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                promise.reject(new JSApplicationIllegalArgumentException("Extra type for " + string + " not supported."));
                                return;
                            }
                            intent.putExtra(string, map.getBoolean(EXTRA_MAP_KEY_FOR_VALUE));
                        } else {
                            intent.putExtra(string, Double.valueOf(map.getDouble(EXTRA_MAP_KEY_FOR_VALUE)));
                        }
                    } else {
                        intent.putExtra(string, map.getString(EXTRA_MAP_KEY_FOR_VALUE));
                    }
                }
            }
            sendOSIntent(intent, Boolean.TRUE);
            return;
        }
        promise.reject(new JSApplicationIllegalArgumentException("Invalid Action: " + str + "."));
    }
}
