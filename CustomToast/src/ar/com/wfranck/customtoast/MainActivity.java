package ar.com.wfranck.customtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import ar.com.wfranck.android.R;
import ar.com.wfranck.customtoast.CustomToast.TipoMensaje;

public class MainActivity extends Activity {

	private Button button;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		button = (Button) findViewById(R.id.buttonToast);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				CustomToast customToast = new CustomToast(MainActivity.this, "La categoría posee respuestas guardadas, ¿Desea borrarla de todos modos?", Toast.LENGTH_SHORT, TipoMensaje.WARN);
				customToast.setGravity(Gravity.BOTTOM, 0, 20);
				customToast.show();
				
			}
			
		});

	}
}