package com.reactnativecommunity.cameraroll;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;
import p414x2.C13677a;

@ReactModule(name = CameraRollModule.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CameraRollModule extends ReactContextBaseJavaModule {
    private static final String ASSET_TYPE_ALL = "All";
    private static final String ASSET_TYPE_PHOTOS = "Photos";
    private static final String ASSET_TYPE_VIDEOS = "Videos";
    private static final String ERROR_UNABLE_TO_DELETE = "E_UNABLE_TO_DELETE";
    private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final String NAME = "RNCCameraRoll";
    private static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude", "_data"};
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";
    private static final String SELECTION_DATE_TAKEN = "datetaken < ?";

    /* renamed from: com.reactnativecommunity.cameraroll.CameraRollModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class AsyncTaskC5385a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f15258a;

        /* renamed from: b */
        private final ReadableArray f15259b;

        /* renamed from: c */
        private final Promise f15260c;

        public AsyncTaskC5385a(ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext);
            this.f15258a = reactContext;
            this.f15259b = readableArray;
            this.f15260c = promise;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            ContentResolver contentResolver = this.f15258a.getContentResolver();
            String[] strArr = {"_id"};
            String str = "?";
            for (int i = 1; i < this.f15259b.size(); i++) {
                str = str + ", ?";
            }
            String str2 = "_data IN (" + str + ")";
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = new String[this.f15259b.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < this.f15259b.size(); i3++) {
                strArr2[i3] = Uri.parse(this.f15259b.getString(i3)).getPath();
            }
            Cursor query = contentResolver.query(uri, strArr, str2, strArr2, null);
            while (query.moveToNext()) {
                if (contentResolver.delete(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id"))), null, null) == 1) {
                    i2++;
                }
            }
            query.close();
            if (i2 == this.f15259b.size()) {
                this.f15260c.resolve(null);
                return;
            }
            this.f15260c.reject(CameraRollModule.ERROR_UNABLE_TO_DELETE, "Could not delete all media, only deleted " + i2 + " photos.");
        }
    }

    /* renamed from: com.reactnativecommunity.cameraroll.CameraRollModule$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class AsyncTaskC5386b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f15261a;

        /* renamed from: b */
        private final int f15262b;

        /* renamed from: c */
        private final String f15263c;

        /* renamed from: d */
        private final String f15264d;

        /* renamed from: e */
        private final ReadableArray f15265e;

        /* renamed from: f */
        private final Promise f15266f;

        /* renamed from: g */
        private final String f15267g;

        private AsyncTaskC5386b(ReactContext reactContext, int i, String str, String str2, ReadableArray readableArray, String str3, Promise promise) {
            super(reactContext);
            this.f15261a = reactContext;
            this.f15262b = i;
            this.f15263c = str;
            this.f15264d = str2;
            this.f15265e = readableArray;
            this.f15266f = promise;
            this.f15267g = str3;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            StringBuilder sb2 = new StringBuilder(NearbyManager.PERMISSION_DENIED);
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f15264d)) {
                sb2.append(" AND bucket_display_name = ?");
                arrayList.add(this.f15264d);
            }
            if (this.f15267g.equals(CameraRollModule.ASSET_TYPE_PHOTOS)) {
                sb2.append(" AND media_type = 1");
            } else if (this.f15267g.equals(CameraRollModule.ASSET_TYPE_VIDEOS)) {
                sb2.append(" AND media_type = 3");
            } else if (this.f15267g.equals(CameraRollModule.ASSET_TYPE_ALL)) {
                sb2.append(" AND media_type IN (3,1)");
            } else {
                this.f15266f.reject(CameraRollModule.ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + this.f15267g + "'. Expected one of '" + CameraRollModule.ASSET_TYPE_PHOTOS + "', '" + CameraRollModule.ASSET_TYPE_VIDEOS + "' or '" + CameraRollModule.ASSET_TYPE_ALL + "'.");
                return;
            }
            ReadableArray readableArray = this.f15265e;
            if (readableArray != null && readableArray.size() > 0) {
                sb2.append(" AND mime_type IN (");
                for (int i = 0; i < this.f15265e.size(); i++) {
                    sb2.append("?,");
                    arrayList.add(this.f15265e.getString(i));
                }
                sb2.replace(sb2.length() - 1, sb2.length(), ")");
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.f15261a.getContentResolver();
            try {
                String str = "limit=" + (this.f15262b + 1);
                if (!TextUtils.isEmpty(this.f15263c)) {
                    str = "limit=" + this.f15263c + "," + (this.f15262b + 1);
                }
                Cursor query = contentResolver.query(MediaStore.Files.getContentUri("external").buildUpon().encodedQuery(str).build(), CameraRollModule.PROJECTION, sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), "date_added DESC, date_modified DESC");
                if (query == null) {
                    this.f15266f.reject("E_UNABLE_TO_LOAD", "Could not get media");
                    return;
                }
                CameraRollModule.putEdges(contentResolver, query, writableNativeMap, this.f15262b);
                CameraRollModule.putPageInfo(query, writableNativeMap, this.f15262b, TextUtils.isEmpty(this.f15263c) ? 0 : Integer.parseInt(this.f15263c));
                query.close();
                this.f15266f.resolve(writableNativeMap);
            } catch (SecurityException e) {
                this.f15266f.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.reactnativecommunity.cameraroll.CameraRollModule$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class AsyncTaskC5387c extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f15268a;

        /* renamed from: b */
        private final Uri f15269b;

        /* renamed from: c */
        private final Promise f15270c;

        /* renamed from: d */
        private final ReadableMap f15271d;

        /* renamed from: com.reactnativecommunity.cameraroll.CameraRollModule$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C5388a implements MediaScannerConnection.OnScanCompletedListener {
            C5388a() {
                AsyncTaskC5387c.this = r1;
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                if (uri != null) {
                    AsyncTaskC5387c.this.f15270c.resolve(uri.toString());
                } else {
                    AsyncTaskC5387c.this.f15270c.reject(CameraRollModule.ERROR_UNABLE_TO_SAVE, "Could not add image to gallery");
                }
            }
        }

        public AsyncTaskC5387c(ReactContext reactContext, Uri uri, ReadableMap readableMap, Promise promise) {
            super(reactContext);
            this.f15268a = reactContext;
            this.f15269b = uri;
            this.f15270c = promise;
            this.f15271d = readableMap;
        }

        /* JADX WARN: Removed duplicated region for block: B:187:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x0163  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void doInBackgroundGuarded(java.lang.Void... r21) {
            /*
                Method dump skipped, instructions count: 371
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.cameraroll.CameraRollModule.AsyncTaskC5387c.doInBackgroundGuarded(java.lang.Void[]):void");
        }
    }

    public CameraRollModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        writableMap.putDouble("timestamp", cursor.getLong(i3) / 1000.0d);
    }

    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeArray writableNativeArray;
        int i2;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("mime_type");
        int columnIndex3 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = cursor.getColumnIndex("width");
        int columnIndex6 = cursor.getColumnIndex("height");
        int columnIndex7 = cursor.getColumnIndex("longitude");
        int columnIndex8 = cursor.getColumnIndex("latitude");
        int columnIndex9 = cursor.getColumnIndex("_data");
        int i3 = i;
        int i4 = 0;
        while (i4 < i3 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeArray writableNativeArray3 = writableNativeArray2;
            int i5 = columnIndex;
            int i6 = columnIndex5;
            int i7 = i4;
            int i8 = columnIndex;
            int i9 = columnIndex8;
            int i10 = columnIndex5;
            int i11 = columnIndex7;
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, i5, i6, columnIndex6, columnIndex9, columnIndex2)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor, writableNativeMap2, i11, i9);
                writableNativeMap.putMap("node", writableNativeMap2);
                writableNativeArray = writableNativeArray3;
                writableNativeArray.pushMap(writableNativeMap);
                i2 = i7;
            } else {
                writableNativeArray = writableNativeArray3;
                i2 = i7 - 1;
            }
            cursor.moveToNext();
            i4 = i2 + 1;
            i3 = i;
            writableNativeArray2 = writableNativeArray;
            columnIndex8 = i9;
            columnIndex7 = i11;
            columnIndex = i8;
            columnIndex5 = i10;
        }
        writableMap.putArray("edges", writableNativeArray2);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse("file://" + cursor.getString(i4));
        String name = new File(cursor.getString(i4)).getName();
        writableNativeMap.putString("uri", parse.toString());
        writableNativeMap.putString("filename", name);
        float f = cursor.getInt(i2);
        float f2 = cursor.getInt(i3);
        String string = cursor.getString(i5);
        if (string != null && string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f <= 0.0f || f2 <= 0.0f) {
                    try {
                        f = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    } catch (NumberFormatException e) {
                        C13677a.m1853k(ReactConstants.TAG, "Number format exception occurred while trying to fetch video metadata for " + parse.toString(), e);
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        return false;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
            } catch (Exception e2) {
                C13677a.m1853k(ReactConstants.TAG, "Could not get video metadata for " + parse.toString(), e2);
                return false;
            }
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(parse, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                f = options.outWidth;
                f2 = options.outHeight;
                openAssetFileDescriptor2.close();
            } catch (IOException e3) {
                C13677a.m1853k(ReactConstants.TAG, "Could not get width/height for " + parse.toString(), e3);
                return false;
            }
        }
        writableNativeMap.putDouble("width", f);
        writableNativeMap.putDouble("height", f2);
        writableMap.putMap("image", writableNativeMap);
        return true;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > 0.0d || d2 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("longitude", d);
            writableNativeMap.putDouble("latitude", d2);
            writableMap.putMap("location", writableNativeMap);
        }
    }

    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        boolean z;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (i < cursor.getCount()) {
            z = true;
        } else {
            z = false;
        }
        writableNativeMap.putBoolean("has_next_page", z);
        if (i < cursor.getCount()) {
            writableNativeMap.putString("end_cursor", Integer.toString(i2 + i));
        }
        writableMap.putMap("page_info", writableNativeMap);
    }

    @ReactMethod
    public void deletePhotos(ReadableArray readableArray, Promise promise) {
        if (readableArray.size() == 0) {
            promise.reject(ERROR_UNABLE_TO_DELETE, "Need at least one URI to delete");
        } else {
            new AsyncTaskC5385a(getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        String str;
        String str2;
        String str3;
        ReadableArray readableArray;
        int i = readableMap.getInt("first");
        if (readableMap.hasKey("after")) {
            str = readableMap.getString("after");
        } else {
            str = null;
        }
        if (readableMap.hasKey("groupName")) {
            str2 = readableMap.getString("groupName");
        } else {
            str2 = null;
        }
        if (readableMap.hasKey("assetType")) {
            str3 = readableMap.getString("assetType");
        } else {
            str3 = ASSET_TYPE_PHOTOS;
        }
        String str4 = str3;
        if (readableMap.hasKey("mimeTypes")) {
            readableArray = readableMap.getArray("mimeTypes");
        } else {
            readableArray = null;
        }
        new AsyncTaskC5386b(getReactApplicationContext(), i, str, str2, readableArray, str4, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void saveToCameraRoll(String str, ReadableMap readableMap, Promise promise) {
        new AsyncTaskC5387c(getReactApplicationContext(), Uri.parse(str), readableMap, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}