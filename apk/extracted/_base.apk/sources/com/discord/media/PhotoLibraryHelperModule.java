package com.discord.media;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.discord.media.react.events.PhotoLibraryChangedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u000bH\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/media/PhotoLibraryHelperModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "listener", "com/discord/media/PhotoLibraryHelperModule$listener$1", "Lcom/discord/media/PhotoLibraryHelperModule$listener$1;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "doesAttachmentExist", "uri", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getName", "register", "registerEventListener", "removeEventListener", "removeListeners", "count", "", "unregister", "Companion", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class PhotoLibraryHelperModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String PHOTO_LIBRARY_CHANGED = "photoLibraryChanged";
    private final PhotoLibraryHelperModule$listener$1 listener;
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/media/PhotoLibraryHelperModule$Companion;", "", "()V", "PHOTO_LIBRARY_CHANGED", "", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.discord.media.PhotoLibraryHelperModule$listener$1] */
    public PhotoLibraryHelperModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(C11591x.m7577a(PHOTO_LIBRARY_CHANGED, C9591f0.m13969b(PhotoLibraryChangedEvent.class)));
        final Handler handler = new Handler(Looper.getMainLooper());
        this.listener = new ContentObserver(handler) { // from class: com.discord.media.PhotoLibraryHelperModule$listener$1
            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                ReactEvents reactEvents;
                ReactApplicationContext reactApplicationContext;
                super.onChange(z, uri);
                reactEvents = PhotoLibraryHelperModule.this.reactEvents;
                reactApplicationContext = PhotoLibraryHelperModule.this.reactContext;
                reactEvents.emitModuleEvent(reactApplicationContext, new PhotoLibraryChangedEvent());
            }
        };
    }

    private final void register() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.reactContext.getContentResolver().registerContentObserver(MediaStore.Files.getContentUri("external"), true, this.listener);
            return;
        }
        this.reactContext.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.listener);
        this.reactContext.getContentResolver().registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.listener);
    }

    private final void unregister() {
        this.reactContext.getContentResolver().unregisterContentObserver(this.listener);
    }

    @ReactMethod
    public final void addListener(String type) {
        C9612q.m13917h(type, "type");
        if (C9612q.m13922c(type, PHOTO_LIBRARY_CHANGED)) {
            register();
        }
    }

    @ReactMethod
    public final void doesAttachmentExist(String uri, Promise promise) {
        int i;
        C9612q.m13917h(uri, "uri");
        C9612q.m13917h(promise, "promise");
        Cursor query = this.reactContext.getContentResolver().query(Uri.parse(uri), new String[]{"_id"}, null, null, null, null);
        boolean z = false;
        if (query != null) {
            i = query.getCount();
        } else {
            i = 0;
        }
        if (i > 0) {
            z = true;
        }
        promise.resolve(Boolean.valueOf(z));
        if (query != null) {
            query.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PhotoLibraryHelper";
    }

    @ReactMethod
    public final void registerEventListener(String type) {
        C9612q.m13917h(type, "type");
        if (C9612q.m13922c(type, PHOTO_LIBRARY_CHANGED)) {
            register();
        }
    }

    @ReactMethod
    public final void removeEventListener(String type) {
        C9612q.m13917h(type, "type");
        if (C9612q.m13922c(type, PHOTO_LIBRARY_CHANGED)) {
            unregister();
        }
    }

    @ReactMethod
    public final void removeListeners(int i) {
        removeEventListener(PHOTO_LIBRARY_CHANGED);
    }
}
