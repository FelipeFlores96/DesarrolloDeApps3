package mx.edu.utng.tabs;

/**
 * Created by felipe on 8/02/17.
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

public class Tab3Number extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3number, container, false);
        return rootView;
    }
}
