package xyz.jiaci.plugin1;

import android.content.Context;

import xyz.jiaci.commonlib.IDynamic;

public class Dynamic implements IDynamic {
    @Override
    public String getStringForResId(Context context) {
        return context.getResources().getString(R.string.plugin1_hello);
    }
}
