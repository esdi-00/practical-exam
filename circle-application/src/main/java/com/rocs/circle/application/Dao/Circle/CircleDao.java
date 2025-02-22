package com.rocs.circle.application.Dao.Circle;

import com.rocs.circle.application.model.circle.Circle;

public interface CircleDao {
   double getCircumference(Circle circle);
   double getArea(Circle circle);
}
