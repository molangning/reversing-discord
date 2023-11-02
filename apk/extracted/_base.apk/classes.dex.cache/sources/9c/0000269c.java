package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.UiThreadUtil;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeViewMeasurer {
    public static final String TAG = "NativeViewMeasurer";
    private final ViewProvider viewProvider;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ViewProvider {
        View provideView(int i);
    }

    public NativeViewMeasurer(ViewProvider viewProvider) {
        this.viewProvider = viewProvider;
    }

    private void computeBoundingBox(View view, int[] iArr) {
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, rectF);
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
        iArr[4] = Math.round(view.getLeft());
        iArr[5] = Math.round(view.getTop());
    }

    private void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public int[] measure(int i) {
        UiThreadUtil.assertOnUiThread();
        int[] iArr = {0, 0, 0, 0, 0, 0};
        View provideView = this.viewProvider.provideView(i);
        if (provideView == null) {
            C13677a.m1870H(TAG, "measure: No native view for " + i + " currently exists");
            return iArr;
        }
        View view = (View) RootViewUtil.getRootView(provideView);
        if (view == null) {
            C13677a.m1870H(TAG, "measure: Native view " + i + " is no longer on screen");
            return iArr;
        }
        computeBoundingBox(view, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        computeBoundingBox(provideView, iArr);
        iArr[0] = iArr[0] - i2;
        iArr[1] = iArr[1] - i3;
        return iArr;
    }

    public int[] measureInWindow(int i) {
        UiThreadUtil.assertOnUiThread();
        View provideView = this.viewProvider.provideView(i);
        int[] iArr = {0, 0, 0, 0};
        if (provideView == null) {
            C13677a.m1870H(TAG, "measureInWindow: No native view for " + i + " currently exists");
            return iArr;
        }
        int[] iArr2 = new int[2];
        provideView.getLocationOnScreen(iArr2);
        Rect rect = new Rect();
        provideView.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr2[0] - rect.left;
        iArr[1] = iArr2[1] - rect.top;
        iArr[2] = provideView.getWidth();
        iArr[3] = provideView.getHeight();
        return iArr;
    }
}