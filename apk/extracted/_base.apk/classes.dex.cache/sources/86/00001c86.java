package com.discord.permissions;

import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.PromiseWrapper;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = "NativePermissionManager")
@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001f"}, m14357d2 = {"Lcom/discord/permissions/NativePermissionManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "permissionsModule", "Lcom/facebook/react/modules/permissions/PermissionsModule;", "getPermissionsModule", "()Lcom/facebook/react/modules/permissions/PermissionsModule;", "getName", "", "getNotificationAuthorizationStatus", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "hasBluetoothAuthorization", "hasCameraAuthorization", "hasContactAuthorization", "hasExternalStorageAuthorization", "hasMicrophoneAuthorization", "hasModifyAudioAuthorization", "hasPhotoAuthorization", "requestBluetoothAuthorization", "requestCameraAuthorization", "requestContactsAuthorization", "requestExternalStorageAuthorization", "requestMicrophoneAuthorization", "requestModifyAudioAuthorization", "requestNotificationAuthorization", "requestPhotoAuthorization", "Companion", "permissions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class NativePermissionManagerModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/permissions/NativePermissionManagerModule$Companion;", "", "()V", "transformHasAuthorizationResult", "Lcom/discord/react/utilities/PromiseWrapper;", "Lcom/facebook/react/bridge/Promise;", "transformRequestResult", "permissions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PromiseWrapper transformHasAuthorizationResult(Promise promise) {
            return new PromiseWrapper(promise, new C3366x4956bbec(NativePermissionStatus.Companion), null, 4, null);
        }

        public final PromiseWrapper transformRequestResult(Promise promise) {
            return new PromiseWrapper(promise, new NativePermissionManagerModule$Companion$transformRequestResult$1(NativePermissionStatus.Companion), null, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativePermissionManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    private final PermissionsModule getPermissionsModule() {
        NativeModule nativeModule = getReactApplicationContext().getNativeModule(PermissionsModule.class);
        C9612q.m13920e(nativeModule);
        return (PermissionsModule) nativeModule;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NativePermissionManager";
    }

    @ReactMethod
    public final void getNotificationAuthorizationStatus(Promise promise) {
        C9612q.m13917h(promise, "promise");
        if (NotificationManagerCompat.m38785g(getReactApplicationContext()).m38791a()) {
            promise.resolve(2);
        } else {
            promise.resolve(1);
        }
    }

    @ReactMethod
    public final void hasBluetoothAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.BLUETOOTH", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasCameraAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.CAMERA", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasContactAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.READ_CONTACTS", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasExternalStorageAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasMicrophoneAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.RECORD_AUDIO", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasModifyAudioAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.MODIFY_AUDIO_SETTINGS", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasPhotoAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        if (Build.VERSION.SDK_INT >= 33) {
            getPermissionsModule().checkPermission("android.permission.READ_MEDIA_IMAGES", Companion.transformHasAuthorizationResult(promise));
        } else {
            getPermissionsModule().checkPermission("android.permission.READ_EXTERNAL_STORAGE", Companion.transformHasAuthorizationResult(promise));
        }
    }

    @ReactMethod
    public final void requestBluetoothAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.BLUETOOTH", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestCameraAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.CAMERA", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestContactsAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.READ_CONTACTS", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestExternalStorageAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.WRITE_EXTERNAL_STORAGE", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestMicrophoneAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.RECORD_AUDIO", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestModifyAudioAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.MODIFY_AUDIO_SETTINGS", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestNotificationAuthorization(Promise promise) {
        C9612q.m13917h(promise, "promise");
        if (Build.VERSION.SDK_INT >= 33) {
            getPermissionsModule().requestPermission("android.permission.POST_NOTIFICATIONS", Companion.transformRequestResult(promise));
            return;
        }
        String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
        C9612q.m13918g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        promise.resolve(lowerCase);
    }

    @ReactMethod
    public final void requestPhotoAuthorization(Promise promise) {
        List m14101l;
        C9612q.m13917h(promise, "promise");
        if (Build.VERSION.SDK_INT >= 33) {
            PermissionsModule permissionsModule = getPermissionsModule();
            m14101l = C9545j.m14101l("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO");
            permissionsModule.requestMultiplePermissions(NativeArrayExtensionsKt.toNativeArray(m14101l), Companion.transformRequestResult(promise));
            return;
        }
        getPermissionsModule().requestPermission("android.permission.READ_EXTERNAL_STORAGE", Companion.transformRequestResult(promise));
    }
}