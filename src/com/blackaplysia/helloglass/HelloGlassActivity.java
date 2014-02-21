package com.blackaplysia.helloglass;

import com.google.android.glass.timeline.TimelineManager;
import com.google.android.glass.app.Card;
import android.app.Activity;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;


public class HelloGlassActivity extends Activity
{

    String createDateString() {
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy'/'MM'/'dd' 'kk':'mm':'ss");
	return sdf.format(date);
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

	TimelineManager timelineManager = TimelineManager.from(this);
	Card card1 = new Card(this);
	card1.setText(R.string.hello_message);
	card1.setFootnote(createDateString());
	timelineManager.insert(card1);

	finish();
    }
}
