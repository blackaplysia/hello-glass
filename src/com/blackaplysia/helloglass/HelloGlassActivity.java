package com.blackaplysia.helloglass;

import com.google.android.glass.timeline.TimelineManager;
import com.google.android.glass.widget.CardScrollAdapter;
import com.google.android.glass.widget.CardScrollView;
import com.google.android.glass.app.Card;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class HelloGlassActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

	TimelineManager timelineManager = TimelineManager.from(this);
	Card card1 = new Card(this);
	card1.setText(R.string.hello_message);
	timelineManager.insert(card1);

	finish();
    }
}
