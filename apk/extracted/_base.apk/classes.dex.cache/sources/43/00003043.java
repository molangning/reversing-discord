package com.yalantis.ucrop.task;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import p110g0.C6509a;
import p354te.C12669b;
import p354te.C12670c;
import p354te.C12671d;
import se.InterfaceC12460a;
import ve.C13260e;
import ve.C13261f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    private Bitmap f15908a;

    /* renamed from: b */
    private final RectF f15909b;

    /* renamed from: c */
    private final RectF f15910c;

    /* renamed from: d */
    private float f15911d;

    /* renamed from: e */
    private float f15912e;

    /* renamed from: f */
    private final int f15913f;

    /* renamed from: g */
    private final int f15914g;

    /* renamed from: h */
    private final Bitmap.CompressFormat f15915h;

    /* renamed from: i */
    private final int f15916i;

    /* renamed from: j */
    private final String f15917j;

    /* renamed from: k */
    private final String f15918k;

    /* renamed from: l */
    private final C12670c f15919l;

    /* renamed from: m */
    private final InterfaceC12460a f15920m;

    /* renamed from: n */
    private int f15921n;

    /* renamed from: o */
    private int f15922o;

    /* renamed from: p */
    private int f15923p;

    /* renamed from: q */
    private int f15924q;

    static {
        System.loadLibrary("ucrop");
    }

    public BitmapCropTask(Bitmap bitmap, C12671d c12671d, C12669b c12669b, InterfaceC12460a interfaceC12460a) {
        this.f15908a = bitmap;
        this.f15909b = c12671d.m4556a();
        this.f15910c = c12671d.m4554c();
        this.f15911d = c12671d.m4553d();
        this.f15912e = c12671d.m4555b();
        this.f15913f = c12669b.m4560f();
        this.f15914g = c12669b.m4559g();
        this.f15915h = c12669b.m4565a();
        this.f15916i = c12669b.m4564b();
        this.f15917j = c12669b.m4562d();
        this.f15918k = c12669b.m4561e();
        this.f15919l = c12669b.m4563c();
        this.f15920m = interfaceC12460a;
    }

    /* renamed from: a */
    private boolean m24691a(float f) {
        C6509a c6509a = new C6509a(this.f15917j);
        this.f15923p = Math.round((this.f15909b.left - this.f15910c.left) / this.f15911d);
        this.f15924q = Math.round((this.f15909b.top - this.f15910c.top) / this.f15911d);
        this.f15921n = Math.round(this.f15909b.width() / this.f15911d);
        int round = Math.round(this.f15909b.height() / this.f15911d);
        this.f15922o = round;
        boolean m24687e = m24687e(this.f15921n, round);
        Log.i("BitmapCropTask", "Should crop: " + m24687e);
        if (m24687e) {
            boolean cropCImg = cropCImg(this.f15917j, this.f15918k, this.f15923p, this.f15924q, this.f15921n, this.f15922o, this.f15912e, f, this.f15915h.ordinal(), this.f15916i, this.f15919l.m4558a(), this.f15919l.m4557b());
            if (cropCImg && this.f15915h.equals(Bitmap.CompressFormat.JPEG)) {
                C13261f.m2900b(c6509a, this.f15921n, this.f15922o, this.f15918k);
            }
            return cropCImg;
        }
        C13260e.m2902a(this.f15917j, this.f15918k);
        return false;
    }

    public static native boolean cropCImg(String str, String str2, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8);

    /* renamed from: d */
    private float m24688d() {
        int i;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.f15917j, options);
        if (this.f15919l.m4558a() != 90 && this.f15919l.m4558a() != 270) {
            z = false;
        }
        if (z) {
            i = options.outHeight;
        } else {
            i = options.outWidth;
        }
        float width = i / this.f15908a.getWidth();
        if (z) {
            i2 = options.outWidth;
        } else {
            i2 = options.outHeight;
        }
        this.f15911d /= Math.min(width, i2 / this.f15908a.getHeight());
        if (this.f15913f > 0 && this.f15914g > 0) {
            float width2 = this.f15909b.width() / this.f15911d;
            float height = this.f15909b.height() / this.f15911d;
            int i3 = this.f15913f;
            if (width2 > i3 || height > this.f15914g) {
                float min = Math.min(i3 / width2, this.f15914g / height);
                this.f15911d /= min;
                return min;
            }
        }
        return 1.0f;
    }

    /* renamed from: e */
    private boolean m24687e(int i, int i2) {
        int round = Math.round(Math.max(i, i2) / 1000.0f) + 1;
        if (this.f15913f > 0 && this.f15914g > 0) {
            return true;
        }
        float f = round;
        if (Math.abs(this.f15909b.left - this.f15910c.left) > f || Math.abs(this.f15909b.top - this.f15910c.top) > f || Math.abs(this.f15909b.bottom - this.f15910c.bottom) > f || Math.abs(this.f15909b.right - this.f15910c.right) > f || this.f15912e != 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.os.AsyncTask
    /* renamed from: b */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f15908a;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f15910c.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            m24691a(m24688d());
            this.f15908a = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(Throwable th2) {
        InterfaceC12460a interfaceC12460a = this.f15920m;
        if (interfaceC12460a != null) {
            if (th2 == null) {
                this.f15920m.mo5220a(Uri.fromFile(new File(this.f15918k)), this.f15923p, this.f15924q, this.f15921n, this.f15922o);
                return;
            }
            interfaceC12460a.mo5219b(th2);
        }
    }
}