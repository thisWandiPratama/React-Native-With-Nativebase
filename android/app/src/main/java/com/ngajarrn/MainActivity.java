package com.ngajarrn;

import com.facebook.react.ReactActivity;

 import com.facebook.react.ReactActivityDelegate;                                   //Tambahkan Ini 
 import com.facebook.react.ReactRootView;                                           //Tambahkan Ini         
 import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;         //Tambahkan Ini 

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "ngajarrn";
    }

     @Override                                                                    //Tambahkan Ini 
  protected ReactActivityDelegate createReactActivityDelegate() {              //Tambahkan Ini 
    return new ReactActivityDelegate(this, getMainComponentName()) {           //Tambahkan Ini 
      @Override                                                                //Tambahkan Ini 
      protected ReactRootView createRootView() {                               //Tambahkan Ini 
       return new RNGestureHandlerEnabledRootView(MainActivity.this);          //Tambahkan Ini 
      }                                                                        //Tambahkan Ini 
    };                                                                         //Tambahkan Ini 
  }                                                                            //Tambahkan Ini 
}
