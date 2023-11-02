package com.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.C0946a;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.util.JSStackTrace;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;
import p110g0.C6509a;

/* renamed from: com.imagepicker.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5259f {

    /* renamed from: a */
    public static String f14908a = "rn_image_picker_lib_temp_";

    /* renamed from: b */
    public static String f14909b = "camera_unavailable";

    /* renamed from: c */
    public static String f14910c = "permission";

    /* renamed from: d */
    public static String f14911d = "others";

    /* renamed from: e */
    public static String f14912e = "photo";

    /* renamed from: f */
    public static String f14913f = "video";

    /* renamed from: g */
    public static String f14914g = "mixed";

    /* renamed from: h */
    public static String f14915h = "any";

    /* renamed from: i */
    public static String f14916i = "This library does not require Manifest.permission.CAMERA, if you add this permission in manifest then you have to obtain the same.";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static boolean m25646A(int i) {
        switch (i) {
            case ImagePickerModule.REQUEST_LAUNCH_IMAGE_CAPTURE /* 13001 */:
            case ImagePickerModule.REQUEST_LAUNCH_VIDEO_CAPTURE /* 13002 */:
            case ImagePickerModule.REQUEST_LAUNCH_LIBRARY /* 13003 */:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: B */
    static boolean m25645B(Uri uri, Context context) {
        return m25615y("video/", uri, context);
    }

    /* renamed from: C */
    public static Uri m25644C(Uri uri, UUID uuid, Context context, C5258e c5258e) {
        try {
            int[] m25625o = m25625o(uri, context);
            if (!m25640G(m25625o[0], m25625o[1], c5258e)) {
                return uri;
            }
            int[] m25626n = m25626n(m25625o[0], m25625o[1], c5258e);
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            String m25622r = m25622r(uri);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(openInputStream), m25626n[0], m25626n[1], true);
            String m25621s = m25621s(uri, context);
            File m25637c = m25637c(context, uuid, m25627m(m25622r));
            createScaledBitmap.compress(m25632h(m25622r), c5258e.f14901e, context.getContentResolver().openOutputStream(Uri.fromFile(m25637c)));
            m25641F(m25637c, m25621s, context);
            return Uri.fromFile(m25637c);
        } catch (Exception e) {
            e.printStackTrace();
            return uri;
        }
    }

    /* renamed from: D */
    public static void m25643D(Uri uri, UUID uuid, Context context, String str) {
        Uri insert;
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            contentValues.put("_display_name", uuid.toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            contentValues.put("_display_name", uuid.toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        m25638b(uri, insert, contentResolver);
    }

    /* renamed from: E */
    public static void m25642E(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    /* renamed from: F */
    static void m25641F(File file, String str, Context context) {
        if (!str.equals(String.valueOf(1)) && !str.equals(String.valueOf(0))) {
            C6509a c6509a = new C6509a(file);
            c6509a.m22526Z("Orientation", str);
            c6509a.m22530V();
        }
    }

    /* renamed from: G */
    static boolean m25640G(int i, int i2, C5258e c5258e) {
        int i3 = c5258e.f14902f;
        if ((i3 == 0 || c5258e.f14903g == 0) && c5258e.f14901e == 100) {
            return false;
        }
        if (i3 >= i && c5258e.f14903g >= i2 && c5258e.f14901e == 100) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<Uri> m25639a(Intent intent) {
        if (intent.getClipData() == null) {
            return Collections.singletonList(intent.getData());
        }
        ClipData clipData = intent.getClipData();
        ArrayList arrayList = new ArrayList(clipData.getItemCount());
        for (int i = 0; i < clipData.getItemCount(); i++) {
            arrayList.add(clipData.getItemAt(i).getUri());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m25638b(Uri uri, Uri uri2, ContentResolver contentResolver) {
        try {
            OutputStream openOutputStream = contentResolver.openOutputStream(uri2);
            InputStream openInputStream = contentResolver.openInputStream(uri);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read != -1) {
                    openOutputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static File m25637c(Context context, UUID uuid, String str) {
        if (uuid == null) {
            try {
                uuid = UUID.randomUUID();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        File file = new File(context.getCacheDir(), f14908a + uuid + "." + str);
        file.createNewFile();
        return file;
    }

    /* renamed from: d */
    public static Uri m25636d(File file, Context context) {
        return FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".imagepickerprovider", file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m25635e(Uri uri) {
        new File(uri.getPath()).delete();
    }

    /* renamed from: f */
    public static Uri m25634f(Uri uri, UUID uuid, Context context) {
        if (uri == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri fromFile = Uri.fromFile(m25637c(context, uuid, m25627m(contentResolver.getType(uri))));
        m25638b(uri, fromFile, contentResolver);
        return fromFile;
    }

    /* renamed from: g */
    static String m25633g(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = openInputStream.read(bArr);
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

    /* renamed from: h */
    static Bitmap.CompressFormat m25632h(String str) {
        str.hashCode();
        if (!str.equals("image/jpeg")) {
            if (!str.equals("image/png")) {
                return Bitmap.CompressFormat.JPEG;
            }
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static ReadableMap m25631i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("didCancel", true);
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static ReadableMap m25630j(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorCode", str);
        if (str2 != null) {
            createMap.putString("errorMessage", str2);
        }
        return createMap;
    }

    /* renamed from: k */
    static ReadableMap m25629k(Uri uri, Context context) {
        String m25649a = ContentResolver.m25649a(context.getContentResolver(), uri);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", uri.toString());
        createMap.putString("fileName", m25649a);
        createMap.putString("mimeType", m25623q(uri, context));
        return createMap;
    }

    /* renamed from: l */
    static double m25628l(Uri uri, Context context) {
        try {
            return context.getContentResolver().openFileDescriptor(uri, "r").getStatSize();
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: m */
    static String m25627m(String str) {
        if (str == null) {
            return "jpg";
        }
        if (!str.equals("image/gif")) {
            if (!str.equals("image/png")) {
                return "jpg";
            }
            return "png";
        }
        return "gif";
    }

    /* renamed from: n */
    static int[] m25626n(int i, int i2, C5258e c5258e) {
        int i3;
        int i4 = c5258e.f14902f;
        if (i4 == 0 || (i3 = c5258e.f14903g) == 0) {
            return new int[]{i, i2};
        }
        if (i4 < i) {
            i2 = (int) ((i4 / i) * i2);
            i = i4;
        }
        if (i3 < i2) {
            i = (int) ((i3 / i2) * i);
        } else {
            i3 = i2;
        }
        return new int[]{i, i3};
    }

    /* renamed from: o */
    public static int[] m25625o(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new int[]{0, 0};
        }
    }

    /* renamed from: p */
    static ReadableMap m25624p(Uri uri, C5258e c5258e, Context context) {
        String lastPathSegment = uri.getLastPathSegment();
        C5255b c5255b = new C5255b(uri, context);
        int[] m25625o = m25625o(uri, context);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", uri.toString());
        createMap.putDouble("fileSize", m25628l(uri, context));
        createMap.putString("fileName", lastPathSegment);
        createMap.putString("type", m25622r(uri));
        createMap.putInt("width", m25625o[0]);
        createMap.putInt("height", m25625o[1]);
        createMap.putString("type", m25623q(uri, context));
        if (c5258e.f14898b.booleanValue()) {
            createMap.putString("base64", m25633g(uri, context));
        }
        if (c5258e.f14899c.booleanValue()) {
            createMap.putString("timestamp", c5255b.m25648b());
            createMap.putString("id", lastPathSegment);
        }
        return createMap;
    }

    /* renamed from: q */
    static String m25623q(Uri uri, Context context) {
        if (uri.getScheme().equals(JSStackTrace.FILE_KEY)) {
            return m25622r(uri);
        }
        return context.getContentResolver().getType(uri);
    }

    /* renamed from: r */
    static String m25622r(Uri uri) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
    }

    /* renamed from: s */
    static String m25621s(Uri uri, Context context) {
        return new C6509a(context.getContentResolver().openInputStream(uri)).m22510j("Orientation");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static ReadableMap m25620t(List<Uri> list, UUID uuid, C5258e c5258e, Context context) {
        boolean equals = c5258e.f14907k.equals(f14912e);
        boolean equals2 = c5258e.f14907k.equals(f14913f);
        boolean equals3 = c5258e.f14907k.equals(f14914g);
        boolean equals4 = c5258e.f14907k.equals(f14915h);
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i);
            if (m25614z(uri, context) && (equals || equals3)) {
                if (uri.getScheme().contains("content")) {
                    uri = m25634f(uri, uuid, context);
                }
                createArray.pushMap(m25624p(m25644C(uri, uuid, context, c5258e), c5258e, context));
            } else if (m25645B(uri, context) && (equals2 || equals3)) {
                createArray.pushMap(m25619u(uri, c5258e, context));
            } else if (equals4) {
                createArray.pushMap(m25629k(uri, context));
            } else {
                throw new RuntimeException("Unsupported file type");
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("assets", createArray);
        return createMap;
    }

    /* renamed from: u */
    static ReadableMap m25619u(Uri uri, C5258e c5258e, Context context) {
        String m25649a = ContentResolver.m25649a(context.getContentResolver(), uri);
        WritableMap createMap = Arguments.createMap();
        C5260g c5260g = new C5260g(uri, context);
        createMap.putString("uri", uri.toString());
        createMap.putDouble("fileSize", m25628l(uri, context));
        createMap.putInt("duration", c5260g.m25610e());
        createMap.putInt("bitrate", c5260g.m25612c());
        createMap.putString("fileName", m25649a);
        createMap.putString("type", m25623q(uri, context));
        createMap.putInt("width", c5260g.m25608g());
        createMap.putInt("height", c5260g.m25609f());
        if (c5258e.f14899c.booleanValue()) {
            createMap.putString("timestamp", c5260g.m25611d());
            createMap.putString("id", m25649a);
        }
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static boolean m25618v(Activity activity) {
        if (C0946a.m38403a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m25617w(Context context) {
        if (!context.getPackageManager().hasSystemFeature("android.hardware.camera") && !context.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public static boolean m25616x(Context context, Activity activity) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).requestedPermissions;
            if (strArr != null && Arrays.asList(strArr).contains("android.permission.CAMERA")) {
                if (C0946a.m38403a(activity, "android.permission.CAMERA") != 0) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: y */
    static boolean m25615y(String str, Uri uri, Context context) {
        String m25623q = m25623q(uri, context);
        if (m25623q != null) {
            return m25623q.contains(str);
        }
        return false;
    }

    /* renamed from: z */
    static boolean m25614z(Uri uri, Context context) {
        return m25615y("image/", uri, context);
    }
}
