package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;

@ReactModule(name = ImagePickerModule.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ImagePickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    static final String NAME = "ImagePickerManager";
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 13001;
    public static final int REQUEST_LAUNCH_LIBRARY = 13003;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 13002;
    Callback callback;
    Uri cameraCaptureURI;
    private Uri fileUri;
    UUID identifier;
    C5258e options;
    final ReactApplicationContext reactContext;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void launchCamera(ReadableMap readableMap, Callback callback) {
        Intent intent;
        File m25637c;
        int i;
        if (!C5259f.m25617w(this.reactContext)) {
            callback.invoke(C5259f.m25630j(C5259f.f14909b, null));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(C5259f.m25630j(C5259f.f14911d, "Activity error"));
        } else if (!C5259f.m25616x(this.reactContext, currentActivity)) {
            callback.invoke(C5259f.m25630j(C5259f.f14911d, C5259f.f14916i));
        } else {
            this.callback = callback;
            C5258e c5258e = new C5258e(readableMap);
            this.options = c5258e;
            if (c5258e.f14904h.booleanValue() && Build.VERSION.SDK_INT <= 28 && !C5259f.m25618v(currentActivity)) {
                callback.invoke(C5259f.m25630j(C5259f.f14910c, null));
                this.callback = null;
                return;
            }
            this.identifier = UUID.randomUUID();
            if (this.options.f14907k.equals(C5259f.f14913f)) {
                intent = new Intent("android.media.action.VIDEO_CAPTURE");
                intent.putExtra("android.intent.extra.videoQuality", this.options.f14900d);
                int i2 = this.options.f14905i;
                if (i2 > 0) {
                    intent.putExtra("android.intent.extra.durationLimit", i2);
                }
                m25637c = C5259f.m25637c(this.reactContext, this.identifier, "mp4");
                this.cameraCaptureURI = C5259f.m25636d(m25637c, this.reactContext);
                i = REQUEST_LAUNCH_VIDEO_CAPTURE;
            } else {
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                m25637c = C5259f.m25637c(this.reactContext, this.identifier, "jpg");
                this.cameraCaptureURI = C5259f.m25636d(m25637c, this.reactContext);
                i = REQUEST_LAUNCH_IMAGE_CAPTURE;
            }
            if (this.options.f14906j.booleanValue()) {
                C5259f.m25642E(intent);
            }
            this.fileUri = Uri.fromFile(m25637c);
            intent.putExtra("output", this.cameraCaptureURI);
            intent.addFlags(3);
            try {
                currentActivity.startActivityForResult(intent, i);
            } catch (ActivityNotFoundException e) {
                callback.invoke(C5259f.m25630j(C5259f.f14911d, e.getMessage()));
                this.callback = null;
            }
        }
    }

    @ReactMethod
    public void launchImageLibrary(ReadableMap readableMap, Callback callback) {
        boolean z;
        Intent intent;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(C5259f.m25630j(C5259f.f14911d, "Activity error"));
            return;
        }
        this.callback = callback;
        C5258e c5258e = new C5258e(readableMap);
        this.options = c5258e;
        if (c5258e.f14897a == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = c5258e.f14907k.equals(C5259f.f14912e);
        boolean equals2 = this.options.f14907k.equals(C5259f.f14913f);
        boolean equals3 = this.options.f14907k.equals(C5259f.f14914g);
        if (z && (equals || equals2)) {
            intent = new Intent("android.intent.action.PICK");
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        }
        if (!z) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (equals) {
            intent.setType("image/*");
        } else if (equals2) {
            intent.setType("video/*");
        } else if (equals3) {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        } else {
            intent.setType("*/*");
        }
        try {
            currentActivity.startActivityForResult(Intent.createChooser(intent, null), REQUEST_LAUNCH_LIBRARY);
        } catch (ActivityNotFoundException e) {
            callback.invoke(C5259f.m25630j(C5259f.f14911d, e.getMessage()));
            this.callback = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (C5259f.m25646A(i) && this.callback != null) {
            if (i2 != -1) {
                if (i == 13001) {
                    C5259f.m25635e(this.fileUri);
                }
                this.callback.invoke(C5259f.m25631i());
                this.callback = null;
                return;
            }
            switch (i) {
                case REQUEST_LAUNCH_IMAGE_CAPTURE /* 13001 */:
                    if (this.options.f14904h.booleanValue()) {
                        C5259f.m25643D(this.cameraCaptureURI, this.identifier, this.reactContext, "photo");
                    }
                    onAssetsObtained(Collections.singletonList(this.fileUri));
                    return;
                case REQUEST_LAUNCH_VIDEO_CAPTURE /* 13002 */:
                    if (this.options.f14904h.booleanValue()) {
                        C5259f.m25643D(this.cameraCaptureURI, this.identifier, this.reactContext, MediaStreamTrack.VIDEO_TRACK_KIND);
                    }
                    onAssetsObtained(Collections.singletonList(this.fileUri));
                    return;
                case REQUEST_LAUNCH_LIBRARY /* 13003 */:
                    onAssetsObtained(C5259f.m25639a(intent));
                    return;
                default:
                    return;
            }
        }
    }

    void onAssetsObtained(List<Uri> list) {
        try {
            try {
                this.callback.invoke(C5259f.m25620t(list, this.identifier, this.options, this.reactContext));
            } catch (RuntimeException e) {
                this.callback.invoke(C5259f.m25630j(C5259f.f14911d, e.getMessage()));
            }
        } finally {
            this.callback = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
