package com.discord.image.dominant_color;

import com.discord.image.fresco.FrescoFetchDecodedImageKt;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0016¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/image/dominant_color/ImageManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getAvatarBase64", "", "imageSource", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getDominantColors", "uri", "", "getDominantColorsLocalAsset", "getName", "dominant_color_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ImageManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    @ReactMethod
    public final void getAvatarBase64(ReadableMap imageSource, Promise promise) {
        C9612q.m13917h(imageSource, "imageSource");
        C9612q.m13917h(promise, "promise");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        FrescoFetchDecodedImageKt.fetchDecodedImage$default(reactApplicationContext, imageSource.getString("uri"), (PostProcessor) null, new ImageManagerModule$getAvatarBase64$1(promise), 2, (Object) null);
    }

    @ReactMethod
    public final void getDominantColors(ReadableMap imageSource, Promise promise) {
        C9612q.m13917h(imageSource, "imageSource");
        C9612q.m13917h(promise, "promise");
        getDominantColors(imageSource.getString("uri"), promise);
    }

    @ReactMethod
    public final void getDominantColorsLocalAsset(ReadableMap imageSource, Promise promise) {
        C9612q.m13917h(imageSource, "imageSource");
        C9612q.m13917h(promise, "promise");
        getDominantColors(imageSource.getString("uri"), promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageManager";
    }

    private final void getDominantColors(String str, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        FrescoFetchDecodedImageKt.fetchDecodedImage$default(reactApplicationContext, str, (PostProcessor) null, new ImageManagerModule$getDominantColors$1(promise), 2, (Object) null);
    }
}
