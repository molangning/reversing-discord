package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC1023h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0548p {

    /* renamed from: c */
    private static final int[] f1903c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1904a;

    /* renamed from: b */
    private Bitmap f1905b;

    /* renamed from: androidx.appcompat.widget.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0549a {
        /* renamed from: a */
        public static void m39771a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public C0548p(ProgressBar progressBar) {
        this.f1904a = progressBar;
    }

    /* renamed from: a */
    private Shape m39775a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: e */
    private Drawable m39772e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable m39773d = m39773d(animationDrawable.getFrame(i), true);
                m39773d.setLevel(10000);
                animationDrawable2.addFrame(m39773d, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* renamed from: b */
    public Bitmap m39774b() {
        return this.f1905b;
    }

    /* renamed from: c */
    public void mo39666c(AttributeSet attributeSet, int i) {
        C0544n1 m39780v = C0544n1.m39780v(this.f1904a.getContext(), attributeSet, f1903c, i, 0);
        Drawable m39794h = m39780v.m39794h(0);
        if (m39794h != null) {
            this.f1904a.setIndeterminateDrawable(m39772e(m39794h));
        }
        Drawable m39794h2 = m39780v.m39794h(1);
        if (m39794h2 != null) {
            this.f1904a.setProgressDrawable(m39773d(m39794h2, false));
        }
        m39780v.m39779w();
    }

    /* renamed from: d */
    Drawable m39773d(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof InterfaceC1023h) {
            InterfaceC1023h interfaceC1023h = (InterfaceC1023h) drawable;
            Drawable m38057a = interfaceC1023h.m38057a();
            if (m38057a != null) {
                interfaceC1023h.m38056b(m39773d(m38057a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id2 = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id2 != 16908301 && id2 != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = m39773d(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                C0549a.m39771a(layerDrawable, layerDrawable2, i2);
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1905b == null) {
                this.f1905b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m39775a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}