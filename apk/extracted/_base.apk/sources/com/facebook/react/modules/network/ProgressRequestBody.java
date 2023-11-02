package com.facebook.react.modules.network;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Sink;
import p122gk.C6840m;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ProgressRequestBody extends RequestBody {
    private long mContentLength = 0;
    private final ProgressListener mProgressListener;
    private final RequestBody mRequestBody;

    public ProgressRequestBody(RequestBody requestBody, ProgressListener progressListener) {
        this.mRequestBody = requestBody;
        this.mProgressListener = progressListener;
    }

    private Sink outputStreamSink(BufferedSink bufferedSink) {
        return C6840m.m21825h(new CountingOutputStream(bufferedSink.mo8600x0()) { // from class: com.facebook.react.modules.network.ProgressRequestBody.1
            private void sendProgressUpdate() {
                boolean z;
                long count = getCount();
                long contentLength = ProgressRequestBody.this.contentLength();
                ProgressListener progressListener = ProgressRequestBody.this.mProgressListener;
                if (count == contentLength) {
                    z = true;
                } else {
                    z = false;
                }
                progressListener.onProgress(count, contentLength, z);
            }

            @Override // com.facebook.react.modules.network.CountingOutputStream, java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                super.write(bArr, i, i2);
                sendProgressUpdate();
            }

            @Override // com.facebook.react.modules.network.CountingOutputStream, java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                super.write(i);
                sendProgressUpdate();
            }
        });
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.mContentLength == 0) {
            this.mContentLength = this.mRequestBody.contentLength();
        }
        return this.mContentLength;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.mRequestBody.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) {
        BufferedSink m21830c = C6840m.m21830c(outputStreamSink(bufferedSink));
        contentLength();
        this.mRequestBody.writeTo(m21830c);
        m21830c.flush();
    }
}
