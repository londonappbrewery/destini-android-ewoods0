package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.attr.id;
import static com.londonappbrewery.destini.R.id.media_actions;
import static com.londonappbrewery.destini.R.id.storyTextView;
import static com.londonappbrewery.destini.R.string.T3_Story;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

        TextView story;
        Button ans1;
        Button ans2;
        int mStoryIndex = 1;
        int theStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        story = (TextView) findViewById(storyTextView);
        ans1 = (Button) findViewById(R.id.buttonTop);
        ans2 = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    story.setText(R.string.T3_Story);
                    ans1.setText(R.string.T3_Ans1);
                    ans2.setText(R.string.T3_Ans2);
                    mStoryIndex++;
                }else if(mStoryIndex == 2){
                    ans1.setText(R.string.T6_End);
                    ans2.setVisibility(View.GONE);
                    story.setVisibility(View.GONE);
                }else if(mStoryIndex == 3){
                    story.setText(R.string.T3_Story);
                    ans1.setText(R.string.T3_Ans1);
                    ans2.setText(R.string.T3_Ans2);
                    mStoryIndex++;
                }else if(mStoryIndex == 4){
                    ans1.setText(R.string.T6_End);
                    ans2.setVisibility(View.GONE);
                    story.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    story.setText(R.string.T2_Story);
                    ans1.setText(R.string.T2_Ans1);
                    ans2.setText(R.string.T2_Ans2);
                    mStoryIndex += 2;
                } else if (mStoryIndex == 2) {
                    ans1.setVisibility(View.GONE);
                    ans2.setText(R.string.T5_End);
                    story.setVisibility(View.GONE);
                }else if(mStoryIndex == 3){
                    ans1.setVisibility(View.GONE);
                    ans2.setText(R.string.T4_End);
                    story.setVisibility(View.GONE);
                }else if(mStoryIndex == 4){
                    ans1.setVisibility(View.GONE);
                    ans2.setText(R.string.T5_End);
                    story.setVisibility(View.GONE);
                }
            }
        });
    }
}
