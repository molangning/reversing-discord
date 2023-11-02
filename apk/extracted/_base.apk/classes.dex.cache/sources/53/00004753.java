package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        @CalledByNative("State")
        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaSource(final long j) {
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.i0
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeReleaseRef(j);
            }
        });
        this.nativeSource = j;
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource != 0) {
            return;
        }
        throw new IllegalStateException("MediaSource has been disposed.");
    }

    private static native State nativeGetState(long j);

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    public void runWithReference(Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}