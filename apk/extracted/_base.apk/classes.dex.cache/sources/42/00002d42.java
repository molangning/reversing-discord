package com.henninghall.date_picker;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import p121gj.C6822a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DatePickerModule extends ReactContextBaseJavaModule {
    private AlertDialog dialog;

    /* renamed from: com.henninghall.date_picker.DatePickerModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class DialogInterface$OnCancelListenerC5133a implements DialogInterface.OnCancelListener {

        /* renamed from: j */
        final /* synthetic */ Callback f14453j;

        DialogInterface$OnCancelListenerC5133a(Callback callback) {
            DatePickerModule.this = r1;
            this.f14453j = callback;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f14453j.invoke(new Object[0]);
        }
    }

    /* renamed from: com.henninghall.date_picker.DatePickerModule$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class DialogInterface$OnClickListenerC5134b implements DialogInterface.OnClickListener {

        /* renamed from: j */
        final /* synthetic */ Callback f14455j;

        DialogInterface$OnClickListenerC5134b(Callback callback) {
            DatePickerModule.this = r1;
            this.f14455j = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f14455j.invoke(new Object[0]);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.henninghall.date_picker.DatePickerModule$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class DialogInterface$OnClickListenerC5135c implements DialogInterface.OnClickListener {

        /* renamed from: j */
        final /* synthetic */ Callback f14457j;

        /* renamed from: k */
        final /* synthetic */ C5147g f14458k;

        DialogInterface$OnClickListenerC5135c(Callback callback, C5147g c5147g) {
            DatePickerModule.this = r1;
            this.f14457j = callback;
            this.f14458k = c5147g;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f14457j.invoke(this.f14458k.getDate());
            dialogInterface.dismiss();
        }
    }

    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6822a.m21859b(reactApplicationContext, false);
    }

    private AlertDialog createDialog(ReadableMap readableMap, C5147g c5147g, Callback callback, Callback callback2) {
        String string = readableMap.getString("title");
        String string2 = readableMap.getString("confirmText");
        return new AlertDialog.Builder(C5136a.f14460a.getCurrentActivity(), getTheme(readableMap)).setTitle(string).setCancelable(true).setView(withTopMargin(c5147g)).setPositiveButton(string2, new DialogInterface$OnClickListenerC5135c(callback, c5147g)).setNegativeButton(readableMap.getString("cancelText"), new DialogInterface$OnClickListenerC5134b(callback2)).setOnCancelListener(new DialogInterface$OnCancelListenerC5133a(callback2)).create();
    }

    private C5147g createPicker(ReadableMap readableMap) {
        C5147g c5147g = new C5147g(new LinearLayout.LayoutParams(-1, C5153k.m26021k(180)));
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (!nextKey.equals("style")) {
                try {
                    c5147g.m26065d(nextKey, dynamic);
                } catch (Exception unused) {
                }
            }
        }
        c5147g.m26066c();
        return c5147g;
    }

    private int getTheme(ReadableMap readableMap) {
        String string = readableMap.getString("theme");
        if (string == null) {
            return 0;
        }
        if (!string.equals("dark")) {
            if (!string.equals("light")) {
                return 0;
            }
            return 5;
        }
        return 4;
    }

    private View withTopMargin(C5147g c5147g) {
        LinearLayout linearLayout = new LinearLayout(C5136a.f14460a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(c5147g);
        linearLayout.setPadding(0, C5153k.m26021k(20), 0, 0);
        return linearLayout;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void closePicker() {
        this.dialog.dismiss();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNDatePicker";
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap, Callback callback, Callback callback2) {
        AlertDialog createDialog = createDialog(readableMap, createPicker(readableMap), callback, callback2);
        this.dialog = createDialog;
        createDialog.show();
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}