package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0946a;
import androidx.recyclerview.widget.RecyclerView;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.FabricViewStateManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.facebook.react.views.text.DefaultStyleValuesUtil;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.TextAttributeProps;
import com.facebook.react.views.text.TextInlineImageSpan;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.text.TextLayoutManagerMapBuffer;
import com.facebook.react.views.text.TextTransform;
import com.facebook.yoga.C4340d;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import p058d5.C5743a;
import p414x2.C13677a;

@ReactModule(name = ReactTextInputManager.REACT_CLASS)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactTextInputManager extends BaseViewManager<ReactEditText, LayoutShadowNode> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    protected ReactTextViewManagerCallback mReactTextViewManagerCallback;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new HashMap<String, String>() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.1
        {
            put("birthdate-day", "birthDateDay");
            put("birthdate-full", "birthDateFull");
            put("birthdate-month", "birthDateMonth");
            put("birthdate-year", "birthDateYear");
            put("cc-csc", "creditCardSecurityCode");
            put("cc-exp", "creditCardExpirationDate");
            put("cc-exp-day", "creditCardExpirationDay");
            put("cc-exp-month", "creditCardExpirationMonth");
            put("cc-exp-year", "creditCardExpirationYear");
            put("cc-number", "creditCardNumber");
            put("email", "emailAddress");
            put("gender", "gender");
            put(ZeroconfModule.KEY_SERVICE_NAME, "personName");
            put("name-family", "personFamilyName");
            put("name-given", "personGivenName");
            put("name-middle", "personMiddleName");
            put("name-middle-initial", "personMiddleInitial");
            put("name-prefix", "personNamePrefix");
            put("name-suffix", "personNameSuffix");
            put("password", "password");
            put("password-new", "newPassword");
            put("postal-address", "postalAddress");
            put("postal-address-country", "addressCountry");
            put("postal-address-extended", "extendedAddress");
            put("postal-address-extended-postal-code", "extendedPostalCode");
            put("postal-address-locality", "addressLocality");
            put("postal-address-region", "addressRegion");
            put("postal-code", "postalCode");
            put("street-address", "streetAddress");
            put("sms-otp", "smsOTPCode");
            put("tel", "phoneNumber");
            put("tel-country-code", "phoneCountryCode");
            put("tel-national", "phoneNational");
            put("tel-device", "phoneNumberDevice");
            put("username", "username");
            put("username-new", "newUsername");
        }
    };
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final String[] DRAWABLE_FIELDS = {"mCursorDrawable", "mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    private static final String[] DRAWABLE_RESOURCES = {"mCursorDrawableRes", "mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class ReactContentSizeWatcher implements ContentSizeWatcher {
        private final ReactEditText mEditText;
        private final EventDispatcher mEventDispatcher;
        private final int mSurfaceId;
        private int mPreviousContentWidth = 0;
        private int mPreviousContentHeight = 0;

        public ReactContentSizeWatcher(ReactEditText reactEditText) {
            this.mEditText = reactEditText;
            ReactContext reactContext = UIManagerHelper.getReactContext(reactEditText);
            this.mEventDispatcher = ReactTextInputManager.getEventDispatcher(reactContext, reactEditText);
            this.mSurfaceId = UIManagerHelper.getSurfaceId(reactContext);
        }

        @Override // com.facebook.react.views.textinput.ContentSizeWatcher
        public void onLayout() {
            if (this.mEventDispatcher == null) {
                return;
            }
            int width = this.mEditText.getWidth();
            int height = this.mEditText.getHeight();
            if (this.mEditText.getLayout() != null) {
                width = this.mEditText.getCompoundPaddingLeft() + this.mEditText.getLayout().getWidth() + this.mEditText.getCompoundPaddingRight();
                height = this.mEditText.getCompoundPaddingTop() + this.mEditText.getLayout().getHeight() + this.mEditText.getCompoundPaddingBottom();
            }
            if (width != this.mPreviousContentWidth || height != this.mPreviousContentHeight) {
                this.mPreviousContentHeight = height;
                this.mPreviousContentWidth = width;
                this.mEventDispatcher.dispatchEvent(new ReactContentSizeChangedEvent(this.mSurfaceId, this.mEditText.getId(), PixelUtil.toDIPFromPixel(width), PixelUtil.toDIPFromPixel(height)));
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class ReactScrollWatcher implements ScrollWatcher {
        private final EventDispatcher mEventDispatcher;
        private int mPreviousHoriz;
        private int mPreviousVert;
        private final ReactEditText mReactEditText;
        private final int mSurfaceId;

        public ReactScrollWatcher(ReactEditText reactEditText) {
            this.mReactEditText = reactEditText;
            ReactContext reactContext = UIManagerHelper.getReactContext(reactEditText);
            this.mEventDispatcher = ReactTextInputManager.getEventDispatcher(reactContext, reactEditText);
            this.mSurfaceId = UIManagerHelper.getSurfaceId(reactContext);
        }

        @Override // com.facebook.react.views.textinput.ScrollWatcher
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            if (this.mPreviousHoriz != i || this.mPreviousVert != i2) {
                this.mEventDispatcher.dispatchEvent(ScrollEvent.obtain(this.mSurfaceId, this.mReactEditText.getId(), ScrollEventType.SCROLL, i, i2, 0.0f, 0.0f, 0, 0, this.mReactEditText.getWidth(), this.mReactEditText.getHeight()));
                this.mPreviousHoriz = i;
                this.mPreviousVert = i2;
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class ReactSelectionWatcher implements SelectionWatcher {
        private final EventDispatcher mEventDispatcher;
        private int mPreviousSelectionEnd;
        private int mPreviousSelectionStart;
        private final ReactEditText mReactEditText;
        private final int mSurfaceId;

        public ReactSelectionWatcher(ReactEditText reactEditText) {
            this.mReactEditText = reactEditText;
            ReactContext reactContext = UIManagerHelper.getReactContext(reactEditText);
            this.mEventDispatcher = ReactTextInputManager.getEventDispatcher(reactContext, reactEditText);
            this.mSurfaceId = UIManagerHelper.getSurfaceId(reactContext);
        }

        @Override // com.facebook.react.views.textinput.SelectionWatcher
        public void onSelectionChanged(int i, int i2) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            if (this.mPreviousSelectionStart != min || this.mPreviousSelectionEnd != max) {
                this.mEventDispatcher.dispatchEvent(new ReactTextInputSelectionEvent(this.mSurfaceId, this.mReactEditText.getId(), min, max));
                this.mPreviousSelectionStart = min;
                this.mPreviousSelectionEnd = max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class ReactTextInputTextWatcher implements TextWatcher {
        private final ReactEditText mEditText;
        private final EventDispatcher mEventDispatcher;
        private String mPreviousText = null;
        private final int mSurfaceId;

        public ReactTextInputTextWatcher(ReactContext reactContext, ReactEditText reactEditText) {
            this.mEventDispatcher = ReactTextInputManager.getEventDispatcher(reactContext, reactEditText);
            this.mEditText = reactEditText;
            this.mSurfaceId = UIManagerHelper.getSurfaceId(reactContext);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.mPreviousText = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.mEditText.mDisableTextDiffing) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            C5743a.m24583c(this.mPreviousText);
            String substring = charSequence.toString().substring(i, i + i3);
            int i4 = i + i2;
            String substring2 = this.mPreviousText.substring(i, i4);
            if (i3 == i2 && substring.equals(substring2)) {
                return;
            }
            FabricViewStateManager fabricViewStateManager = this.mEditText.getFabricViewStateManager();
            if (fabricViewStateManager.hasStateWrapper()) {
                fabricViewStateManager.setState(new FabricViewStateManager.StateUpdateCallback() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.ReactTextInputTextWatcher.1
                    @Override // com.facebook.react.uimanager.FabricViewStateManager.StateUpdateCallback
                    public WritableMap getStateUpdate() {
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putInt("mostRecentEventCount", ReactTextInputTextWatcher.this.mEditText.incrementAndGetEventCounter());
                        writableNativeMap.putInt("opaqueCacheId", ReactTextInputTextWatcher.this.mEditText.getId());
                        return writableNativeMap;
                    }
                });
            }
            this.mEventDispatcher.dispatchEvent(new ReactTextChangedEvent(this.mSurfaceId, this.mEditText.getId(), charSequence.toString(), this.mEditText.incrementAndGetEventCounter()));
            this.mEventDispatcher.dispatchEvent(new ReactTextInputEvent(this.mSurfaceId, this.mEditText.getId(), substring, substring2, i, i4));
        }
    }

    private static void checkPasswordType(ReactEditText reactEditText) {
        if ((reactEditText.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) != 0 && (reactEditText.getStagedInputType() & 128) != 0) {
            updateStagedInputTypeFlag(reactEditText, 128, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EventDispatcher getEventDispatcher(ReactContext reactContext, ReactEditText reactEditText) {
        return UIManagerHelper.getEventDispatcherForReactTag(reactContext, reactEditText.getId());
    }

    private ReactTextUpdate getReactTextUpdate(String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) TextTransform.apply(str, TextTransform.UNSET));
        return new ReactTextUpdate(spannableStringBuilder, i, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    private void setAutofillHints(ReactEditText reactEditText, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        reactEditText.setAutofillHints(strArr);
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.ROOT);
        if (Build.VERSION.SDK_INT == 29 && lowerCase.contains("xiaomi")) {
            return true;
        }
        return false;
    }

    private static void updateStagedInputTypeFlag(ReactEditText reactEditText, int i, int i2) {
        reactEditText.setStagedInputType(((~i) & reactEditText.getStagedInputType()) | i2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m30469of("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(MapBuilder.builder().put("topSubmitEditing", MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).put("topEndEditing", MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).put(ReactTextInputEvent.EVENT_NAME, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onTextInput", "captured", "onTextInputCapture"))).put("topFocus", MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onFocus", "captured", "onFocusCapture"))).put("topBlur", MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onBlur", "captured", "onBlurCapture"))).put(ReactTextInputKeyPressEvent.EVENT_NAME, MapBuilder.m30470of("phasedRegistrationNames", MapBuilder.m30469of("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).build());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.m30470of("registrationName", "onScroll")).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return MapBuilder.m30470of("AutoCapitalizationType", MapBuilder.m30467of(ViewProps.NONE, 0, "characters", Integer.valueOf((int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT), "words", 8192, "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public void setAllowFontScaling(ReactEditText reactEditText, boolean z) {
        reactEditText.setAllowFontScaling(z);
    }

    @ReactProp(name = "autoCapitalize")
    public void setAutoCapitalize(ReactEditText reactEditText, Dynamic dynamic) {
        int i;
        if (dynamic.getType() == ReadableType.Number) {
            i = dynamic.asInt();
        } else {
            if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals(ViewProps.NONE)) {
                    i = 0;
                } else if (asString.equals("characters")) {
                    i = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                } else if (asString.equals("words")) {
                    i = 8192;
                } else {
                    asString.equals("sentences");
                }
            }
            i = 16384;
        }
        updateStagedInputTypeFlag(reactEditText, AUTOCAPITALIZE_FLAGS, i);
    }

    @ReactProp(name = "autoCorrect")
    public void setAutoCorrect(ReactEditText reactEditText, Boolean bool) {
        int i;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 32768;
            } else {
                i = 524288;
            }
        } else {
            i = 0;
        }
        updateStagedInputTypeFlag(reactEditText, 557056, i);
    }

    @ReactProp(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setAutoFocus(z);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public void setBorderColor(ReactEditText reactEditText, int i, Integer num) {
        float intValue;
        float f = Float.NaN;
        if (num == null) {
            intValue = Float.NaN;
        } else {
            intValue = num.intValue() & 16777215;
        }
        if (num != null) {
            f = num.intValue() >>> 24;
        }
        reactEditText.setBorderColor(SPACING_TYPES[i], intValue, f);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(ReactEditText reactEditText, int i, float f) {
        if (!C4340d.m29971a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactEditText.setBorderRadius(f);
        } else {
            reactEditText.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactEditText reactEditText, String str) {
        reactEditText.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public void setBorderWidth(ReactEditText reactEditText, int i, float f) {
        if (!C4340d.m29971a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        reactEditText.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactProp(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(ReactEditText reactEditText, boolean z) {
        if (reactEditText.getStagedInputType() == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        reactEditText.setCursorVisible(!z);
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(ReactEditText reactEditText, Integer num) {
        String str;
        if (num == null) {
            ColorStateList defaultTextColor = DefaultStyleValuesUtil.getDefaultTextColor(reactEditText.getContext());
            if (defaultTextColor != null) {
                reactEditText.setTextColor(defaultTextColor);
                return;
            }
            Context context = reactEditText.getContext();
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get default text color from View Context: ");
            if (context != null) {
                str = context.getClass().getCanonicalName();
            } else {
                str = "null";
            }
            sb2.append(str);
            ReactSoftExceptionLogger.logSoftException(str2, new IllegalStateException(sb2.toString()));
            return;
        }
        reactEditText.setTextColor(num.intValue());
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(ReactEditText reactEditText, final boolean z) {
        reactEditText.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return z;
            }
        });
    }

    @ReactProp(customType = "Color", name = "cursorColor")
    public void setCursorColor(ReactEditText reactEditText, Integer num) {
        int i;
        BlendMode blendMode;
        if (num == null) {
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Drawable textCursorDrawable = reactEditText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                int intValue = num.intValue();
                blendMode = BlendMode.SRC_IN;
                textCursorDrawable.setColorFilter(new BlendModeColorFilter(intValue, blendMode));
                reactEditText.setTextCursorDrawable(textCursorDrawable);
            }
        } else if (i2 == 28) {
        } else {
            int i3 = 0;
            while (true) {
                String[] strArr = DRAWABLE_RESOURCES;
                if (i3 < strArr.length) {
                    try {
                        Field declaredField = TextView.class.getDeclaredField(strArr[i3]);
                        declaredField.setAccessible(true);
                        i = declaredField.getInt(reactEditText);
                    } catch (IllegalAccessException | NoSuchFieldException unused) {
                    }
                    if (i == 0) {
                        return;
                    }
                    Drawable mutate = C0946a.m38399e(reactEditText.getContext(), i).mutate();
                    mutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(reactEditText);
                    Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_FIELDS[i3]);
                    declaredField3.setAccessible(true);
                    if (strArr[i3] == "mCursorDrawableRes") {
                        declaredField3.set(obj, new Drawable[]{mutate, mutate});
                    } else {
                        declaredField3.set(obj, mutate);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    @ReactProp(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(ReactEditText reactEditText, boolean z) {
        reactEditText.setDisableFullscreenUI(z);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public void setEditable(ReactEditText reactEditText, boolean z) {
        reactEditText.setEnabled(z);
    }

    @ReactProp(name = ViewProps.FONT_FAMILY)
    public void setFontFamily(ReactEditText reactEditText, String str) {
        reactEditText.setFontFamily(str);
    }

    @ReactProp(defaultFloat = ViewDefaults.FONT_SIZE_SP, name = ViewProps.FONT_SIZE)
    public void setFontSize(ReactEditText reactEditText, float f) {
        reactEditText.setFontSize(f);
    }

    @ReactProp(name = ViewProps.FONT_STYLE)
    public void setFontStyle(ReactEditText reactEditText, String str) {
        reactEditText.setFontStyle(str);
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public void setFontVariant(ReactEditText reactEditText, ReadableArray readableArray) {
        reactEditText.setFontFeatureSettings(ReactTypefaceUtils.parseFontVariant(readableArray));
    }

    @ReactProp(name = ViewProps.FONT_WEIGHT)
    public void setFontWeight(ReactEditText reactEditText, String str) {
        reactEditText.setFontWeight(str);
    }

    @ReactProp(name = "importantForAutofill")
    public void setImportantForAutofill(ReactEditText reactEditText, String str) {
        int i;
        if ("no".equals(str)) {
            i = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i = 8;
        } else if ("yes".equals(str)) {
            i = 1;
        } else {
            i = "yesExcludeDescendants".equals(str) ? 4 : 0;
        }
        setImportantForAutofill(reactEditText, i);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public void setIncludeFontPadding(ReactEditText reactEditText, boolean z) {
        reactEditText.setIncludeFontPadding(z);
    }

    @ReactProp(name = "inlineImageLeft")
    public void setInlineImageLeft(ReactEditText reactEditText, String str) {
        reactEditText.setCompoundDrawablesWithIntrinsicBounds(ResourceDrawableIdHelper.getInstance().getResourceDrawable(reactEditText.getContext(), str), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @ReactProp(name = "inlineImagePadding")
    public void setInlineImagePadding(ReactEditText reactEditText, int i) {
        reactEditText.setCompoundDrawablePadding(i);
    }

    @ReactProp(name = "keyboardType")
    public void setKeyboardType(ReactEditText reactEditText, String str) {
        int i;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            if (shouldHideCursorForEmailTextInput()) {
                reactEditText.setCursorVisible(false);
            }
            i = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i = 3;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
            i = 144;
        } else if (KEYBOARD_TYPE_URI.equalsIgnoreCase(str)) {
            i = 16;
        } else {
            i = 1;
        }
        updateStagedInputTypeFlag(reactEditText, 15, i);
        checkPasswordType(reactEditText);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public void setLetterSpacing(ReactEditText reactEditText, float f) {
        reactEditText.setLetterSpacingPt(f);
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public void setMaxFontSizeMultiplier(ReactEditText reactEditText, float f) {
        reactEditText.setMaxFontSizeMultiplier(f);
    }

    @ReactProp(name = "maxLength")
    public void setMaxLength(ReactEditText reactEditText, Integer num) {
        InputFilter[] filters = reactEditText.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i = 0; i < filters.length; i++) {
                if (filters[i] instanceof InputFilter.LengthFilter) {
                    filters[i] = new InputFilter.LengthFilter(num.intValue());
                    z = true;
                }
            }
            if (!z) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        reactEditText.setFilters(inputFilterArr);
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public void setMultiline(ReactEditText reactEditText, boolean z) {
        updateStagedInputTypeFlag(reactEditText, z ? 0 : 131072, z ? 131072 : 0);
    }

    @ReactProp(defaultInt = 1, name = ViewProps.NUMBER_OF_LINES)
    public void setNumLines(ReactEditText reactEditText, int i) {
        reactEditText.setLines(i);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setContentSizeWatcher(new ReactContentSizeWatcher(reactEditText));
        } else {
            reactEditText.setContentSizeWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(ReactEditText reactEditText, boolean z) {
        reactEditText.setOnKeyPress(z);
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setScrollWatcher(new ReactScrollWatcher(reactEditText));
        } else {
            reactEditText.setScrollWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setSelectionWatcher(new ReactSelectionWatcher(reactEditText));
        } else {
            reactEditText.setSelectionWatcher(null);
        }
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public void setPlaceholder(ReactEditText reactEditText, String str) {
        reactEditText.setPlaceholder(str);
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(ReactEditText reactEditText, Integer num) {
        if (num == null) {
            reactEditText.setHintTextColor(DefaultStyleValuesUtil.getDefaultTextColorHint(reactEditText.getContext()));
        } else {
            reactEditText.setHintTextColor(num.intValue());
        }
    }

    @ReactProp(name = "returnKeyLabel")
    public void setReturnKeyLabel(ReactEditText reactEditText, String str) {
        reactEditText.setImeActionLabel(str, IME_ACTION_ID);
    }

    @ReactProp(name = "returnKeyType")
    public void setReturnKeyType(ReactEditText reactEditText, String str) {
        reactEditText.setReturnKeyType(str);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(ReactEditText reactEditText, boolean z) {
        int i;
        if (z) {
            i = 128;
        } else {
            i = 0;
        }
        updateStagedInputTypeFlag(reactEditText, 144, i);
        checkPasswordType(reactEditText);
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setSelectAllOnFocus(z);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactEditText reactEditText, Integer num) {
        if (num == null) {
            reactEditText.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(reactEditText.getContext()));
        } else {
            reactEditText.setHighlightColor(num.intValue());
        }
        setCursorColor(reactEditText, num);
    }

    @ReactProp(name = "submitBehavior")
    public void setSubmitBehavior(ReactEditText reactEditText, String str) {
        reactEditText.setSubmitBehavior(str);
    }

    @ReactProp(name = ViewProps.TEXT_ALIGN)
    public void setTextAlign(ReactEditText reactEditText, String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                reactEditText.setJustificationMode(1);
            }
            reactEditText.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            reactEditText.setJustificationMode(0);
        }
        if (str != null && !"auto".equals(str)) {
            if (ViewProps.LEFT.equals(str)) {
                reactEditText.setGravityHorizontal(3);
                return;
            } else if (ViewProps.RIGHT.equals(str)) {
                reactEditText.setGravityHorizontal(5);
                return;
            } else if ("center".equals(str)) {
                reactEditText.setGravityHorizontal(1);
                return;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "Invalid textAlign: " + str);
                reactEditText.setGravityHorizontal(0);
                return;
            }
        }
        reactEditText.setGravityHorizontal(0);
    }

    @ReactProp(name = ViewProps.TEXT_ALIGN_VERTICAL)
    public void setTextAlignVertical(ReactEditText reactEditText, String str) {
        if (str != null && !"auto".equals(str)) {
            if (ViewProps.TOP.equals(str)) {
                reactEditText.setGravityVertical(48);
                return;
            } else if (ViewProps.BOTTOM.equals(str)) {
                reactEditText.setGravityVertical(80);
                return;
            } else if ("center".equals(str)) {
                reactEditText.setGravityVertical(16);
                return;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "Invalid textAlignVertical: " + str);
                reactEditText.setGravityVertical(0);
                return;
            }
        }
        reactEditText.setGravityVertical(0);
    }

    @ReactProp(name = "autoComplete")
    public void setTextContentType(ReactEditText reactEditText, String str) {
        if (str == null) {
            setImportantForAutofill(reactEditText, 2);
        } else if ("off".equals(str)) {
            setImportantForAutofill(reactEditText, 2);
        } else {
            Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
            if (map.containsKey(str)) {
                setAutofillHints(reactEditText, map.get(str));
                return;
            }
            C13677a.m1870H(ReactConstants.TAG, "Invalid autoComplete: " + str);
            setImportantForAutofill(reactEditText, 2);
        }
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public void setTextDecorationLine(ReactEditText reactEditText, String str) {
        String[] split;
        reactEditText.setPaintFlags(reactEditText.getPaintFlags() & (-25));
        for (String str2 : str.split(" ")) {
            if (str2.equals("underline")) {
                reactEditText.setPaintFlags(reactEditText.getPaintFlags() | 8);
            } else if (str2.equals("line-through")) {
                reactEditText.setPaintFlags(reactEditText.getPaintFlags() | 16);
            }
        }
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(ReactEditText reactEditText, Integer num) {
        Drawable background = reactEditText.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e) {
                C13677a.m1853k(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setShowSoftInputOnFocus(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final ThemedReactContext themedReactContext, final ReactEditText reactEditText) {
        reactEditText.setEventDispatcher(getEventDispatcher(themedReactContext, reactEditText));
        reactEditText.addTextChangedListener(new ReactTextInputTextWatcher(themedReactContext, reactEditText));
        reactEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                int surfaceId = themedReactContext.getSurfaceId();
                EventDispatcher eventDispatcher = ReactTextInputManager.getEventDispatcher(themedReactContext, reactEditText);
                if (z) {
                    eventDispatcher.dispatchEvent(new ReactTextInputFocusEvent(surfaceId, reactEditText.getId()));
                    return;
                }
                eventDispatcher.dispatchEvent(new ReactTextInputBlurEvent(surfaceId, reactEditText.getId()));
                eventDispatcher.dispatchEvent(new ReactTextInputEndEditingEvent(surfaceId, reactEditText.getId(), reactEditText.getText().toString()));
            }
        });
        reactEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.4
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if ((i & 255) == 0 && i != 0) {
                    return true;
                }
                boolean isMultiline = reactEditText.isMultiline();
                boolean shouldSubmitOnReturn = reactEditText.shouldSubmitOnReturn();
                boolean shouldBlurOnReturn = reactEditText.shouldBlurOnReturn();
                if (shouldSubmitOnReturn) {
                    ReactTextInputManager.getEventDispatcher(themedReactContext, reactEditText).dispatchEvent(new ReactTextInputSubmitEditingEvent(themedReactContext.getSurfaceId(), reactEditText.getId(), reactEditText.getText().toString()));
                }
                if (shouldBlurOnReturn) {
                    reactEditText.clearFocus();
                }
                if (shouldBlurOnReturn || shouldSubmitOnReturn || !isMultiline || i == 5 || i == 7) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactBaseTextShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactEditText createViewInstance(ThemedReactContext themedReactContext) {
        ReactEditText reactEditText = new ReactEditText(themedReactContext);
        reactEditText.setInputType(reactEditText.getInputType() & (-131073));
        reactEditText.setReturnKeyType("done");
        reactEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return reactEditText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactEditText reactEditText) {
        super.onAfterUpdateTransaction((ReactTextInputManager) reactEditText);
        reactEditText.maybeUpdateTypeface();
        reactEditText.commitStagedInputType();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(ReactEditText reactEditText, int i, int i2, int i3, int i4) {
        reactEditText.setPadding(i, i2, i3, i4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ReactEditText reactEditText, Object obj) {
        if (obj instanceof ReactTextUpdate) {
            ReactTextUpdate reactTextUpdate = (ReactTextUpdate) obj;
            int paddingLeft = (int) reactTextUpdate.getPaddingLeft();
            int paddingTop = (int) reactTextUpdate.getPaddingTop();
            int paddingRight = (int) reactTextUpdate.getPaddingRight();
            int paddingBottom = (int) reactTextUpdate.getPaddingBottom();
            int i = -1;
            if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
                if (paddingLeft == -1) {
                    paddingLeft = reactEditText.getPaddingLeft();
                }
                if (paddingTop == -1) {
                    paddingTop = reactEditText.getPaddingTop();
                }
                if (paddingRight == -1) {
                    paddingRight = reactEditText.getPaddingRight();
                }
                if (paddingBottom == -1) {
                    paddingBottom = reactEditText.getPaddingBottom();
                }
                reactEditText.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
            if (reactTextUpdate.containsImages()) {
                TextInlineImageSpan.possiblyUpdateInlineImageSpans(reactTextUpdate.getText(), reactEditText);
            }
            if (reactEditText.getSelectionStart() == reactEditText.getSelectionEnd()) {
                i = reactTextUpdate.getText().length() - ((reactEditText.getText() != null ? reactEditText.getText().length() : 0) - reactEditText.getSelectionStart());
            }
            reactEditText.maybeSetTextFromState(reactTextUpdate);
            reactEditText.maybeSetSelection(reactTextUpdate.getJsEventCounter(), i, i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactEditText reactEditText, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        FabricViewStateManager fabricViewStateManager = reactEditText.getFabricViewStateManager();
        if (!fabricViewStateManager.hasStateWrapper()) {
            reactEditText.setPadding(0, 0, 0, 0);
        }
        fabricViewStateManager.setStateWrapper(stateWrapper);
        ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(reactEditText, reactStylesDiffMap, stateDataMapBuffer);
        }
        ReadableNativeMap stateData = stateWrapper.getStateData();
        if (stateData == null || !stateData.hasKey("attributedString")) {
            return null;
        }
        ReadableNativeMap map = stateData.getMap("attributedString");
        ReadableNativeMap map2 = stateData.getMap("paragraphAttributes");
        if (map != null && map2 != null) {
            return ReactTextUpdate.buildReactTextUpdateFromState(TextLayoutManager.getOrCreateSpannableForText(reactEditText.getContext(), map, this.mReactTextViewManagerCallback), stateData.getInt("mostRecentEventCount"), TextAttributeProps.getTextAlignment(reactStylesDiffMap, TextLayoutManager.isRTL(map), reactEditText.getGravityHorizontal()), TextAttributeProps.getTextBreakStrategy(map2.getString(ViewProps.TEXT_BREAK_STRATEGY)), TextAttributeProps.getJustificationMode(reactStylesDiffMap, Build.VERSION.SDK_INT >= 26 ? reactEditText.getJustificationMode() : 0));
        }
        throw new IllegalArgumentException("Invalid TextInput State was received as a parameters");
    }

    public ReactBaseTextShadowNode createShadowNodeInstance(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        return new ReactTextInputShadowNode(reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, int i, ReadableArray readableArray) {
        if (i == 1) {
            receiveCommand(reactEditText, "focus", readableArray);
        } else if (i == 2) {
            receiveCommand(reactEditText, "blur", readableArray);
        } else if (i != 4) {
        } else {
            receiveCommand(reactEditText, "setTextAndSelection", readableArray);
        }
    }

    public Object getReactTextUpdate(ReactEditText reactEditText, ReactStylesDiffMap reactStylesDiffMap, MapBuffer mapBuffer) {
        if (mapBuffer.getCount() == 0) {
            return null;
        }
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(0);
        MapBuffer mapBuffer3 = mapBuffer.getMapBuffer(1);
        if (mapBuffer2 != null && mapBuffer3 != null) {
            return ReactTextUpdate.buildReactTextUpdateFromState(TextLayoutManagerMapBuffer.getOrCreateSpannableForText(reactEditText.getContext(), mapBuffer2, this.mReactTextViewManagerCallback), mapBuffer.getInt(3), TextAttributeProps.getTextAlignment(reactStylesDiffMap, TextLayoutManagerMapBuffer.isRTL(mapBuffer2), reactEditText.getGravityHorizontal()), TextAttributeProps.getTextBreakStrategy(mapBuffer3.getString(2)), TextAttributeProps.getJustificationMode(reactStylesDiffMap, Build.VERSION.SDK_INT >= 26 ? reactEditText.getJustificationMode() : 0));
        }
        throw new IllegalArgumentException("Invalid TextInput State (MapBuffer) was received as a parameters");
    }

    private void setImportantForAutofill(ReactEditText reactEditText, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        reactEditText.setImportantForAutofill(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, String str, ReadableArray readableArray) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1699362314:
                if (str.equals("blurTextInput")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1427010500:
                if (str.equals("setTextAndSelection")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1690703013:
                if (str.equals("focusTextInput")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                reactEditText.clearFocusFromJS();
                return;
            case 2:
            case 4:
                reactEditText.requestFocusFromJS();
                return;
            case 3:
                int i = readableArray.getInt(0);
                if (i == -1) {
                    return;
                }
                int i2 = readableArray.getInt(2);
                int i3 = readableArray.getInt(3);
                if (i3 == -1) {
                    i3 = i2;
                }
                if (!readableArray.isNull(1)) {
                    reactEditText.maybeSetTextFromJS(getReactTextUpdate(readableArray.getString(1), i));
                }
                reactEditText.maybeSetSelection(i, i2, i3);
                return;
            default:
                return;
        }
    }
}
