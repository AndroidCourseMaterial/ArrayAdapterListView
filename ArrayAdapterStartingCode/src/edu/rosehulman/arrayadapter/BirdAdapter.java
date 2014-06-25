package edu.rosehulman.arrayadapter;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import edu.rosehulman.arrayadapter.MainActivity.StateBird;

public class BirdAdapter extends ArrayAdapter<StateBird> {

	public BirdAdapter(Context context, ArrayList<StateBird> birds) {
		super(context, android.R.layout.simple_expandable_list_item_2, android.R.id.text1, birds);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = super.getView(position, convertView, parent);
		StateBird bird = getItem(position);
		TextView nameTextView = (TextView) view.findViewById(android.R.id.text1);
		nameTextView.setTextColor(Color.RED); 
		nameTextView.setText(bird.getName());
		TextView stateTextView = (TextView) view.findViewById(android.R.id.text2);
		stateTextView.setText(bird.getState());
		return view;
	}
}
