package sd;

import android.media.MediaFormat;
import com.linkedin.android.litr.p050io.MediaRange;
import java.nio.ByteBuffer;

/* renamed from: sd.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC12458c {
    void advance();

    int getOrientationHint();

    int getSampleFlags();

    long getSampleTime();

    int getSampleTrackIndex();

    MediaRange getSelection();

    long getSize();

    int getTrackCount();

    MediaFormat getTrackFormat(int i);

    int readSampleData(ByteBuffer byteBuffer, int i);

    void release();

    void seekTo(long j, int i);

    void selectTrack(int i);
}