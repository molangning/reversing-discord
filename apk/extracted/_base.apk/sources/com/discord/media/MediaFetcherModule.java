package com.discord.media;

import com.discord.media.react.GetPhotosData;
import com.discord.media.utils.ContentResolverMedia;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p340sf.C12466c;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/media/MediaFetcherModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getPhotos", "", "params", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getQueryType", "Lcom/discord/media/utils/ContentResolverMedia$QueryType;", "filter", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaFetcherModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaFetcherModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    private final ContentResolverMedia.QueryType getQueryType(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -989034367) {
                if (hashCode != -816678056) {
                    if (hashCode == 65921 && str.equals("All")) {
                        return ContentResolverMedia.QueryType.ALL;
                    }
                } else if (str.equals("videos")) {
                    return ContentResolverMedia.QueryType.VIDEO;
                }
            } else if (str.equals("photos")) {
                return ContentResolverMedia.QueryType.IMAGE;
            }
        }
        throw new IllegalArgumentException("Unknown filter type: " + str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraRollUtils";
    }

    @ReactMethod
    public final void getPhotos(ReadableMap params, Promise promise) {
        Integer num;
        List m14028v0;
        List m14027w0;
        WritableNativeMap nativeMapOf;
        Object m14056T;
        Object m14044f0;
        C9612q.m13917h(params, "params");
        C9612q.m13917h(promise, "promise");
        int i = params.getInt("first");
        if (params.hasKey("offset")) {
            num = Integer.valueOf(params.getInt("offset"));
        } else {
            num = null;
        }
        ContentResolverMedia.QueryType queryType = getQueryType(params.getString("assetType"));
        try {
            ContentResolverMedia.Companion companion = ContentResolverMedia.Companion;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
            m14028v0 = C9553r.m14028v0(companion.getMedia(reactApplicationContext, queryType, i, num), new Comparator() { // from class: com.discord.media.MediaFetcherModule$getPhotos$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int m5209d;
                    m5209d = C12466c.m5209d(Integer.valueOf(((ContentResolverMedia) t2).getDateAdded()), Integer.valueOf(((ContentResolverMedia) t).getDateAdded()));
                    return m5209d;
                }
            });
            m14027w0 = C9553r.m14027w0(m14028v0, i);
            if (m14027w0.size() == i) {
                m14056T = C9553r.m14056T(m14027w0);
                m14044f0 = C9553r.m14044f0(m14027w0);
                nativeMapOf = NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("start_cursor", String.valueOf(((ContentResolverMedia) m14056T).getUri())), C11591x.m7577a("end_cursor", String.valueOf(((ContentResolverMedia) m14044f0).getUri())), C11591x.m7577a("has_next_page", Boolean.TRUE));
            } else {
                nativeMapOf = NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("has_next_page", Boolean.FALSE));
            }
            WritableNativeMap nativeMap = new GetPhotosData(m14027w0).toNativeMap();
            nativeMap.putMap("page_info", nativeMapOf);
            promise.resolve(nativeMap);
        } catch (Exception e) {
            promise.reject(GetPhotosData.FAILED_TO_LOAD, e);
        }
    }
}
