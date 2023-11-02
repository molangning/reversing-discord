package com.facebook.react.modules.sound;

import android.media.AudioManager;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import org.webrtc.MediaStreamTrack;

@ReactModule(name = NativeSoundManagerSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SoundManagerModule extends NativeSoundManagerSpec {
    public SoundManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeSoundManagerSpec
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }
}
