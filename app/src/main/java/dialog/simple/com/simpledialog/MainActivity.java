package dialog.simple.com.simpledialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View v){
        //Initialize the Dialog Builder
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this); //this is used for current context, its required to show dialog on this activity
        dialogBuilder.setTitle("Simple Dialog").setMessage("This is message").setPositiveButton("Ok",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialogBuilder.show();
    }
}
