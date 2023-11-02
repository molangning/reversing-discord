package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.TextInlineImageSpan;
import java.util.Locale;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FrescoBasedReactTextInlineImageShadowNode extends ReactTextInlineImageShadowNode {
    private final Object mCallerContext;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private ReadableMap mHeaders;
    private String mResizeMode;
    private Uri mUri;
    private float mWidth = Float.NaN;
    private float mHeight = Float.NaN;
    private int mTintColor = 0;

    public FrescoBasedReactTextInlineImageShadowNode(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    private static Uri getResourceDrawableUri(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
        }
        return null;
    }

    @Override // com.facebook.react.views.text.ReactTextInlineImageShadowNode
    public TextInlineImageSpan buildInlineImageSpan() {
        return new FrescoBasedReactTextInlineImageSpan(getThemedContext().getResources(), (int) Math.ceil(this.mHeight), (int) Math.ceil(this.mWidth), this.mTintColor, getUri(), getHeaders(), getDraweeControllerBuilder(), getCallerContext(), this.mResizeMode);
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        return this.mDraweeControllerBuilder;
    }

    public ReadableMap getHeaders() {
        return this.mHeaders;
    }

    public Uri getUri() {
        return this.mUri;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return true;
    }

    @ReactProp(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.mHeight = (float) dynamic.asDouble();
            return;
        }
        C13677a.m1870H(ReactConstants.TAG, "Inline images must not have percentage based height");
        this.mHeight = Float.NaN;
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(String str) {
        this.mResizeMode = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r1.getScheme() == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "src")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSource(com.facebook.react.bridge.ReadableArray r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L16
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L16
        La:
            r1 = 0
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L17
        L16:
            r4 = r0
        L17:
            if (r4 == 0) goto L2f
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Exception -> L24
            if (r2 != 0) goto L24
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != 0) goto L2f
            com.facebook.react.uimanager.ThemedReactContext r0 = r3.getThemedContext()
            android.net.Uri r0 = getResourceDrawableUri(r0, r4)
        L2f:
            android.net.Uri r4 = r3.mUri
            if (r0 == r4) goto L36
            r3.markUpdated()
        L36:
            r3.mUri = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageShadowNode.setSource(com.facebook.react.bridge.ReadableArray):void");
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(int i) {
        this.mTintColor = i;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.mWidth = (float) dynamic.asDouble();
            return;
        }
        C13677a.m1870H(ReactConstants.TAG, "Inline images must not have percentage based width");
        this.mWidth = Float.NaN;
    }
}
