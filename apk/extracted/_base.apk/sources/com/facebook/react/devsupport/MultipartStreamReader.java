package com.facebook.react.devsupport;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MultipartStreamReader {
    private static final String CRLF = "\r\n";
    private final String mBoundary;
    private long mLastProgressEvent;
    private final BufferedSource mSource;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ChunkListener {
        void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z);

        void onChunkProgress(Map<String, String> map, long j, long j2);
    }

    public MultipartStreamReader(BufferedSource bufferedSource, String str) {
        this.mSource = bufferedSource;
        this.mBoundary = str;
    }

    private void emitChunk(Buffer buffer, boolean z, ChunkListener chunkListener) {
        ByteString m8568e = ByteString.m8568e("\r\n\r\n");
        long mo8582w = buffer.mo8582w(m8568e);
        if (mo8582w == -1) {
            chunkListener.onChunkComplete(null, buffer, z);
            return;
        }
        Buffer buffer2 = new Buffer();
        Buffer buffer3 = new Buffer();
        buffer.read(buffer2, mo8582w);
        buffer.skip(m8568e.m8551z());
        buffer.mo8583u0(buffer3);
        chunkListener.onChunkComplete(parseHeaders(buffer2), buffer3, z);
    }

    private void emitProgress(Map<String, String> map, long j, boolean z, ChunkListener chunkListener) {
        long j2;
        if (map != null && chunkListener != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastProgressEvent > 16 || z) {
                this.mLastProgressEvent = currentTimeMillis;
                if (map.get("Content-Length") != null) {
                    j2 = Long.parseLong(map.get("Content-Length"));
                } else {
                    j2 = 0;
                }
                chunkListener.onChunkProgress(map, j, j2);
            }
        }
    }

    private Map<String, String> parseHeaders(Buffer buffer) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str : buffer.mo8584p0().split(CRLF)) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                hashMap.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        }
        return hashMap;
    }

    public boolean readAllParts(ChunkListener chunkListener) {
        boolean z;
        long j;
        ByteString m8568e = ByteString.m8568e("\r\n--" + this.mBoundary + CRLF);
        ByteString m8568e2 = ByteString.m8568e("\r\n--" + this.mBoundary + "--" + CRLF);
        ByteString m8568e3 = ByteString.m8568e("\r\n\r\n");
        Buffer buffer = new Buffer();
        long j2 = 0L;
        long j3 = 0L;
        long j4 = 0L;
        Map<String, String> map = null;
        while (true) {
            long max = Math.max(j2 - m8568e2.m8551z(), j3);
            long m8638I = buffer.m8638I(m8568e, max);
            if (m8638I == -1) {
                m8638I = buffer.m8638I(m8568e2, max);
                z = true;
            } else {
                z = false;
            }
            if (m8638I == -1) {
                long size = buffer.size();
                if (map == null) {
                    long m8638I2 = buffer.m8638I(m8568e3, max);
                    if (m8638I2 >= 0) {
                        this.mSource.read(buffer, m8638I2);
                        Buffer buffer2 = new Buffer();
                        j = j3;
                        buffer.m8616t(buffer2, max, m8638I2 - max);
                        j4 = buffer2.size() + m8568e3.m8551z();
                        map = parseHeaders(buffer2);
                    } else {
                        j = j3;
                    }
                } else {
                    j = j3;
                    emitProgress(map, buffer.size() - j4, false, chunkListener);
                }
                if (this.mSource.read(buffer, (long) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) <= 0) {
                    return false;
                }
                j2 = size;
                j3 = j;
            } else {
                long j5 = j3;
                long j6 = m8638I - j5;
                if (j5 > 0) {
                    Buffer buffer3 = new Buffer();
                    buffer.skip(j5);
                    buffer.read(buffer3, j6);
                    emitProgress(map, buffer3.size() - j4, true, chunkListener);
                    emitChunk(buffer3, z, chunkListener);
                    j4 = 0;
                    map = null;
                } else {
                    buffer.skip(m8638I);
                }
                if (z) {
                    return true;
                }
                j3 = m8568e.m8551z();
                j2 = j3;
            }
        }
    }
}
