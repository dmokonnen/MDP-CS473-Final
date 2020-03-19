package edu.miu.mdp_cs473;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import edu.miu.mdp_cs473.domain.Assignment;
import edu.miu.mdp_cs473.domain.Lecture;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AssignmentsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AssignmentsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View view;
    private RecyclerView recyclerView;
    private List<Assignment> assignmentList=new ArrayList<>();

    public AssignmentsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AssignmentsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AssignmentsFragment newInstance(String param1, String param2) {
        AssignmentsFragment fragment = new AssignmentsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assignmentList.add(new Assignment(1,"Home work for Lesson-1 and Lesson-2","week1day1_lesson1_lesson2_homework1"));
        assignmentList.add(new Assignment(2,"Programming Homework","week1day2_lesson3_homework2"));
        assignmentList.add(new Assignment(3,"Working with TabLayout and Create a Login page for the Walmart store" +
                "","week1day3_lesson4_homework3"));
        assignmentList.add(new Assignment(4,"Create a Login page for the Walmart store","week1day4_lesson5_homework4"));
        assignmentList.add(new Assignment(5,"Quiz App, Walmart Shopping category, and Electronics " +
                "items using RecyclerView","week1day5_day6_lesson6_homework5"));
        assignmentList.add(new Assignment(5,"CV App Group Assignment","week2_lesson6_lesson7_homework6_group_assignment"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_assignments, container, false);
        recyclerView=(RecyclerView) view.findViewById(R.id.recycler_view3);
        MyAssignmentAdapter myAssignmentAdapter= new MyAssignmentAdapter(getContext(),assignmentList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(myAssignmentAdapter);
        return  view;

    }
}
