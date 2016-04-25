package com.exampl.loginstate;

import android.content.Context;

public class LogContext {

	UserState mState = new LogoutState();
	private static LogContext logContext = new LogContext();
	
	private void LogContext(){
		
	}
	public static LogContext getLogContext(){
		return logContext;
	}
	
	public void setState(UserState mState){
		this.mState = mState;
	}
	
	public void forward(Context context){
		mState.forward(context);
	}
	public void comment(Context context){
		mState.comment(context);
	}
}
