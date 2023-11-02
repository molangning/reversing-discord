package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.core.content.C0946a;
import androidx.core.content.FileProvider;
import androidx.core.util.C1136d;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.ThemedReactContext;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;
import p414x2.C13677a;

@ReactModule(name = RNCWebViewModule.MODULE_NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    private static final String TAG = "RNCWebViewModule";
    protected static final C5418d shouldOverrideUrlLoadingLock = new C5418d();
    private DownloadManager.Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private File outputImage;
    private File outputVideo;

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5415a implements PermissionListener {

        /* renamed from: j */
        final /* synthetic */ String f15360j;

        /* renamed from: k */
        final /* synthetic */ String f15361k;

        C5415a(String str, String str2) {
            RNCWebViewModule.this = r1;
            this.f15360j = str;
            this.f15361k = str2;
        }

        @Override // com.facebook.react.modules.core.PermissionListener
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i != 1) {
                return false;
            }
            if (iArr.length > 0 && iArr[0] == 0) {
                if (RNCWebViewModule.this.downloadRequest != null) {
                    RNCWebViewModule.this.downloadFile(this.f15360j);
                }
            } else {
                Toast.makeText(RNCWebViewModule.this.getCurrentActivity().getApplicationContext(), this.f15361k, 1).show();
            }
            return true;
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C5416b {

        /* renamed from: a */
        static final /* synthetic */ int[] f15363a;

        static {
            int[] iArr = new int[EnumC5417c.values().length];
            f15363a = iArr;
            try {
                iArr[EnumC5417c.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15363a[EnumC5417c.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5417c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);
        

        /* renamed from: j */
        private final String f15368j;

        EnumC5417c(String str) {
            this.f15368j = str;
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5418d {

        /* renamed from: a */
        private int f15369a = 1;

        /* renamed from: b */
        private final HashMap<Integer, AtomicReference<EnumC5419a>> f15370b = new HashMap<>();

        /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public enum EnumC5419a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected C5418d() {
        }

        /* renamed from: a */
        public synchronized AtomicReference<EnumC5419a> m25178a(Integer num) {
            return this.f15370b.get(num);
        }

        /* renamed from: b */
        public synchronized C1136d<Integer, AtomicReference<EnumC5419a>> m25177b() {
            int i;
            AtomicReference<EnumC5419a> atomicReference;
            i = this.f15369a;
            this.f15369a = i + 1;
            atomicReference = new AtomicReference<>(EnumC5419a.UNDECIDED);
            this.f15370b.put(Integer.valueOf(i), atomicReference);
            return new C1136d<>(Integer.valueOf(i), atomicReference);
        }

        /* renamed from: c */
        public synchronized void m25176c(Integer num) {
            this.f15370b.remove(num);
        }
    }

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(EnumC5417c.IMAGE.f15368j));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(EnumC5417c.VIDEO.f15368j));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (noAcceptTypesSet(strArr).booleanValue()) {
            return new String[]{EnumC5417c.DEFAULT.f15368j};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                String mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
                if (mimeTypeFromExtension != null) {
                    strArr2[i] = mimeTypeFromExtension;
                } else {
                    strArr2[i] = str;
                }
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    private File getCapturedFile(EnumC5417c enumC5417c) {
        String str;
        String str2;
        int i = C5416b.f15363a[enumC5417c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "";
                str2 = "";
            } else {
                String str3 = Environment.DIRECTORY_MOVIES;
                str = "video-";
                str2 = ".mp4";
            }
        } else {
            String str4 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(String.valueOf(System.currentTimeMillis()));
        sb2.append(str2);
        return File.createTempFile(str, str2, getReactApplicationContext().getExternalFilesDir(null));
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? EnumC5417c.DEFAULT.f15368j : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(File file) {
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return FileProvider.getUriForFile(reactApplicationContext, packageName + ".fileprovider", file);
    }

    private PermissionAwareActivity getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if (currentActivity instanceof PermissionAwareActivity) {
                return (PermissionAwareActivity) currentActivity;
            }
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
    }

    private Intent getPhotoIntent() {
        Intent intent;
        Throwable e;
        try {
            File capturedFile = getCapturedFile(EnumC5417c.IMAGE);
            this.outputImage = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
            } catch (IOException e2) {
                e = e2;
                Log.e("CREATE FILE", "Error occurred while creating the File", e);
                e.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e3) {
                e = e3;
                Log.e("CREATE FILE", "Error occurred while creating the File", e);
                e.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e4) {
            intent = null;
            e = e4;
        }
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
            }
            return uriArr;
        } else if (intent.getData() == null || i != -1) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
    }

    private Intent getVideoIntent() {
        Intent intent;
        Throwable e;
        try {
            File capturedFile = getCapturedFile(EnumC5417c.VIDEO);
            this.outputVideo = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
            } catch (IOException e2) {
                e = e2;
                Log.e("CREATE FILE", "Error occurred while creating the File", e);
                e.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e3) {
                e = e3;
                Log.e("CREATE FILE", "Error occurred while creating the File", e);
                e.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e4) {
            intent = null;
            e = e4;
        }
        return intent;
    }

    private PermissionListener getWebviewFileDownloaderPermissionListener(String str, String str2) {
        return new C5415a(str, str2);
    }

    public static /* synthetic */ void lambda$injectJavaScriptWithWebViewKey$1(String str, String str2, Promise promise) {
        RNCWebViewManager.C5410f c5410f = (RNCWebViewManager.C5410f) C5427b1.f15383a.m25169a().get(str);
        if (c5410f != null) {
            c5410f.m25196h(str2);
            promise.resolve(null);
            return;
        }
        promise.reject("err", "Failed to inject javascript with webViewKey: " + str + ". WebView is null.");
    }

    public static /* synthetic */ void lambda$releaseWebView$0(String str) {
        C5427b1 c5427b1 = C5427b1.f15383a;
        RNCWebViewManager.C5410f c5410f = (RNCWebViewManager.C5410f) c5427b1.m25169a().get(str);
        if (c5410f == null) {
            C13677a.m1870H(TAG, "Failed to release webview with webViewKey: " + str);
            return;
        }
        ViewParent parent = c5410f.getParent();
        if (parent != null && (parent instanceof C5423b)) {
            if (((C5423b) parent).m25173b() != c5410f) {
                throw new IllegalStateException("mismatched webview with key: " + str);
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) c5410f.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(c5410f);
            }
        }
        if (c5410f.f15336o != null) {
            ((ThemedReactContext) c5410f.getContext()).removeLifecycleEventListener(c5410f);
            c5410f.m25200d();
        }
        c5427b1.m25169a().remove(str);
    }

    private Boolean noAcceptTypesSet(String[] strArr) {
        String str;
        boolean z = true;
        if (strArr.length != 0 && (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void downloadFile(String str) {
        try {
            ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
            Toast.makeText(getCurrentActivity().getApplicationContext(), str, 1).show();
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "Unsupported URI, aborting download", e);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        boolean z;
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        if (C0946a.m38403a(getCurrentActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            getPermissionAwareActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, getWebviewFileDownloaderPermissionListener(str, str2));
        }
        return z;
    }

    @ReactMethod
    public void injectJavaScriptWithWebViewKey(final String str, final String str2, final Promise promise) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativecommunity.webview.c1
            @Override // java.lang.Runnable
            public final void run() {
                RNCWebViewModule.lambda$injectJavaScriptWithWebViewKey$1(str, str2, promise);
            }
        });
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        promise.resolve(Boolean.TRUE);
    }

    protected boolean needsCameraPermission() {
        try {
            if (Arrays.asList(getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).requestedPermissions).contains("android.permission.CAMERA")) {
                if (C0946a.m38403a(getCurrentActivity(), "android.permission.CAMERA") != 0) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        boolean z;
        boolean z2;
        if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
            return;
        }
        File file = this.outputImage;
        if (file != null && file.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        File file2 = this.outputVideo;
        if (file2 != null && file2.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i != 1) {
            if (i == 3) {
                if (i2 != -1) {
                    this.filePathCallbackLegacy.onReceiveValue(null);
                } else if (z) {
                    this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputImage));
                } else if (z2) {
                    this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputVideo));
                } else {
                    this.filePathCallbackLegacy.onReceiveValue(intent.getData());
                }
            }
        } else if (i2 != -1) {
            ValueCallback<Uri[]> valueCallback = this.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z) {
            this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputImage)});
        } else if (z2) {
            this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputVideo)});
        } else {
            this.filePathCallback.onReceiveValue(getSelectedFiles(intent, i2));
        }
        File file3 = this.outputImage;
        if (file3 != null && !z) {
            file3.delete();
        }
        File file4 = this.outputVideo;
        if (file4 != null && !z2) {
            file4.delete();
        }
        this.filePathCallback = null;
        this.filePathCallbackLegacy = null;
        this.outputImage = null;
        this.outputVideo = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void onShouldStartLoadWithRequestCallback(boolean z, int i) {
        C5418d.EnumC5419a enumC5419a;
        AtomicReference<C5418d.EnumC5419a> m25178a = shouldOverrideUrlLoadingLock.m25178a(Integer.valueOf(i));
        if (m25178a != null) {
            synchronized (m25178a) {
                if (z) {
                    enumC5419a = C5418d.EnumC5419a.DO_NOT_OVERRIDE;
                } else {
                    enumC5419a = C5418d.EnumC5419a.SHOULD_OVERRIDE;
                }
                m25178a.set(enumC5419a);
                m25178a.notify();
            }
        }
    }

    @ReactMethod
    public void releaseWebView(final String str) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativecommunity.webview.d1
            @Override // java.lang.Runnable
            public final void run() {
                RNCWebViewModule.lambda$releaseWebView$0(str);
            }
        });
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
            arrayList.add(photoIntent);
        }
        if (acceptsVideo(str).booleanValue() && (videoIntent = getVideoIntent()) != null) {
            arrayList.add(videoIntent);
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(createChooser, 3);
        } else {
            Log.w(TAG, "there is no Activity to handle this Intent");
        }
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, EnumC5417c.DEFAULT.f15368j).booleanValue() || arrayContainsString(acceptedMimeType, EnumC5417c.IMAGE.f15368j).booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, EnumC5417c.DEFAULT.f15368j).booleanValue() || arrayContainsString(acceptedMimeType, EnumC5417c.VIDEO.f15368j).booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(EnumC5417c.DEFAULT.f15368j);
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
                arrayList.add(photoIntent);
            }
            if (acceptsVideo(strArr).booleanValue() && (videoIntent = getVideoIntent()) != null) {
                arrayList.add(videoIntent);
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent, 1);
        } else {
            Log.w(TAG, "there is no Activity to handle this Intent");
        }
        return true;
    }
}