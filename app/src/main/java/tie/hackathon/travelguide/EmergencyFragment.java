package tie.hackathon.travelguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Displays emergency contact numbers
 */
public class EmergencyFragment extends Fragment {

    @BindView(R.id.police)      Button police;
    @BindView(R.id.fire)        Button fire;
    @BindView(R.id.ambulance)   Button ambulance;
    @BindView(R.id.bomb)        Button bomb;
    @BindView(R.id.railways)    Button railways;

    private Activity activity;

    public EmergencyFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_emergency, container, false);

        ButterKnife.bind(this, view);

        return view;
    }


    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);
        this.activity = (Activity) activity;
    }
}
