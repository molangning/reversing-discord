package sd;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.linkedin.android.litr.p050io.MediaRange;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import p248nd.C10573b;
import p387vd.C13255h;

/* renamed from: sd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12454a implements InterfaceC12458c {
    private final MediaExtractor mediaExtractor;
    private final MediaRange mediaRange;
    private int orientationHint;
    private long size;

    public C12454a(Context context, Uri uri) {
        this(context, uri, new MediaRange(0L, Long.MAX_VALUE));
    }

    @Override // sd.InterfaceC12458c
    public void advance() {
        this.mediaExtractor.advance();
    }

    @Override // sd.InterfaceC12458c
    public int getOrientationHint() {
        return this.orientationHint;
    }

    @Override // sd.InterfaceC12458c
    public int getSampleFlags() {
        return this.mediaExtractor.getSampleFlags();
    }

    @Override // sd.InterfaceC12458c
    public long getSampleTime() {
        return this.mediaExtractor.getSampleTime();
    }

    @Override // sd.InterfaceC12458c
    public int getSampleTrackIndex() {
        return this.mediaExtractor.getSampleTrackIndex();
    }

    @Override // sd.InterfaceC12458c
    public MediaRange getSelection() {
        return this.mediaRange;
    }

    @Override // sd.InterfaceC12458c
    public long getSize() {
        return this.size;
    }

    @Override // sd.InterfaceC12458c
    public int getTrackCount() {
        return this.mediaExtractor.getTrackCount();
    }

    @Override // sd.InterfaceC12458c
    public MediaFormat getTrackFormat(int i) {
        return this.mediaExtractor.getTrackFormat(i);
    }

    @Override // sd.InterfaceC12458c
    public int readSampleData(ByteBuffer byteBuffer, int i) {
        return this.mediaExtractor.readSampleData(byteBuffer, i);
    }

    @Override // sd.InterfaceC12458c
    public void release() {
        this.mediaExtractor.release();
    }

    @Override // sd.InterfaceC12458c
    public void seekTo(long j, int i) {
        this.mediaExtractor.seekTo(j, i);
    }

    @Override // sd.InterfaceC12458c
    public void selectTrack(int i) {
        this.mediaExtractor.selectTrack(i);
    }

    public C12454a(Context context, Uri uri, MediaRange mediaRange) {
        this.mediaRange = mediaRange;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.mediaExtractor = mediaExtractor;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
            mediaMetadataRetriever.setDataSource(context, uri);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            if (extractMetadata != null) {
                this.orientationHint = Integer.parseInt(extractMetadata);
            }
            this.size = C13255h.m2917f(context, uri);
            mediaMetadataRetriever.release();
        } catch (IOException e) {
            mediaMetadataRetriever.release();
            throw new C10573b(C10573b.EnumC10574a.DATA_SOURCE, uri, e);
        }
    }
}
