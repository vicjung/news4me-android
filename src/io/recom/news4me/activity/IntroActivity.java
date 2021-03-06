package io.recom.news4me.activity;

import io.recom.news4me.R;
import io.recom.news4me.adapter.IntroFragmentAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.actionbarsherlock.app.ActionBar;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;

public class IntroActivity extends FlurrySherlockFragmentActivity {

	IntroFragmentAdapter introFragmentAdapter;
	ViewPager introViewPager;
	PageIndicator introPageIndicator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intro);

		ActionBar actionBar = getSupportActionBar();
		actionBar.hide();

		introFragmentAdapter = new IntroFragmentAdapter(
				getSupportFragmentManager());

		introViewPager = (ViewPager) findViewById(R.id.introViewPager);
		introViewPager.setAdapter(introFragmentAdapter);

		introPageIndicator = (CirclePageIndicator) findViewById(R.id.introPageIndicator);
		introPageIndicator.setViewPager(introViewPager);
	}

}
