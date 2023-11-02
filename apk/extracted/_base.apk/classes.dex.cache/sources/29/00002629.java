package com.facebook.react.modules.network;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import p122gk.AbstractC6833g;
import p122gk.C6840m;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ProgressResponseBody extends ResponseBody {
    private BufferedSource mBufferedSource;
    private final ProgressListener mProgressListener;
    private final ResponseBody mResponseBody;
    private long mTotalBytesRead = 0;

    public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
        this.mResponseBody = responseBody;
        this.mProgressListener = progressListener;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        if (this.mBufferedSource == null) {
            this.mBufferedSource = C6840m.m21829d(source(this.mResponseBody.source()));
        }
        return this.mBufferedSource;
    }

    public long totalBytesRead() {
        return this.mTotalBytesRead;
    }

    private Source source(Source source) {
        return new AbstractC6833g(source) { // from class: com.facebook.react.modules.network.ProgressResponseBody.1
            @Override // p122gk.AbstractC6833g, okio.Source
            public long read(Buffer buffer, long j) {
                long j2;
                boolean z;
                long read = super.read(buffer, j);
                ProgressResponseBody progressResponseBody = ProgressResponseBody.this;
                long j3 = progressResponseBody.mTotalBytesRead;
                int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
                if (i != 0) {
                    j2 = read;
                } else {
                    j2 = 0;
                }
                progressResponseBody.mTotalBytesRead = j3 + j2;
                ProgressListener progressListener = ProgressResponseBody.this.mProgressListener;
                long j4 = ProgressResponseBody.this.mTotalBytesRead;
                long contentLength = ProgressResponseBody.this.mResponseBody.contentLength();
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                progressListener.onProgress(j4, contentLength, z);
                return read;
            }
        };
    }
}