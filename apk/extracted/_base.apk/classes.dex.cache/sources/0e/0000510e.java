package p406we;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import p467zf.C14179b;
import p467zf.C14180c;
import p467zf.C14198n;
import pf.C11583s;
import pf.C11586t;
import pf.C11591x;
import pf.C11592y;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0005\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004\u001a\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u001a\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t\u001a\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0000\u001a*\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u001a*\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u000b\"\u001c\u0010!\u001a\n \u001f*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006\""}, m14357d2 = {"Landroid/content/Context;", "context", "", "a", "Ljava/io/File;", "Landroid/graphics/Bitmap$CompressFormat;", "c", "g", "imageFile", "Landroid/graphics/Bitmap;", "i", "", "reqWidth", "reqHeight", "e", "Landroid/graphics/BitmapFactory$Options;", "options", "b", "bitmap", "f", "Landroid/net/Uri;", "srcFileUri", "d", "uri", "h", "format", "quality", "j", "destination", "", "l", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "separator", "compressor_release"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: we.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13534c {

    /* renamed from: a */
    private static final String f34902a = File.separator;

    /* renamed from: a */
    private static final String m2291a(Context context) {
        StringBuilder sb2 = new StringBuilder();
        File cacheDir = context.getCacheDir();
        C9612q.m13921d(cacheDir, "context.cacheDir");
        sb2.append(cacheDir.getPath());
        String str = f34902a;
        sb2.append(str);
        sb2.append("compressor");
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: b */
    public static final int m2290b(BitmapFactory.Options options, int i, int i2) {
        C9612q.m13916i(options, "options");
        Pair m7577a = C11591x.m7577a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) m7577a.m14351a()).intValue();
        int intValue2 = ((Number) m7577a.m14350b()).intValue();
        int i3 = 1;
        if (intValue > i2 || intValue2 > i) {
            int i4 = intValue / 2;
            int i5 = intValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: c */
    public static final Bitmap.CompressFormat m2289c(File compressFormat) {
        String m481j;
        C9612q.m13916i(compressFormat, "$this$compressFormat");
        m481j = C14198n.m481j(compressFormat);
        if (m481j != null) {
            String lowerCase = m481j.toLowerCase();
            C9612q.m13921d(lowerCase, "(this as java.lang.String).toLowerCase()");
            int hashCode = lowerCase.hashCode();
            if (hashCode != 111145) {
                if (hashCode != 3198679) {
                    if (hashCode == 3645340 && lowerCase.equals("webp")) {
                        return Bitmap.CompressFormat.WEBP;
                    }
                } else if (lowerCase.equals("heic")) {
                    return null;
                }
            } else if (lowerCase.equals("png")) {
                return Bitmap.CompressFormat.PNG;
            }
            return Bitmap.CompressFormat.JPEG;
        }
        throw new C11592y("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    public static final File m2288d(Context context, Uri srcFileUri) {
        C9612q.m13916i(context, "context");
        C9612q.m13916i(srcFileUri, "srcFileUri");
        File file = new File(m2291a(context) + m2284h(context, srcFileUri));
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        file.deleteOnExit();
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(context.getContentResolver().openFileDescriptor(srcFileUri, "r"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            C14179b.m516b(autoCloseInputStream, fileOutputStream, 0, 2, null);
            C14180c.m514a(fileOutputStream, null);
            C14180c.m514a(autoCloseInputStream, null);
            return file;
        } finally {
        }
    }

    /* renamed from: e */
    public static final Bitmap m2287e(File imageFile, int i, int i2) {
        C9612q.m13916i(imageFile, "imageFile");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        options.inSampleSize = m2290b(options, i, i2);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        C9612q.m13921d(decodeFile, "BitmapFactory.decodeFile…eFile.absolutePath, this)");
        C9612q.m13921d(decodeFile, "BitmapFactory.Options().…absolutePath, this)\n    }");
        return decodeFile;
    }

    /* renamed from: f */
    public static final Bitmap m2286f(File imageFile, Bitmap bitmap) {
        C9612q.m13916i(imageFile, "imageFile");
        C9612q.m13916i(bitmap, "bitmap");
        int attributeInt = new ExifInterface(imageFile.getAbsolutePath()).getAttributeInt("Orientation", 0);
        Matrix matrix = new Matrix();
        if (attributeInt != 3) {
            if (attributeInt != 6) {
                if (attributeInt == 8) {
                    matrix.postRotate(270.0f);
                }
            } else {
                matrix.postRotate(90.0f);
            }
        } else {
            matrix.postRotate(180.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        C9612q.m13921d(createBitmap, "Bitmap.createBitmap(bitm…map.height, matrix, true)");
        return createBitmap;
    }

    /* renamed from: g */
    public static final String m2285g(Bitmap.CompressFormat extension) {
        C9612q.m13916i(extension, "$this$extension");
        int i = C13533b.f34901a[extension.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "jpg";
            }
            return "webp";
        }
        return "png";
    }

    /* renamed from: h */
    public static final String m2284h(Context context, Uri uri) {
        Object m7596b;
        Object m7596b2;
        String str;
        String type;
        String str2;
        Cursor query;
        boolean m13751w;
        C9612q.m13916i(context, "context");
        C9612q.m13916i(uri, "uri");
        ContentResolver contentResolver = context.getContentResolver();
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            query = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
            if (query == null) {
                C9612q.m13906s();
            }
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (query.moveToFirst()) {
            String it = query.getString(query.getColumnIndex("_display_name"));
            C9612q.m13921d(it, "it");
            m13751w = C9653o.m13751w(it);
            if (!(!m13751w)) {
                it = null;
            }
            if (it == null) {
                C9612q.m13906s();
            }
            C14180c.m514a(query, null);
            m7596b = C11583s.m7596b(it);
            if (C11583s.m7593e(m7596b) != null) {
                try {
                    str = "IMG_" + new SimpleDateFormat("yyyyMMdd_", Locale.getDefault()).format(new Date()) + System.nanoTime();
                    type = contentResolver.getType(uri);
                } catch (Throwable th3) {
                    C11583s.C11584a c11584a3 = C11583s.f30090k;
                    m7596b2 = C11583s.m7596b(C11586t.m7587a(th3));
                }
                if (!C9612q.m13922c(type, "image/jpg") && !C9612q.m13922c(type, "image/jpeg")) {
                    if (C9612q.m13922c(type, "image/png")) {
                        str2 = "png";
                    } else if (C9612q.m13922c(type, "image/webp")) {
                        str2 = "webp";
                    } else {
                        throw new IllegalArgumentException("Cannot generate fallback filename for " + type + ' ' + uri);
                    }
                    m7596b2 = C11583s.m7596b(str + '.' + str2);
                    m7596b = m7596b2;
                }
                str2 = "jpg";
                m7596b2 = C11583s.m7596b(str + '.' + str2);
                m7596b = m7596b2;
            }
            C11586t.m7586b(m7596b);
            return (String) m7596b;
        }
        throw new IllegalStateException("Cursor is empty".toString());
    }

    /* renamed from: i */
    public static final Bitmap m2283i(File imageFile) {
        boolean z;
        C9612q.m13916i(imageFile, "imageFile");
        Bitmap decodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath());
        if (decodeFile != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m2286f(imageFile, decodeFile);
        }
        throw new IllegalArgumentException(("Failed to load bitmap from " + imageFile).toString());
    }

    /* renamed from: j */
    public static final File m2282j(File imageFile, Bitmap bitmap, Bitmap.CompressFormat format, int i) {
        File file;
        String m13714U0;
        C9612q.m13916i(imageFile, "imageFile");
        C9612q.m13916i(bitmap, "bitmap");
        C9612q.m13916i(format, "format");
        if (format == m2289c(imageFile)) {
            file = imageFile;
        } else {
            StringBuilder sb2 = new StringBuilder();
            String absolutePath = imageFile.getAbsolutePath();
            C9612q.m13921d(absolutePath, "imageFile.absolutePath");
            m13714U0 = C9654p.m13714U0(absolutePath, ".", null, 2, null);
            sb2.append(m13714U0);
            sb2.append('.');
            sb2.append(m2285g(format));
            file = new File(sb2.toString());
        }
        imageFile.delete();
        m2280l(bitmap, file, format, i);
        return file;
    }

    /* renamed from: k */
    public static /* synthetic */ File m2281k(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, int i2, Object obj) {
        if ((i2 & 4) != 0 && (compressFormat = m2289c(file)) == null) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i2 & 8) != 0) {
            i = 100;
        }
        return m2282j(file, bitmap, compressFormat, i);
    }

    /* renamed from: l */
    public static final void m2280l(Bitmap bitmap, File destination, Bitmap.CompressFormat format, int i) {
        FileOutputStream fileOutputStream;
        C9612q.m13916i(bitmap, "bitmap");
        C9612q.m13916i(destination, "destination");
        C9612q.m13916i(format, "format");
        File parentFile = destination.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(destination.getAbsolutePath());
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bitmap.compress(format, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
            throw th;
        }
    }
}