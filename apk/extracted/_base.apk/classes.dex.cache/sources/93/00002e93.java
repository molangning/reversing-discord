package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Environment;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: com.reactnative.ivpusic.imagepicker.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5378a {
    /* renamed from: a */
    public File m25330a(Context context, ReadableMap readableMap, String str, BitmapFactory.Options options) {
        Integer num;
        Integer num2;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        Integer valueOf;
        Integer valueOf2;
        Double d = null;
        if (readableMap.hasKey("compressImageMaxWidth")) {
            num = Integer.valueOf(readableMap.getInt("compressImageMaxWidth"));
        } else {
            num = null;
        }
        if (readableMap.hasKey("compressImageMaxHeight")) {
            num2 = Integer.valueOf(readableMap.getInt("compressImageMaxHeight"));
        } else {
            num2 = null;
        }
        if (readableMap.hasKey("compressImageQuality")) {
            d = Double.valueOf(readableMap.getDouble("compressImageQuality"));
        }
        boolean z4 = false;
        if (d != null && d.doubleValue() != 1.0d) {
            z = false;
        } else {
            z = true;
        }
        if (num != null && num.intValue() < options.outWidth) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (num2 != null && num2.intValue() < options.outHeight) {
            z3 = false;
        } else {
            z3 = true;
        }
        List asList = Arrays.asList("image/jpeg", "image/jpg", "image/png", "image/gif", "image/tiff");
        String str2 = options.outMimeType;
        if (str2 != null && asList.contains(str2.toLowerCase())) {
            z4 = true;
        }
        if (z && z2 && z3 && z4) {
            Log.d("image-crop-picker", "Skipping image compression");
            return new File(str);
        }
        Log.d("image-crop-picker", "Image compression activated");
        if (d != null) {
            i = (int) (d.doubleValue() * 100.0d);
        } else {
            i = 100;
        }
        Log.d("image-crop-picker", "Compressing image with quality " + i);
        if (num == null) {
            valueOf = Integer.valueOf(options.outWidth);
        } else {
            valueOf = Integer.valueOf(Math.min(num.intValue(), options.outWidth));
        }
        if (num2 == null) {
            valueOf2 = Integer.valueOf(options.outHeight);
        } else {
            valueOf2 = Integer.valueOf(Math.min(num2.intValue(), options.outHeight));
        }
        return m25327d(context, str, valueOf.intValue(), valueOf2.intValue(), i, options.outMimeType);
    }

    /* renamed from: b */
    public synchronized void m25329b(Activity activity, ReadableMap readableMap, String str, String str2, Promise promise) {
        promise.resolve(str);
    }

    /* renamed from: c */
    int m25328c(int i) {
        if (i != 3) {
            if (i != 6) {
                return i != 8 ? 0 : -90;
            }
            return 90;
        }
        return 180;
    }

    /* renamed from: d */
    public File m25327d(Context context, String str, int i, int i2, int i3, String str2) {
        int i4;
        int i5;
        String str3;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
        Matrix matrix = new Matrix();
        matrix.postRotate(m25328c(attributeInt));
        float f = width / height;
        float f2 = i;
        float f3 = i2;
        if (f2 / f3 > 1.0f) {
            i5 = (int) (f3 * f);
            i4 = i2;
        } else {
            i4 = (int) (f2 / f);
            i5 = i;
        }
        Bitmap createBitmap = Bitmap.createBitmap(Bitmap.createScaledBitmap(decodeFile, i5, i4, true), 0, 0, i5, i4, matrix, true);
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists()) {
            Log.d("image-crop-picker", "Pictures Directory is not existing. Will create this directory.");
            externalFilesDir.mkdirs();
        }
        if (C5381d.m25320a(str2) == Bitmap.CompressFormat.PNG) {
            str3 = ".png";
        } else {
            str3 = ".jpg";
        }
        File file = new File(externalFilesDir, UUID.randomUUID() + str3);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        createBitmap.compress(C5381d.m25320a(str2), i3, bufferedOutputStream);
        bufferedOutputStream.close();
        decodeFile.recycle();
        createBitmap.recycle();
        return file;
    }
}