/**
 * 
 */
package com.example.plugin;

import com.example.plug.IComm;

import android.util.Log;

/**
 * @author YC
 * @time 2016-4-25 обнГ7:09:26
 */
public class PlugInClass implements IComm{

	private static final String TAG = "PlugInClass";

	public PlugInClass() {
		Log.i(TAG, "Plugin instanse");
	}

	@Override
	public int function1(int arg0, int arg1) {
		return arg0 + arg1;
	}
	
}
