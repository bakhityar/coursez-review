package com.teamtreehouse.coursez.dao;

import com.teamtreehouse.coursez.exc.DaoException;
import com.teamtreehouse.coursez.model.Review;

import java.util.List;

public interface ReviewDao {
  void add(Review review) throws DaoException;

  List<Review> findAll();

  List<Review> findByCourseId(int courseId);
}
