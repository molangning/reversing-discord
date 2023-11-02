package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.C1134c;
import androidx.core.util.C1138f;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.facebook.react.util.JSStackTrace;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f3352k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3353a;

    /* renamed from: b */
    Object f3354b;

    /* renamed from: c */
    public byte[] f3355c;

    /* renamed from: d */
    public Parcelable f3356d;

    /* renamed from: e */
    public int f3357e;

    /* renamed from: f */
    public int f3358f;

    /* renamed from: g */
    public ColorStateList f3359g;

    /* renamed from: h */
    PorterDuff.Mode f3360h;

    /* renamed from: i */
    public String f3361i;

    /* renamed from: j */
    public String f3362j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1009a {
        /* renamed from: a */
        static IconCompat m38111a(Object obj) {
            C1138f.m37824f(obj);
            int m38108d = m38108d(obj);
            if (m38108d != 2) {
                if (m38108d != 4) {
                    if (m38108d != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f3354b = obj;
                        return iconCompat;
                    }
                    return IconCompat.m38131g(m38107e(obj));
                }
                return IconCompat.m38128j(m38107e(obj));
            }
            return IconCompat.m38125m(null, m38109c(obj), m38110b(obj));
        }

        /* renamed from: b */
        static int m38110b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C1011c.m38102a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        /* renamed from: c */
        static String m38109c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C1011c.m38101b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        /* renamed from: d */
        static int m38108d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C1011c.m38100c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        /* renamed from: e */
        static Uri m38107e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C1011c.m38099d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        /* renamed from: f */
        static Drawable m38106f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: g */
        static Icon m38105g(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f3353a) {
                case -1:
                    return (Icon) iconCompat.f3354b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3354b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.m38122p(), iconCompat.f3357e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f3354b, iconCompat.f3357e, iconCompat.f3358f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f3354b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = C1010b.m38103b((Bitmap) iconCompat.f3354b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.m38133e((Bitmap) iconCompat.f3354b, false));
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        createWithBitmap = C1012d.m38098a(iconCompat.m38119s());
                        break;
                    } else if (context != null) {
                        InputStream m38118t = iconCompat.m38118t(context);
                        if (m38118t != null) {
                            if (i >= 26) {
                                createWithBitmap = C1010b.m38103b(BitmapFactory.decodeStream(m38118t));
                                break;
                            } else {
                                createWithBitmap = Icon.createWithBitmap(IconCompat.m38133e(BitmapFactory.decodeStream(m38118t), false));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m38119s());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m38119s());
                    }
            }
            ColorStateList colorStateList = iconCompat.f3359g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3360h;
            if (mode != IconCompat.f3352k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1010b {
        /* renamed from: a */
        static Drawable m38104a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        static Icon m38103b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1011c {
        /* renamed from: a */
        static int m38102a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        /* renamed from: b */
        static String m38101b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        /* renamed from: c */
        static int m38100c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        /* renamed from: d */
        static Uri m38099d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1012d {
        /* renamed from: a */
        static Icon m38098a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    public IconCompat() {
        this.f3353a = -1;
        this.f3355c = null;
        this.f3356d = null;
        this.f3357e = 0;
        this.f3358f = 0;
        this.f3359g = null;
        this.f3360h = f3352k;
        this.f3361i = null;
    }

    /* renamed from: A */
    private static String m38138A(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: b */
    public static IconCompat m38136b(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f3357e = bundle.getInt("int1");
        iconCompat.f3358f = bundle.getInt("int2");
        iconCompat.f3362j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f3359g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f3360h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.f3354b = bundle.getParcelable("obj");
                break;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f3354b = bundle.getString("obj");
                break;
            case 3:
                iconCompat.f3354b = bundle.getByteArray("obj");
                break;
        }
        return iconCompat;
    }

    /* renamed from: c */
    public static IconCompat m38135c(Icon icon) {
        return C1009a.m38111a(icon);
    }

    /* renamed from: d */
    public static IconCompat m38134d(Icon icon) {
        if (C1009a.m38108d(icon) == 2 && C1009a.m38110b(icon) == 0) {
            return null;
        }
        return C1009a.m38111a(icon);
    }

    /* renamed from: e */
    static Bitmap m38133e(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: f */
    public static IconCompat m38132f(Bitmap bitmap) {
        C1134c.m37833c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f3354b = bitmap;
        return iconCompat;
    }

    /* renamed from: g */
    public static IconCompat m38131g(Uri uri) {
        C1134c.m37833c(uri);
        return m38130h(uri.toString());
    }

    /* renamed from: h */
    public static IconCompat m38130h(String str) {
        C1134c.m37833c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3354b = str;
        return iconCompat;
    }

    /* renamed from: i */
    public static IconCompat m38129i(Bitmap bitmap) {
        C1134c.m37833c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3354b = bitmap;
        return iconCompat;
    }

    /* renamed from: j */
    public static IconCompat m38128j(Uri uri) {
        C1134c.m37833c(uri);
        return m38127k(uri.toString());
    }

    /* renamed from: k */
    public static IconCompat m38127k(String str) {
        C1134c.m37833c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3354b = str;
        return iconCompat;
    }

    /* renamed from: l */
    public static IconCompat m38126l(Context context, int i) {
        C1134c.m37833c(context);
        return m38125m(context.getResources(), context.getPackageName(), i);
    }

    /* renamed from: m */
    public static IconCompat m38125m(Resources resources, String str, int i) {
        C1134c.m37833c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3357e = i;
            if (resources != null) {
                try {
                    iconCompat.f3354b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3354b = str;
            }
            iconCompat.f3362j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: q */
    static Resources m38121q(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo == null) {
                return null;
            }
            return packageManager.getResourcesForApplication(applicationInfo);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    /* renamed from: a */
    public void m38137a(Context context) {
        Object obj;
        if (this.f3353a == 2 && (obj = this.f3354b) != null) {
            String str = (String) obj;
            if (!str.contains(":")) {
                return;
            }
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String m38122p = m38122p();
            int identifier = m38121q(context, m38122p).getIdentifier(str4, str3, str5);
            if (this.f3357e != identifier) {
                Log.i("IconCompat", "Id has changed for " + m38122p + " " + str);
                this.f3357e = identifier;
            }
        }
    }

    /* renamed from: n */
    public Bitmap m38124n() {
        int i = this.f3353a;
        if (i == -1) {
            Object obj = this.f3354b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f3354b;
        } else {
            if (i == 5) {
                return m38133e((Bitmap) this.f3354b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: o */
    public int m38123o() {
        int i = this.f3353a;
        if (i == -1) {
            return C1009a.m38110b(this.f3354b);
        }
        if (i == 2) {
            return this.f3357e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: p */
    public String m38122p() {
        int i = this.f3353a;
        if (i == -1) {
            return C1009a.m38109c(this.f3354b);
        }
        if (i == 2) {
            String str = this.f3362j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f3362j;
            }
            return ((String) this.f3354b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: r */
    public int m38120r() {
        int i = this.f3353a;
        if (i == -1) {
            return C1009a.m38108d(this.f3354b);
        }
        return i;
    }

    /* renamed from: s */
    public Uri m38119s() {
        int i = this.f3353a;
        if (i == -1) {
            return C1009a.m38107e(this.f3354b);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f3354b);
    }

    /* renamed from: t */
    public InputStream m38118t(Context context) {
        Uri m38119s = m38119s();
        String scheme = m38119s.getScheme();
        if (!"content".equals(scheme) && !JSStackTrace.FILE_KEY.equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f3354b));
            } catch (FileNotFoundException e) {
                Log.w("IconCompat", "Unable to load image from path: " + m38119s, e);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(m38119s);
        } catch (Exception e2) {
            Log.w("IconCompat", "Unable to load image from URI: " + m38119s, e2);
            return null;
        }
    }

    public String toString() {
        if (this.f3353a == -1) {
            return String.valueOf(this.f3354b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m38138A(this.f3353a));
        switch (this.f3353a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f3354b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f3354b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f3362j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m38123o())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f3357e);
                if (this.f3358f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f3358f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f3354b);
                break;
        }
        if (this.f3359g != null) {
            sb2.append(" tint=");
            sb2.append(this.f3359g);
        }
        if (this.f3360h != f3352k) {
            sb2.append(" mode=");
            sb2.append(this.f3360h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: u */
    public Drawable m38117u(Context context) {
        m38137a(context);
        return C1009a.m38106f(m38112z(context), context);
    }

    /* renamed from: v */
    public void m38116v() {
        this.f3360h = PorterDuff.Mode.valueOf(this.f3361i);
        switch (this.f3353a) {
            case -1:
                Parcelable parcelable = this.f3356d;
                if (parcelable != null) {
                    this.f3354b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3356d;
                if (parcelable2 != null) {
                    this.f3354b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3355c;
                this.f3354b = bArr;
                this.f3353a = 3;
                this.f3357e = 0;
                this.f3358f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3355c, Charset.forName("UTF-16"));
                this.f3354b = str;
                if (this.f3353a == 2 && this.f3362j == null) {
                    this.f3362j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3354b = this.f3355c;
                return;
        }
    }

    /* renamed from: w */
    public void m38115w(boolean z) {
        this.f3361i = this.f3360h.name();
        switch (this.f3353a) {
            case -1:
                if (!z) {
                    this.f3356d = (Parcelable) this.f3354b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f3354b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3355c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f3356d = (Parcelable) this.f3354b;
                return;
            case 2:
                this.f3355c = ((String) this.f3354b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3355c = (byte[]) this.f3354b;
                return;
            case 4:
            case 6:
                this.f3355c = this.f3354b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* renamed from: x */
    public Bundle m38114x() {
        Bundle bundle = new Bundle();
        switch (this.f3353a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f3354b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f3354b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f3354b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f3354b);
                break;
        }
        bundle.putInt("type", this.f3353a);
        bundle.putInt("int1", this.f3357e);
        bundle.putInt("int2", this.f3358f);
        bundle.putString("string1", this.f3362j);
        ColorStateList colorStateList = this.f3359g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f3360h;
        if (mode != f3352k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    /* renamed from: y */
    public Icon m38113y() {
        return m38112z(null);
    }

    /* renamed from: z */
    public Icon m38112z(Context context) {
        return C1009a.m38105g(this, context);
    }

    IconCompat(int i) {
        this.f3355c = null;
        this.f3356d = null;
        this.f3357e = 0;
        this.f3358f = 0;
        this.f3359g = null;
        this.f3360h = f3352k;
        this.f3361i = null;
        this.f3353a = i;
    }
}
