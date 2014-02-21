package com.blackaplysia.helloglass;

import com.google.android.glass.timeline.TimelineManager;
import com.google.android.glass.app.Card;
import android.app.Activity;
import android.os.Bundle;
import java.util.Date;

public class HelloGlassActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

	TimelineManager timelineManager = TimelineManager.from(this);
	Card card1 = new Card(this);
	card1.setText(R.string.hello_message);
	card1.setFootnote(new Date().toString());
	timelineManager.insert(card1);

	finish();
    }
}
