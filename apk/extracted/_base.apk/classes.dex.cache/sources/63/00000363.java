package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class SharedElementCallback {

    /* renamed from: a */
    private Matrix f3197a;

    /* renamed from: androidx.core.app.SharedElementCallback$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0761a {
        void onSharedElementsReady();
    }

    /* renamed from: a */
    private static Bitmap m38696a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
            if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int i = (int) (intrinsicWidth * min);
            int i2 = (int) (intrinsicHeight * min);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect bounds = drawable.getBounds();
            int i3 = bounds.left;
            int i4 = bounds.top;
            int i5 = bounds.right;
            int i6 = bounds.bottom;
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            drawable.setBounds(i3, i4, i5, i6);
            return createBitmap;
        }
        return null;
    }

    /* renamed from: b */
    public Parcelable m38695b(View view, Matrix matrix, RectF rectF) {
        Bitmap m38696a;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (m38696a = m38696a(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("sharedElement:snapshot:bitmap", m38696a);
                bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                }
                return bundle;
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int i = (int) (round * min);
            int i2 = (int) (round2 * min);
            if (this.f3197a == null) {
                this.f3197a = new Matrix();
            }
            this.f3197a.set(matrix);
            this.f3197a.postTranslate(-rectF.left, -rectF.top);
            this.f3197a.postScale(min, min);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.concat(this.f3197a);
            view.draw(canvas);
            return createBitmap;
        }
        return null;
    }

    /* renamed from: c */
    public View m38694c(Context context, Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
                return imageView;
            }
            return imageView;
        } else if (!(parcelable instanceof Bitmap)) {
            return null;
        } else {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
    }

    /* renamed from: d */
    public void m38693d(List<String> list, Map<String, View> map) {
    }

    /* renamed from: e */
    public void m38692e(List<View> list) {
    }

    /* renamed from: f */
    public void m38691f(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: g */
    public void m38690g(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: h */
    public void m38689h(List<String> list, List<View> list2, InterfaceC0761a interfaceC0761a) {
        interfaceC0761a.onSharedElementsReady();
    }
}