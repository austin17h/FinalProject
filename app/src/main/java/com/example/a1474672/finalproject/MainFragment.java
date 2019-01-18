package com.example.a1474672.finalproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment implements View.OnClickListener{
    final static String TAG = "mainfragment";

    MainInterface mCallback;
    View mRootView;
    TextView mLabel;
    Button mNext;
    Bitmap emptySquare;
    public MainFragment() {
    }

    public static com.example.a1474672.finalproject.MainFragment newInstance() {
        com.example.a1474672.finalproject.MainFragment fragment = new com.example.a1474672.finalproject.MainFragment();
        Log.i(fragment.TAG, "onCreateView MasterFragment");
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach");

        try {
            mCallback = (MainInterface) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement FragmentOneInterface");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Log.i(TAG, "reached 1:");
        mRootView = inflater.inflate(R.layout.main_fragment, container, false);
        mLabel = (TextView) mRootView.findViewById(R.id.textView);
        mNext = (Button) mRootView.findViewById(R.id.next);
        mNext.setOnClickListener(this);
        emptySquare = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.blacksquare1);
        return mRootView;
    }
    @Override
    public void onClick(View v) {
        mCallback.goToNext();
    }
    public interface MainInterface{
        void goToNext();
    }
}
