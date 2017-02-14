package utng.edu.mx.dialogosuno;

import android.support.v4.app.DialogFragment;
import android.support.annotation.NonNull;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Dialog;
import android.support.v7.app.AlertDialog;

/**
 * Created by felipe on 27/01/17.
 */

public class DialogAlerta extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("Esto es un mensaje de alerta").setTitle("Información")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        return builder.create();

    }
}

