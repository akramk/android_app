package com.example.videostreaming;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import android.os.Build;

public class MainActivity extends Activity {
	
	protected static final String URL = null;
	private Button button;
	VideoView myVideoView;
	String SrcPath = "rtsp://v5.cache1.c.youtube.com/CjYLENy73wIaLQnhycnrJQ8qmRMYESARFEIJbXYtZ29vZ2xlSARSBXdhdGNoYPj_hYjnq6uUTQw=/0/0/0/video.3gp";

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
/*        myVideoView = (VideoView)findViewById(R.id.videoView1);
        myVideoView.setVideoURI(Uri.parse(SrcPath));
        myVideoView.setMediaController(new MediaController(this));
        myVideoView.requestFocus();
        myVideoView.start();*/
        
        button = (Button) findViewById(R.id.clickhere);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			     Toast.makeText(getApplicationContext(), 
                         "Button is clicked", Toast.LENGTH_LONG).show();
			     
/*			     String LINK = "rtsp://v5.cache1.c.youtube.com/CjYLENy73wIaLQnhycnrJQ8qmRMYESARFEIJbXYtZ29vZ2xlSARSBXdhdGNoYPj_hYjnq6uUTQw=/0/0/0/video.3gp";
			     VideoView mVideoView  = (VideoView) findViewById(R.id.videoView1);
			     MediaController mc = new MediaController(MainActivity.this);
			     mc.setAnchorView(mVideoView);
			     mc.setMediaPlayer(mVideoView);
			     Uri video = Uri.parse(LINK);
			     mVideoView.setMediaController(mc);
			     mVideoView.setVideoURI(video);
			     mVideoView.start();*/
			     myVideoView = (VideoView)findViewById(R.id.videoView1);
			     myVideoView.setVideoURI(Uri.parse(SrcPath));
			     myVideoView.setMediaController(new MediaController(MainActivity.this));
			     myVideoView.requestFocus();
			     myVideoView.start();
			     
			}
		});
        
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        
    }
    
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
