package com.huawei.reactcrash;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.huawei.agconnect.crash.AGConnectCrash;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "ReactCrash";
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //Test trigger a crash
    AGConnectCrash.getInstance().testIt(this);

  }
}
