package com.reactnativedocumentpicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ke.C9217a;

@ReactModule(name = DocumentPickerModule.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DocumentPickerModule extends ReactContextBaseJavaModule {
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "ACTIVITY_DOES_NOT_EXIST";
    private static final String E_DOCUMENT_PICKER_CANCELED = "DOCUMENT_PICKER_CANCELED";
    private static final String E_FAILED_TO_SHOW_PICKER = "FAILED_TO_SHOW_PICKER";
    private static final String E_INVALID_DATA_RETURNED = "INVALID_DATA_RETURNED";
    private static final String E_UNABLE_TO_OPEN_FILE_TYPE = "UNABLE_TO_OPEN_FILE_TYPE";
    private static final String E_UNEXPECTED_EXCEPTION = "UNEXPECTED_EXCEPTION";
    private static final String E_UNKNOWN_ACTIVITY_RESULT = "UNKNOWN_ACTIVITY_RESULT";
    private static final String FIELD_COPY_ERROR = "copyError";
    private static final String FIELD_FILE_COPY_URI = "fileCopyUri";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SIZE = "size";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_URI = "uri";
    public static final String NAME = "RNDocumentPicker";
    private static final String OPTION_COPY_TO = "copyTo";
    private static final String OPTION_MULTIPLE = "allowMultiSelection";
    private static final String OPTION_TYPE = "type";
    private static final int PICK_DIR_REQUEST_CODE = 42;
    private static final int READ_REQUEST_CODE = 41;
    private final ActivityEventListener activityEventListener;
    private String copyTo;
    private Promise promise;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativedocumentpicker.DocumentPickerModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5480a extends BaseActivityEventListener {
        C5480a() {
            DocumentPickerModule.this = r1;
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            Promise promise = DocumentPickerModule.this.promise;
            if (promise == null) {
                Log.e(DocumentPickerModule.NAME, "promise was null in onActivityResult");
            } else if (i == 41) {
                DocumentPickerModule.this.onShowActivityResult(i2, intent, promise);
            } else if (i == 42) {
                DocumentPickerModule.this.onPickDirectoryResult(i2, intent);
            }
        }
    }

    /* renamed from: com.reactnativedocumentpicker.DocumentPickerModule$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class AsyncTaskC5481b extends GuardedResultAsyncTask<ReadableArray> {

        /* renamed from: a */
        private final WeakReference<Context> f15439a;

        /* renamed from: b */
        private final List<Uri> f15440b;

        /* renamed from: c */
        private final String f15441c;

        /* renamed from: d */
        private final Promise f15442d;

        protected AsyncTaskC5481b(ReactContext reactContext, List<Uri> list, String str, Promise promise) {
            super(reactContext.getExceptionHandler());
            this.f15439a = new WeakReference<>(reactContext.getApplicationContext());
            this.f15440b = list;
            this.f15441c = str;
            this.f15442d = promise;
        }

        /* renamed from: a */
        public static String m25162a(Context context, Uri uri, File file) {
            FileOutputStream fileOutputStream;
            InputStream inputStream = null;
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    if (openInputStream != null) {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = openInputStream.read(bArr);
                                if (read > 0) {
                                    fileOutputStream.write(bArr, 0, read);
                                } else {
                                    fileOutputStream.close();
                                    openInputStream.close();
                                    return file.toURI().toString();
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            inputStream = openInputStream;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                    throw e;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw e;
                        }
                    } else {
                        throw new NullPointerException("Invalid input stream");
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = null;
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
            }
        }

        /* renamed from: c */
        private WritableMap m25160c(Uri uri) {
            Context context = this.f15439a.get();
            if (context == null) {
                return Arguments.createMap();
            }
            ContentResolver contentResolver = context.getContentResolver();
            WritableMap createMap = Arguments.createMap();
            createMap.putString(DocumentPickerModule.FIELD_URI, uri.toString());
            createMap.putString("type", contentResolver.getType(uri));
            Cursor query = contentResolver.query(uri, null, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("_display_name");
                        if (!query.isNull(columnIndex)) {
                            createMap.putString("name", query.getString(columnIndex));
                        }
                        int columnIndex2 = query.getColumnIndex("mime_type");
                        if (!query.isNull(columnIndex2)) {
                            createMap.putString("type", query.getString(columnIndex2));
                        }
                        int columnIndex3 = query.getColumnIndex("_size");
                        if (!query.isNull(columnIndex3)) {
                            createMap.putInt(DocumentPickerModule.FIELD_SIZE, query.getInt(columnIndex3));
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        query.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (query != null) {
                query.close();
            }
            m25158e(context, createMap, uri);
            return createMap;
        }

        /* renamed from: e */
        private void m25158e(Context context, WritableMap writableMap, Uri uri) {
            if (this.f15441c != null) {
                File cacheDir = context.getCacheDir();
                if (this.f15441c.equals("documentDirectory")) {
                    cacheDir = context.getFilesDir();
                }
                File file = new File(cacheDir, UUID.randomUUID().toString());
                try {
                    if (file.mkdir()) {
                        String string = writableMap.getString("name");
                        if (string == null) {
                            string = String.valueOf(System.currentTimeMillis());
                        }
                        writableMap.putString(DocumentPickerModule.FIELD_FILE_COPY_URI, m25162a(context, uri, new File(file, string)));
                        return;
                    }
                    throw new IOException("failed to create directory at " + file.getAbsolutePath());
                } catch (Exception e) {
                    e.printStackTrace();
                    writableMap.putNull(DocumentPickerModule.FIELD_FILE_COPY_URI);
                    writableMap.putString(DocumentPickerModule.FIELD_COPY_ERROR, e.getLocalizedMessage());
                    return;
                }
            }
            writableMap.putNull(DocumentPickerModule.FIELD_FILE_COPY_URI);
        }

        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        /* renamed from: b */
        public ReadableArray doInBackgroundGuarded() {
            WritableArray createArray = Arguments.createArray();
            for (Uri uri : this.f15440b) {
                createArray.pushMap(m25160c(uri));
            }
            return createArray;
        }

        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        /* renamed from: d */
        public void onPostExecuteGuarded(ReadableArray readableArray) {
            this.f15442d.resolve(readableArray);
        }
    }

    public DocumentPickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C5480a c5480a = new C5480a();
        this.activityEventListener = c5480a;
        reactApplicationContext.addActivityEventListener(c5480a);
    }

    public void onPickDirectoryResult(int i, Intent intent) {
        if (i == 0) {
            sendError(E_DOCUMENT_PICKER_CANCELED, "User canceled directory picker");
        } else if (i != -1) {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, "Unknown activity result: " + i);
        } else if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            WritableMap createMap = Arguments.createMap();
            createMap.putString(FIELD_URI, data.toString());
            this.promise.resolve(createMap);
        } else {
            sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
        }
    }

    private String[] readableArrayToStringArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = readableArray.getString(i);
        }
        return strArr;
    }

    private void sendError(String str, String str2) {
        sendError(str, str2, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
    }

    public void onShowActivityResult(int i, Intent intent, Promise promise) {
        Uri uri;
        ClipData clipData;
        if (i == 0) {
            sendError(E_DOCUMENT_PICKER_CANCELED, "User canceled document picker");
        } else if (i == -1) {
            if (intent != null) {
                uri = intent.getData();
                clipData = intent.getClipData();
            } else {
                uri = null;
                clipData = null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                if (clipData != null && clipData.getItemCount() > 0) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        arrayList.add(clipData.getItemAt(i2).getUri());
                    }
                } else if (uri != null) {
                    arrayList.add(uri);
                } else {
                    sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
                    return;
                }
                new AsyncTaskC5481b(getReactApplicationContext(), arrayList, this.copyTo, promise).execute(new Void[0]);
            } catch (Exception e) {
                sendError(E_UNEXPECTED_EXCEPTION, e.getLocalizedMessage(), e);
            }
        } else {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, "Unknown activity result: " + i);
        }
    }

    @ReactMethod
    public void pick(ReadableMap readableMap, Promise promise) {
        String str;
        ReadableArray array;
        Activity currentActivity = getCurrentActivity();
        this.promise = promise;
        if (readableMap.hasKey(OPTION_COPY_TO)) {
            str = readableMap.getString(OPTION_COPY_TO);
        } else {
            str = null;
        }
        this.copyTo = str;
        if (currentActivity == null) {
            sendError(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            boolean z = false;
            if (!readableMap.isNull("type") && (array = readableMap.getArray("type")) != null) {
                if (array.size() > 1) {
                    String[] readableArrayToStringArray = readableArrayToStringArray(array);
                    intent.putExtra("android.intent.extra.MIME_TYPES", readableArrayToStringArray);
                    intent.setType(C9217a.m16035a("|", readableArrayToStringArray));
                } else if (array.size() == 1) {
                    intent.setType(array.getString(0));
                }
            }
            if (!readableMap.isNull(OPTION_MULTIPLE) && readableMap.getBoolean(OPTION_MULTIPLE)) {
                z = true;
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
            currentActivity.startActivityForResult(Intent.createChooser(intent, null), 41, Bundle.EMPTY);
        } catch (ActivityNotFoundException e) {
            sendError(E_UNABLE_TO_OPEN_FILE_TYPE, e.getLocalizedMessage());
        } catch (Exception e2) {
            e2.printStackTrace();
            sendError(E_FAILED_TO_SHOW_PICKER, e2.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void pickDirectory(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        this.promise = promise;
        try {
            currentActivity.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 42, null);
        } catch (Exception e) {
            sendError(E_FAILED_TO_SHOW_PICKER, "Failed to create directory picker", e);
        }
    }

    private void sendError(String str, String str2, Exception exc) {
        Promise promise = this.promise;
        if (promise != null) {
            this.promise = null;
            promise.reject(str, str2, exc);
        }
    }
}