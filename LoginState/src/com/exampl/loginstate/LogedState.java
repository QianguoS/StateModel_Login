package com.exampl.loginstate;

import android.content.Context;
import android.widget.Toast;

public class LogedState implements UserState {

	@Override
	public void forward(Context context) {
		// TODO Auto-generated method stub

		Toast.makeText(context, "转发成功", Toast.LENGTH_LONG).show();
	}

	@Override
	public void comment(Context context) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "评论成功", Toast.LENGTH_LONG).show();
	}

}
