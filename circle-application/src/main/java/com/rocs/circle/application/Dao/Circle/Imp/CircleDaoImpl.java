package com.rocs.circle.application.Dao.Circle.Imp;

import com.rocs.circle.application.Dao.Circle.CircleDao;
import com.rocs.circle.application.model.circle.Circle;

public class CircleDaoImpl implements CircleDao {

    @Override
    public double getCircumference(Circle circle) {
        return 2 * circle.getPie() * circle.getRad();
    }

    @Override
    public double getArea(Circle circle) {
        return circle.getPie() * circle.getRad() *Math.sqrt(2);
    }
}

