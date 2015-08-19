package ar.com.wfranck.customtoast;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import ar.com.wfranck.android.R;

public class CustomToast extends Toast{
	
	public CustomToast(Context activityContext, String message, int duration, TipoMensaje tipo){
		super(activityContext);
		this.setDuration(duration);
		LayoutInflater inflater = (LayoutInflater) activityContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.custom_toast, (ViewGroup) ((Activity) activityContext).findViewById(R.id.custom_toast_layout_id));
		this.setView(view);
		LinearLayout layoutImage = (LinearLayout) view.findViewById(R.id.custom_toast_layout_image);
		ImageView imageView = (ImageView) view.findViewById(R.id.image);
		
		TextView tv = (TextView) view.findViewById(R.id.text);
		tv.setText(message);
		
		switch (tipo) {
			case OK:
				layoutImage.setBackgroundColor(activityContext.getResources().getColor(R.color.toast_background_color_green));
				imageView.setImageDrawable(activityContext.getResources().getDrawable(R.drawable.ok));
				tv.setTextColor(activityContext.getResources().getColor(R.color.toast_text_color_green));
				break;
			
			case INFO:
				layoutImage.setBackgroundColor(activityContext.getResources().getColor(R.color.toast_background_color_blue));
				imageView.setImageDrawable(activityContext.getResources().getDrawable(R.drawable.info));
				tv.setTextColor(activityContext.getResources().getColor(R.color.toast_text_color_blue));
				break;
				
			case WARN:
				layoutImage.setBackgroundColor(activityContext.getResources().getColor(R.color.toast_background_color_yellow));
				imageView.setImageDrawable(activityContext.getResources().getDrawable(R.drawable.warning));
				tv.setTextColor(activityContext.getResources().getColor(R.color.toast_text_color_yellow));
				break;
				
			case ERROR:
				layoutImage.setBackgroundColor(activityContext.getResources().getColor(R.color.toast_background_color_red));
				imageView.setImageDrawable(activityContext.getResources().getDrawable(R.drawable.error));
				tv.setTextColor(activityContext.getResources().getColor(R.color.toast_text_color_red));
				break;
				
			default:
				layoutImage.setBackgroundColor(activityContext.getResources().getColor(R.color.toast_background_color_blue));
				imageView.setImageDrawable(activityContext.getResources().getDrawable(R.drawable.info));
				tv.setTextColor(activityContext.getResources().getColor(R.color.toast_text_color_blue));
				break;
		}
	}
	
	public enum TipoMensaje {
		OK,
		INFO,
		WARN,
		ERROR;
	}

}
