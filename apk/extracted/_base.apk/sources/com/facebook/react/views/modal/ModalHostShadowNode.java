package com.facebook.react.views.modal;

import android.graphics.Point;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class ModalHostShadowNode extends LayoutShadowNode {
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.addChildAt(reactShadowNodeImpl, i);
        Point modalHostSize = ModalHostHelper.getModalHostSize(getThemedContext());
        reactShadowNodeImpl.setStyleWidth(modalHostSize.x);
        reactShadowNodeImpl.setStyleHeight(modalHostSize.y);
    }
}
