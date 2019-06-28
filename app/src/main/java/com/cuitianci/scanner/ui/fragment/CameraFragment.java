package com.cuitianci.scanner.ui.fragment;

import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.*;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.cuitianci.scanner.databinding.FragmentCameraBinding;
import com.cuitianci.scanner.R;

import java.io.File;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CameraFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CameraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CameraFragment extends Fragment {

    private static final String TAG = "CameraFragment";
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private FragmentCameraBinding binding;
    private OnFragmentInteractionListener mListener;

    public CameraFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CameraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CameraFragment newInstance(String param1, String param2) {
        CameraFragment fragment = new CameraFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_camera, container, false);
        startCamera();
        binding.viewFinder.addOnLayoutChangeListener((v, left, top, right, bottom, oldLeft, oldTop, oldRight, oldBottom) -> updateTransform());
        return binding.getRoot();
    }

    private void startCamera() {
        //相机预览配置
        PreviewConfig previewConfig = new PreviewConfig.Builder()
                .setTargetAspectRatio(new Rational(1, 1))
                .setTargetResolution(new Size(640, 640))
                .build();
        Preview preview = new Preview(previewConfig);
        preview.setOnPreviewOutputUpdateListener(output -> {
            ViewGroup parent = (ViewGroup) binding.viewFinder.getParent();
            parent.removeView(binding.viewFinder);
            parent.addView(binding.viewFinder, 0);
            binding.viewFinder.setSurfaceTexture(output.getSurfaceTexture());
            CameraFragment.this.updateTransform();
        });
        //拍照
        ImageCaptureConfig imageCaptureConfig = new ImageCaptureConfig.Builder()
                .setTargetAspectRatio(new Rational(1, 1))
                .setCaptureMode(ImageCapture.CaptureMode.MIN_LATENCY)
                .build();
        ImageCapture imageCapture = new ImageCapture(imageCaptureConfig);
        binding.fabShoot.setOnClickListener(v -> {
            File file = new File(Objects.requireNonNull(CameraFragment.this.getActivity()).getExternalMediaDirs()[0], System.currentTimeMillis() + ".jpg");
            imageCapture.takePicture(file, new ImageCapture.OnImageSavedListener() {
                @Override
                public void onImageSaved(@NonNull File file) {
                    Log.e(TAG, "onImageSaved: " + file.getAbsolutePath());
                    Glide.with(binding.ci)
                            .load(file)
                            .into(binding.ci);
                }

                @Override
                public void onError(@NonNull ImageCapture.UseCaseError useCaseError, @NonNull String message, @Nullable Throwable cause) {
                    Log.e(TAG, "onError: " + message);
                }
            });
        });
        CameraX.bindToLifecycle(this, preview, imageCapture);
    }

    private void updateTransform() {
        Matrix matrix = new Matrix();
        float centerX = binding.viewFinder.getWidth() / 2f;
        float centerY = binding.viewFinder.getHeight() / 2f;

        int rotationDegrees = 0;
        if (null != binding.viewFinder.getDisplay()) {
            switch (binding.viewFinder.getDisplay().getRotation()) {
                case Surface.ROTATION_0:
                    rotationDegrees = 0;
                    break;
                case Surface.ROTATION_90:
                    rotationDegrees = 90;
                    break;
                case Surface.ROTATION_180:
                    rotationDegrees = 180;
                    break;
                case Surface.ROTATION_270:
                    rotationDegrees = 270;
                    break;
                default:
                    rotationDegrees = 0;
                    break;
            }
        }
        matrix.postRotate(-rotationDegrees, centerX, centerY);
        binding.viewFinder.setTransform(matrix);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
