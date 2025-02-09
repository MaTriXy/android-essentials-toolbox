package com.ensoftcorp.open.android.essentials.subsystems.runtime;

/**
 * Android administration runtime libraries
 * 
 * @author Ben Holland
 */
public class AdministrationSubsystem extends AndroidRuntimeSubsystem {

	public static final String TAG = "ANDROID_ADMINISTRATION_SUBSYSTEM";

	@Override
	public String getName() {
		return "Android Administration";
	}

	@Override
	public String getTag() {
		return TAG;
	}

	@Override
	public String[] getParentTags() {
		return new String[] { AndroidRuntimeSubsystem.TAG };
	}

	@Override
	public String[] getNamespaces() {
		return new String[]{ "android.app.admin" };
	}
	
}
