package com.discord.media.react;

import com.discord.media.utils.ContentResolverMedia;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0004H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/media/react/GetPhotosData;", "", "edges", "", "Lcom/discord/media/utils/ContentResolverMedia;", "(Ljava/util/List;)V", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "Companion", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class GetPhotosData {
    public static final Companion Companion = new Companion(null);
    public static final String FAILED_TO_LOAD = "E_UNABLE_TO_LOAD";
    private final List<ContentResolverMedia> edges;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/media/react/GetPhotosData$Companion;", "", "()V", "FAILED_TO_LOAD", "", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GetPhotosData(List<ContentResolverMedia> edges) {
        C9612q.m13917h(edges, "edges");
        this.edges = edges;
    }

    public final WritableNativeMap toNativeMap() {
        int m14093t;
        Pair[] pairArr = new Pair[1];
        List<ContentResolverMedia> list = this.edges;
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("node", toNativeMap((ContentResolverMedia) it.next()))));
        }
        pairArr[0] = C11591x.m7577a("edges", NativeArrayExtensionsKt.toNativeArray(arrayList));
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }

    private final WritableNativeMap toNativeMap(ContentResolverMedia contentResolverMedia) {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("type", String.valueOf(contentResolverMedia.getMediaType())), C11591x.m7577a("image", NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("uri", String.valueOf(contentResolverMedia.getUri())), C11591x.m7577a("mimeType", contentResolverMedia.getMimeType()), C11591x.m7577a("filename", contentResolverMedia.getName()), C11591x.m7577a("width", Integer.valueOf(contentResolverMedia.getWidth())), C11591x.m7577a("height", Integer.valueOf(contentResolverMedia.getHeight())), C11591x.m7577a("playableDuration", Integer.valueOf(contentResolverMedia.getDuration())))));
    }
}
