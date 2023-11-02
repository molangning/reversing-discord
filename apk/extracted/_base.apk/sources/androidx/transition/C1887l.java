package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: androidx.transition.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1887l {

    /* renamed from: a */
    private static final boolean f5199a;

    /* renamed from: b */
    private static final boolean f5200b;

    /* renamed from: c */
    private static final boolean f5201c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f5199a = true;
        f5200b = true;
        if (i < 28) {
            z = false;
        }
        f5201c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static View m35111a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        C1895t.m35093i(view, matrix);
        C1895t.m35092j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap m35110b = m35110b(view, matrix, rectF, viewGroup);
        if (m35110b != null) {
            imageView.setImageBitmap(m35110b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* renamed from: b */
    private static Bitmap m35110b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        boolean z2;
        int i;
        ViewGroup viewGroup2;
        if (f5199a) {
            z = !view.isAttachedToWindow();
            if (viewGroup == null) {
                z2 = false;
            } else {
                z2 = viewGroup.isAttachedToWindow();
            }
        } else {
            z = false;
            z2 = false;
        }
        boolean z3 = f5200b;
        Bitmap bitmap = null;
        if (z3 && z) {
            if (!z2) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            i = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        } else {
            i = 0;
            viewGroup2 = null;
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f5201c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z3 && z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Animator m35109c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
