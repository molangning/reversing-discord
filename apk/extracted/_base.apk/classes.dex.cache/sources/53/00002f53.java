package com.shopify.reactnative.skia;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ViewScreenshotService {
    private static final long SURFACE_VIEW_READ_PIXELS_TIMEOUT = 5;
    private static final String TAG = "SkiaScreenshot";

    public static Matrix applyTransformations(Canvas canvas, View view, View view2) {
        int i;
        Matrix matrix = new Matrix();
        LinkedList linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            View view4 = (View) it.next();
            canvas.save();
            int left = view4.getLeft();
            int i2 = 0;
            if (view4 != view2) {
                i = view4.getPaddingLeft();
            } else {
                i = 0;
            }
            float translationX = left + i + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                i2 = view4.getPaddingTop();
            }
            float translationY = top + i2 + view4.getTranslationY();
            canvas.translate(translationX, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(translationX, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    private static List<View> getAllChildren(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList2.addAll(getAllChildren(viewGroup.getChildAt(i)));
        }
        return arrayList2;
    }

    public static Bitmap makeViewScreenshotFromTag(ReactContext reactContext, int i) {
        final View resolveView = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).resolveView(i);
        if (resolveView != null) {
            int width = resolveView.getWidth();
            int height = resolveView.getHeight();
            if (width > 0 && height > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                final Paint paint = new Paint();
                int i2 = 1;
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                final Canvas canvas = new Canvas(createBitmap);
                resolveView.draw(canvas);
                for (final View view : getAllChildren(resolveView)) {
                    if (view instanceof TextureView) {
                        if (view.getVisibility() == 0) {
                            TextureView textureView = (TextureView) view;
                            textureView.setOpaque(false);
                            Bitmap bitmap = textureView.getBitmap(Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888));
                            int save = canvas.save();
                            applyTransformations(canvas, resolveView, view);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            canvas.restoreToCount(save);
                        }
                    } else if (view instanceof SurfaceView) {
                        SurfaceView surfaceView = (SurfaceView) view;
                        final CountDownLatch countDownLatch = new CountDownLatch(i2);
                        if (Build.VERSION.SDK_INT >= 24) {
                            final Bitmap createBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                            try {
                                PixelCopy.request(surfaceView, createBitmap2, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.shopify.reactnative.skia.ViewScreenshotService.1
                                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                    public void onPixelCopyFinished(int i3) {
                                        int save2 = canvas.save();
                                        ViewScreenshotService.applyTransformations(canvas, resolveView, view);
                                        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
                                        canvas.restoreToCount(save2);
                                        countDownLatch.countDown();
                                    }
                                }, new Handler(Looper.getMainLooper()));
                                countDownLatch.await(SURFACE_VIEW_READ_PIXELS_TIMEOUT, TimeUnit.SECONDS);
                            } catch (Exception e) {
                                Log.e(TAG, "Cannot PixelCopy for " + surfaceView, e);
                            }
                        } else if (surfaceView.getDrawingCache() != null) {
                            canvas.drawBitmap(surfaceView.getDrawingCache(), 0.0f, 0.0f, paint);
                        }
                    }
                    i2 = 1;
                }
                return createBitmap;
            }
            return null;
        }
        throw new RuntimeException("Could not resolve view from view tag " + i);
    }
}