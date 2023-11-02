package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractC3574b;
import com.facebook.datasource.DataSource;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.views.image.ReactCallerContextFactory;
import com.facebook.react.views.imagehelper.ImageSource;
import p208l3.C10035c;
import p359u2.C12818a;
import p380v4.AbstractC13063c;

@ReactModule(name = NativeImageLoaderAndroidSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    private final Object mCallerContext;
    private ReactCallerContextFactory mCallerContextFactory;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<DataSource<Void>> mEnqueuedRequests;
    private ImagePipeline mImagePipeline;

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContext = this;
    }

    private Object getCallerContext() {
        ReactCallerContextFactory reactCallerContextFactory = this.mCallerContextFactory;
        if (reactCallerContextFactory != null) {
            return reactCallerContextFactory.getOrCreateCallerContext("", "");
        }
        return this.mCallerContext;
    }

    public ImagePipeline getImagePipeline() {
        ImagePipeline imagePipeline = this.mImagePipeline;
        return imagePipeline != null ? imagePipeline : C10035c.m12512a();
    }

    private void registerRequest(int i, DataSource<Void> dataSource) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, dataSource);
        }
    }

    public DataSource<Void> removeRequest(int i) {
        DataSource<Void> dataSource;
        synchronized (this.mEnqueuedRequestMonitor) {
            dataSource = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return dataSource;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double d) {
        DataSource<Void> removeRequest = removeRequest((int) d);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String str, final Promise promise) {
        if (str != null && !str.isEmpty()) {
            getImagePipeline().m31179d(ImageRequestBuilder.m30567s(new ImageSource(getReactApplicationContext(), str).getUri()).m30585a(), getCallerContext()).mo31710d(new AbstractC3574b<CloseableReference<AbstractC13063c>>() { // from class: com.facebook.react.modules.image.ImageLoaderModule.1
                @Override // com.facebook.datasource.AbstractC3574b
                protected void onFailureImpl(DataSource<CloseableReference<AbstractC13063c>> dataSource) {
                    promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.mo31711c());
                }

                @Override // com.facebook.datasource.AbstractC3574b
                protected void onNewResultImpl(DataSource<CloseableReference<AbstractC13063c>> dataSource) {
                    if (!dataSource.mo31712a()) {
                        return;
                    }
                    CloseableReference<AbstractC13063c> mo31018g = dataSource.mo31018g();
                    try {
                        if (mo31018g != null) {
                            try {
                                AbstractC13063c m31730D = mo31018g.m31730D();
                                WritableMap createMap = Arguments.createMap();
                                createMap.putInt("width", m31730D.getWidth());
                                createMap.putInt("height", m31730D.getHeight());
                                promise.resolve(createMap);
                            } catch (Exception e) {
                                promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e);
                            }
                            return;
                        }
                        promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                    } finally {
                        CloseableReference.m31715v(mo31018g);
                    }
                }
            }, C12818a.m3873a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, final Promise promise) {
        if (str != null && !str.isEmpty()) {
            getImagePipeline().m31179d(ReactNetworkImageRequest.fromBuilderWithHeaders(ImageRequestBuilder.m30567s(new ImageSource(getReactApplicationContext(), str).getUri()), readableMap), getCallerContext()).mo31710d(new AbstractC3574b<CloseableReference<AbstractC13063c>>() { // from class: com.facebook.react.modules.image.ImageLoaderModule.2
                @Override // com.facebook.datasource.AbstractC3574b
                protected void onFailureImpl(DataSource<CloseableReference<AbstractC13063c>> dataSource) {
                    promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.mo31711c());
                }

                @Override // com.facebook.datasource.AbstractC3574b
                protected void onNewResultImpl(DataSource<CloseableReference<AbstractC13063c>> dataSource) {
                    if (!dataSource.mo31712a()) {
                        return;
                    }
                    CloseableReference<AbstractC13063c> mo31018g = dataSource.mo31018g();
                    try {
                        if (mo31018g != null) {
                            try {
                                AbstractC13063c m31730D = mo31018g.m31730D();
                                WritableMap createMap = Arguments.createMap();
                                createMap.putInt("width", m31730D.getWidth());
                                createMap.putInt("height", m31730D.getHeight());
                                promise.resolve(createMap);
                            } catch (Exception e) {
                                promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e);
                            }
                            return;
                        }
                        promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                    } finally {
                        CloseableReference.m31715v(mo31018g);
                    }
                }
            }, C12818a.m3873a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                DataSource<Void> valueAt = this.mEnqueuedRequests.valueAt(i);
                if (valueAt != null) {
                    valueAt.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String str, double d, final Promise promise) {
        final int i = (int) d;
        if (str != null && !str.isEmpty()) {
            DataSource<Void> m31164s = getImagePipeline().m31164s(ImageRequestBuilder.m30567s(Uri.parse(str)).m30585a(), getCallerContext());
            AbstractC3574b<Void> abstractC3574b = new AbstractC3574b<Void>() { // from class: com.facebook.react.modules.image.ImageLoaderModule.3
                @Override // com.facebook.datasource.AbstractC3574b
                protected void onFailureImpl(DataSource<Void> dataSource) {
                    try {
                        ImageLoaderModule.this.removeRequest(i);
                        promise.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, dataSource.mo31711c());
                    } finally {
                        dataSource.close();
                    }
                }

                @Override // com.facebook.datasource.AbstractC3574b
                protected void onNewResultImpl(DataSource<Void> dataSource) {
                    try {
                        if (!dataSource.mo31712a()) {
                            return;
                        }
                        try {
                            ImageLoaderModule.this.removeRequest(i);
                            promise.resolve(Boolean.TRUE);
                        } catch (Exception e) {
                            promise.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, e);
                        }
                    } finally {
                        dataSource.close();
                    }
                }
            };
            registerRequest(i, m31164s);
            m31164s.mo31710d(abstractC3574b, C12818a.m3873a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(final ReadableArray readableArray, final Promise promise) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.image.ImageLoaderModule.4
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap createMap = Arguments.createMap();
                ImagePipeline imagePipeline = ImageLoaderModule.this.getImagePipeline();
                for (int i = 0; i < readableArray.size(); i++) {
                    String string = readableArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        Uri parse = Uri.parse(string);
                        if (imagePipeline.m31170m(parse)) {
                            createMap.putString(string, "memory");
                        } else if (imagePipeline.m31168o(parse)) {
                            createMap.putString(string, "disk");
                        }
                    }
                }
                promise.resolve(createMap);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContext = obj;
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, ReactCallerContextFactory reactCallerContextFactory) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContextFactory = reactCallerContextFactory;
        this.mImagePipeline = imagePipeline;
        this.mCallerContext = null;
    }
}