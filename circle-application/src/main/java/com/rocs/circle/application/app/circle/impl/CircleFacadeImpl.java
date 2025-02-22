package com.rocs.circle.application.app.circle.impl;

import com.rocs.circle.application.Dao.Circle.CircleDao;
import com.rocs.circle.application.Dao.Circle.Imp.CircleDaoImpl;
import com.rocs.circle.application.app.circle.CircleFacade;
import com.rocs.circle.application.model.circle.Circle;

public class CircleFacadeImpl implements CircleFacade {

    CircleDao circleDao = new CircleDaoImpl();

    @Override
    public double getArea(Circle circle) {
        double area = circleDao.getArea(circle);
        return area;
    }

    @Override
    public double getCircumference(Circle circle) {
        double circumference = circleDao.getCircumference(circle);
        return circumference;
    }
}
