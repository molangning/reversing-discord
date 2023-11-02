package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.C0946a;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.yalantis.ucrop.C5691a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.webrtc.MediaStreamTrack;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class PickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int CAMERA_PICKER_REQUEST = 61111;
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "E_ACTIVITY_DOES_NOT_EXIST";
    private static final String E_CALLBACK_ERROR = "E_CALLBACK_ERROR";
    private static final String E_CAMERA_IS_NOT_AVAILABLE = "E_CAMERA_IS_NOT_AVAILABLE";
    private static final String E_CANNOT_LAUNCH_CAMERA = "E_CANNOT_LAUNCH_CAMERA";
    private static final String E_ERROR_WHILE_CLEANING_FILES = "E_ERROR_WHILE_CLEANING_FILES";
    private static final String E_FAILED_TO_OPEN_CAMERA = "E_FAILED_TO_OPEN_CAMERA";
    private static final String E_FAILED_TO_SHOW_PICKER = "E_FAILED_TO_SHOW_PICKER";
    private static final String E_NO_CAMERA_PERMISSION_KEY = "E_NO_CAMERA_PERMISSION";
    private static final String E_NO_CAMERA_PERMISSION_MSG = "User did not grant camera permission.";
    private static final String E_NO_IMAGE_DATA_FOUND = "E_NO_IMAGE_DATA_FOUND";
    private static final String E_NO_LIBRARY_PERMISSION_KEY = "E_NO_LIBRARY_PERMISSION";
    private static final String E_NO_LIBRARY_PERMISSION_MSG = "User did not grant library permission.";
    private static final String E_PICKER_CANCELLED_KEY = "E_PICKER_CANCELLED";
    private static final String E_PICKER_CANCELLED_MSG = "User cancelled image selection";
    private static final int IMAGE_PICKER_REQUEST = 61110;
    private C5378a compression;
    private String cropperActiveWidgetColor;
    private boolean cropperCircleOverlay;
    private String cropperStatusBarColor;
    private String cropperToolbarColor;
    private String cropperToolbarTitle;
    private String cropperToolbarWidgetColor;
    private boolean cropping;
    private boolean disableCropperColorSetters;
    private boolean enableRotationGesture;
    private boolean freeStyleCropEnabled;
    private int height;
    private boolean hideBottomControls;
    private boolean includeBase64;
    private boolean includeExif;
    private Uri mCameraCaptureURI;
    private String mCurrentMediaPath;
    private String mediaType;
    private boolean multiple;
    private ReadableMap options;
    private ReactApplicationContext reactContext;
    private C5384g resultCollector;
    private boolean showCropFrame;
    private boolean showCropGuidelines;
    private boolean useFrontCamera;
    private int width;

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class CallableC5369a implements Callable<Void> {

        /* renamed from: j */
        final /* synthetic */ PickerModule f15225j;

        /* renamed from: k */
        final /* synthetic */ Activity f15226k;

        /* renamed from: l */
        final /* synthetic */ Promise f15227l;

        CallableC5369a(PickerModule pickerModule, Activity activity, Promise promise) {
            PickerModule.this = r1;
            this.f15225j = pickerModule;
            this.f15226k = activity;
            this.f15227l = promise;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            File file;
            try {
                file = new File(this.f15225j.getTmpDir(this.f15226k));
            } catch (Exception e) {
                e.printStackTrace();
                this.f15227l.reject(PickerModule.E_ERROR_WHILE_CLEANING_FILES, e.getMessage());
            }
            if (file.exists()) {
                this.f15225j.deleteRecursive(file);
                this.f15227l.resolve(null);
                return null;
            }
            throw new Exception("File does not exist");
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class CallableC5370b implements Callable<Void> {

        /* renamed from: j */
        final /* synthetic */ String f15229j;

        /* renamed from: k */
        final /* synthetic */ PickerModule f15230k;

        /* renamed from: l */
        final /* synthetic */ Promise f15231l;

        CallableC5370b(String str, PickerModule pickerModule, Promise promise) {
            PickerModule.this = r1;
            this.f15229j = str;
            this.f15230k = pickerModule;
            this.f15231l = promise;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            String str;
            File file;
            try {
                str = this.f15229j;
                if (str.startsWith("file://")) {
                    str = str.substring(7);
                }
                file = new File(str);
            } catch (Exception e) {
                e.printStackTrace();
                this.f15231l.reject(PickerModule.E_ERROR_WHILE_CLEANING_FILES, e.getMessage());
            }
            if (file.exists()) {
                this.f15230k.deleteRecursive(file);
                this.f15231l.resolve(null);
                return null;
            }
            throw new Exception("File does not exist. Path: " + str);
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5371c implements PermissionListener {

        /* renamed from: j */
        final /* synthetic */ Promise f15233j;

        /* renamed from: k */
        final /* synthetic */ Callable f15234k;

        C5371c(Promise promise, Callable callable) {
            PickerModule.this = r1;
            this.f15233j = promise;
            this.f15234k = callable;
        }

        @Override // com.facebook.react.modules.core.PermissionListener
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i == 1) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    String str = strArr[i2];
                    if (iArr[i2] == -1) {
                        if (str.equals("android.permission.CAMERA")) {
                            this.f15233j.reject(PickerModule.E_NO_CAMERA_PERMISSION_KEY, PickerModule.E_NO_CAMERA_PERMISSION_MSG);
                        } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            this.f15233j.reject(PickerModule.E_NO_LIBRARY_PERMISSION_KEY, PickerModule.E_NO_LIBRARY_PERMISSION_MSG);
                        } else {
                            this.f15233j.reject(PickerModule.E_NO_LIBRARY_PERMISSION_KEY, "Required permission missing");
                        }
                        return true;
                    }
                }
                try {
                    this.f15234k.call();
                } catch (Exception e) {
                    this.f15233j.reject(PickerModule.E_CALLBACK_ERROR, "Unknown error", e);
                }
            }
            return true;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class CallableC5372d implements Callable<Void> {

        /* renamed from: j */
        final /* synthetic */ Activity f15236j;

        CallableC5372d(Activity activity) {
            PickerModule.this = r1;
            this.f15236j = activity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            PickerModule.this.initiateCamera(this.f15236j);
            return null;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class CallableC5373e implements Callable<Void> {

        /* renamed from: j */
        final /* synthetic */ Activity f15238j;

        CallableC5373e(Activity activity) {
            PickerModule.this = r1;
            this.f15238j = activity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            PickerModule.this.initiatePicker(this.f15238j);
            return null;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class CallableC5374f implements Callable<Void> {

        /* renamed from: j */
        final /* synthetic */ Activity f15240j;

        /* renamed from: k */
        final /* synthetic */ Uri f15241k;

        CallableC5374f(Activity activity, Uri uri) {
            PickerModule.this = r1;
            this.f15240j = activity;
            this.f15241k = uri;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            PickerModule.this.startCropping(this.f15240j, this.f15241k);
            return null;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC5375g implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Activity f15243j;

        /* renamed from: k */
        final /* synthetic */ String f15244k;

        /* renamed from: l */
        final /* synthetic */ String f15245l;

        /* renamed from: m */
        final /* synthetic */ String f15246m;

        /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$g$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C5376a implements Callback {
            C5376a() {
                RunnableC5375g.this = r1;
            }

            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                String str = (String) objArr[0];
                try {
                    Bitmap validateVideo = PickerModule.this.validateVideo(str);
                    long lastModified = new File(str).lastModified();
                    long longValue = PickerModule.getVideoDuration(str).longValue();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt("width", validateVideo.getWidth());
                    writableNativeMap.putInt("height", validateVideo.getHeight());
                    writableNativeMap.putString("mime", RunnableC5375g.this.f15246m);
                    writableNativeMap.putInt("size", (int) new File(str).length());
                    writableNativeMap.putInt("duration", (int) longValue);
                    writableNativeMap.putString("path", "file://" + str);
                    writableNativeMap.putString("modificationDate", String.valueOf(lastModified));
                    PickerModule.this.resultCollector.m25312d(writableNativeMap);
                } catch (Exception e) {
                    PickerModule.this.resultCollector.m25313c(PickerModule.E_NO_IMAGE_DATA_FOUND, e);
                }
            }
        }

        /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$g$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C5377b implements Callback {
            C5377b() {
                RunnableC5375g.this = r1;
            }

            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                WritableNativeMap writableNativeMap = (WritableNativeMap) objArr[0];
                PickerModule.this.resultCollector.m25314b(writableNativeMap.getString("code"), writableNativeMap.getString("message"));
            }
        }

        RunnableC5375g(Activity activity, String str, String str2, String str3) {
            PickerModule.this = r1;
            this.f15243j = activity;
            this.f15244k = str;
            this.f15245l = str2;
            this.f15246m = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            PickerModule.this.compression.m25329b(this.f15243j, PickerModule.this.options, this.f15244k, this.f15245l, new PromiseImpl(new C5376a(), new C5377b()));
        }
    }

    public PickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mediaType = "any";
        this.multiple = false;
        this.includeBase64 = false;
        this.includeExif = false;
        this.cropping = false;
        this.cropperCircleOverlay = false;
        this.freeStyleCropEnabled = false;
        this.showCropGuidelines = true;
        this.showCropFrame = true;
        this.hideBottomControls = false;
        this.enableRotationGesture = false;
        this.disableCropperColorSetters = false;
        this.useFrontCamera = false;
        this.cropperActiveWidgetColor = null;
        this.cropperStatusBarColor = null;
        this.cropperToolbarColor = null;
        this.cropperToolbarTitle = null;
        this.cropperToolbarWidgetColor = null;
        this.width = 0;
        this.height = 0;
        this.resultCollector = new C5384g();
        this.compression = new C5378a();
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    private void cameraPickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.m25314b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
        } else if (i2 == -1) {
            Uri uri = this.mCameraCaptureURI;
            if (uri == null) {
                this.resultCollector.m25314b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
            } else if (this.cropping) {
                new C5691a.C5692a().m24701e(Bitmap.CompressFormat.JPEG);
                startCropping(activity, uri);
            } else {
                try {
                    this.resultCollector.m25311e(1);
                    WritableMap selection = getSelection(activity, uri, true);
                    if (selection != null) {
                        this.resultCollector.m25312d(selection);
                    }
                } catch (Exception e) {
                    this.resultCollector.m25314b(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                }
            }
        }
    }

    private void configureCropperColors(C5691a.C5692a c5692a) {
        String str = this.cropperActiveWidgetColor;
        if (str != null) {
            c5692a.m24704b(Color.parseColor(str));
        }
        String str2 = this.cropperToolbarColor;
        if (str2 != null) {
            c5692a.m24694l(Color.parseColor(str2));
        }
        String str3 = this.cropperStatusBarColor;
        if (str3 != null) {
            c5692a.m24695k(Color.parseColor(str3));
        }
        String str4 = this.cropperToolbarWidgetColor;
        if (str4 != null) {
            c5692a.m24692n(Color.parseColor(str4));
        }
    }

    private File createImageFile() {
        String str = "image-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, ".jpg", externalFilesDir);
        this.mCurrentMediaPath = "file:" + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private File createVideoFile() {
        String str = "video-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, ".mp4", externalFilesDir);
        this.mCurrentMediaPath = "file:" + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private void croppingResult(Activity activity, int i, int i2, Intent intent) {
        if (intent != null) {
            Uri m24711b = C5691a.m24711b(intent);
            if (m24711b != null) {
                try {
                    if (this.width > 0 && this.height > 0) {
                        m24711b = Uri.fromFile(this.compression.m25327d(this.reactContext, m24711b.getPath(), this.width, this.height, 100, getMimeType(m24711b.toString())));
                    }
                    WritableMap selection = getSelection(activity, m24711b, false);
                    if (selection != null) {
                        selection.putMap("cropRect", getCroppedRectMap(intent));
                        this.resultCollector.m25311e(1);
                        this.resultCollector.m25312d(selection);
                        return;
                    }
                    throw new Exception("Cannot crop video files");
                } catch (Exception e) {
                    this.resultCollector.m25314b(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                    return;
                }
            }
            this.resultCollector.m25314b(E_NO_IMAGE_DATA_FOUND, "Cannot find image data");
            return;
        }
        this.resultCollector.m25314b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
    }

    public void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    private void getAsyncSelection(Activity activity, Uri uri, boolean z) {
        String resolveRealPath = resolveRealPath(activity, uri, z);
        if (resolveRealPath != null && !resolveRealPath.isEmpty()) {
            String mimeType = getMimeType(resolveRealPath);
            if (mimeType != null && mimeType.startsWith("video/")) {
                getVideo(activity, resolveRealPath, mimeType);
                return;
            } else {
                this.resultCollector.m25312d(getImage(activity, resolveRealPath));
                return;
            }
        }
        this.resultCollector.m25314b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve asset path.");
    }

    private String getBase64StringFromFile(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static WritableMap getCroppedRectMap(Intent intent) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("x", intent.getIntExtra("com.yalantis.ucrop.OffsetX", -1));
        writableNativeMap.putInt("y", intent.getIntExtra("com.yalantis.ucrop.OffsetY", -1));
        writableNativeMap.putInt("width", intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1));
        writableNativeMap.putInt("height", intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1));
        return writableNativeMap;
    }

    private WritableMap getImage(Activity activity, String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            String path = this.compression.m25330a(this.reactContext, this.options, str, validateImage(str)).getPath();
            BitmapFactory.Options validateImage = validateImage(path);
            long lastModified = new File(str).lastModified();
            writableNativeMap.putString("path", "file://" + path);
            writableNativeMap.putInt("width", validateImage.outWidth);
            writableNativeMap.putInt("height", validateImage.outHeight);
            writableNativeMap.putString("mime", validateImage.outMimeType);
            writableNativeMap.putInt("size", (int) new File(path).length());
            writableNativeMap.putString("modificationDate", String.valueOf(lastModified));
            if (this.includeBase64) {
                writableNativeMap.putString("data", getBase64StringFromFile(path));
            }
            if (this.includeExif) {
                try {
                    writableNativeMap.putMap("exif", C5379b.m25326a(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return writableNativeMap;
        }
        throw new Exception("Cannot select remote files");
    }

    private String getMimeType(String str) {
        Uri fromFile = Uri.fromFile(new File(str));
        if (fromFile.getScheme().equals("content")) {
            return this.reactContext.getContentResolver().getType(fromFile);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(fromFile.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        }
        return null;
    }

    private WritableMap getSelection(Activity activity, Uri uri, boolean z) {
        String resolveRealPath = resolveRealPath(activity, uri, z);
        if (resolveRealPath != null && !resolveRealPath.isEmpty()) {
            String mimeType = getMimeType(resolveRealPath);
            if (mimeType != null && mimeType.startsWith("video/")) {
                getVideo(activity, resolveRealPath, mimeType);
                return null;
            }
            return getImage(activity, resolveRealPath);
        }
        throw new Exception("Cannot resolve asset path.");
    }

    public String getTmpDir(Activity activity) {
        String str = activity.getCacheDir() + "/react-native-image-crop-picker";
        new File(str).mkdir();
        return str;
    }

    private void getVideo(Activity activity, String str, String str2) {
        validateVideo(str);
        new Thread(new RunnableC5375g(activity, str, getTmpDir(activity) + "/" + UUID.randomUUID().toString() + ".mp4", str2)).run();
    }

    public static Long getVideoDuration(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
    }

    private void imagePickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.m25314b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
        } else if (i2 == -1) {
            if (this.multiple) {
                ClipData clipData = intent.getClipData();
                try {
                    if (clipData == null) {
                        this.resultCollector.m25311e(1);
                        getAsyncSelection(activity, intent.getData(), false);
                        return;
                    }
                    this.resultCollector.m25311e(clipData.getItemCount());
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        getAsyncSelection(activity, clipData.getItemAt(i3).getUri(), false);
                    }
                    return;
                } catch (Exception e) {
                    this.resultCollector.m25314b(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                    return;
                }
            }
            Uri data = intent.getData();
            if (data == null) {
                this.resultCollector.m25314b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
            } else if (this.cropping) {
                startCropping(activity, data);
            } else {
                try {
                    getAsyncSelection(activity, data, false);
                } catch (Exception e2) {
                    this.resultCollector.m25314b(E_NO_IMAGE_DATA_FOUND, e2.getMessage());
                }
            }
        }
    }

    public void initiateCamera(Activity activity) {
        String str;
        File createImageFile;
        try {
            if (this.mediaType.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                str = "android.media.action.VIDEO_CAPTURE";
                createImageFile = createVideoFile();
            } else {
                str = "android.media.action.IMAGE_CAPTURE";
                createImageFile = createImageFile();
            }
            Intent intent = new Intent(str);
            Uri uriForFile = FileProvider.getUriForFile(activity, activity.getApplicationContext().getPackageName() + ".provider", createImageFile);
            this.mCameraCaptureURI = uriForFile;
            intent.putExtra("output", uriForFile);
            if (this.useFrontCamera) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                this.resultCollector.m25314b(E_CANNOT_LAUNCH_CAMERA, "Cannot launch camera");
            } else {
                activity.startActivityForResult(intent, CAMERA_PICKER_REQUEST);
            }
        } catch (Exception e) {
            this.resultCollector.m25313c(E_FAILED_TO_OPEN_CAMERA, e);
        }
    }

    public void initiatePicker(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            if (!this.cropping && !this.mediaType.equals("photo")) {
                if (this.mediaType.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    intent.setType("video/*");
                } else {
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                intent.setFlags(67108864);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.multiple);
                intent.addCategory("android.intent.category.OPENABLE");
                activity.startActivityForResult(Intent.createChooser(intent, "Pick an image"), IMAGE_PICKER_REQUEST);
            }
            intent.setType("image/*");
            if (this.cropping) {
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/jpeg", "image/png"});
            }
            intent.setFlags(67108864);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.multiple);
            intent.addCategory("android.intent.category.OPENABLE");
            activity.startActivityForResult(Intent.createChooser(intent, "Pick an image"), IMAGE_PICKER_REQUEST);
        } catch (Exception e) {
            this.resultCollector.m25313c(E_FAILED_TO_SHOW_PICKER, e);
        }
    }

    private boolean isCameraAvailable(Activity activity) {
        if (!activity.getPackageManager().hasSystemFeature("android.hardware.camera") && !activity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            return false;
        }
        return true;
    }

    private void permissionsCheck(Activity activity, Promise promise, List<String> list, Callable<Void> callable) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList(list);
        if (Build.VERSION.SDK_INT > 28) {
            arrayList2.remove("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        for (String str : arrayList2) {
            if (C0946a.m38403a(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ((PermissionAwareActivity) activity).requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 1, new C5371c(promise, callable));
            return;
        }
        try {
            callable.call();
        } catch (Exception e) {
            promise.reject(E_CALLBACK_ERROR, "Unknown error", e);
        }
    }

    private String resolveRealPath(Activity activity, Uri uri, boolean z) {
        if (z) {
            return Uri.parse(this.mCurrentMediaPath).getPath();
        }
        return C5383f.m25318b(activity, uri);
    }

    private void setConfiguration(ReadableMap readableMap) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        boolean z4;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (readableMap.hasKey("mediaType")) {
            str = readableMap.getString("mediaType");
        } else {
            str = "any";
        }
        this.mediaType = str;
        boolean z12 = true;
        if (readableMap.hasKey("multiple") && readableMap.getBoolean("multiple")) {
            z = true;
        } else {
            z = false;
        }
        this.multiple = z;
        if (readableMap.hasKey("includeBase64") && readableMap.getBoolean("includeBase64")) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.includeBase64 = z2;
        if (readableMap.hasKey("includeExif") && readableMap.getBoolean("includeExif")) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.includeExif = z3;
        if (readableMap.hasKey("width")) {
            i = readableMap.getInt("width");
        } else {
            i = 0;
        }
        this.width = i;
        if (readableMap.hasKey("height")) {
            i2 = readableMap.getInt("height");
        } else {
            i2 = 0;
        }
        this.height = i2;
        if (readableMap.hasKey("cropping") && readableMap.getBoolean("cropping")) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.cropping = z4;
        String str6 = null;
        if (readableMap.hasKey("cropperActiveWidgetColor")) {
            str2 = readableMap.getString("cropperActiveWidgetColor");
        } else {
            str2 = null;
        }
        this.cropperActiveWidgetColor = str2;
        if (readableMap.hasKey("cropperStatusBarColor")) {
            str3 = readableMap.getString("cropperStatusBarColor");
        } else {
            str3 = null;
        }
        this.cropperStatusBarColor = str3;
        if (readableMap.hasKey("cropperToolbarColor")) {
            str4 = readableMap.getString("cropperToolbarColor");
        } else {
            str4 = null;
        }
        this.cropperToolbarColor = str4;
        if (readableMap.hasKey("cropperToolbarTitle")) {
            str5 = readableMap.getString("cropperToolbarTitle");
        } else {
            str5 = null;
        }
        this.cropperToolbarTitle = str5;
        if (readableMap.hasKey("cropperToolbarWidgetColor")) {
            str6 = readableMap.getString("cropperToolbarWidgetColor");
        }
        this.cropperToolbarWidgetColor = str6;
        if (readableMap.hasKey("cropperCircleOverlay") && readableMap.getBoolean("cropperCircleOverlay")) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.cropperCircleOverlay = z5;
        if (readableMap.hasKey("freeStyleCropEnabled") && readableMap.getBoolean("freeStyleCropEnabled")) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.freeStyleCropEnabled = z6;
        if (readableMap.hasKey("showCropGuidelines") && !readableMap.getBoolean("showCropGuidelines")) {
            z7 = false;
        } else {
            z7 = true;
        }
        this.showCropGuidelines = z7;
        if (readableMap.hasKey("showCropFrame") && !readableMap.getBoolean("showCropFrame")) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.showCropFrame = z8;
        if (readableMap.hasKey("hideBottomControls") && readableMap.getBoolean("hideBottomControls")) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.hideBottomControls = z9;
        if (readableMap.hasKey("enableRotationGesture") && readableMap.getBoolean("enableRotationGesture")) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.enableRotationGesture = z10;
        if (readableMap.hasKey("disableCropperColorSetters") && readableMap.getBoolean("disableCropperColorSetters")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.disableCropperColorSetters = z11;
        if (!readableMap.hasKey("useFrontCamera") || !readableMap.getBoolean("useFrontCamera")) {
            z12 = false;
        }
        this.useFrontCamera = z12;
        this.options = readableMap;
    }

    public void startCropping(Activity activity, Uri uri) {
        String str;
        int i;
        Bitmap.CompressFormat m25320a = C5381d.m25320a(getMimeType(uri.toString()));
        C5691a.C5692a c5692a = new C5691a.C5692a();
        c5692a.m24701e(m25320a);
        c5692a.m24700f(100);
        c5692a.m24702d(this.cropperCircleOverlay);
        c5692a.m24699g(this.freeStyleCropEnabled);
        c5692a.m24696j(this.showCropGuidelines);
        c5692a.m24697i(this.showCropFrame);
        c5692a.m24698h(this.hideBottomControls);
        String str2 = this.cropperToolbarTitle;
        if (str2 != null) {
            c5692a.m24693m(str2);
        }
        if (this.enableRotationGesture) {
            c5692a.m24703c(3, 3, 3);
        }
        if (!this.disableCropperColorSetters) {
            configureCropperColors(c5692a);
        }
        if (m25320a == Bitmap.CompressFormat.PNG) {
            str = ".png";
        } else {
            str = ".jpg";
        }
        String tmpDir = getTmpDir(activity);
        C5691a m24706g = C5691a.m24710c(uri, Uri.fromFile(new File(tmpDir, UUID.randomUUID().toString() + str))).m24706g(c5692a);
        int i2 = this.width;
        if (i2 > 0 && (i = this.height) > 0) {
            m24706g.m24707f(i2, i);
        }
        m24706g.m24709d(activity);
    }

    private BitmapFactory.Options validateImage(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outMimeType != null && options.outWidth != 0 && options.outHeight != 0) {
            return options;
        }
        throw new Exception("Invalid image selected");
    }

    public Bitmap validateVideo(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new Exception("Cannot retrieve video data");
    }

    @ReactMethod
    public void clean(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC5369a(this, currentActivity, promise));
        }
    }

    @ReactMethod
    public void cleanSingle(String str, Promise promise) {
        if (str == null) {
            promise.reject(E_ERROR_WHILE_CLEANING_FILES, "Cannot cleanup empty path");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC5370b(str, this, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageCropPicker";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == IMAGE_PICKER_REQUEST) {
            imagePickerResult(activity, i, i2, intent);
        } else if (i == CAMERA_PICKER_REQUEST) {
            cameraPickerResult(activity, i, i2, intent);
        } else if (i == 69) {
            croppingResult(activity, i, i2, intent);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openCamera(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else if (!isCameraAvailable(currentActivity)) {
            promise.reject(E_CAMERA_IS_NOT_AVAILABLE, "Camera not available");
        } else {
            setConfiguration(readableMap);
            this.resultCollector.m25310f(promise, false);
            permissionsCheck(currentActivity, promise, Arrays.asList("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC5372d(currentActivity));
        }
    }

    @ReactMethod
    public void openCropper(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.m25310f(promise, false);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC5374f(currentActivity, Uri.parse(readableMap.getString("path"))));
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.m25310f(promise, this.multiple);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC5373e(currentActivity));
    }
}