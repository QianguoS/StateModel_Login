package com.exampl.loginstate;

import android.content.Context;
import android.content.Intent;

public class LogoutState implements UserState {

	@Override
	public void forward(Context context) {
		// TODO Auto-generated method stub
			openActivity(context);
	}

	private void openActivity(Context context) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(context,LoginActivity.class);
		context.startActivity(intent);	
		
	}

	@Override
	public void comment(Context context) {
		// TODO Auto-generated method stub
		openActivity(context);
	}

}
