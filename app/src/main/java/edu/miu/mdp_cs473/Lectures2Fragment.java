package edu.miu.mdp_cs473;
import java.io.IOException;
import java.io.InputStream;
import	java.util.ArrayList;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import edu.miu.mdp_cs473.domain.Lecture;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Lectures2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Lectures2Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View view;
    private RecyclerView recyclerView;
    private List<Lecture> lectureList=new ArrayList<> ();

    public Lectures2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Lectures2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Lectures2Fragment newInstance(String param1, String param2) {
        Lectures2Fragment fragment = new Lectures2Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lectureList.add(new Lecture(1,"Introduction to Android","lesson_01"));
        lectureList.add(new Lecture(2,"Kotlin Fundamentals","lesson_02"));
        lectureList.add(new Lecture(3,"Creating First App","lesson_03"));
        lectureList.add(new Lecture(4,"Views, Layouts, and Resources","lesson_04"));
        lectureList.add(new Lecture(5,"Activities, Intents","lesson_05"));
        lectureList.add(new Lecture(6,"User Input Controls","lesson_06d1"));
        lectureList.add(new Lecture(6,"User Input Controls","lesson_06d2"));
        lectureList.add(new Lecture(7,"Menus, Fragments and Tab layout with Swipe views","lesson_07d1"));
        lectureList.add(new Lecture(7,"Menus, Fragments and Tab layout with Swipe views","lesson_07d2"));
        lectureList.add(new Lecture(8,"WebView, Shared Preferences and JSON","lesson_08"));
        lectureList.add(new Lecture(9,"Multimedia","lesson_09"));
        lectureList.add(new Lecture(10,"SQLite Database","lesson_10"));
        lectureList.add(new Lecture(11,"Sensors","lesson_11"));
        lectureList.add(new Lecture(12,"Localization","lesson_12"));
        lectureList.add(new Lecture(13,"Publish APK","lesson_13"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_lectures2, container, false);
        recyclerView=(RecyclerView) view.findViewById(R.id.recycler_view2);
        MyLectureAdapter myLectureAdapter= new MyLectureAdapter(getContext(),lectureList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(myLectureAdapter);
        return  view;
    }
}
