package com.teamtreehouse.coursez.dao;

import com.teamtreehouse.coursez.exc.DaoException;
import com.teamtreehouse.coursez.model.Course;

import java.util.List;

public interface CourseDao {
  void add(Course course) throws DaoException;

  List<Course> findAll();
}
