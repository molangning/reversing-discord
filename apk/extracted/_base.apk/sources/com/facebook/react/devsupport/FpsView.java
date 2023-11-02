package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.C3893R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.debug.FpsDebugFrameCallback;
import java.util.Locale;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FpsView extends FrameLayout {
    private static final int UPDATE_INTERVAL_MS = 500;
    private final FPSMonitorRunnable mFPSMonitorRunnable;
    private final FpsDebugFrameCallback mFrameCallback;
    private final TextView mTextView;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class FPSMonitorRunnable implements Runnable {
        private boolean mShouldStop;
        private int mTotal4PlusFrameStutters;
        private int mTotalFramesDropped;

        private FPSMonitorRunnable() {
            this.mShouldStop = false;
            this.mTotalFramesDropped = 0;
            this.mTotal4PlusFrameStutters = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mShouldStop) {
                return;
            }
            this.mTotalFramesDropped += FpsView.this.mFrameCallback.getExpectedNumFrames() - FpsView.this.mFrameCallback.getNumFrames();
            this.mTotal4PlusFrameStutters += FpsView.this.mFrameCallback.get4PlusFrameStutters();
            FpsView fpsView = FpsView.this;
            fpsView.setCurrentFPS(fpsView.mFrameCallback.getFPS(), FpsView.this.mFrameCallback.getJSFPS(), this.mTotalFramesDropped, this.mTotal4PlusFrameStutters);
            FpsView.this.mFrameCallback.reset();
            FpsView.this.postDelayed(this, 500L);
        }

        public void start() {
            this.mShouldStop = false;
            FpsView.this.post(this);
        }

        public void stop() {
            this.mShouldStop = true;
        }
    }

    public FpsView(ReactContext reactContext) {
        super(reactContext);
        View.inflate(reactContext, C3893R.layout.fps_view, this);
        this.mTextView = (TextView) findViewById(C3893R.C3895id.fps_text);
        this.mFrameCallback = new FpsDebugFrameCallback(reactContext);
        this.mFPSMonitorRunnable = new FPSMonitorRunnable();
        setCurrentFPS(0.0d, 0.0d, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentFPS(double d, double d2, int i, int i2) {
        String format = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Double.valueOf(d), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2));
        this.mTextView.setText(format);
        C13677a.m1862b(ReactConstants.TAG, format);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFrameCallback.reset();
        this.mFrameCallback.start();
        this.mFPSMonitorRunnable.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFrameCallback.stop();
        this.mFPSMonitorRunnable.stop();
    }
}
